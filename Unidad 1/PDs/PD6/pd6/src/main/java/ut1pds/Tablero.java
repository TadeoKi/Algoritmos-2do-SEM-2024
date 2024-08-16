package ut1pds;

public class Tablero {

    public static void main(String[] args) {
        Tablero.imprimirTablero(7, 7);
    }
    
    public static void imprimirTablero(int largo, int ancho){
        for (int i = 0; i < ancho; i++){
            for (int u = 0; u <= largo; u++){
                if (u == largo){
                    System.err.println("");
                }else{
                    System.out.print("#");
                }
                
            }
        }
    }
}
