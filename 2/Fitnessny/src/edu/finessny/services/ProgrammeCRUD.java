/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.finessny.services;

import edu.finessny.utils.MyConnection;
import edu.fitnessny.entities.Programme;

import edu.fitnessny.entities.Exercice;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import edu.finessny.services.ExerciceCRUD;
import java.util.Collection;

/**
 *
 * @author rocky
 */
public class ProgrammeCRUD {

    public void ajouterProgramme(Programme p) {
        try {
            String requete2 = "INSERT INTO programme (nomProgramme,objectifProgramme,descriptionProgramme,categorieProgramme)" + " VALUES (?,?,?,?)";

            //  String requete8 = " UPDATE `programme` SET `idExercice` = '2' WHERE `programme`.`idProgramme` = 14"
            String requete8 = " UPDATE `programme`p , `exercice`e SET p.idExercice = e.idExercice  WHERE p.objectifProgramme = 'perdre du poids' AND e.categorieExercice = p.categorieProgramme ";
            String requete9 = " UPDATE `programme`p , `exercice`e SET p.idExercice = e.idExercice  WHERE p.objectifProgramme = 'rester en forme' AND e.categorieExercice = p.categorieProgramme ";
            String requete10 = " UPDATE `programme`p , `exercice`e SET p.idExercice = e.idExercice  WHERE p.objectifProgramme = 'se muscle' AND e.categorieExercice = p.categorieProgramme ";

            PreparedStatement pst = new MyConnection().getCnx().prepareStatement(requete2);
            PreparedStatement pst1 = new MyConnection().getCnx().prepareStatement(requete8);
            PreparedStatement pst2 = new MyConnection().getCnx().prepareStatement(requete9);
            PreparedStatement pst3 = new MyConnection().getCnx().prepareStatement(requete10);
            pst.setString(1, p.getnomProgramme());
            pst.setString(2, p.getobjectifProgramme());
            pst.setString(3, p.getdescriptionProgramme());
            pst.setString(4, p.getcategorieProgramme());
            //  pst.setString(3, p.getdescriptionProgramme());   pst1.setInt(1, e.getIdExercice() );

            pst.executeUpdate();
            pst1.executeUpdate();
            pst2.executeUpdate();
            pst3.executeUpdate();
            System.out.println(" Votre Programme  est Ajoutee ++ ");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    public List<Programme> afficherProgramme() {
        List<Programme> myList = new ArrayList<>();
        List<Exercice> myList1 = new ArrayList<>();
        
        try {
            //    String requete7 = "select nomExercice ,nbrRepetition ,nbrSerie ,descriptionExercice   from exercice e,programme p WHERE e.idExercice=p.idExercice;";

            String requete3 = "SELECT * FROM programme p , exercice e where p.idExercice =e.idExercice";
            // String requete6 = "SELECT * FROM programme p , exercice e where p.idExercice =e.idExercice";

            Statement st = new MyConnection().getCnx().createStatement();
            ResultSet rs = st.executeQuery(requete3);
          
            System.out.println("\n");
            while (rs.next()) {

                Programme p = new Programme();
                
                p.setnomProgramme(rs.getString("nomProgramme"));
                p.setobjectifProgramme(rs.getString("objectifProgramme"));
                p.setdescriptionProgramme(rs.getString("descriptionProgramme"));
                p.setcategorieProgramme(rs.getString("categorieProgramme"));
               
                 
//                Exercice e = new Exercice();
//                e.setNomExercice(rs.getString("nomExercice"));
//                e.setNbrRepetition(rs.getInt("nbrRepetition"));
//                e.setNbrSerie(rs.getInt("nbrSerie"));
//                e.setDescriptionExercice(rs.getString("descriptionExercice"));
//                e.setCategorieExercice(rs.getString("categorieExercice"));
//                
               myList.add(p);
               //myList1.add(e);
//ArrayList<String> a = new ArrayList<String>();
    
//    all.addAll(myList);
//     all.addAll(myList1);
    
    
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }

        return myList;
         
        

    }
    
    public List<Programme> afficherProgrammeAll() {
        List<Programme> myList = new ArrayList<>();
        List<Exercice> myList1 = new ArrayList<>();
        
        try {
            //    String requete7 = "select nomExercice ,nbrRepetition ,nbrSerie ,descriptionExercice   from exercice e,programme p WHERE e.idExercice=p.idExercice;";

            String requete3 = "SELECT * FROM programme";
            // String requete6 = "SELECT * FROM programme p , exercice e where p.idExercice =e.idExercice";

            Statement st = new MyConnection().getCnx().createStatement();
            ResultSet rs = st.executeQuery(requete3);
          
            System.out.println("\n");
            while (rs.next()) {

                Programme p = new Programme();
                
                p.setnomProgramme(rs.getString("nomProgramme"));
                p.setobjectifProgramme(rs.getString("objectifProgramme"));
                p.setdescriptionProgramme(rs.getString("descriptionProgramme"));
                p.setcategorieProgramme(rs.getString("categorieProgramme"));
               
                 
//                Exercice e = new Exercice();
//                e.setNomExercice(rs.getString("nomExercice"));
//                e.setNbrRepetition(rs.getInt("nbrRepetition"));
//                e.setNbrSerie(rs.getInt("nbrSerie"));
//                e.setDescriptionExercice(rs.getString("descriptionExercice"));
//                e.setCategorieExercice(rs.getString("categorieExercice"));
//                
               myList.add(p);
               //myList1.add(e);
//ArrayList<String> a = new ArrayList<String>();
    
//    all.addAll(myList);
//     all.addAll(myList1);
    
    
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }

        return myList;
         
        

    }

    /*    public List<Client> afficherClients() {
        List<Client> myList = new ArrayList<>();
        try {
            String requete3 = "SELECT * FROM Client";
            Statement st = new MyConnection().getCnx().createStatement();
            ResultSet rs = st.executeQuery(requete3);
            while (rs.next()) {
                Client c = new Client();
                c.setId_client(rs.getInt(1));
                c.setNom(rs.getString("nom"));
                c.setPrenom(rs.getString("prenom"));
                c.setPrenom(rs.getString("Date_nais"));
                myList.add(c);
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }

        return myList;
    }
     */
    public void supprimerProgramme() {
        try {
            String requete4 = "DELETE FROM programme WHERE idProgramme='1'";
            Statement st = new MyConnection().getCnx().createStatement();
            st.executeUpdate(requete4);
            System.out.println("Programme supprimer avec succés");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    public void modifierProgramme() {
        try {
            String requete5 = "Update programme SET nomProgramme='Chaaaa' Where idProgramme='3'";
            Statement st = new MyConnection().getCnx().createStatement();
            st.executeUpdate(requete5);
            System.out.println("Programme modifier avec succés");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

  

}
