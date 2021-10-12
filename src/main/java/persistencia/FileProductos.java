package persistencia;
/**@author Deisy Monroy - Karen Hernández
 @version 12/10/2021
 Clase encargada de controlar los archivos de los productos*/
import logica.ManegementProducto;

import java.io.IOException;

public class FileProductos extends FileSerializable{
    /**Metodo para leer el manejo de los productos*/
    public ManegementProducto reader() throws IOException, ClassNotFoundException{
        ManegementProducto mng = (ManegementProducto) readObject();

        return mng;
    }
    /**Metodo para escribir en los archivos de los productos*/
    public void writer(ManegementProducto mng) throws  IOException{
        writeObject(mng);
    }
}
