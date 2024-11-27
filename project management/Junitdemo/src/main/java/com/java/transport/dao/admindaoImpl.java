
package com.java.transport.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.java.transport.model.admin;
import com.java.transport.util.ConnectionHelper;

public class admindaoImpl implements admindao {

    Connection connection;
    PreparedStatement pst;

    @Override
    public admin searchByAdminId(int adminId) throws ClassNotFoundException, SQLException {
        admin adminObj = null;
        connection = ConnectionHelper.getConnection();
        String cmd = "SELECT * FROM Admin WHERE AdminId = ?";
        pst = connection.prepareStatement(cmd);
        pst.setInt(1, adminId);
        ResultSet rs = pst.executeQuery();
        while (rs.next()) {
            adminObj = new admin();
            adminObj.setAdminId(rs.getInt("AdminId"));
            adminObj.setAdminName(rs.getString("AdminName"));
            adminObj.setGender(rs.getString("Gender"));
            adminObj.setDob(rs.getString("DOB"));
            adminObj.setDoj(rs.getString("DOJ"));
            adminObj.setMobile(rs.getString("Mobile"));
            adminObj.setEmail(rs.getString("Email"));
            adminObj.setUsername(rs.getString("Username"));
            adminObj.setPassword(rs.getString("Password"));
        }
        return adminObj;
    }

    @Override
    public List<admin> showAllAdmins() throws SQLException, ClassNotFoundException {
        connection = ConnectionHelper.getConnection();
        List<admin> adminList = new ArrayList<>();
        admin adminObj = null;
        String cmd = "SELECT * FROM Admin";
        pst = connection.prepareStatement(cmd);
        ResultSet rs = pst.executeQuery();
        while (rs.next()) {
            adminObj = new admin();
            adminObj.setAdminId(rs.getInt("AdminId"));
            adminObj.setAdminName(rs.getString("AdminName"));
            adminObj.setGender(rs.getString("Gender"));
            adminObj.setDob(rs.getString("DOB"));
            adminObj.setDoj(rs.getString("DOJ"));
            adminObj.setMobile(rs.getString("Mobile"));
            adminObj.setEmail(rs.getString("Email"));
            adminObj.setUsername(rs.getString("Username"));
            adminObj.setPassword(rs.getString("Password"));
            adminList.add(adminObj);
        }
        return adminList;
    }

    @Override
    public String addAdmin(admin newAdmin) throws ClassNotFoundException, SQLException {
        connection = ConnectionHelper.getConnection();
        String cmd = "INSERT INTO Admin (AdminId, AdminName, Gender, DOB, DOJ, Mobile, Email, Username, Password) VALUES (?,?,?,?,?,?,?,?,?)";
        pst = connection.prepareStatement(cmd);
        pst.setInt(1, newAdmin.getAdminId());
        pst.setString(2, newAdmin.getAdminName());
        pst.setString(3, newAdmin.getGender());
        pst.setString(4, newAdmin.getDob());
        pst.setString(5, newAdmin.getDoj());
        pst.setString(6, newAdmin.getMobile());
        pst.setString(7, newAdmin.getEmail());
        pst.setString(8, newAdmin.getUsername());
        pst.setString(9, newAdmin.getPassword());
        pst.executeUpdate();
        return "Admin added successfully!";
    }

    @Override
    public String updateAdmin(admin updatedAdmin) throws ClassNotFoundException, SQLException {
        connection = ConnectionHelper.getConnection();
        String cmd = "UPDATE Admin SET AdminName = ?, Gender = ?, DOB = ?, DOJ = ?, Mobile = ?, Email = ?, Username = ?, Password = ? WHERE AdminId = ?";
        pst = connection.prepareStatement(cmd);
        pst.setString(1, updatedAdmin.getAdminName());
        pst.setString(2, updatedAdmin.getGender());
        pst.setString(3, updatedAdmin.getDob());
        pst.setString(4, updatedAdmin.getDoj());
        pst.setString(5, updatedAdmin.getMobile());
        pst.setString(6, updatedAdmin.getEmail());
        pst.setString(7, updatedAdmin.getUsername());
        pst.setString(8, updatedAdmin.getPassword());
        pst.setInt(9, updatedAdmin.getAdminId());
        pst.executeUpdate();
        return "Admin updated successfully!";
    }

    @Override
    public String deleteAdmin(int adminId) throws ClassNotFoundException, SQLException {
        connection = ConnectionHelper.getConnection();
        String cmd = "DELETE FROM Admin WHERE AdminId = ?";
        pst = connection.prepareStatement(cmd);
        pst.setInt(1, adminId);
        pst.executeUpdate();
        return "Admin deleted successfully!";
    }

	@Override
	public String searchAdminByUsername(String username) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}
}
