package ut1pds;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public final class App {
    private App() {
    }

    public static void main(String[] args) {
        App.leerEntradaArchivo(".\\Prueba.txt");
    }

    public static void leerEntradaArchivo(String rutaArchivo){
        
        FileReader fr;
        String[] lineas = null;
        int auxiliarLinea = 0;
        int a= 0;
        float b= 0;
        String c= "";
        try {
            fr = new FileReader(rutaArchivo);
            BufferedReader br = new BufferedReader(fr);
            String lineaActual = br.readLine(); 

            while (lineaActual != null){
                auxiliarLinea++;
                lineaActual = br.readLine();
            }
        
            fr.close();
            br.close();

            fr = new FileReader(rutaArchivo);
            BufferedReader br2 = new BufferedReader(fr);

            lineas = new String[auxiliarLinea];
            
            for (int i = 0; i<auxiliarLinea; i++) {
                String linea = br.readLine();
                lineas[i] = linea;
            }
            fr.close();
            br2.close();

            for (String linea : lineas) {
                if (isInteger(linea)) {
                    System.out.println("El entero leído es: "+linea);
                    a = Integer.parseInt(linea);
                } else if (isFloat(linea)) {
                    System.out.println("El número de punto flotante es: "+linea);
                    b = Float.parseFloat(linea);
                } else {
                    System.out.println("La cadena leída es " + linea);
                    c = linea;
                }
            }
            System.out.println("Hola "+ c + "! La suma de "+a+ " y "+b+" es "+(a+b)+".");
            System.out.println("La división entera de "+b+" y "+a+" es "+(b/a)+" y su resto es "+(b%a)+".");


 


        } catch (FileNotFoundException e) {
        System.out.println("Error al encontrar el archivo "+rutaArchivo);
        e.printStackTrace();
        } catch (IOException e)
        {
        System.out.println("Error al leer el archivo "+rutaArchivo);
        e.printStackTrace();
        }
        System.out.println("Archivo leido satisfactoriamente");
        
    }

    public static boolean isInteger(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isFloat(String value) {
        try {
            Double.parseDouble(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
