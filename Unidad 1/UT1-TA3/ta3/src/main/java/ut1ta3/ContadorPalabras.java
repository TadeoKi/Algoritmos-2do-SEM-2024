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




}
