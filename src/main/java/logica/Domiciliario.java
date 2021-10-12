package logica;

import java.io.Serializable;

public class Domiciliario implements Serializable {

    private String id, nombre;
    private int numPedidos;
    private boolean bono;

    public Domiciliario(String id, String nombre,int numPedidos,double bono) {
        this.id = id;
        this.nombre = nombre;
        this.numPedidos = numPedidos;
        this.bono = false;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumPedidos() {return numPedidos;}

    public void setNumPedidos(int pedidos) {this.numPedidos = pedidos;}

    public boolean isBono() {return bono;}

    public void setBono(boolean bono) {this.bono = bono;}

    @Override
    public String toString() {
        return "Domiciliario{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", pedidos=" + numPedidos +
                ", bono=" + bono +
                '}';
    }
}
