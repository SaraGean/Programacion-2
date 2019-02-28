import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class CrearArchivo {
	
	File file = new File("C:\\Users\\Roy\\Documents\\filename.txt");
    public void Archivo (String contenido){
        try {

            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            contenido = contenido + "\r\n";
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contenido);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}