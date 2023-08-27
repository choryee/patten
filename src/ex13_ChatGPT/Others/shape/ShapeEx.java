package ex13_ChatGPT.Others.shape;

interface shape{
    double area();
    void print();
}

class Circle implements shape{
    private double radius;

    Circle(double radius){
        this.radius=radius;
    }

    @Override
    public double area() {
        return Math.ceil(3.1*radius*radius);
    }

    @Override
    public void print() {
        System.out.println(area());
    }
}

public class ShapeEx {
    public static void main(String[] args) {
        shape circle=new Circle(3.0);
        circle.print();
    }
}
