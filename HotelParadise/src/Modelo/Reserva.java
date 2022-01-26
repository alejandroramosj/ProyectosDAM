/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Utilidades.Utilidades;
import java.time.LocalDate;

/**
 *
 * @author aleja
 */
public class Reserva {
   private int idReserva;
    private String dniCliente;
    private int idHabitacion;
    private LocalDate fechaEntrada;
    private LocalDate fechaSalida;
    private int dias;
    private int precioTotal;

    public Reserva(int idReserva, String dniCliente, int idHabitacion, String fechaEntrada, String fechaSalida, int dias, int precioTotal) {
        this.idReserva = idReserva;
        this.dniCliente = dniCliente;
        this.idHabitacion = idHabitacion;
        this.fechaEntrada = Utilidades.StringALocalDate(fechaEntrada);
        this.fechaSalida = Utilidades.StringALocalDate(fechaSalida);
        this.dias = dias;
        this.precioTotal = precioTotal;
    }

    public Reserva(String dniCliente, int idHabitacion, String fechaEntrada, String fechaSalida, int dias, int precioTotal) {
        this.dniCliente = dniCliente;
        this.idHabitacion = idHabitacion;
        this.fechaEntrada = Utilidades.StringALocalDate(fechaEntrada);
        this.fechaSalida = Utilidades.StringALocalDate(fechaSalida);
        this.dias = dias;
        this.precioTotal = precioTotal;
    }
    
    

    public Reserva() {
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public String getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(String dniCliente) {
        this.dniCliente = dniCliente;
    }

    public int getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public int getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(int precioTotal) {
        this.precioTotal = precioTotal;
    }
    
    
    
    
}
