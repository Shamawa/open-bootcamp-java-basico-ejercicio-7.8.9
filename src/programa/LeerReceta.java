package programa;
import java.io.FileReader;
import java.io.IOException;

public class LeerReceta {
    public static void leer(String leerArchivoReceta) {

        //Lanzamos la excepción
        try {

            //Escribimos la ruta de nuestro archivo
            FileReader entrada = new FileReader(leerArchivoReceta);
            int c = entrada.read();

            while(c!= -1){
                c = entrada.read();
                char letra =(char)c; // Decimos que nos pase los datos de int a char.
                System.out.print(letra);
            }

        } catch (IOException e) { // IOException (la que lanza FileReader) es la superclase de FileNotFoundException
            System.out.println("Archivo no encontrado");
        }
    }
}
