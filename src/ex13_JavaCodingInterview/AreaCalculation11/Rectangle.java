package ex13_JavaCodingInterview.AreaCalculation11;

public class Rectangle implements Shape{
    private double width;
    private double height;

    Rectangle(double width, double height){
        this.width=width;
        this.height=height;
    }

    @Override
    public double area() {
        return width*height;
    }

    @Override
    public void showArea() {
        System.out.println("Area = "+ area());
    }
}
