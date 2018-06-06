/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import model.Home;

/**
 *
 * @author Tú Trinh
 */
public class home implements Initializable{
    ObservableList<ArrayList> user = FXCollections.observableArrayList();
    @FXML
    ListView<HBox> listview_contact ;
    
    
    public void ListUser(){
        
        Home homepage = new Home();
        ObservableList<HBox> list = FXCollections.observableArrayList();
        user = homepage.getUsers();
        for (ArrayList u : user) {
            ImageView img_on = new ImageView("/icon/online.png");
            img_on.setFitHeight(20);
            img_on.setFitWidth(20);
            ImageView img_off = new ImageView("/icon/offline.png");
            img_off.setFitHeight(20);
            img_off.setFitWidth(20);
            HBox hb_user;
            Label name = new Label(u.get(1).toString()); 
            if (u.get(0).toString().equals("1")){
                hb_user = new HBox(img_on, name);
            }
            else{
                hb_user = new HBox(img_off,name);
            }
            list.add(hb_user);
        }
        listview_contact.setItems(list);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ListUser();
    }
    
}
