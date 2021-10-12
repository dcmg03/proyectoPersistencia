package persistencia;
/**@author Deisy Monroy - Karen Hernández
 @version 12/10/2021
 Clase encargada de controlar los archivos de la gestion*/
import logica.ManegementGestion;

import java.io.IOException;

public class FileGestion extends FileSerializable{
    /**Metodo para leer el manejo de la gestion*/
    public ManegementGestion reader() throws IOException, ClassNotFoundException{
        ManegementGestion mng = (ManegementGestion) readObject();

        return mng;
    }
    /**Metodo para escribir en los archivos de la gestion*/
    public void writer(ManegementGestion mng) throws IOException{
        writeObject(mng);
    }
}
