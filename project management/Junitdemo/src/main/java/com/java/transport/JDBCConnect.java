
//import java.sql.*;
//public class jdbcconnect {
//    public static Connection getConnection() throws ClassNotFoundException, SQLException {
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        return DriverManager.getConnection("jdbc:mysql://localhost:3306/transport_port", "root", "srec@7181");
//    }
//    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//        System.out.println("Connected to database");
//    }
//
//public static void showAdmin() throws SQLException, ClassNotFoundException {
//    String query = "SELECT * FROM Admin";
//    try (Connection con = getConnection();
//         Statement stmt = con.createStatement();
//         ResultSet rs = stmt.executeQuery(query)) {
//        while (rs.next()) {
//            System.out.println("Admin ID: " + rs.getInt("adminId") +
//                               ", Name: " + rs.getString("adminName") +
//                               ", Gender: " + rs.getString("Gender") +
//                               ", Mobile: " + rs.getString("Mobile") +
//                               ", Email: " + rs.getString("Email"));
//        }
//    }
//}
//
//public static void searchAdminByUsername(String username) throws SQLException, ClassNotFoundException {
//    String query = "SELECT * FROM Admin WHERE Username = ?";
//    try (Connection con = getConnection();
//         PreparedStatement stmt = con.prepareStatement(query)) {
//        stmt.setString(1, username);
//        try (ResultSet rs = stmt.executeQuery()) {
//            if (rs.next()) {
//                System.out.println("Admin ID: " + rs.getInt("adminId") +
//                                   ", Name: " + rs.getString("adminName") +
//                                   ", Gender: " + rs.getString("Gender"));
//            } else {
//                System.out.println("No admin found with username: " + username);
//            }
//        }
//    }
//}
//public static void addAdmin(int adminId, String adminName, String gender, Date dob, Date doj, String mobile, String email, String username, String password) throws SQLException, ClassNotFoundException {
//    String query = "INSERT INTO Admin (adminId, adminName, Gender, Dob, DOJ, Mobile, Email, Username, password) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
//    try (Connection con = getConnection();
//         PreparedStatement stmt = con.prepareStatement(query)) {
//        stmt.setInt(1, adminId);
//        stmt.setString(2, adminName);
//        stmt.setString(3, gender);
//        stmt.setDate(4, dob);
//        stmt.setDate(5, doj);
//        stmt.setString(6, mobile);
//        stmt.setString(7, email);
//        stmt.setString(8, username);
//        stmt.setString(9, password);
//        int rowsAffected = stmt.executeUpdate();
//        System.out.println("Admin added successfully, rows affected: " + rowsAffected);
//    }
//}
//public static void showVehicle() throws SQLException, ClassNotFoundException {
//    String query = "SELECT * FROM Vehicle";
//    try (Connection con = getConnection();
//         Statement stmt = con.createStatement();
//         ResultSet rs = stmt.executeQuery(query)) {
//        while (rs.next()) {
//            System.out.println("Vehicle ID: " + rs.getInt("VehicleId") +
//                               ", Registration No: " + rs.getString("RegistrationNo") +
//                               ", Type: " + rs.getString("VehicleType") +
//                               ", Status: " + rs.getString("Status"));
//        }
//    }
//}
//}
package com.java.transport;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class JDBCConnect {
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");        
        String url = "jdbc:mysql://localhost:3306/transport_portabl";
        String username = "root";
        String password = "srec@7181";        
        return DriverManager.getConnection(url, username, password);
    }
    public static void main(String[] args) {
        try {
            Connection con = getConnection();
            if (con != null) {
                System.out.println("Database connected successfully!");
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}