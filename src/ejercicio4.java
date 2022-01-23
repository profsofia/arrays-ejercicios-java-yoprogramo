//import java.util.Arrays;
//import java.util.Collections;

public class ejercicio4 {
    public static void main(String[] args){
        /**Consigna:
         * 4.      En un vector de 23 posiciones se tienen las temperaturas máximas de las capitales de las 23 provincias argentinas en el último mes. A partir de esta información, un noticiero desea determinar el top 5 de las temperaturas más altas para poder mostrar en la pantalla de su programa, para ello se necesita un programa que sea capaz de recorrer el vector de temperaturas, determinar las 5 más altas y copiarlas en un nuevo vector de 5 posiciones
         */
        int[] temperature = {23, 24, 25, 30, 31, 34, 40, 15, 27, 28, 29, 24, 18, 37, 32, 34, 40, 15, 27, 28, 38, 41};
        //creamos la variable que usamos en el ciclo anidado
        int auxiliar_de_cambio;
        
        //Arrays.sort(temperature, Collections.reverseOrder()); No funciona
        
      /*  int mayor_temp = temperature[0];
        for (int i = 1; i <temperature.length; i++) {
            if(temperature[i]>mayor_temp){
                mayor_temp = temperature[i];
            }
        }
        System.out.println(mayor_temp);
        */
        /**El código funciona solo imprimiendo el valor más alto de temperatura */
   //Método burbuja...
   for(int i=0; i<temperature.length-1; i++){
     for(int j=0; j<temperature.length-1; j++){
         //si numero actual es mayor a numerosiguiente, cambio de lugar...
         if(temperature[j]>temperature[j+1]){
          auxiliar_de_cambio = temperature[j];
          temperature[j]= temperature[j+1];
          temperature[j+1]= auxiliar_de_cambio;
         }
     }
   }
   //mostrando el arreglo en forma creciente
   System.out.print("Arreglo en forma creciente : ");
   for( int i=0; i<temperature.length; i++){
       System.out.print(temperature[i]+ " - ");
   }
   System.out.println(" ");
   //ahora vamos a imprimirlo en forma decreciente...
   System.out.print("imprimimos el top five: ");
   for(int d=temperature.length-1; d>=17; d--){
       System.out.print(temperature[d] + " - ");
   }
   
 }
    
}
