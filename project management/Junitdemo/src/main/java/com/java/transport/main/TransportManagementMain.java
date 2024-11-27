
package com.java.transport.main;

import com.java.transport.dao.*;
import com.java.transport.model.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class TransportManagementMain {

    static Scanner sc = new Scanner(System.in);

    // Database connection setup
    private static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/transportdb", "root", "srec@7181"
        );
    }

    // Show all Admins
    public static void showAdmins() throws SQLException, ClassNotFoundException {
        admindao dao = new admindaoImpl();
        List<admin> adminList = dao.showAllAdmins();
        for (admin admin : adminList) {
            System.out.println(admin);
        }
    }

    // Search Admin by UserName
    public static void searchAdminByUsername() throws SQLException, ClassNotFoundException {
        admindao dao = new admindaoImpl();
        System.out.println("Enter Admin Username: ");
        System.out.println(dao.searchAdminByUsername(sc.next()));
    }

    // Add a new Admin
    public static void addAdmin() throws SQLException, ClassNotFoundException {
        admindao dao = new admindaoImpl();
        admin admin = new admin();
        System.out.println("Enter Admin ID: ");
        admin.setAdminId(sc.nextInt());
        System.out.println("Enter Username: ");
        admin.setUsername(sc.next());
        System.out.println("Enter Password: ");
        admin.setPassword(sc.next());
        System.out.println(dao.addAdmin(admin));
    }

    // Show all Vehicles
    public static void showVehicles(Connection con) throws SQLException {
        ConcreteVehicleDaoImpl dao = new ConcreteVehicleDaoImpl(con);
        List<vehicle> vehicleList = dao.getAllVehicles();
        for (vehicle vehicle : vehicleList) {
            System.out.println(vehicle);
        }
    }

    // Search Vehicles by Type
    public static void searchVehicleByType(Connection con) throws SQLException {
        ConcreteVehicleDaoImpl dao = new ConcreteVehicleDaoImpl(con);
        System.out.println("Enter Vehicle Type: ");
        List<vehicle> vehicleList = dao.searchVehicleByType(sc.next());
        for (vehicle vehicle : vehicleList) {
            System.out.println(vehicle);
        }
    }

    // Add a new Vehicle
    public static void addVehicle(Connection con) throws SQLException {
        ConcreteVehicleDaoImpl dao = new ConcreteVehicleDaoImpl(con);
        vehicle vehicle = new vehicle();
        System.out.println("Enter Vehicle ID: ");
        vehicle.setVehicleId(sc.nextInt());
        System.out.println("Enter Registration Number: ");
        vehicle.setRegistrationNo(sc.next());
        System.out.println("Enter Vehicle Type: ");
        vehicle.setVehicleType(sc.next());
        System.out.println("Enter Vehicle Name: ");
        vehicle.setVehicleName(sc.next());
        System.out.println("Enter Model Year: ");
        vehicle.setModel(sc.nextInt());
        System.out.println("Enter Capacity: ");
        vehicle.setCapacity(sc.nextInt());
        System.out.println("Enter Status: ");
        vehicle.setStatus(sc.next());
        System.out.println("Enter Quantity: ");
        vehicle.setQuantity(sc.nextInt());
        System.out.println("Enter Admin ID: ");
        vehicle.setAdminId(sc.nextInt());
        dao.addVehicle(vehicle);
        System.out.println("Vehicle added successfully!");
    }

    // Add a Journey
    public static void addJourney() throws SQLException {
        try {
            // Ensure JDBC driver is loaded
            Class.forName("com.mysql.cj.jdbc.Driver");  // Added to handle ClassNotFoundException
            
            // Establish a connection to the database
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/transportdb","root","srec@7181");

            // Instantiate the concrete class for journeydaoImpl
            journeydaoImpl journeyDao = new journeydaoImpl(con);

            // Example: Perform operations using journeyDao
            journey journey = new journey();
            // Set journey attributes here...
            boolean isAdded = journeyDao.addJourney(journey);
            if (isAdded) {
                System.out.println("Journey added successfully!");
            } else {
                System.out.println("Failed to add journey.");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found: " + e.getMessage());
        }
    }

    // Update a Journey
    public static void updateJourney() throws SQLException {
        System.out.println("Updating journey...");
        // Implement the logic for updating a journey
    }

    // Cancel a Journey
    public static void cancelJourney() throws SQLException {
        System.out.println("Canceling journey...");
        // Implement the logic for canceling a journey
    }

    // Add a Booking
    public static void addBooking() throws SQLException {
        System.out.println("Adding booking...");
        // Implement the logic for adding a booking
    }

    // Check Booking by ID
    public static void checkBookingById() throws SQLException {
        System.out.println("Checking booking by ID...");
        // Implement the logic for checking a booking by ID
    }

    // Cancel a Booking
    public static void cancelBooking() throws SQLException {
        System.out.println("Canceling booking...");
        // Implement the logic for canceling a booking
    }

    // Add or Clear Payment
    public static void addOrClearPayment() throws SQLException {
        System.out.println("Adding or clearing payment...");
        // Implement the logic for adding or clearing payment
    }

    // Main Menu
    public static void main(String[] args) {
        try (Connection con = getConnection()) {
            int choice;
            do {
                System.out.println("1. Show Admins");
                System.out.println("2. Search by Admin Username");
                System.out.println("3. Add Admin");
                System.out.println("4. Show Vehicles");
                System.out.println("5. Search By Vehicle Type");
                System.out.println("6. Add Vehicle");
                System.out.println("7. Add Journey");
                System.out.println("8. Update Journey");
                System.out.println("9. Cancel Journey");
                System.out.println("10. Add Booking");
                System.out.println("11. Check Booking by ID");
                System.out.println("12. Cancel Booking");
                System.out.println("13. Add or Clear Payment");
                System.out.println("14. Exit");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();
                System.out.println();

                switch (choice) {
                    case 1:
                        showAdmins();
                        break;
                    case 2:
                        searchAdminByUsername();
                        break;
                    case 3:
                        addAdmin();
                        break;
                    case 4:
                        showVehicles(con);
                        break;
                    case 5:
                        searchVehicleByType(con);
                        break;
                    case 6:
                        addVehicle(con);
                        break;
                    case 7:
                        addJourney();
                        break;
                    case 8:
                        updateJourney();
                        break;
                    case 9:
                        cancelJourney();
                        break;
                    case 10:
                        addBooking();
                        break;
                    case 11:
                        checkBookingById();
                        break;
                    case 12:
                        cancelBooking();
                        break;
                    case 13:
                        addOrClearPayment();
                        break;
                    case 14:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
            } while (choice != 14);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

