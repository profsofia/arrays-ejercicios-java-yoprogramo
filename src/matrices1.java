
import java.util.Scanner;

import javax.swing.JOptionPane;

public class matrices1 {
    /**1.      Una matriz de 5 filas x 3 columnas almacena el total de goles de 5 jugadores de futbol en los últimos 3 partidos que jugaron, donde cada fila representa a un jugador y cada columna a la cantidad de goles que hizo. Se necesita un programa que sea capaz de permitir la carga de los goles, calcular el promedio de goles realizado por cada jugador y almacenar el resultado en un vector de 5 posiciones, donde cada posición representará a un jugador. Tener en cuenta el siguiente diagrama para llevar a cabo el planteo:


Nota: tener en cuenta que el promedio de goles puede dar como resultado un número que NO SEA ENTERO. */
  public static void main(String[] args) { 
      Scanner entrada = new Scanner(System.in);
     // float prom_goles[] = new float[4];
     int jugadores_goles[][];
     
     int nFilas, nColumnas;
     //para que el usuario ingrese los datos a través de una ventana emergente..
     nFilas = Integer.parseInt(JOptionPane.showInputDialog("Coloque el n° de filas: "));
     nColumnas = Integer.parseInt(JOptionPane.showInputDialog("Coloque el n° de columnas: "));
     //una vez que el usuario coloca cuantas filas y cuantas columnas tiene la matriz le asignamos esos indices a la matriz...
     jugadores_goles = new int[nFilas][nColumnas];
     //recorrido de la matriz..

     System.out.print("\nDigite la matriz: ");
     for(int i = 0; i < nFilas; i++){
         for(int j = 0; j < nColumnas; j++){
             System.out.print("\nMatriz :["+ i + "]" +"[" +j + "] :");
             //lo guardamos en...
             jugadores_goles[i][j] = entrada.nextInt();
         }
     }
     System.out.print("\nLa matriz que creaste es: \n");
    for(int filas=0; filas<nFilas; filas++){
        for(int columnas=0; columnas<nColumnas; columnas++){
          System.out.print(jugadores_goles[filas][columnas]);
        }
        System.out.println("");
    }
   }
}
