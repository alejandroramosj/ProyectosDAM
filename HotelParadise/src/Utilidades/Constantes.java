/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

/**
 *
 * @author Juanan
 */
public interface Constantes {
    //Base de datos
    public String nombreBaseDeDatos = "hotelparadise";
    public String usuarioBaseDeDatos = "root";
    public String passwordBaseDeDatos = "";
    
    //Patrones
    public String patron_Dni = "[0-9]{7,8}[A-Za-z]";
    public String patron_Nombre = "^[\\p{L} .'-]+$";
    public String patron_Apellido = "^[\\p{L} .'-]+$";
    public String patron_Telefono = "^(\\+34|0034|34)?[6789]\\d{8}$";
    public String patron_Direccion = "^[\\p{L} .'-]+$";
    public String patron_Localidad = "^[\\p{L} .'-]+$";
    public String patron_Correo = "([a-z0-9]+(\\.?[a-z0-9])*)+@(([a-z]+)\\.([a-z]+))+";
    public String patron_Password = "^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$";
    
}

