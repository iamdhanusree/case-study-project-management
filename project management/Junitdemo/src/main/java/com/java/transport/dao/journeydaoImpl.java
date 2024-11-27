package com.java.transport.dao;

import com.java.transport.model.journey;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class journeydaoImpl implements journeydao{

    private Connection connection;

    // Constructor to initialize the connection
    public journeydaoImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public boolean addJourney(journey journey) throws SQLException {
        String sql = "INSERT INTO Journey (journeyId, vehicleId, registrationNo, startStation, endStation, startTime, departureTime, type, adminId, price) "
                   + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, journey.getJourneyId());
            stmt.setInt(2, journey.getVehicleId());
            stmt.setString(3, journey.getRegistrationNo());
            stmt.setString(4, journey.getStartStation());
            stmt.setString(5, journey.getEndStation());
            stmt.setTime(6, journey.getStartTime());
            stmt.setTime(7, journey.getDepartureTime());
            stmt.setString(8, journey.getType());
            stmt.setInt(9, journey.getAdminId());
            stmt.setDouble(10, journey.getPrice());
            
            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;
        }
    }

    @Override
    public boolean updateJourney(journey journey) throws SQLException {
        String sql = "UPDATE Journey SET vehicleId = ?, registrationNo = ?, startStation = ?, endStation = ?, startTime = ?, "
                   + "departureTime = ?, type = ?, adminId = ?, price = ? WHERE journeyId = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, journey.getVehicleId());
            stmt.setString(2, journey.getRegistrationNo());
            stmt.setString(3, journey.getStartStation());
            stmt.setString(4, journey.getEndStation());
            stmt.setTime(5, journey.getStartTime());
            stmt.setTime(6, journey.getDepartureTime());
            stmt.setString(7, journey.getType());
            stmt.setInt(8, journey.getAdminId());
            stmt.setDouble(9, journey.getPrice());
            stmt.setInt(10, journey.getJourneyId());

            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;
        }
    }

    @Override
    public boolean deleteJourney(int journeyId) throws SQLException {
        String sql = "DELETE FROM Journey WHERE journeyId = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, journeyId);
            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;
        }
    }

    @Override
    public journey getJourneyById(int journeyId) throws SQLException {
        String sql = "SELECT * FROM Journey WHERE journeyId = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, journeyId);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return mapResultSetTojourney(rs);
            } else {
                return null;
            }
        }
    }

    private journey mapResultSetTojourney(ResultSet rs) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
    public List<journey> getAllJourneys() throws SQLException {
        String sql = "SELECT * FROM Journey";
        try (Statement stmt = connection.createStatement()) {
            ResultSet rs = stmt.executeQuery(sql);

            List<journey> journeys = new ArrayList<>();
            while (rs.next()) {
                journeys.add(mapResultSetTojourney(rs));
            }
            return journeys;
        }
    }

    @Override
    public List<journey> getJourneysByVehicleId(int vehicleId) throws SQLException {
        String sql = "SELECT * FROM Journey WHERE vehicleId = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, vehicleId);
            ResultSet rs = stmt.executeQuery();

            List<journey> journeys = new ArrayList<>();
            while (rs.next()) {
                journeys.add(mapResultSetTojourney(rs));
            }
            return journeys;
        }
    }
}
