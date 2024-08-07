package com.ta1;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");

        PruebaAtributos prueba = new PruebaAtributos();
        System.out.println(prueba.bool); //imprime false
        System.out.println(prueba.cadena); //imprime null
        System.out.println(prueba.num); //imprime 0
        System.out.println(prueba.flotante); //imprime 0.0

        Ejercicio4 prueba2 =new Ejercicio4();
        prueba2.codigo(3);
    }
}
