package persistencia;
/**@author Deisy Monroy - Karen Hernández
 @version 12/10/2021
 Clase encargada de contrlar los archivos de los domiciliarios*/
import logica.ManegementDomiciliario;

import java.io.IOException;

public class FileDomiciliarios extends FileSerializable{
/**Metodo para leer el manejo del domiciliario*/
    public ManegementDomiciliario reader() throws IOException, ClassNotFoundException{
        ManegementDomiciliario mng = (ManegementDomiciliario) readObject();

        return mng;
    }
/**Metodo para escribir en los archivos de domiciliario*/
    public void writer(ManegementDomiciliario mng) throws IOException{
        writeObject(mng);
    }
}
