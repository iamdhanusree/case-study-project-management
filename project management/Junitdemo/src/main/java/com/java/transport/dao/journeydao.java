//package com.java.transport.dao;
//
//import com.java.transport.model.journey;
//import java.sql.SQLException;
//import java.util.List;
//
//public interface journeydao {
//    // Add a new journey
//    boolean addJourney(journey journey) throws SQLException;
//
//    // Update an existing journey
//    boolean updateJourney(journey journey) throws SQLException;
//
//    // Delete a journey by its ID
//    boolean deleteJourney(int journeyId) throws SQLException;
//
//    // Get a journey by its ID
//    journey getJourneyById(int journeyId) throws SQLException;
//
//    // Get all journeys
//    List<journey> getAllJourneys() throws SQLException;
//
//    // Get journeys by vehicle ID
//    List<journey> getJourneysByVehicleId(int vehicleId) throws SQLException;
//}
package com.java.transport.dao;

import com.java.transport.model.journey;
import java.sql.SQLException;
import java.util.List;

public interface journeydao {
    // Add a new journey
    boolean addJourney(journey journey) throws SQLException;

    // Update an existing journey
    boolean updateJourney(journey journey) throws SQLException;

    // Delete a journey by its ID
    boolean deleteJourney(int journeyId) throws SQLException;

    // Alias for deleteJourney for clarity
    default boolean cancelJourney(int journeyId) throws SQLException {
        return deleteJourney(journeyId);
    }

    // Get a journey by its ID
    journey getJourneyById(int journeyId) throws SQLException;

    // Get all journeys
    List<journey> getAllJourneys() throws SQLException;

    // Get journeys by vehicle ID
    List<journey> getJourneysByVehicleId(int vehicleId) throws SQLException;
}

