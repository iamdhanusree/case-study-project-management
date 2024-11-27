package com.java.transport;
import java.sql.*;
import java.util.Scanner;
public class Customerfile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {            
            Class.forName("com.mysql.cj.jdbc.Driver");           
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/transport_portabl", "root", "srec@7181");
            System.out.println("--- Transport Management System ---");
            System.out.println("1. Add Customer");
            System.out.println("2. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            switch (choice) {
                case 1:
                    addCustomer(con, scanner);
                    break;
                case 2:
                    System.out.println("Exiting program. Goodbye!");
                    con.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }    
    public static void addCustomer(Connection con, Scanner scanner) throws SQLException {
        System.out.println("--- Add Customer ---");

        System.out.print("Enter Customer ID: ");
        int customerId = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter Customer Name: ");
        String customerName = scanner.nextLine();

        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter Mobile Number: ");
        String mobile = scanner.nextLine();

        System.out.print("Enter Email: ");
        String email = scanner.nextLine();

        String query = "INSERT INTO Customer (CustomerId, CustomerName, Age, Mobile, Email) VALUES (?, ?, ?, ?, ?)";
        
        PreparedStatement pstmt = con.prepareStatement(query);
        pstmt.setInt(1, customerId);
        pstmt.setString(2, customerName);
        pstmt.setInt(3, age);
        pstmt.setString(4, mobile);
        pstmt.setString(5, email);

        int rows = pstmt.executeUpdate();
        if (rows > 0) {
            System.out.println("Customer added successfully!");
        } else {
            System.out.println("Failed to add customer.");
        }
    }
}