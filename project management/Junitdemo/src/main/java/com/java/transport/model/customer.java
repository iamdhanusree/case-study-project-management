package com.java.transport.model;

public class customer {
    private int customerId;
    private String customerName;
    private int age;
    private String mobile;
    private String email;

    // Default Constructor
    public customer() {}

    // Parameterized Constructor
    public customer(int customerId, String customerName, int age, String mobile, String email) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.age = age;
        this.mobile = mobile;
        this.email = email;
    }

    // Getters and Setters
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer [customerId=" + customerId + ", customerName=" + customerName + 
               ", age=" + age + ", mobile=" + mobile + ", email=" + email + "]";
    }
}
