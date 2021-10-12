package logica;
/**@author Deisy Monroy - Karen Hernández
 @version 12/10/2021
 Clase encargada de manejar los atributos para la gestion
 de los pedidos y domiciliarios que realizan dichos pedidos*/
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

public class Gestion implements Serializable {

    private String numPedido,nombreUsuario,direccion,nombreDomiciliario;
    private float telefono;
    ArrayList<Object> pedido = new ArrayList<Object>();
    private double valorPedido;
    private LocalDate fecha;

    /**Contrsuctor de la clase Gestion
     * recibe @param String - numPedido, String - nombreUsuario, String - direccion, ArrayList - pedido,
     * String - nombreDomiciliario, float - telefono, double - valorPedido, LocalDate - fecha*/
    public Gestion(String numPedido, String nombreUsuario, String direccion, String nombreDomiciliario, String pedido
                   , int telefono, double valorPedido, LocalDate fecha) {
        this.numPedido = numPedido;
        this.nombreUsuario = nombreUsuario;
        this.direccion = direccion;
        this.nombreDomiciliario = nombreDomiciliario;
        this.telefono = telefono;
        this.valorPedido = valorPedido;
        this.fecha = fecha;
    }



    /**@return retorna un dato de tipo string - numPedido*/
    public String getNumPedido() {
        return numPedido;
    }

    /**recibe un parametro de tipo String - numPedido @param*/
    public void setNumPedido(String numPedido) {
        this.numPedido = numPedido;
    }

    /**@return retorna un dato de tipo String - nombreUsuario*/
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /**recibe un parametro de tipo String - numUsuario*/
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    /**@return retorna un dato de tipo String - direccion*/
    public String getDireccion() {
        return direccion;
    }

    /**recibe un parametro de tipo String - direccion*/
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**@return retorna un dato de tipo String - nombreDomiciliario*/
    public String getNombreDomiciliario() {
        return nombreDomiciliario;
    }

    /**recibe un parametro de tipo String - nombreDomiciliario*/
    public void setNombreDomiciliario(String nombreDomiciliario) {
        this.nombreDomiciliario = nombreDomiciliario;
    }

    /**@return retorna un dato de tipo float - telefono*/
    public float getTelefono() {
        return telefono;
    }

    /**recibe un parametro de tipo float - telefono*/
    public void setTelefono(float telefono) {
        this.telefono = telefono;
    }

    /**@return retorna un dato de tipo ArrayList - pedido*/
    public ArrayList<Object> getPedido() {
        return pedido;
    }

    /**recibe un parametro de tipo ArrayList - pedido*/
    public void setPedido(ArrayList<Object> pedido) {
        this.pedido = pedido;
    }

    /**@return retorna un dato de tipo float - valorPedido*/
    public double getValorPedido() {
        return valorPedido;
    }

    /**recibe un parametro de tipo float - valorPedido*/
    public void setValorPedido(float valorPedido) {
        this.valorPedido = valorPedido;
    }

    /**@return retorna un dato de tipo LocalDate - fecha*/
    public LocalDate getFecha() {
        return fecha;
    }

    /**recibe un parametro de tipo LocalDate - fecha*/
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    /**metodo toString*/
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
