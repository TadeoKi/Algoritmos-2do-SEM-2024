package com.ta1;
// a) creemos que imprimira second string y third string
// b) efectivamente da lo que dijimos y lo que sucede es que cumple la primer condicion pero no cumple el segundo if por lo que pasa al else, imprimiendo second string.
//    Luego pasa a la siguiente linea imprimiendo third string.
public class Ejercicio4 {

    public void codigo(int aNumber){
        /* if (aNumber >= 0)
        if (aNumber == 0)
        System.out.println("first string");
        else System.out.println("second string");
        System.out.println("third string");*/

        /*
        if (aNumber >= 0) 
            if (aNumber == 0)
                System.out.println("first string");
            else System.out.println("second string");
            System.out.println("third string");
        */

        if (aNumber >= 0){
            if (aNumber == 0){
                System.out.println("first string");
            }else System.out.println("second string");
            
        }
        System.out.println("third string"); // va fuera ya que sin llaves, los if o else pueden tener una unica sentencia y leyendo el original desde arriba da que el ultimo print queda fuera de la sentencia del primer if.
        
        
    }
    

}
