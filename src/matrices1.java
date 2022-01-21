import java.util.Scanner;

public class matrices1 {
    /**1.      Una matriz de 5 filas x 3 columnas almacena el total de goles de 5 jugadores de futbol en los últimos 3 partidos que jugaron, donde cada fila representa a un jugador y cada columna a la cantidad de goles que hizo. Se necesita un programa que sea capaz de permitir la carga de los goles, calcular el promedio de goles realizado por cada jugador y almacenar el resultado en un vector de 5 posiciones, donde cada posición representará a un jugador. Tener en cuenta el siguiente diagrama para llevar a cabo el planteo:


Nota: tener en cuenta que el promedio de goles puede dar como resultado un número que NO SEA ENTERO. */
  public static void main(String[] args) { 
     int jugadores_goles[][] = new int[5][3];
     try (Scanner obtener_goles = new Scanner(System.in)){
         for(int i=0; i<5; i++) {
             for(int j=0; j<3; j++) {
                 System.out.println("Ingrese el número de goles: ");
                 int gol = obtener_goles.nextInt();
                 jugadores_goles[i][j] = gol;
                 //promedio de goles.
                float promedio = gol/3;
                System.out.println(promedio);
             }
         }
     }
   }
}
