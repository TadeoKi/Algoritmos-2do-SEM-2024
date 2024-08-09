package ut1pd4.Ejercicio2;

public class Rectangle {
    int width;
    int height;

    public Rectangle(){
        this.width = 0;
        this.height = 0;
    }

    public int area(){
        int area = this.width * this.height;
        return area;
    }
}
