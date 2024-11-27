package com.java.transport;

public class customer {
	
	    private int customerID;
	    private String customerName;
	    private int age;
	    private String mobile;
	    private String email;

	   
	    public customer(int customerID, String customerName, int age, String mobile, String email) {
	        this.customerID = customerID;
	        this.customerName = customerName;
	        this.age = age;
	        this.mobile = mobile;
	        this.email = email;
	    }

	    
	    public int getCustomerID() {
	        return customerID;
	    }

	    public void setCustomerID(int customerID) {
	        this.customerID = customerID;
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
	}
