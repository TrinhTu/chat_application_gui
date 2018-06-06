package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import main.new_windows;
import model.Dangnhap;

/**
 *
 * @author Tú Trinh
 */
public class Login implements Initializable{
    @FXML
    private TextField tf_user, tf_pass;
    
    @FXML
    AnchorPane submit ;
    
    @FXML
    public void enter(KeyEvent e){
        Login();
    }
    
    @FXML
    public void Login() {
        String text_user = tf_user.getText();
        String text_pass = tf_pass.getText();
        Dangnhap setlogin = new Dangnhap();
        if(setlogin.Dangnhap(text_user, text_pass)){
            //dong cua so
            Stage stage = (Stage) tf_user.getScene().getWindow();
            stage.close();
            //mo cua so moi
            new_windows windows = new new_windows();
            windows.windows("/view/home.fxml");
        }
        else{
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Login");
            alert.setContentText("Login failed !!!");
            alert.showAndWait();
        }
        
    }
    
    @FXML
    public void Cancel(ActionEvent event){
        System.exit(0);
    }
    
    
    @FXML 
    public void Register(MouseEvent event) throws IOException{
        new_windows windows = new new_windows();
        windows.windows("/view/register.fxml");
    }
    
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }
    
}
