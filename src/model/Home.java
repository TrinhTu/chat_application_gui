/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author Tú Trinh
 */
public class Home {
    public ObservableList getUsers(){
        try {
            ObservableList<ArrayList> user = FXCollections.observableArrayList();
            ArrayList<String> data;
            Connect connectDB = new Connect();
            Connection conn = connectDB.getconnect();
            String sql = "select * from login";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                data = new ArrayList();
                data.add(rs.getInt(4) + "");  // data[0]  = status
                data.add(rs.getString(2)) ; // data[1] = user
                user.add(data);
            }
            return user;
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }
}
