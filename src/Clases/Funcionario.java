/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author felipe
 */
public class Funcionario {
    private String rut;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String domicilio;
    private String diaNac;
    private String mesNac;
    private String anoNac;
    private double sueldo;

    public Funcionario() {
    }

    public Funcionario(String rut, String nombre, String apellidoPaterno, String apellidoMaterno, String domicilio, String diaNac, String mesNac, String anoNac, double sueldo) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.domicilio = domicilio;
        this.diaNac = diaNac;
        this.mesNac = mesNac;
        this.anoNac = anoNac;
        this.sueldo = sueldo;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getDiaNac() {
        return diaNac;
    }

    public void setDiaNac(String diaNac) {
        this.diaNac = diaNac;
    }

    public String getMesNac() {
        return mesNac;
    }

    public void setMesNac(String mesNac) {
        this.mesNac = mesNac;
    }

    public String getAnoNac() {
        return anoNac;
    }

    public void setAnoNac(String anoNac) {
        this.anoNac = anoNac;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

   
    public String getAtributos(){
        return rut+","+apellidoPaterno+" "+apellidoMaterno+" "+nombre+" "+","
                +diaNac+"/"+mesNac+"/"+anoNac+","+sueldo;
    }
    
    
}
