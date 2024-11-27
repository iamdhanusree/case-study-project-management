package com.java.transport.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.java.transport.model.vehicle;

public class ConcreteVehicleDaoImpl extends vehicledaoImpl {

    public ConcreteVehicleDaoImpl(Connection con) {
        super(con); // Pass the connection to the parent class constructor
    }

	@Override
	public List<vehicle> getAllVehicles() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateVehicleStatus(int vehicleId, String status) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteVehicle(int vehicleId) throws SQLException {
		// TODO Auto-generated method stub
		
	}

    // Additional methods specific to ConcreteVehicleDaoImpl (if needed)
}
