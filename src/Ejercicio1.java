public class Ejercicio1 {

    String texto = "";
    String texto2 = "";

    public String recorrerCadena(String[] cadena){
        for (String elemento : cadena){
            // texto = elemento + " " + texto;
            texto2 = texto2 + elemento + " ";
        }
        return texto2;
    }

}
