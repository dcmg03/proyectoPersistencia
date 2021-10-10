package logica;

import java.io.Serializable;
import java.time.LocalDate;

public class Gestion implements Serializable {

    private String numPedido, nombreUsuario, direccion, nombreDomiciliario, productos;
    private int telefono;
    private double valorPedido;
    private LocalDate fecha;

    public Gestion(String numPedido, String nombreUsuario, String direccion, String nombreDomiciliario, String productos
                   ,int telefono, double valorPedido, LocalDate fecha) {
        this.numPedido = numPedido;
        this.nombreUsuario = nombreUsuario;
        this.direccion = direccion;
        this.nombreDomiciliario = nombreDomiciliario;
        this.productos = productos;
        this.telefono = telefono;
        this.valorPedido = valorPedido;
        this.fecha = fecha;
    }

    public String getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(String numPedido) {
        this.numPedido = numPedido;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombreDomiciliario() {
        return nombreDomiciliario;
    }

    public void setNombreDomiciliario(String nombreDomiciliario) {
        this.nombreDomiciliario = nombreDomiciliario;
    }

    public String getProductos() {
        return productos;
    }

    public void setProductos(String productos) {
        this.productos = productos;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public double getValorPedido() {
        return valorPedido;
    }

    public void setValorPedido(double valorPedido) {
        this.valorPedido = valorPedido;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Gestion{" +
                "numPedido='" + numPedido + '\'' +
                ", nombreUsuario='" + nombreUsuario + '\'' +
                ", direccion='" + direccion + '\'' +
                ", nombreDomiciliario='" + nombreDomiciliario + '\'' +
                ", productos='" + productos + '\'' +
                ", telefono=" + telefono +
                ", valorPedido=" + valorPedido +
                ", fecha=" + fecha +
                '}';
    }
}
