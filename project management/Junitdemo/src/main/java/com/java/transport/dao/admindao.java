package com.java.transport.dao;

import java.sql.SQLException;
import java.util.List;
import com.java.transport.model.admin;

public interface admindao {

    admin searchByAdminId(int adminId) throws ClassNotFoundException, SQLException;
    List<admin> showAllAdmins() throws SQLException, ClassNotFoundException;
    String addAdmin(admin newAdmin) throws ClassNotFoundException, SQLException;
    String updateAdmin(admin updatedAdmin) throws ClassNotFoundException, SQLException;
    String deleteAdmin(int adminId) throws ClassNotFoundException, SQLException;
    String searchAdminByUsername(String username) throws ClassNotFoundException, SQLException; 
	
}
