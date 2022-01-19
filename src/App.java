import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /**Consignas
         * 1. Se necesita de un vector que sea capaz de almacenar 10 números enteros entre 1 y 100. Realizar un programa que permita la carga por teclado de los 10 números solicitados.
         */
        ordenar_edad();
        int[] vector_one = new int[9];

        try
            (Scanner keyBoard = new Scanner(System.in)) {
                for(int index=0; index<vector_one.length; index++){
                    System.out.println("Ingrese el número para la posición :"+ index);
                    //lee el dato del teclado
                    int key = keyBoard.nextInt();
                    //lo asigna en el indice correspondiente
                    vector_one[index] = key;
                }
            }
            catch (Exception e){
                System.out.println("Porfavor ingrese un número.");
            }

    }
    /**
     * 2. En un vector de 15 posiciones se almacenan las edades de 15 alumnos. Se desea un programa que sea capaz de determinar cuál es la mayor edad y cuál es la menor edad que se encuentra entre los estudiantes.
     */
    public static void ordenar_edad(){
        int age[] = new int[14];
    age[0] = 15;
    age[1] = 16;
    age[2] = 17;
    age[3] = 18;
    age[4] = 23;
    age[5] = 24;
    age[6] = 10;
    age[7] = 7;
    age[8] = 9;
    age[9] = 12;
    age[10] = 6;
    age[11] = 19;
    age[12] = 35;
    age[13] = 28;
    age[14] = 29;
    int mayor = age[0];

    for(int i=1; i<age.length; i++){
        if(age[i]> mayor){
            mayor = age[i];
        }
    }
    System.out.println(mayor);
    }

}
