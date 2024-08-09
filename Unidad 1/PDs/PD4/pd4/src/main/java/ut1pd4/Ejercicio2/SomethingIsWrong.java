package ut1pd4.Ejercicio2;

public class SomethingIsWrong {
    public static void main(String[] args) {
    Rectangle myRect = new Rectangle();
    myRect.width = 40;
    myRect.height = 50;
    System.out.println("myRect's area is " + myRect.area());
    }
}

/*
 * El problema de este codigo es no tener definido el objeto rectangle por lo que no es posible crearlo ni modificarlo
 * Tambien esta mal inicializado el objeto myRect, falta agregarle = new Rectangle()
*/