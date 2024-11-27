package com.java.transport.model;

public class vehicle {

    private int vehicleId;
    private String registrationNo;
    private String vehicleType;
    private String vehicleName;
    private int model; // Change this to int if the model is an integer
    private int capacity;
    private String status;
    private int quantity;
    private int adminId;

    // Default constructor
    public vehicle() {}

    // Constructor with parameters
    public vehicle(int vehicleId, String registrationNo, String vehicleType, String vehicleName,
                   int model, int capacity, String status, int quantity, int adminId) {
        this.vehicleId = vehicleId;
        this.registrationNo = registrationNo;
        this.vehicleType = vehicleType;
        this.vehicleName = vehicleName;
        this.model = model;
        this.capacity = capacity;
        this.status = status;
        this.quantity = quantity;
        this.adminId = adminId;
    }

    // Getters and setters
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

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model; // Ensure this method accepts an int
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    @Override
    public String toString() {
        return "vehicle [vehicleId=" + vehicleId + ", registrationNo=" + registrationNo + ", vehicleType=" + vehicleType +
                ", vehicleName=" + vehicleName + ", model=" + model + ", capacity=" + capacity + ", status=" + status +
                ", quantity=" + quantity + ", adminId=" + adminId + "]";
    }
}
