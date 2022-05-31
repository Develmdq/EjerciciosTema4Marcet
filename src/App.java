
public class App {

    public static void main(String[] args) {

        /// Ejercicio 1 ///
        int numInf = 5;

        if (numInf > 0) {
            System.out.println("El valor de numInf " + numInf + " es positivo");
        } else if (numInf < 0) {
            System.out.println("El valor de numInf " + numInf + " es negativo");
        } else {
            System.out.println("El valor de numInf es igual a 0");
        }


        /// Ejercicio 2 ///
        int numWhile = 1;

        while (numWhile < 3) {
            numWhile++;
            System.out.println("El valor actual de numWhile es " + numWhile);
        }


        /// Ejercicio 3 ///
        int numDoWhile = 3;
        do {
            numDoWhile++;
            System.out.println("El valor de numDoWhile es " + numDoWhile);
        } while (numDoWhile < 3);


        /// Ejercicio 4 ///

        for (int numFor = 0; numFor <= 3; numFor++) {
            System.out.println("El valor de numFor es  " + numFor);
        }

        
        /// Ejercicio 5 ///
        String estacion = "verano";
        switch (estacion) {
            case "invierno":
                System.out.println("La estación del año actual es: " + estacion);
                break;
            case "primavera":
                System.out.println("La estación del año actual es: " + estacion);
                break;
            case "verano":
                System.out.println("La estación del año actual es: " + estacion);
                break;
            case "otoño":
                System.out.println("La estación del año actual es: " + estacion);
                break;
            default:
                System.out.println("El valor " + estacion + " es una estación del año");
        }
    }
}
