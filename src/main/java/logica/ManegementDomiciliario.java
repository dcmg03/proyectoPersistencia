package logica;

import persistencia.FileDomiciliarios;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

public class ManegementDomiciliario implements Serializable {

    private ArrayList<Domiciliario> domiciliarios;
    private FileDomiciliarios fileDomiciliarios;

    public ManegementDomiciliario(){
        domiciliarios = new ArrayList<>();
        fileDomiciliarios = new FileDomiciliarios();
    }

    public Domiciliario findDomiciliario(String id){
        for(Domiciliario domiciliario : domiciliarios){
            if (id.equals(domiciliario.getId())){
                return domiciliario;
            }
        }
        return null;
    }

    public boolean addDomiciliario(Domiciliario domiciliario){
        if (findDomiciliario(domiciliario.getId()) ==  null){
            domiciliarios.add(domiciliario);
            return true;
        }
        return false;
    }

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
