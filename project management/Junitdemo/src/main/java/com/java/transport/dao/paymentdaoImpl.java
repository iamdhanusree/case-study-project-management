package com.java.transport.dao;

import com.java.transport.model.payment;  // Ensure the class name is Payment (capitalized)
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public abstract class paymentdaoImpl implements paymentdao {

    private Statement DBUtil;

    @Override
    public boolean addPayment(payment payment) {
        try (Connection connection = DBUtil.getConnection()) {
            String query = "INSERT INTO payments (paymentAmount, paymentStatus) VALUES (?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setDouble(1, payment.getAmount());  // Updated to use getAmount
            statement.setString(2, payment.getPaymentStatus());
            int rowsAffected = statement.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean updatePayment(payment payment) {
        try (Connection connection = DBUtil.getConnection()) {
            String query = "UPDATE payments SET paymentAmount = ?, paymentStatus = ? WHERE paymentId = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setDouble(1, payment.getAmount());  // Updated to use getAmount
            statement.setString(2, payment.getPaymentStatus());
            statement.setInt(3, payment.getPaymentId());
            int rowsAffected = statement.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean deletePayment(int paymentId) {
        try (Connection connection = DBUtil.getConnection()) {
            String query = "DELETE FROM payments WHERE paymentId = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, paymentId);
            int rowsAffected = statement.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public payment getPaymentById(int paymentId) {
        payment payment = null;
        try (Connection connection = DBUtil.getConnection()) {
            String query = "SELECT * FROM payments WHERE paymentId = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, paymentId);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                payment = new payment();
                payment.setPaymentId(resultSet.getInt("paymentId"));
                payment.setAmount(resultSet.getDouble("paymentAmount"));  // Updated to use setAmount
                payment.setPaymentStatus(resultSet.getString("paymentStatus"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return payment;
    }

    @Override
    public List<payment> getAllPayments() {
        List<payment> payments = new ArrayList<>();
        try (Connection connection = DBUtil.getConnection()) {
            String query = "SELECT * FROM payments";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                payment payment = new payment();
                payment.setPaymentId(resultSet.getInt("paymentId"));
                payment.setAmount(resultSet.getDouble("paymentAmount"));  // Updated to use setAmount
                payment.setPaymentStatus(resultSet.getString("paymentStatus"));
                payments.add(payment);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return payments;
    }

    @Override
    public String addOrClearPayment(payment payment) {
        try (Connection connection = DBUtil.getConnection()) {
            if (payment.getAmount() > 0) {  // Updated to use getAmount
                String query = "INSERT INTO payments (paymentAmount, paymentStatus) VALUES (?, ?)";
                PreparedStatement statement = connection.prepareStatement(query);
                statement.setDouble(1, payment.getAmount());  // Updated to use getAmount
                statement.setString(2, payment.getPaymentStatus());
                int rowsAffected = statement.executeUpdate();
                if (rowsAffected > 0) {
                    return "Payment added successfully!";
                }
                return "Failed to add payment.";
            } else {
                String query = "DELETE FROM payments WHERE paymentId = ?";
                PreparedStatement statement = connection.prepareStatement(query);
                statement.setInt(1, payment.getPaymentId());
                int rowsAffected = statement.executeUpdate();
                if (rowsAffected > 0) {
                    return "Payment cleared successfully!";
                }
                return "Failed to clear payment.";
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return "An error occurred while processing the payment.";
        }
    }
}

