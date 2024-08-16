package ut1pds;

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
        /*
        System.out.println(contador.contadorPalabras("Hola"));
        System.out.println(contador.contadorPalabras("Hola Mundo!"));
        System.out.println(contador.contadorPalabras("Hola 12345"));
        System.out.println(contador.contadorPalabras("Hola___3!---45"));

        System.out.println(contador.contadorVocales("Hola"));
        System.out.println(contador.contadorVocales("Holanda e Inglaterra"));
        System.out.println(contador.contadorVocales("Holanda3456"));
        System.out.println(contador.contadorVocales("HJLPKR"));

        System.out.println(contador.contadorConsonantes("Hola"));
        System.out.println(contador.contadorConsonantes("Holanda e Inglaterra"));
        System.out.println(contador.contadorConsonantes("Holanda3456"));
        System.out.println(contador.contadorConsonantes("HJLPKR"));

        System.out.println(contador.contadorPalabrasMin("Hola", 2));
        System.out.println(contador.contadorPalabrasMin("Hola de nuevo", 3));
        System.out.println(contador.contadorPalabrasMin("Hola", -2));
        */
        String[] ar1 = {"Hola", "mundo", "de", "los", "algoritmos"};
        String[] ar2 = {"Hola", "mundo", "de", "la", "informática"};
        String[] devolucion = contador.palabrasComunes(ar1, ar2);
        for (String cadena : devolucion) {
            System.out.println(cadena);
        }
    }
}
