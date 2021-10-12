package logica;

import persistencia.FileProductos;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

public class ManegementProducto implements Serializable {

    private ArrayList<Producto> productos;
    private FileProductos fileProductos;

    public ManegementProducto(){
        productos = new ArrayList<>();
        fileProductos = new FileProductos();
    }
    /**Encontrar un producto*/
    public Producto findProducto(String codigo){
        for (Producto producto: productos){
            if (codigo.equals(producto.getCodigo())){
                return producto;
            }
        }
        return null;
    }
    /**Añadir un nuevo producto*/
    public boolean addProducto (Producto producto){
       if(findProducto(producto.getCodigo()) == null){
           productos.add(producto);
       }
        return false;
    }

    /**leer productos*/
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

    /**Escribir productos*/
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
