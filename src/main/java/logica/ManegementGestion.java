package logica;

import persistencia.FileGestion;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

public class ManegementGestion implements Serializable {

    private ArrayList<Gestion> gestions;
    private FileGestion fileGestion;

    public ManegementGestion(){
        gestions = new ArrayList<>();
        fileGestion = new FileGestion();
    }

    public Gestion findGestion(String numPedido){
        for (Gestion gestion : gestions){
            if (numPedido.equals(gestion.getNumPedido())){
                return gestion;
            }
        }
        return null;
    }

    public boolean addGestion(Gestion gestion){
        if (findGestion(gestion.getNumPedido()) == null){
            gestions.add(gestion);
            return true;
        }
        return false;
    }

    public ManegementGestion read(String path, String name) throws IOException, ClassNotFoundException {
        fileGestion.setPath(path);
        fileGestion.setName(name);
        fileGestion.openFile();
        ManegementGestion mngGestion = null;
        if (fileGestion.getFile().exists()){
            mngGestion = fileGestion.reader();
        }
        return mngGestion;
    }

    public void write(String path, String name) throws IOException{
        fileGestion.setPath(path);
        fileGestion.setName(name);
        fileGestion.openFile();

        fileGestion.writeObject(this);
    }

    public ArrayList<Gestion> getGestions(){
        return (ArrayList<Gestion>) gestions.clone();
    }
}
