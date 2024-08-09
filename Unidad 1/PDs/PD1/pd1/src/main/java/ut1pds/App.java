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
        double numero1=1, numero2=2, numero3=3;
        
        Multsuma multisuma = new Multsuma();
        double result = multisuma.multsuma(numero1,numero2,numero3);
        System.out.println(result);
    }

    
        
}


