/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba1_progra2;

/**
 *
 * @author Administrator
 */
public class Movie extends RentItem {
    private String estado;

    public Movie(String codigoItem, String nombreItem, double precioRentaItem) {
        super(codigoItem, nombreItem, precioRentaItem);
        this.estado = "Nuevo";
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

   
    public String toString() {
        return super.toString() + ", Estado: " + estado + " Pelicula";
    }

    
    public double pagoRenta(int dias) {
        double pagoItems = getPagoRenta();
        if (estado.equals("Nuevo") && dias > 2) {
            pagoItems += (dias - 2) * 50;
        } else if (!estado.equals("Nuevo") && dias > 5) {
            pagoItems += (dias - 5) * 30;
        }
        return pagoItems;
    }


}
