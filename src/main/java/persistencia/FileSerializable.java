package persistencia;
/**@author Deisy Monroy - Karen Hernández
 @version 12/10/2021
 Clase encargada de los archivos a serializar*/
import java.io.*;

public class FileSerializable implements Serializable {

        private String path;
        private String name;
        private File file;

        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void openFile(){
            file = new File( path + name );
        }

        public File getFile() {
            return file;
        }

        public Object readObject() throws IOException, ClassNotFoundException {
            ObjectInputStream input = new ObjectInputStream( new FileInputStream( file ) );
            Object object = input.readObject();
            input.close();

            return object;
        }

        public void writeObject( Object object ) throws IOException {
            ObjectOutputStream output = new ObjectOutputStream( new FileOutputStream( file ) );
            output.writeObject( object );

            output.close();
        }
}

