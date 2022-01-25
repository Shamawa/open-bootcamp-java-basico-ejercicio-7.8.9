import java.util.ArrayList;

public class NumerosImpares {

    public static void MetodoNumerosImpares() {

        // Creamos una ArrayList con 10 elementos numéricos.
        ArrayList<Integer> numerosLista = new ArrayList<>();

        // Utilizamos un bucle y lo rellenamos con elementos del 1 al 10
        for (int i = 1; i < 11; i++) {
            numerosLista.add(i);
        }

        // Imprimimos por pantalla los elementos del 1 al 10
        System.out.println(numerosLista);


        // Creamos un for para recorrer el tamaño de la lista
        for (int i = 0; i < numerosLista.size(); i++) {

            // numerosLista.get me da el objeto que esta en esta lista en la posición "i"(va cambiando)
            int numero = numerosLista.get(i);

            // Si la posición "i" dividida entre 2 el resto "%" es par decimos que elimine ("remove") ese elemento ("i")
            if (numero % 2 == 0) {
                numerosLista.remove(i);
            }
        }

        // Imprimimos por pantalla el resultado final de ArrayList.
        System.out.println("Los números impares del ArrayList son los siguientes: " + numerosLista);
    }
}