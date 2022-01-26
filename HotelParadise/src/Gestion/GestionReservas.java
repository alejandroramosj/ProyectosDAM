/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestion;

import Modelo.Reserva;
import Utilidades.Utilidades;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author aleja
 */
public class GestionReservas {

    public GestionReservas() {
    }
    
    
    public static void realizarReserva(Reserva reserva){
        Connection conexion = Utilidades.crearConexion();
        try {
            
            String sql = "INSERT INTO reservas (fecha_entrada,fecha_salida,dias,preciototal,dni_cliente,id_habitacion) VALUES (?,?,?,?,?,?)";
            PreparedStatement st = conexion.prepareStatement(sql);
            st.setDate(1, Utilidades.LocalDateAMysqlDate(reserva.getFechaEntrada()));
            st.setDate(2, Utilidades.LocalDateAMysqlDate(reserva.getFechaSalida()));
            st.setInt(3, reserva.getDias());
            st.setInt(4, reserva.getPrecioTotal());
            st.setString(5, reserva.getDniCliente());
            st.setInt(6, reserva.getIdHabitacion());
         
            st.executeUpdate();
           
            
            conexion.commit();
            Utilidades.cerrarConexion(conexion);
            
            
        } catch (SQLException e) {
            
        }
    }
    
    public static boolean maximoReservas(String dni){
        int contadorReservas = 0;
        
        Connection conexion = Utilidades.crearConexion();
        try {
            Statement stm = conexion.createStatement();
            String sql = "SELECT * from reservas where dni_Cliente = '" + dni + "'";
            ResultSet rs = stm.executeQuery(sql);

            while (rs.next()) {
                contadorReservas++;
            }
            

        } catch (SQLException e) {

        }
        if (contadorReservas <= 3) {
            return true;
        }
        return false;
    }
    
    public ArrayList<Reserva> obtenerReservas(String dni){
        ArrayList<Reserva> reservas = new ArrayList<Reserva>();
        Connection conexion = Utilidades.crearConexion();
        try {
            Statement stm = conexion.createStatement();
            String sql = "SELECT * from reservas where dni_cliente = '" + dni + "'";
            ResultSet rs = stm.executeQuery(sql);

            while (rs.next()) {
                reservas.add(new Reserva(rs.getInt("id"),dni, rs.getInt("id_habitacion"), rs.getDate("fecha_entrada").toString(), rs.getDate("fecha_salida").toString(), rs.getInt("dias"), rs.getInt("preciototal")));
                
            }
            

        } catch (SQLException e) {

        }
        
        return reservas;
    }
    
    public void cancelarReserva(int idReserva){
        Connection conexion = Utilidades.crearConexion();
        try {
            Statement stm = conexion.createStatement();
            String sql = "DELETE FROM reservas WHERE id = '" + idReserva + "'";
            stm.executeUpdate(sql);
            
        } catch (SQLException e) {

        }
    }
}
