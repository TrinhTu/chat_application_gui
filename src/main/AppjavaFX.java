package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Tú Trinh
 */
public class AppjavaFX extends Application {
    
    @Override
    public void start(Stage stage) {
        try {
                Parent root = FXMLLoader.load(getClass().getResource("/view/login.fxml"));
                Scene scene = new Scene(root);
                stage.setTitle("Login");	
                stage.setScene(scene);
                //primaryStage.setResizable(false);
                stage.show();
        } catch(Exception e) {
                e.printStackTrace();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
