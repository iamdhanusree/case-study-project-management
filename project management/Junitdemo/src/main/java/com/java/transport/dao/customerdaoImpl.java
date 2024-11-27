package com.java.transport.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.java.transport.model.customer;
import com.java.transport.util.ConnectionHelper;

public abstract class customerdaoImpl implements customerdao {

    Connection connection;
    PreparedStatement pst;

    @Override
    public String addCustomer(customer customer) throws ClassNotFoundException, SQLException {
        connection = ConnectionHelper.getConnection();
        String cmd = "INSERT INTO Customer (CustomerId, CustomerName, Age, Mobile, Email) VALUES (?,?,?,?,?)";
        pst = connection.prepareStatement(cmd);
        pst.setInt(1, customer.getCustomerId());
        pst.setString(2, customer.getCustomerName());
        pst.setInt(3, customer.getAge());
        pst.setString(4, customer.getMobile());
        pst.setString(5, customer.getEmail());
        pst.executeUpdate();
        return "Customer added successfully";
    }

    @Override
    public List<customer> getAllCustomers() throws SQLException, ClassNotFoundException {
        connection = ConnectionHelper.getConnection();
        List<customer> customerList = new ArrayList<>();
        String cmd = "SELECT * FROM Customer";
        pst = connection.prepareStatement(cmd);
        ResultSet rs = pst.executeQuery();
        while (rs.next()) {
            customer customer = new customer();
            customer.setCustomerId(rs.getInt("CustomerId"));
            customer.setCustomerName(rs.getString("CustomerName"));
            customer.setAge(rs.getInt("Age"));
            customer.setMobile(rs.getString("Mobile"));
            customer.setEmail(rs.getString("Email"));
            customerList.add(customer);
        }
        return customerList;
    }

    @Override
    public customer getCustomerById(int customerId) throws ClassNotFoundException, SQLException {
        connection = ConnectionHelper.getConnection();
        String cmd = "SELECT * FROM Customer WHERE CustomerId = ?";
        pst = connection.prepareStatement(cmd);
        pst.setInt(1, customerId);
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            customer customer = new customer();
            customer.setCustomerId(rs.getInt("CustomerId"));
            customer.setCustomerName(rs.getString("CustomerName"));
            customer.setAge(rs.getInt("Age"));
            customer.setMobile(rs.getString("Mobile"));
            customer.setEmail(rs.getString("Email"));
            return customer;
        }
        return null;
    }

    @Override
    public String updateCustomer(customer customer) throws ClassNotFoundException, SQLException {
        connection = ConnectionHelper.getConnection();
        String cmd = "UPDATE Customer SET CustomerName = ?, Age = ?, Mobile = ?, Email = ? WHERE CustomerId = ?";
        pst = connection.prepareStatement(cmd);
        pst.setString(1, customer.getCustomerName());
        pst.setInt(2, customer.getAge());
        pst.setString(3, customer.getMobile());
        pst.setString(4, customer.getEmail());
        pst.setInt(5, customer.getCustomerId());
        pst.executeUpdate();
        return "Customer updated successfully";
    }

    @Override
    public String deleteCustomer(int customerId) throws ClassNotFoundException, SQLException {
        connection = ConnectionHelper.getConnection();
        String cmd = "DELETE FROM Customer WHERE CustomerId = ?";
        pst = connection.prepareStatement(cmd);
        pst.setInt(1, customerId);
        pst.executeUpdate();
        return "Customer deleted successfully";
    }
}
