package logica;
/**@author Deisy Monroy - Karen Hernández
 @version 12/10/2021
 Clase encargada de gestionar los atributo de la
 clase ManegementGestion*/
import persistencia.FileGestion;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

public class ManegementGestion implements Serializable {

    private ArrayList<Gestion> gestions;
    private FileGestion fileGestion;

/**Constructor de la clase ManegementGestion*/
    public ManegementGestion(){
        gestions = new ArrayList<>();
        fileGestion = new FileGestion();
    }
/**Metodo que encuantra algun pedido realizdo*/
    public Gestion findGestion(String numPedido){
        for (Gestion gestion : gestions){
            if (numPedido.equals(gestion.getNumPedido())){
                return gestion;
            }
        }
        return null;
    }
/**Metodo para agregar un nuevo pedido*/
    public boolean addGestion(Gestion gestion){
        if (findGestion(gestion.getNumPedido()) == null){
            gestions.add(gestion);
            return true;
        }
        return false;
    }
/**Metodo para leer datos de gestion*/
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
/**MEtodo para escribir datos de gestion*/
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
