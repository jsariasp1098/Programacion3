package co.edu.uniquindio.controlCItas;

public class ContarCifrasEntero {
    public static void main(String[] args) {
        int entero = 2255;

        int cifras = contarCifras(entero);
        System.out.println(cifras);
    }

    private static int contarCifras(int entero) {
        if(entero < 10){
            return 1;
        }else {
            return contarCifras(entero/10) + 1;
        }

    }
}
