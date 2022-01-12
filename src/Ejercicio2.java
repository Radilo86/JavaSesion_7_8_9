public class Ejercicio2 {
    public void recorrerArray2D(int[][] dosD){
        for(int i=0; i < dosD.length; i++){
            for(int k=0; k < dosD[i].length;k++){
                System.out.println("La posicion [" + i + "]" + "[" + k + "] es: "
                        + dosD[i][k]);
            }
        }
    }
}
