package ut1ta3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LectorArchivos {
  public String[] contarLineasArchivo(String nombreCompletoArchivo){
    FileReader fr;

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

      String[] lineas = new String[contadorLineas];
      
      for (int i = 0; i<contadorLineas; i++) {
        String linea = br.readLine();
        lineas[i] = linea;
      }
      fr.close();
      br2.close();

    }
    catch (FileNotFoundException e) {
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
}
