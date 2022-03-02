/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package edu.fitnessny.gui2;
//
import edu.finessny.utils.MyConnection;
import edu.finessny.services.ProgrammeCRUD;
import edu.fitnessny.entities.Programme;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
/**
 * FXML Controller class
 *
 * @author rocky
 */
public class AfficherProgrammeController implements Initializable {


    @FXML
    private TableView<Programme> ProgTable;
    @FXML
    private TableColumn<Programme, String> nom;
    @FXML
    private TableColumn<Programme, String> objectif;
    @FXML
    private TableColumn<Programme, String> categorie;
    @FXML
    private TableColumn<Programme, String> description;
    @FXML
    
    ObservableList<Programme> Programme = AfficherProgramme();

   
    private Button btnajouterprog;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
 
        nom.setCellValueFactory(new PropertyValueFactory<Programme, String>("nomProgramme"));
        objectif.setCellValueFactory(new PropertyValueFactory<Programme, String>("objectifProgramme"));
        categorie.setCellValueFactory(new PropertyValueFactory<Programme, String>("descriptionProgramme"));
        description.setCellValueFactory(new PropertyValueFactory<Programme, String>("categorieProgramme"));
        ProgTable.setItems(Programme);
        // TODO
    }    
    

    private ObservableList<Programme>  AfficherProgramme() {
        
        ProgrammeCRUD prog = new ProgrammeCRUD();
        List<Programme> p = prog.afficherProgrammeAll();

        return FXCollections.observableList(p);
         
         
        
    }
}
