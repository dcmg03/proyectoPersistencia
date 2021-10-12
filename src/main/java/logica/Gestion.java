package logica;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

public class Gestion implements Serializable {

    private String numPedido,nombreUsuario,direccion,nombreDomiciliario;
    private float telefono;
    ArrayList<Object> pedido = new ArrayList<Object>();
    private float valorPedido;
    private LocalDate fecha;

    public Gestion(String numPedido, String nombreUsuario, String direccion, String nombreDomiciliario, ArrayList<Object> pedido
                   , int telefono, float valorPedido, LocalDate fecha) {
        this.numPedido = numPedido;
        this.nombreUsuario = nombreUsuario;
        this.direccion = direccion;
        this.nombreDomiciliario = nombreDomiciliario;
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

    public float getTelefono() {
        return telefono;
    }

    public void setTelefono(float telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Object> getPedido() {
        return pedido;
    }

    public void setPedido(ArrayList<Object> pedido) {
        this.pedido = pedido;
    }

    public float getValorPedido() {
        return valorPedido;
    }

    public void setValorPedido(float valorPedido) {
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
                ", telefono=" + telefono +
                ", pedido=" + pedido +
                ", valorPedido=" + valorPedido +
                ", fecha=" + fecha +
                '}';
    }
}
