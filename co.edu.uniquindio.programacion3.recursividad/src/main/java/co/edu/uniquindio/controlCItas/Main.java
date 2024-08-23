package co.edu.uniquindio.controlCItas;

public class Main {
 /*   public static void main(String[] args) {
        int n=3;
       // int suma = sumarEntero(n);
        int fb = secuenciaFB(n);
        System.out.println("El valor de la suma es: "+ fb);
    }*/

    private static int secuenciaFB(int n) {
        if (n <= 1){
            return n;
        }else{
            return secuenciaFB(n-1)+secuenciaFB(n-2);
        }
    }

    private static int sumarEntero(int n) {
        if (n == 1){
            return 1;
        }else{
            return sumarEntero(n-1)+n;
        }
    }
}