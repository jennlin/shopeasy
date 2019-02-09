/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author bciavarella
 */
public class SearchGeneralStoresController implements Initializable {

    public void winning(ActionEvent event)throws IOException {
        System.out.println("You clicked me!");
        Parent general_results_parent = FXMLLoader.load(getClass().getResource("GeneralResults.fxml"));
        Scene general_results_scene = new Scene(general_results_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(general_results_scene);
        app_stage.show();
    }
    
    public void losing(ActionEvent event)throws IOException {
        System.out.println("You clicked me!");
        Parent store_results_parent = FXMLLoader.load(getClass().getResource("StoreResults.fxml"));
        Scene store_results_scene = new Scene(store_results_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(store_results_scene);
        app_stage.show();
    }
    
    public void generalSearch(ActionEvent event)throws IOException{
        
        
    }
    public void storeSearch(ActionEvent event)throws  IOException{
  
    
    
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
