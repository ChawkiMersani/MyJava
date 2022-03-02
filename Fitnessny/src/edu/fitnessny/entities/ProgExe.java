/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.fitnessny.entities;

/**
 *
 * @author rocky
 */
public class ProgExe {
    
    private int idProgExe ;
    private int idProgramme ; 
    private int idExercice ;

    public ProgExe() {
    }

    public ProgExe(int idProgExe, int idProgramme, int idExercice) {
        this.idProgExe = idProgExe;
        this.idProgramme = idProgramme;
        this.idExercice = idExercice;
    }

    public int getIdProgExe() {
        return idProgExe;
    }

    public void setIdProgExe(int idProgExe) {
        this.idProgExe = idProgExe;
    }

    public int getIdProgramme() {
        return idProgramme;
    }

    public void setIdProgramme(int idProgramme) {
        this.idProgramme = idProgramme;
    }

    public int getIdExercice() {
        return idExercice;
    }

    public void setIdExercice(int idExercice) {
        this.idExercice = idExercice;
    }

    @Override
    public String toString() {
        return "ProgExe{" + "idProgExe=" + idProgExe + ", idProgramme=" + idProgramme + ", idExercice=" + idExercice + '}';
    }
    
    
}
