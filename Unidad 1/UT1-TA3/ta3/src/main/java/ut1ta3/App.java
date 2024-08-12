package ut1ta3;

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
       ContadorPalabras contador = new ContadorPalabras();
       System.out.println(contador.contadorPalabras("Hola"));
       System.out.println(contador.contadorPalabras("Hola Mundo!"));
       System.out.println(contador.contadorPalabras("Hola 12345"));
       System.out.println(contador.contadorPalabras("Hola___3!---45"));

    }
}
