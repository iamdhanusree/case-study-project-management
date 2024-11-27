//package com.java.transport.dao;
//
//import java.sql.SQLException;
//import java.util.List;
//
//import com.java.transport.model.vehicle;
//
//public interface vehicledao{
//    
//    boolean addvehicle(vehicle vehicle) throws SQLException;  // Add a new vehicle
//    
//    List<vehicle> getAllVehicles() throws SQLException;  // Get a list of all vehicles
//    
//    void updateVehicleStatus(int vehicleId, String status) throws SQLException;  // Update vehicle status
//    
//    void deleteVehicle(int vehicleId) throws SQLException;  // Delete a vehicle
//
//	List<vehicle> showvehicle();
//    
//}
package com.java.transport.dao;

import java.sql.SQLException;
import java.util.List;
import com.java.transport.model.vehicle;

public interface vehicledao {

    boolean addVehicle(vehicle vehicle) throws SQLException;  // Add a new vehicle

    List<vehicle> getAllVehicles() throws SQLException;  // Get a list of all vehicles

    void updateVehicleStatus(int vehicleId, String status) throws SQLException;  // Update vehicle status

    void deleteVehicle(int vehicleId) throws SQLException;  // Delete a vehicle

    List<vehicle> searchVehicleByType(String vehicleType) throws SQLException;  // Search vehicles by type

}
