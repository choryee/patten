package ex13_JavaCodingInterview.AreaCalculation11;

public class Circle implements Shape{
    private double raidus;
    private static final double PI=Math.PI;

    Circle(double raidus){
        this.raidus=raidus;
    }
    @Override
    public double area() {
        return Math.floor( raidus*PI);
    }

    @Override
    public void showArea() {
        System.out.println("circle area: "+ area());
    }
}
