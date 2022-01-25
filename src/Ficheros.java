import java.io.*;

public class Ficheros {

    public static void hacerCopiaFicheros(String fileIn, String fileOut){


        try {
            //InputStream fileIn = new FileInputStream("C:\\carpeta\\texto.txt)");
            InputStream inputStreamFileIn = new FileInputStream(fileIn);

            try{

                byte[]datos = inputStreamFileIn.readAllBytes();
                for (byte dato : datos) {
                    System.out.println(dato);
                }
                inputStreamFileIn.close();//cerramos el flujo

                //PrintStream inputStreamFileOut = new PrintStream("C:\\carpeta\\copiaTexto.txt)");
                PrintStream inputStreamFileOut = new PrintStream(fileOut);
                inputStreamFileOut.write(datos);
                inputStreamFileOut.close();

            } catch (IOException e){
                System.out.println("No puedo leer esto " + e.getMessage());
            }

        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado: " + e.getMessage());
        }
    }
}
