package logica;
/**@author Deisy Monroy - Karen Hernández
 @version 12/10/2021
 Clase encargada de manejaer los domiciliarios*/
import persistencia.FileDomiciliarios;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

public class ManegementDomiciliario implements Serializable {

    private ArrayList<Domiciliario> domiciliarios;
    private FileDomiciliarios fileDomiciliarios;

/**Contructor de la clase ManegementDomiciliario*/
    public ManegementDomiciliario(){
        domiciliarios = new ArrayList<>();
        fileDomiciliarios = new FileDomiciliarios();
    }

    /**Metodo para encontrar un domiciliario*/
    public Domiciliario findDomiciliario(String id) {
        for (Domiciliario domiciliario : domiciliarios) {
            if (id.equals(domiciliario.getId())) {
                return domiciliario;
            }
        }
        return null;
    }

    /**Metodo para agragar un domiciliario*/
    public boolean addDomiciliario(Domiciliario domiciliario){
        if (findDomiciliario(domiciliario.getId()) ==  null){
            domiciliarios.add(domiciliario);
            return true;
        }
        return false;
    }

    /**Metodo para leer los domiciliarios*/
    public ManegementDomiciliario read(String path, String name) throws IOException, ClassNotFoundException {
        fileDomiciliarios.setPath(path);
        fileDomiciliarios.setName(name);
        fileDomiciliarios.openFile();
        ManegementDomiciliario mngDomiciliario = null;

        if (fileDomiciliarios.getFile().exists()){
            mngDomiciliario = fileDomiciliarios.reader();
        }
        return mngDomiciliario;
    }

    /**Metodo para escribir los domiciliarios*/
    public void write(String path, String name) throws IOException{
        fileDomiciliarios.setPath(path);
        fileDomiciliarios.setName(name);
        fileDomiciliarios.openFile();

        fileDomiciliarios.writeObject(this);
    }

    public ArrayList<Domiciliario> getDomiciliarios(){
        return (ArrayList<Domiciliario>) domiciliarios.clone();
    }


}
