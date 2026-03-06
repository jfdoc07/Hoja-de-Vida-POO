/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author Home
 */
public class Profesional {
    
    private final String perfilProfesional;
    private final String experienciaLaboral;
    private final String formacionAcademica;
    private final String aptitudes;

    public Profesional(String perfilProfesional, String experienciaLaboral, String formacionAcademica, String aptitudes) {
        this.perfilProfesional = perfilProfesional;
        this.experienciaLaboral = experienciaLaboral;
        this.formacionAcademica = formacionAcademica;
        this.aptitudes = aptitudes;
    }

    public String getPerfilProfesional() {
        return perfilProfesional;
    }

    public String getExperienciaLaboral() {
        return experienciaLaboral;
    }

    public String getFormacionAcademica() {
        return formacionAcademica;
    }

    public String getAptitudes() {
        return aptitudes;
    }
    
}
