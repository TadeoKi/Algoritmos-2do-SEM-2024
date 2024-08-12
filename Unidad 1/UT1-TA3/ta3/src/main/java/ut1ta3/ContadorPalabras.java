package ut1ta3;

// Consideramos una palabra si tiene al menos un caracter o numero. Recorro caracter a caracter y analizo es un digito o numero o no. 
// Si se cumple, se guarda el boolean en una bandera. Si la bandera es true y el digito actual no es un caracter entonces se suma uno al 
// contador de palabras. Al final se analiza si el ultimo digito es una palabra, 
// si es así nuevamente se suma uno (para abarcar casos que la frase solo tiene una palabra o termina en un caracter que no es letra o numero).
//  Luego se retorna el contador con el total de palabras.  

public class ContadorPalabras {
    public int contadorPalabras(String frase){
        int contador= 0;
        boolean bandera= false;
        for (int i=0 ; i < frase.length() ; i++){
            
            if (Character.isLetterOrDigit(frase.charAt(i))){
                bandera = true;
                

            }else{
                if (bandera == true){
                    contador++;
                    bandera = false;
                }

            }


        }
        if(bandera==true){
            contador++;
        }
        return contador;
    }

    public int contadorConsonantes(String fraseoriginal){
        String frase = fraseoriginal.toLowerCase();
        int contadorConsonante= 0;
        String vocales = "aeiouáéíóú";
        for (int i=0 ; i < frase.length() ; i++){
            
            if (Character.isLetter(frase.charAt(i))){
                if(vocales.indexOf(frase.charAt(i)) == -1){
                    contadorConsonante++;
                }
            }
        }
        
        return contadorConsonante;
    }

    public int contadorVocales(String fraseoriginal){
        String frase = fraseoriginal.toLowerCase();
        int contadorVocal= 0;
        String vocales = "aeiouáéíóú";
        for (int i=0 ; i < frase.length() ; i++){
            
            if (Character.isLetter(frase.charAt(i))){
                if(vocales.indexOf(frase.charAt(i)) != -1){
                    contadorVocal++;
                }
            }
        }
        
        return contadorVocal;
    }

    /*
     * Faltaria una documentacion JavaDoc
     *  
     */
    public static int contadorPalabrasMin(String frase, int largoMin){
        int contadorPalabras= 0;
        int contadorLetras = 0;

        boolean bandera= false;

        for (int i=0 ; i < frase.length() ; i++){
            if (Character.isLetterOrDigit(frase.charAt(i))){
                bandera = true;
                contadorLetras++;
                

            }else{
              bandera = false;
              if (contadorLetras >= largoMin) {
                contadorPalabras ++;
              }
              contadorLetras = 0;
            }

        }
        if(bandera==true){
            contadorLetras++;
            if (contadorLetras>largoMin) {
              contadorPalabras++;
            }
        }
        return contadorPalabras;
    }


}
