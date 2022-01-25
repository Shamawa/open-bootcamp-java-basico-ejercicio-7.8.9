import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Reverse {

//Método que recorrer una cadena de texto de forma revertida.
    public static String reverse(String texto) {

        //Declaramos la variable que usaremos para guardar la cadena invertida.
        String cadenaInvertida = "";

        /** Creamos un bucle for que tendrá en cuenta el tamaño del texto.
         * Recorrerá carácter a carácter y lo añadirá a la variable "cadenaInvertida" y lo almacenará.
         */
        for (int i = 0; i < texto.length(); i++){
            char caracter = texto.charAt(i);
            cadenaInvertida = caracter + cadenaInvertida;
        }
        //La función nos devuelve la cadena invertida y lo imprime por pantalla.
        System.out.println(cadenaInvertida);
        return cadenaInvertida;
    }

    // Creamos un método para recorrer el array Unidimensional
    public static void recorrerArrayUnidimensional(String[] arrayUnidimensional) {
        for (int i = 0; i < arrayUnidimensional.length; i++){
            System.out.println(arrayUnidimensional[i]);
        }
    }

    // Creamos un método para recorrer el array Bidimensional
     public static void recorrerArrayBidimensional (int[][] arrayBidiUno){
         for (int i = 0; i < arrayBidiUno.length; i++){
             for (int j = 0; j <arrayBidiUno.length; j++){
                 System.out.println("La posición es: " + i + "," + j + " valor: " + arrayBidiUno[i][j]);
             }
         }
     }

     //Creamos un método para trabajar con los vectores.
     public static void trabajoConVectores(){

        // Creamos un Vector de tipo String.
        Vector<String> vector = new Vector<>(5,5); // Vector tamaño 5 y si sobrepasa aumenta en 5.

        //Añade elementos
        vector.add("Uno");
        vector.add("Dos");
        vector.add("Tres");
        vector.add("Cuatro");
        vector.add("Cinco");

        // Eliminamos los datos del vector que nos piden en este caso el 2º y el 3º elemento de la lista.
        vector.remove("Dos");
        vector.remove("Tres");

        //Borramos varios items del Vector e imprimimos todos menos los eliminados.
        System.out.println("La lista de vectores con los items eliminados es la siguiente " + vector);
    }

    //Cremaos una función para trabajar con ArrayList/LinkedList.
    public static void trabajarConListasVinculadas(){

        //Creamos una ArrayList con 4 elementos
        ArrayList<String> listaElementos = new ArrayList<>();

        listaElementos.add ("Fuego");
        listaElementos.add("Tierra");
        listaElementos.add("Aire");
        listaElementos.add("Agua");

        //Copiar lista en una linkedlist:
        LinkedList<String> listaEnlazada =  new LinkedList<>(listaElementos);

        //Recorrer un arrayList:
        for(String e: listaElementos){
            System.out.println("Valor actual de la lista es " + e);
        }

        //Recorremos nuestra nueva lista tipo enlazada.
        for (String elemento: listaEnlazada) {
            System.out.println("Elemento actual en la lista enlazada: " + elemento);
        }
    }
}