package ut1ta2;

/**
 * Hello world!
 */
public final class UtilMath {

    public static void main(String[] args) {

        int numero = 7;
        int resultado = suma(numero);
        System.out.println(resultado);
        System.out.println("Hello World!");
    }

    public static int factorial (int num){
        int result = 1;
        for (int i = 1; i <= num; i++ ){
            result *= i;
        }
        return result;
    }

    public static boolean isPrime(long n) {
        boolean prime = true;
        for (long i = 3; i <= Math.sqrt(n); i += 2)
            if (n % i == 0) {
                prime = false;
                break;
        }
        if (( n%2 !=0 && prime && n > 2) || n == 2) {
            return true;
        } 
        else {
            return false;
        }
    }

    public static int suma(int num) {
        int i = 0;
        int suma = 0;

        if (isPrime(num) == true) {
            while (i<num) {
                suma += i;
                i += 2;
            }
        } else {
            i=1;
            while (i<=num) {
                suma += i;
                i += 2;
            }
        }
        return suma;
    }
}
