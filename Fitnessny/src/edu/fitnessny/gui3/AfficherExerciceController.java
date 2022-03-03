/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package edu.fitnessny.gui3;

import edu.fitnessny.entities.Exercice;
import edu.finessny.services.ExerciceCRUD;

import java.io.IOException;
import javafx.collections.FXCollections;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author rocky
 */
public class AfficherExerciceController implements Initializable {

    @FXML
    private TableView<Exercice> TabExe;
    @FXML
    private TableColumn<Exercice, String> nomExercice;
    @FXML
    private TableColumn<Exercice, String> nbrSerie;
    @FXML
    private TableColumn<Exercice, String> nbrRep;
    @FXML
    private TableColumn<Exercice, String> Categorie;
    @FXML
    private TableColumn<Exercice, String> Description;
    ObservableList<Exercice> Exercice = AfficherExercice();
    @FXML
    private Button ajouterexe;
    @FXML
    private Button btnModifier;
    @FXML
    private Button btnSupprimer;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        // nom.setCellValueFactory(new PropertyValueFactory<Programme, String>("nomProgramme"));
        // idExercice.setCellValueFactory(new PropertyValueFactory<Exercice, String>("idExercice"));
        nomExercice.setCellValueFactory(new PropertyValueFactory<Exercice, String>("nomExercice"));
        nbrRep.setCellValueFactory(new PropertyValueFactory<Exercice, String>("nbrRepetition"));
        nbrSerie.setCellValueFactory(new PropertyValueFactory<Exercice, String>("nbrSerie"));
        Categorie.setCellValueFactory(new PropertyValueFactory<Exercice, String>("categorieExercice"));
        Description.setCellValueFactory(new PropertyValueFactory<Exercice, String>("descriptionExercice"));
        TabExe.setItems(Exercice);

        // TODO
    }

    private ObservableList<Exercice> AfficherExercice() {
        ExerciceCRUD ex = new ExerciceCRUD();
        List<Exercice> exer = ex.afficherExercice();

        return FXCollections.observableList(exer);

    }
    
    

    @FXML
    public void AjouterExe(ActionEvent e) {
        
      FXMLLoader loader = new FXMLLoader(getClass().getResource("ajouterexercice.fxml"));
        try {
           
            Parent root = loader.load() ;
            AjouterexericeController  ew = loader.getController();

            TabExe.getScene().setRoot(root);

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
