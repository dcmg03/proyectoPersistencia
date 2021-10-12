package logica;
/**@author Deisy Monroy - Karen Hernández
 @version 12/10/2021
 Clase encargada de manejar los principales atributos
 del domiciliario*/
import java.io.Serializable;

public class Domiciliario implements Serializable {

    private String id;
    private String nombre;
    private int numPedidos;
    private boolean bono;

    /**Constructor de la clse Domiciliario
     * recibe @param String - id, String - nombre,
     * int - numPedidos, boolean bono*/
    public Domiciliario(String id, String nombre,int numPedidos,double bono) {
        this.id = id;
        this.nombre = nombre;
        this.numPedidos = numPedidos;
        this.bono = false;
    }

    public Domiciliario(String id, String nombre) {
        this.id=id;
        this.nombre=nombre;
    }

    /**@return retorna un dato de tipo string - id*/
    public String getId() {
        return id;
    }

    /**recibe un parametro de tipo String - id @param*/
    public void setId(String id) {
        this.id = id;
    }

    /**@return retorna un dato de tipo string - nombre*/
    public String getNombre() {
        return nombre;
    }

    /**recibe un parametro de tipo String - nombre @param*/
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**@return retorna un dato de tipo string - numPedidos*/
    public int getNumPedidos() {return numPedidos;}

    /**recibe un parametro de tipo int - pedidos @param*/
    public void setNumPedidos(int pedidos) {this.numPedidos = pedidos;}

    /**@return retorna un dato de tipo boolean - bono*/
    public boolean isBono() {return bono;}

    /**recibe un parametro de tipo boolean - bono @param*/
    public void setBono(boolean bono) {this.bono = bono;}

    /**metodo toString*/
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
