import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args){
        /**Consigna
         * 5.      Se necesita un vector que permita cargar por teclado el nombre de 10 animales. A partir de esta carga, se desea otro vector que copie los mismos nombres pero en el orden inverso, es decir, si los nombres son: perro, gato, lagartija, el nuevo vector debe contener: lagartija, gato, perro. Una vez realizado el cambio, mostrar por pantalla ambos vectores para compararlos.
         */
        String animal[] = new String[9];
        String nombre_mascota;
        try (Scanner obtener_nombre_animal = new Scanner(System.in)){
             for(int nombre=0; nombre<animal.length; nombre++) {
                System.out.print("Ingrese el nombre de su mascota: ");
                 nombre_mascota = obtener_nombre_animal.nextLine();
                 animal[nombre] = nombre_mascota;
                 //System.out.print(nombre_mascota + ", ");
             }
        }
        catch (Exception e) {
            System.out.println("No se pudo obtener el nombre, pruebalo nuevamente...");
        }
       /* System.out.print("\nLista de nombre de los animales, en sentido inverso al ingresado ");
        for(int inverso=animal.length-1; inverso>=0; inverso--){
            inverso_animal = animal[inverso];
            System.out.print(inverso_animal + ", ");
        }
        */
        //Mascotas ordenadas
        System.out.print("\nOrdenadas: ");
        for(int a=0; a<animal.length; a++){
            System.out.print(animal[a]+ ", ");
        }
        System.out.print("\nDesordenadas: ");
        for(int b=animal.length-1; b>=0; b--){
            System.out.print(animal[b] + ", ");
        }
    }
    
}
