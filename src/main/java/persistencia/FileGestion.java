package persistencia;

import logica.ManegementGestion;

import java.io.IOException;

public class FileGestion extends FileSerializable{

    public ManegementGestion reader() throws IOException, ClassNotFoundException{
        ManegementGestion mng = (ManegementGestion) readObject();

        return mng;
    }

    public void writer(ManegementGestion mng) throws IOException{
        writeObject(mng);
    }
}
