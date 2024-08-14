package ut1pds;

public class ValueOfDemo {
    public static void main(String[] args) {
        // this program requires two
        // arguments on the command line
        if (args.length == 3) {
            // convert strings to numbers
            int a = (Integer.valueOf(args[0])).intValue();
            int b = (Integer.valueOf(args[1])).intValue();
            // do some arithmetic
            //se pone un if para ver si son positivos o no
            if (a<0 || b<0){
                System.out.println("This program only accept positives numbers");
            }else{
                System.out.println("a + b = " + (a + b));
                System.out.println("a - b = " + (a - b));
                System.out.println("a * b = " + (a * b));
                System.out.println("a / b = " + (a / b));
                System.out.println("a % b = " + (a % b));
            }
            
        } else {
            System.out.println("This program requires two command-line arguments.");
        }
    }
}

/*
 * La salida con los parametros 13.4 y 66.1 es:
 * 
 * a + b = 79.5
 * a - b = -52.7
 * a * b = 885.74
 * a / b = 0.20242104
 * a % b = 13.4
 */
