/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package edu.fitnessny.gui2;

import edu.finessny.services.ProgrammeCRUD;
import edu.fitnessny.entities.Programme;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author rocky
 */
public class AjouterprogrammeController implements Initializable {

    @FXML
    private TextField tfNom;
    @FXML
    private TextField tfObjectif;
    @FXML
    private TextField tfCategorie;
    @FXML
    private TextArea taDescription;
    @FXML
    private Button btnAjouter;
    @FXML
    private Button btnAffiche;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void SaveProgramme(ActionEvent event) {
        
        String Nom = tfNom.getText() ;
        String Objectif = tfObjectif.getText() ;
        String Categorie= tfCategorie.getText() ;
        String Description = taDescription.getText() ;
        
        Programme p = new Programme(Nom,Objectif,Description,Categorie);
        ProgrammeCRUD pc = new ProgrammeCRUD(); 
        pc.ajouterProgramme(p);
        
         
    }

    @FXML
    private void AfficherProgramme(ActionEvent event) {
        
//         
//        try {
//            Parent root = FXMLLoader.load(getClass().getResource("DetailsWindow.fxml"));
//            
//            Scene scene = new Scene(root);
//           
//        } catch (IOException ex) {
//            System.out.println(ex.getMessage());
//        }
//        
        
    }
    
    
    
}
