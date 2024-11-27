package com.java.transport.dao;

import java.sql.SQLException;
import java.util.List;
import com.java.transport.model.customer;

public interface customerdao {
    
    String addCustomer(customer customer) throws ClassNotFoundException, SQLException;
    List<customer> getAllCustomers() throws SQLException, ClassNotFoundException;
    customer getCustomerById(int customerId) throws ClassNotFoundException, SQLException;
    String updateCustomer(customer customer) throws ClassNotFoundException, SQLException;
    String deleteCustomer(int customerId) throws ClassNotFoundException, SQLException;
}
