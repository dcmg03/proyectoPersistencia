package persistencia;

import logica.ManegementProducto;

import java.io.IOException;

public class FileProductos extends FileSerializable{

    public ManegementProducto reader() throws IOException, ClassNotFoundException{
        ManegementProducto mng = (ManegementProducto) readObject();

        return mng;
    }

    public void writer(ManegementProducto mng) throws  IOException{
        writeObject(mng);
    }
}
