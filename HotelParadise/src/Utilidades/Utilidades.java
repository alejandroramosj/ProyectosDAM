/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilidades;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import static java.time.temporal.ChronoUnit.DAYS;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author aleja
 */
public class Utilidades implements Constantes{
    
    //Metodo para crear la conexion con la base de datos
    public static Connection crearConexion() {
		Connection conexion = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");// Debes utilizar este otra

			// Establecemos la conexión a la BD
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/" + nombreBaseDeDatos, usuarioBaseDeDatos, passwordBaseDeDatos);
			
			}catch (SQLException e) {
				// TODO: handle exception
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return conexion;
	}
    //Metodo para cerrar la conexion con la base de datos
    public static void cerrarConexion(Connection conexion) {
		try {
			conexion.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    //Metodo validar campos
    public static boolean validar(String cadena, String patron) {
        Pattern p = Pattern.compile(patron);
        Matcher m = p.matcher(cadena);

        if (m.matches()) {
            return true;
        }

        return false;
    }
    
    //Metodo para calcular los dias entre dos fechas
    public static int diferenciaDeDias(String fecha_entrada, String fecha_salida){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        LocalDate fechaEntrada = LocalDate.parse(fecha_entrada, formatter);
        LocalDate fechaSalida = LocalDate.parse(fecha_salida, formatter);
        
        int dias = (int) DAYS.between(fechaEntrada, fechaSalida);
        
        return dias;
    }
    
    //Metodo para pasar de String a LocalDate
    public static LocalDate StringALocalDate(String fecha){
        LocalDate localdate;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        
        if (Utilidades.validar(fecha, "^\\d{4}([\\-/.])(0?[1-9]|1[1-2])\\1(3[01]|[12][0-9]|0?[1-9])$") == true) {
            SimpleDateFormat formatoIngles = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat formatovalido = new SimpleDateFormat("dd/MM/yyyy");
            String fechaCambiada = null; 
            try {
                fechaCambiada = formatovalido.format(formatoIngles.parse(fecha));
            } catch (ParseException ex) {
                Logger.getLogger(Utilidades.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            localdate = LocalDate.parse(fechaCambiada, formatter);
        }else{
            localdate = LocalDate.parse(fecha, formatter);
        }
         
        return localdate;
    }
    
    //Metodo para pasar de LocalDate a sql.Date
    public static java.sql.Date LocalDateAMysqlDate(LocalDate fecha){
        java.sql.Date sqlDate = java.sql.Date.valueOf(fecha);
        
        return sqlDate;
        
    }
    
    //Metodo SqlDate a LocalDate
    public static LocalDate SqlDateALocalDate(java.sql.Date date){

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        LocalDate localDate = LocalDate.parse(date.toString(), formatter);
        
        return localDate;
    }
}
