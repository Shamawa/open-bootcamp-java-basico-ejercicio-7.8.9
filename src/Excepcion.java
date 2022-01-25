public class Excepcion {

    //Creamos el método divideporCero
    public static void dividePorCero() throws ArithmeticException {

        // Definimos los atributos.
        int numerador = 10;
        int denominador = 0;
        float division;

        //Recogemos la excepción:
        try {
            division = numerador / denominador;
        } catch(Exception ex) {
            //Sentencia a ejecutar si hay error
            throw new ArithmeticException();
        }
    }

}