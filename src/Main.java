
public class Main {
    public static void main(String[] args){

        String cadena = "hola mundo";
        String[] cadena2 = {"Hola","mundo","me","llamo","Rafael"};
        int[][] dosDimensiones = {{1,2,3,4,5,6},{11,12,13,14,15,16}};

        // Ejercicio 0
        System.out.println("\n*** EJERCICIO 0 ***");
        Ejercicio0 ej0 = new Ejercicio0();
        System.out.println(ej0.invertirCadena(cadena));

        // Ejercicio 1
        System.out.print("\n*** EJERCICIO 1 ***");
        Ejercicio1 ej1 = new Ejercicio1();
        System.out.println("\n" + ej1.recorrerCadena(cadena2));

        // Ejercicio 2
        System.out.println("\n*** EJERCICIO 2 ***");
        Ejercicio2 ej2 = new Ejercicio2();
        ej2.recorrerArray2D(dosDimensiones);

    }
}
