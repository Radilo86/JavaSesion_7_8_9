public class Ejercicio0 {

    String cadena2 ="";



    public String invertirCadena(String cadena) {
        System.out.print("La cadena original es: ");
            System.out.print(cadena);

        // Inversion
        System.out.print("\nLa cadena invertida es: ");
        // El tamaño de la cadena es de 10 caracteres contando del 0 al 9
        // por eso restamos uno al tamaño total de la cadena.
        for (int longitud=cadena.length()-1; longitud >= 0; longitud--){
            // cadena2 = cadena2 + cadena.charAt(longitud);
            cadena2 = cadena2 + cadena.charAt(longitud);
        }
        return cadena2;
    }

}
