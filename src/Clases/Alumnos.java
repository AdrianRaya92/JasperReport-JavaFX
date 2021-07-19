/**
 * Archivo: Alumnos.java
 * Objetivo: Definir a los alumnos del ArrayList
 * Persona: Adrián Raya Hernández
 */
package Clases;

/**
 * Esta clase define a un alumno por su dni, siglas, nota y provincia
 * @author Adrian Raya Hernandez
 * @version 1.0.0
 */
public class Alumnos {
    /**
     * Variables
     * Creación de String dni, siglas y provincia.
     * Cración de double nota.
     */
    private String dni, siglas, provincia;
    private double nota;
    
    /**
     * Constructor con parámetros de la clase almunos. 
     * @param dni Es el DNI que será único de cada alumno.
     * @param siglas Son las siglas del Módulo en el que está el alumno.
     * @param nota Es la nota numérica que ha sacado el alumno en el módulo.
     * @param provincia  Es la provincia donde vive el alumno.
     */
    public Alumnos(String dni, String siglas, double nota, String provincia){
        this.dni=dni;
        this.siglas=siglas;
        this.nota=nota;
        this.provincia=provincia;
    }
    /**
     * Función Get para obtener el DNI del alumno.
     * @return  String el dni del alumno.
     */
    public String getDni(){
        return dni;
    }
    /**
     * Función Set para agregar dni del alumno.
     * @param dni Es el DNI que será único de cada alumno.
     */
    public void setDni(String dni){
        this.dni=dni;
    }
    /**
     * Función Get para obtener las siglas del Módulo del alumno.
     * @return String las siglas del módulo.
     */
    public String getSiglas(){
        return siglas;
    }
    /**
     * Función Set para agregar las siglas del módulo.
     * @param siglas Son las siglas del Módulo matriculado por el alumno.
     */
    public void setSiglas(String siglas){
        this.siglas=siglas;
    }
    /**
     * Función Get para obtener la nota que tiene el alumno en el módulo.
     * @return double la nota numérica del alumno.
     */
    public double getNota(){
        return nota;
    }
    /**
     * Función Set para agregar la nota del módulo.
     * @param nota Es la nota numérica que ha sacado el alumno en el módulo.
     */
    public void setNota(double nota){
        this.nota=nota;
    }    
    /**
     * Función Get para obtener la provincia donde vive el alumno.
     * @return String de la provincia.
     */
    public String getProvincia(){
        return provincia;
    }
    /**
     * Función Set para agregar la provincia donde vive el alumno.
     * @param provincia Es la provincia donde vive el alumno.
     */
    public void setProvincia(String provincia){
        this.provincia=provincia;
    }
}
