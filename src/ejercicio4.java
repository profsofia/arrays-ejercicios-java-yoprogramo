public class ejercicio4 {
    public static void main(String[] args){
        /**Consigna:
         * 4.      En un vector de 23 posiciones se tienen las temperaturas máximas de las capitales de las 23 provincias argentinas en el último mes. A partir de esta información, un noticiero desea determinar el top 5 de las temperaturas más altas para poder mostrar en la pantalla de su programa, para ello se necesita un programa que sea capaz de recorrer el vector de temperaturas, determinar las 5 más altas y copiarlas en un nuevo vector de 5 posiciones
         */
        int[] temperature = {23, 24, 25, 30, 31, 34, 40, 15, 27, 28, 29, 24, 18, 37, 32, 34, 40, 15, 27, 28, 38, 41};
        int mayor_temp = temperature[0];
        for (int i = 1; i <temperature.length; i++) {
            if(temperature[i]>mayor_temp){
                mayor_temp = temperature[i];
            }
        }
        System.out.println(mayor_temp);
    }
    /**El código funciona solo imprimiendo el valor más alto de temperatura, cuando vuelva internet veremos como los almacenamos en un top five...  */
}
