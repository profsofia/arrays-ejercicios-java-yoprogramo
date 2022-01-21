import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args){
    /**Consigna
    * 3.      Se tienen tres vectores. En el primero de ellos se guarda un número de dni, en el segundo un nombre y en el tercero un apellido. Se desea un programa que sea capaz de recorrer los tres vectores AL MISMO TIEMPO y mostrar cada uno de estos datos por pantalla. Pista: tener en cuenta que el índice de cada vector es correspondiente al índice de los demás, es decir, los datos contenidos en el índice cero del vector de dni, se corresponde con el índice cero del vector de nombres y el de apellidos.
    */
     long obtener_dni[] = new long[2]; 
     String obtener_nombre[] = new String[2];
     String obtener_apellido[] = new String[2];
     try (Scanner dni = new Scanner(System.in)){
         for(int i=0; i<2; i++){
             System.out.println("Ingrese su DNI(sin puntos ni guiones): ");
             //leemos el dato que ingresa el usuario
             long num_dni = dni.nextLong();
             //lo colocamos en una variable
             obtener_dni[i] = num_dni;
             //para el nombre.
             System.out.println("Ingrese su nombre: ");
             String nombre = dni.nextLine();
             obtener_nombre[i] = nombre;
             //para el apellido.
             System.out.println("Ingrese su apellido: ");
             String apellido = dni.nextLine();
             obtener_apellido[i] = apellido;
             System.out.println(num_dni +" ." +nombre + " ." +apellido);

         }
     }
     catch(Exception e) {
         System.out.println("Error al obtener los datos, intente nuevamente");
     }
}
}

