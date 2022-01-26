/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestion;

import Modelo.Cliente;
import static Utilidades.Constantes.patron_Apellido;
import static Utilidades.Constantes.patron_Correo;
import static Utilidades.Constantes.patron_Direccion;
import static Utilidades.Constantes.patron_Dni;
import static Utilidades.Constantes.patron_Localidad;
import static Utilidades.Constantes.patron_Nombre;
import static Utilidades.Constantes.patron_Password;
import static Utilidades.Constantes.patron_Telefono;
import Utilidades.Utilidades;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author aleja
 */
public class GestionClientes {
    Cliente cliente;

    public GestionClientes() {
        
    }
    
    
    
    
    
    public boolean iniciarSesion(String CorreoElectronico, String password){
        
        try{

		// Establecemos la conexión a la BD
		Connection conexion = Utilidades.crearConexion();
                
                Statement stm = conexion.createStatement();
                String sql = "SELECT * FROM clientes WHERE correo_electronico = '" + CorreoElectronico + "' AND password = '" + password + "'";
                ResultSet rs = stm.executeQuery(sql);
                
                if(rs.next()){
                    this.cliente = new Cliente(rs.getString("dni"),rs.getString("nombre") ,rs.getString("apellido") ,rs.getInt("numeroTelefono")
                    ,rs.getString("direccion"), rs.getString("localidad"), rs.getString("correo_electronico"), rs.getString("password"));
                    return true;
                }
                
                Utilidades.cerrarConexion(conexion);
                
                
                
            }catch(SQLException e ){
                System.out.println("Error");
            }
        
        return false;
        
    }
    
    public boolean validarCampos(String nombre, String dni, String apellido,String telefono ,String direccion ,String localidad,String correoElectronico, String password) {
        boolean validarNombre, validarApellido, validarDni, validarTelefono, ValidarDireccion, ValidarLocalidad, ValidarCorreo, ValidarPassword;

        validarNombre = Utilidades.validar(nombre, patron_Nombre);

        validarDni = Utilidades.validar(dni, patron_Dni);

        validarApellido = Utilidades.validar(apellido, patron_Apellido);

        validarTelefono = Utilidades.validar(telefono, patron_Telefono);

        ValidarDireccion = Utilidades.validar(direccion, patron_Direccion);

        ValidarLocalidad = Utilidades.validar(localidad, patron_Localidad);

        ValidarCorreo = Utilidades.validar(correoElectronico, patron_Correo);

        ValidarPassword = Utilidades.validar(password, patron_Password);

        if (validarNombre == true && validarApellido == true && validarDni == true && validarTelefono
                == true && ValidarDireccion == true && ValidarLocalidad == true && ValidarCorreo == true && ValidarPassword == true) {
            return true;
        } else {
            return false;
        }
    }

    public boolean validarCamposRepetido(String dni, String correoElectronico) {
        int contadorDni = 0;
        int contadorCorreo = 0;
        Connection conexion = Utilidades.crearConexion();
        try {
            Statement stm = conexion.createStatement();
            String sql = "SELECT * from clientes where dniCliente = '" + dni + "'";
            ResultSet rs = stm.executeQuery(sql);

            while (rs.next()) {
                contadorDni++;
            }
            Statement st = conexion.createStatement();
            String sql2 = "SELECT * from clientes where correo_electronico = '" + correoElectronico + "'";
            ResultSet rs2 = stm.executeQuery(sql);
            while (rs2.next()) {
                contadorCorreo++;
            }
            Utilidades.cerrarConexion(conexion);
        } catch (SQLException e) {

        }
        if (contadorDni == 0 && contadorCorreo == 0) {
            return true;
        }
        return false;
    }

    public void InsertarCliente(Cliente cliente) {
        
        Connection conexion = Utilidades.crearConexion();
        try {
            
            String sql = "INSERT INTO clientes VALUES(?,?,?,?,?,?,?,?)";
            PreparedStatement st = conexion.prepareStatement(sql);
            st.setString(1, cliente.getDni());
            st.setString(2, cliente.getNombre());
            st.setString(3, cliente.getApellido());
            st.setInt(4, cliente.getNumeroTelefono());
            st.setString(5, cliente.getDireccion());
            st.setString(6, cliente.getLocalidad());
            st.setString(7, cliente.getCorreoElectronico());
            st.setString(8, cliente.getPassword());
         
            st.executeUpdate();
           
            conexion.commit();
            Utilidades.cerrarConexion(conexion);
            
            
        } catch (SQLException e) {
            
        }
        
        
        
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
        
    
}
