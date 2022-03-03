/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package edu.fitnessny.gui3;

import edu.finessny.services.ExerciceCRUD;
import edu.fitnessny.entities.Exercice;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;

/**
 * FXML Controller class
 *
 * @author rocky
 */
public class AjouterexericeController implements Initializable {

    @FXML
    private Button afficherExercice;
    @FXML
    private TextField tfNom;
    @FXML
    private TextField tfserie;
    @FXML
    private TextField tfrepit;
    @FXML
    private TextArea tfdesc;
    @FXML
    private TextField tfcategorie;
    @FXML
    private Button ajoutexercice;
    @FXML
    private AnchorPane ajout;
    @FXML
    private Button btnModifier;
    @FXML
    private Button btnSupprimer;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

   

    @FXML
    private void SaveExercice(ActionEvent event) {
          Exercice  e = new Exercice();
          
          if( tfNom.getText().length() <1 )
        {
        tfNom.setStyle("-fx-border-color: red ; -fx-border-width: 2px ;");
        }else {
         e.setNomExercice(tfNom.getText());
        }
        
       
          if( tfserie.getText().length() <1 )
        {
        tfserie.setStyle("-fx-border-color: red ; -fx-border-width: 2px ;");
        }else {
         e.setNbrSerie(Integer.parseInt(tfserie.getText()));
        }
        
          if( tfrepit.getText().length() <1 )
        {
        tfrepit.setStyle("-fx-border-color: red ; -fx-border-width: 2px ;");
        }else {
         e.setNbrSerie(Integer.parseInt(tfrepit.getText()));
        }
          
       
          
        e.setDescriptionExercice(tfdesc.getText());
        e.setCategorieExercice(tfcategorie.getText());
  
        
        
        
        ExerciceCRUD ex = new ExerciceCRUD(); 
        ex.ajouterExercice(e);
        
    }
    
    
     @FXML
    private void AfficherExercice(ActionEvent e) {
        
         FXMLLoader loader = new FXMLLoader(getClass().getResource("AfficherExercice.fxml"));
        try {
           
            Parent root = loader.load() ;
            AfficherExerciceController ew = loader.getController();

            afficherExercice.getScene().setRoot(root);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @FXML
    private void ModifierExercice(ActionEvent event) {
    }

    @FXML
    private void SupprimerExercice(ActionEvent event) {
       
    }
    
        
        
    }

   

