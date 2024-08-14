package ut1pds;

public class ToStringDemo {
    public static void main(String[] args) {
        double d = 888.51;
        String s = Double.toString(d);
        int dot = s.indexOf('.');
        System.out.println(dot + " digits " + "before decimal point.");
        System.out.println( (s.length() - dot - 1) + " digits after decimal point.");
        
    }
}

/*
 * La salida al ejecutar el primer programa es:
 * 3 digits before decimal point.
 * 2 digits after decimal point.
 */

 /*
  * El metodo indexOf recorre un string y devuelve el indice del caracter marcado.
  * En este caso recorre el string "888.51", encontrandolo en la 3 posicion ya que arranca en 0.
  * Por ende sabe que hay 3 numeros antes del . y luego restando ese numero al largo del string obtenemos los digitos despues.
  */
