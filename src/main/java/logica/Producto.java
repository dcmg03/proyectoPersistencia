package logica;
/**@author Deisy Monroy - Karen Hernández
 @version 12/10/2021
 Clase encargada de manejar los atributos para los productos*/
import java.io.Serializable;

public class Producto implements Serializable {

    private String codigo;
    private String producto;
    private double valor;

    /**Constructos de la clase Producto
     * recibe @param String - codigo, String producto, double - valor */
    public Producto(String codigo, String producto, double valor) {
        this.codigo = codigo;
        this.producto = producto;
        this.valor = valor;
    }
    /**@return retorna un dato de tipo string - codigo*/
    public String getCodigo() {
        return codigo;
    }

    /**recibe un parametro de tipo String - codigo @param*/
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**@return retorna un dato de tipo string - producto*/
    public String getProducto() {
        return producto;
    }

    /**recibe un parametro de tipo String - producto @param*/
    public void setProducto(String producto) {
        this.producto = producto;
    }

    /**@return retorna un dato de tipo double - valor*/
    public double getValor() {
        return valor;
    }

    /**recibe un parametro de tipo double - valor @param*/
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**metodo toString*/
    @Override
    public String toString() {
        return "Productos{" +
                "codigo='" + codigo + '\'' +
                ", producto='" + producto + '\'' +
                ", valor=" + valor +
                '}';
    }
}
