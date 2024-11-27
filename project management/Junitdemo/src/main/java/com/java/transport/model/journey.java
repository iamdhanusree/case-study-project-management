//package com.java.transport.model;
//
//import java.sql.Time;
//
//public class journey {
//    private int journeyId;
//    private int vehicleId;
//    private String registrationNo;
//    private String startStation;
//    private String endStation;
//    private Time startTime;
//    private Time departureTime;
//    private String type;
//    private int adminId;
//    private double price;
//
//    // Default Constructor
//    public journey() {}
//
//    // Parameterized Constructor
//    public journey(int journeyId, int vehicleId, String registrationNo, String startStation, 
//                   String endStation, Time startTime, Time departureTime, String type, 
//                   int adminId, double price) {
//        this.journeyId = journeyId;
//        this.vehicleId = vehicleId;
//        this.registrationNo = registrationNo;
//        this.startStation = startStation;
//        this.endStation = endStation;
//        this.startTime = startTime;
//        this.departureTime = departureTime;
//        this.type = type;
//        this.adminId = adminId;
//        this.price = price;
//    }
//
//    // Getters and Setters
//    public int getJourneyId() {
//        return journeyId;
//    }
//
//    public void setJourneyId(int journeyId) {
//        this.journeyId = journeyId;
//    }
//
//    public int getVehicleId() {
//        return vehicleId;
//    }
//
//    public void setVehicleId(int vehicleId) {
//        this.vehicleId = vehicleId;
//    }
//
//    public String getRegistrationNo() {
//        return registrationNo;
//    }
//
//    public void setRegistrationNo(String registrationNo) {
//        this.registrationNo = registrationNo;
//    }
//
//    public String getStartStation() {
//        return startStation;
//    }
//
//    public void setStartStation(String startStation) {
//        this.startStation = startStation;
//    }
//
//    public String getEndStation() {
//        return endStation;
//    }
//
//    public void setEndStation(String endStation) {
//        this.endStation = endStation;
//    }
//
//    public Time getStartTime() {
//        return startTime;
//    }
//
//    public void setStartTime(Time startTime) {
//        this.startTime = startTime;
//    }
//
//    public Time getDepartureTime() {
//        return departureTime;
//    }
//
//    public void setDepartureTime(Time departureTime) {
//        this.departureTime = departureTime;
//    }
//
//    public String getType() {
//        return type;
//    }
//
//    public void setType(String type) {
//        this.type = type;
//    }
//
//    public int getAdminId() {
//        return adminId;
//    }
//
//    public void setAdminId(int adminId) {
//        this.adminId = adminId;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public void setPrice(double price) {
//        this.price = price;
//    }
//
//    @Override
//    public String toString() {
//        return "Journey [journeyId=" + journeyId + ", vehicleId=" + vehicleId + ", registrationNo=" + registrationNo + 
//               ", startStation=" + startStation + ", endStation=" + endStation + ", startTime=" + startTime + 
//               ", departureTime=" + departureTime + ", type=" + type + ", adminId=" + adminId + ", price=" + price + "]";
//    }
//}
package com.java.transport.model;

import java.sql.Time;

public class journey {
    private int journeyId;
    private int vehicleId;
    private String registrationNo;
    private String startStation;
    private String endStation;
    private Time startTime;
    private Time departureTime;
    private String type;
    private int adminId;
    private double price;

    // Default Constructor
    public journey() {}

    // Parameterized Constructor
    public journey(int journeyId, int vehicleId, String registrationNo, String startStation, 
                   String endStation, Time startTime, Time departureTime, String type, 
                   int adminId, double price) {
        this.journeyId = journeyId;
        this.vehicleId = vehicleId;
        this.registrationNo = registrationNo;
        this.startStation = startStation;
        this.endStation = endStation;
        this.startTime = startTime;
        this.departureTime = departureTime;
        this.type = type;
        this.adminId = adminId;
        this.price = price;
    }

    // Getters and Setters
    public int getJourneyId() {
        return journeyId;
    }

    public void setJourneyId(int journeyId) {
        this.journeyId = journeyId;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getRegistrationNo() {
        return registrationNo;
    }

    public void setRegistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;
    }

    public String getStartStation() {
        return startStation;
    }

    public void setStartStation(String startStation) {
        this.startStation = startStation;
    }

    public String getEndStation() {
        return endStation;
    }

    public void setEndStation(String endStation) {
        this.endStation = endStation;
    }

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public Time getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Time departureTime) {
        this.departureTime = departureTime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Journey [journeyId=" + journeyId + ", vehicleId=" + vehicleId + ", registrationNo=" + registrationNo + 
               ", startStation=" + startStation + ", endStation=" + endStation + ", startTime=" + startTime + 
               ", departureTime=" + departureTime + ", type=" + type + ", adminId=" + adminId + ", price=" + price + "]";
    }
}
