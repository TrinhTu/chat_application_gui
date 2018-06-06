/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.home;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Tú Trinh
 */
public class Dangnhap {
    
        public boolean Dangnhap(String user, String pass){
            try {
                Connect connectDB = new Connect();
                Connection conn = connectDB.getconnect();
                String sql = "select * from login where username = ? and password =? ";
                PreparedStatement pst = conn.prepareStatement(sql);
                pst.setString(1, user);
                pst.setString(2, pass);
                ResultSet rs = pst.executeQuery();
                if(rs.next()){
                    return true;
                }
                else{
                    return false;
                }
            } catch (SQLException ex) {
                Logger.getLogger(Dangnhap.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
            
        }
}
