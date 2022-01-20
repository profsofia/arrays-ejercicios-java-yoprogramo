public class ejercicio2 {
    public static void main(String[] args){
      /*
         * 2. En un vector de 15 posiciones se almacenan las edades de 15 alumnos. Se desea un programa que sea capaz de determinar cuál es la mayor edad y cuál es la menor edad que se encuentra entre los estudiantes.
         */
    
        int age[] = new int[15];
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
        for(int min=1; min<age.length; min++){
            if(age[min]< mayor){
                mayor = age[min];
        }
    }
    System.out.println(mayor);
}
}