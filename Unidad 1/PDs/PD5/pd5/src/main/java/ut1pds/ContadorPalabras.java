package ut1pds;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ContadorPalabras {

    public int contadorConsonantes(String fraseoriginal){
        String frase = fraseoriginal.toLowerCase();
        int contadorConsonante= 0;
        
        for (int i=0 ; i < frase.length() ; i++){
            char caracter = frase.charAt(i);

            if (!Vocales.esVocal(caracter) && Character.isLetter(caracter)) {
                contadorConsonante++;
            }
        
        }
        return contadorConsonante;
    }

    public int contadorVocales(String fraseoriginal){
        String frase = fraseoriginal.toLowerCase();
        int contadorVocal= 0;
        
        for (int i=0 ; i < frase.length() ; i++){
            char caracter = frase.charAt(i);
            if (Character.isLetter(caracter) && Vocales.esVocal(caracter)){
                contadorVocal++;
            }
        }
        
        return contadorVocal;
    }
}
