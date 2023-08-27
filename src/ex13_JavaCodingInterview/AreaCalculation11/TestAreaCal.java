package ex13_JavaCodingInterview.AreaCalculation11;

public class TestAreaCal {
    public static void main(String[] args) {
        Shape shape=new Rectangle(20, 10.1);
        shape.showArea();

        Shape circle=new Circle(10);
        circle.area();
        circle.showArea();

        String str1="kim";
        String str2="kim";
        System.out.println(str1==str2);


    }
}
