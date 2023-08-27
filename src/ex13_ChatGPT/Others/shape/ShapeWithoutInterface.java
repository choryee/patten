package ex13_ChatGPT.Others.shape;

class Circle1{
    private double radius;

    Circle1(double radius){
        this.radius=radius;
    }

    public double area(){
        return Math.floor(3.1*radius*radius);
    }

    public double test(double input  ){
        return input>radius ? 2 : 1;
    }
}

public class ShapeWithoutInterface {
    public static void main(String[] args) {
        Circle1 c1=new Circle1(10.0);
        System.out.println(c1.area());


        System.out.println(c1.test(5.0));


    }

}
