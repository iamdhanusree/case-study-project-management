package com.java.transport.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.java.transport.model.vehicle;

public abstract class vehicledaoImpl implements vehicledao {

    private Connection con;

    public vehicledaoImpl(Connection con) {
        this.con = con;
    }

    @Override
    public boolean addVehicle(vehicle vehicle) throws SQLException {
        String sql = "INSERT INTO Vehicle (VehicleId, RegistrationNo, VehicleType, VehicleName, Model, Capacity, Status, Quantity, adminId) " +
                     "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setInt(1, vehicle.getVehicleId());
            pst.setString(2, vehicle.getRegistrationNo());
            pst.setString(3, vehicle.getVehicleType());
            pst.setString(4, vehicle.getVehicleName());
            pst.setInt(5, vehicle.getModel());
            pst.setInt(6, vehicle.getCapacity());
            pst.setString(7, vehicle.getStatus());
            pst.setInt(8, vehicle.getQuantity());
            pst.setInt(9, vehicle.getAdminId());
            pst.executeUpdate();
        }
        return true;
    }

    @Override
    public List<vehicle> searchVehicleByType(String vehicleType) throws SQLException {
        List<vehicle> vehicleList = new ArrayList<>();
        String sql = "SELECT * FROM Vehicle WHERE VehicleType = ?";
        try (PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setString(1, vehicleType);
            try (ResultSet rs = pst.executeQuery()) {
                while (rs.next()) {
                    vehicle vehicle = new vehicle(
                            rs.getInt("VehicleId"),
                            rs.getString("RegistrationNo"),
                            rs.getString("VehicleType"),
                            rs.getString("VehicleName"),
                            rs.getInt("Model"),
                            rs.getInt("Capacity"),
                            rs.getString("Status"),
                            rs.getInt("Quantity"),
                            rs.getInt("adminId")
                    );
                    vehicleList.add(vehicle);
                }
            }
        }
        return vehicleList;
    }
}

