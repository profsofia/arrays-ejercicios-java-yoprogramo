import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args){
        /**Consigna
         * 5.      Se necesita un vector que permita cargar por teclado el nombre de 10 animales. A partir de esta carga, se desea otro vector que copie los mismos nombres pero en el orden inverso, es decir, si los nombres son: perro, gato, lagartija, el nuevo vector debe contener: lagartija, gato, perro. Una vez realizado el cambio, mostrar por pantalla ambos vectores para compararlos.
         */
        String animal[] = new String[9];
        try (Scanner obtener_nombre_animal = new Scanner(System.in)){
             for(int nombre=0; nombre<animal.length; nombre++) {
                 System.out.println("Ingrese el nombre de su mascota: ");
                 String nombre_mascota = obtener_nombre_animal.nextLine();
                 animal[nombre] = nombre_mascota;
             }
        }
        catch (Exception e) {
            System.out.println("No se pudo obtener el nombre, pruebalo nuevamente...");
        }
    }
    /**
     * Hasta acá tenemos los nombres de las 10 mascotas, cuando vuelva internet seguimos con el siguiente paso, guardar 5 nombres y mostrarlos en sentido inverso...
     */
}
