package ut1ta3;

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


}
