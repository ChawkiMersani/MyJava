/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.fitnessny.entities;

/**
 *
 * @author rocky
 */
public class Programme {

    private String nomProgramme;
    private int idProgramme;
    private String objectifProgramme;
    private String descriptionProgramme;
    private int idExercice;
    private String categorieProgramme;
    

    public Programme(String nomProgramme, String objectifProgramme, String descriptionProgramme, String categorieProgramme) {
        this.nomProgramme = nomProgramme;
        this.objectifProgramme = objectifProgramme;
        this.descriptionProgramme = descriptionProgramme;
        this.categorieProgramme = categorieProgramme;
    }

    public Programme(String nomProgramme, int idProgramme, String objectifProgramme, String descriptionProgramme, int idExercice,String categorieProgramme) {
        this.nomProgramme = nomProgramme;
        this.idProgramme = idProgramme;
        this.objectifProgramme = objectifProgramme;
        this.descriptionProgramme = descriptionProgramme;
        this.idExercice = idExercice;
        this.categorieProgramme = categorieProgramme ;
    }

    public String getcategorieProgramme() {
        return categorieProgramme;
    }

    public void setcategorieProgramme(String categorieProgramme) {
        this.categorieProgramme = categorieProgramme;
    }

    public Programme() {

        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getnomProgramme() {
        return nomProgramme;
    }

    public void setnomProgramme(String nomProgramme) {
        this.nomProgramme = nomProgramme;
    }

    public int getidProgramme() {
        return idProgramme;
    }

    public void setidProgramme(int idProgramme) {
        this.idProgramme = idProgramme;
    }

    public String getobjectifProgramme() {
        return objectifProgramme;
    }

    public void setobjectifProgramme(String objectifProgramme) {
        this.objectifProgramme = objectifProgramme;
    }

    public String getdescriptionProgramme() {
        return descriptionProgramme;
    }

    public void setdescriptionProgramme(String descriptionProgramme) {
        this.descriptionProgramme = descriptionProgramme;
    }

    public int getidExercice() {
        return idExercice;
    }

    public void setidExercice(int idExercice) {
        this.idExercice = idExercice;
    }

    @Override
    public String toString() {
        return "Programme{" + "nomProgramme=" + nomProgramme + ", idProgramme=" + idProgramme + ", objectifProgramme=" + objectifProgramme + ", descriptionProgramme=" + descriptionProgramme + ", idExercice=" + idExercice + ", categorieProgramme=" + categorieProgramme + '}';
    }

}
