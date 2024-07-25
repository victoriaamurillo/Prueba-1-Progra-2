package prueba1_progra2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class RentItem {
    protected String codigoItem;
    protected String nombreItem;
    protected double pagoRenta;
    protected int cantidadCopias;

    
    public RentItem(String codigoItem, String nombreItem, double precioRentaItem) {
        this.codigoItem = codigoItem;
        this.nombreItem = nombreItem;
        this.pagoRenta = precioRentaItem;
        this.cantidadCopias = 0;
    }

    public String toString() {
        return "Codigo: " + codigoItem + ", Nombre: " + nombreItem + ", Precio Renta: " + pagoRenta;
    }

    public double pagoRenta(int dias) {
        return 0;
    }

    public String getCodigoItem() {
        return codigoItem;
    }

    public String getNombreItem() {
        return nombreItem;
    }

    public double getPagoRenta() {
        return pagoRenta;
    }

    public int getCantidadCopias() {
        return cantidadCopias;
    }

    public String submenu() {
        return "Imprimir";
    }

    public void ejecutar(int opcion) {
        if ( opcion== 1) {
            System.out.println(toString() + ", Cantidad Copias: " + cantidadCopias);
        } else {
            System.out.println("Opcion No Valida");
        }
    }
}
