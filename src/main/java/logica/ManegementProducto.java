package logica;
/**@author Deisy Monroy - Karen Hernández
 @version 12/10/2021
 Clase encargada de contrlar los productos */
import persistencia.FileProductos;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

public class ManegementProducto implements Serializable {

    private ArrayList<Producto> productos;
    private FileProductos fileProductos;

    /**Contructor de la clase ManegementProducto*/
    public ManegementProducto(){
        productos = new ArrayList<>();
        fileProductos = new FileProductos();
    }
    /**Metodo que encuentra un producto*/
    public Producto findProducto(String codigo){
        for (Producto producto: productos){
            if (codigo.equals(producto.getCodigo())){
                return producto;
            }
        }
        return null;
    }
    /**Metodo para añadir un nuevo producto*/
    public boolean addProducto (Producto producto){
       if(findProducto(producto.getCodigo()) == null){
           productos.add(producto);
       }
        return false;
    }

    /**Metodo para leer productos*/
    public ManegementProducto read (String path, String name) throws IOException, ClassNotFoundException {
        fileProductos.setPath(path);
        fileProductos.setName(name);
        fileProductos.openFile();
        ManegementProducto mngProducto = null;

        if (fileProductos.getFile().exists()){
            mngProducto = fileProductos.reader();
        }
        return mngProducto;
    }

    /**Metodo para escribir productos*/
    public void write(String path, String name) throws IOException{
        fileProductos.setPath(path);
        fileProductos.setName(name);
        fileProductos.openFile();

        fileProductos.writeObject(this);
    }

    public ArrayList<Producto> getProductos(){
        return (ArrayList<Producto>) productos.clone();
    }




}
