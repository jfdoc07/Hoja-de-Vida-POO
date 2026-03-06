/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author Home
 */
public class Persona {
    private final String nombre;
    private final String profesion;
    private final String correo;
    private final String numeroTelefono;
    private final String tipoDocumento;
    private final String numeroDocumento;

    public Persona(String nombre, String profesion, String correo, String numeroTelefono, String tipoDocumento, String numeroDocumento) {
        this.nombre = nombre.toUpperCase();
        this.profesion = profesion.toUpperCase();
        this.correo = correo.toLowerCase();
        this.numeroTelefono = numeroTelefono;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getProfesion() {
        return profesion;
    }

    public String getCorreo() {
        return correo;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }
    
}
