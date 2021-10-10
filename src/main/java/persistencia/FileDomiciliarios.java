package persistencia;

import logica.ManegementDomiciliario;

import java.io.IOException;

public class FileDomiciliarios extends FileSerializable{

    public ManegementDomiciliario reader() throws IOException, ClassNotFoundException{
        ManegementDomiciliario mng = (ManegementDomiciliario) readObject();

        return mng;
    }

    public void writer(ManegementDomiciliario mng) throws IOException{
        writeObject(mng);
    }
}
