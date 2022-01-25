import programa.LeerReceta;
import programa.Medicamento;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String texto = "Hola Mundo";

        //Para invocar a los métodos estáticos: primero (nombre de la clase)+ "." + (nombre del método):
        Reverse.reverse(texto);
        String[] arrayUnidimensional = {"Wanda", "Ahsoka", "Grogu"};
        Reverse.recorrerArrayUnidimensional(arrayUnidimensional);

        //Definimos un array bidimensional
        int[][] arrayBidiUno = new int[4][4];
        Reverse.recorrerArrayBidimensional(arrayBidiUno);

        //Invocamos al método de los vectores.
        Reverse.trabajoConVectores();

        //Invocamos al método que trabajará con las ArrayList y Linkedlist
        Reverse.trabajarConListasVinculadas();

        //Invocamos a la clase NumerosImpares con su método..
        NumerosImpares.MetodoNumerosImpares();

        //Invocamos la clase Excepcion con su método.
        try {
            Excepcion.dividePorCero();
        } catch (ArithmeticException ex) {
            System.out.println("Esto no puede hacerse");
        } finally {
            System.out.println("Demo de código");
        }

        //Invocamos la clase Ficheros:
        Ficheros.hacerCopiaFicheros("C:\\carpeta\\texto.txt)","C:\\carpeta\\copiaTexto.txt)");


        //---------------------------PROGRAMA----------------------


        //Creo los objetos medicamentos
        Medicamento n1 = new Medicamento("Ibuprofeno",30,15);
        Medicamento n2 = new Medicamento("Paracetamol", 64, 30);
        Medicamento n3 = new Medicamento("Omeprazol",20,20);

        //Creamos una lista tipo ArrayList que contenga las familias de los medicamentos para la artritis
        ArrayList<Medicamento> listaMedicamentos1 = new ArrayList<>();
        listaMedicamentos1.add(n1);
        listaMedicamentos1.add(n2);
        listaMedicamentos1.add(n3);

        //Creamos una lista tipo ArrayList que contenga las familias de los medicamentos para la artritis
        ArrayList<Medicamento> listaMedicamentos2 = new ArrayList<>();
        listaMedicamentos2.add(n1);
        listaMedicamentos2.add(n2);
        listaMedicamentos2.add(n3);

        //Creamos un HashMap que su Clave(K) será el tipo de enfermedad y su valor(V) la lista de medicamentos.
        HashMap<String, ArrayList<Medicamento>> lista= new HashMap<>();
        lista.put("Medicamentos para la artritis",listaMedicamentos1);
        lista.put("Medicamentos para la gripe", listaMedicamentos2);

       // Recorremos el Hashmap e imprimimos por pantalla el resultado.
        for(Map.Entry<String, ArrayList<Medicamento>> n : lista.entrySet()) {
            System.out.println(n);
        }

        //Importamos la Clase leerReceta.
        LeerReceta.leer("C:/carpeta/Receta.txt");

    }
}