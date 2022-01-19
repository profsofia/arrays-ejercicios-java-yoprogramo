import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /**Consignas
         * 1. Se necesita de un vector que sea capaz de almacenar 10 números enteros entre 1 y 100. Realizar un programa que permita la carga por teclado de los 10 números solicitados.
         */
        int[] vector_one = new int[9];

        try (Scanner keyBoard = new Scanner(System.in)) {
            for(int index=0; index<vector_one.length; index++){
                System.out.println("Ingrese el número para la posición :"+ index);
                //lee el dato del teclado
                int key = keyBoard.nextInt();
                //lo asigna en el indice correspondiente
                vector_one[index] = key;
            }
        }

    }
}
