package ut1ta3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LectorArchivos {
  public String[] obtenerLineas(String nombreCompletoArchivo){
    FileReader fr;
    String[] lineas = null;
    try {
      fr = new FileReader(nombreCompletoArchivo);
      BufferedReader br = new BufferedReader(fr);
      String lineaActual = br.readLine();
      int contadorLineas = 1; 

      while (lineaActual != null){
        System.out.println(lineaActual);
        lineaActual = br.readLine();
        contadorLineas++;
      }
   
      fr.close();
      br.close();

      fr = new FileReader(nombreCompletoArchivo);
      BufferedReader br2 = new BufferedReader(fr);

      lineas = new String[contadorLineas];
      
      for (int i = 0; i<contadorLineas; i++) {
        String linea = br.readLine();
        lineas[i] = linea;
      }
      fr.close();
      br2.close();

    } catch (FileNotFoundException e) {
      System.out.println("Error al leer el archivo "+nombreCompletoArchivo);
      e.printStackTrace();
    } catch (IOException e)
    {
      System.out.println("Error al leer el archivo "+nombreCompletoArchivo);
      e.printStackTrace();
    }
    System.out.println("Archivo leido satisfactoriamente");
    return lineas;
  }

  public int cantPalabras (String[] lineasArchivo){
    int cantidadPalabras = 0;
    for (int i =0; i < lineasArchivo.length; i++){
        ContadorPalabras contPal = new ContadorPalabras();
        cantidadPalabras += contPal.contadorPalabras(lineasArchivo[i]);

    }
    return cantidadPalabras;
}
}
