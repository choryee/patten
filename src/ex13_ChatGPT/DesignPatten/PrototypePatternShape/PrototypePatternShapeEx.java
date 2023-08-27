package ex13_ChatGPT.DesignPatten.PrototypePatternShape;

import java.util.HashMap;
import java.util.Map;

interface Shape extends Cloneable{
    void draw();
    Shape clone();
}

class Circle implements Shape{
    private String color;

    Circle(String color){
        this.color=color;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " +color+" circle");
    }

    @Override
    public Shape clone() {
        return new Circle(color);
    }
}

class PrototypeRegistry{
    private Map<String, Shape> prototypes=new HashMap<>();

    PrototypeRegistry(){
        prototypes.put("red-circle", new Circle("red"));
        prototypes.put("blue-circle", new Circle("blue"));
    }

    public Shape getPrototype(String type){
        return prototypes.get(type).clone();
    }
}

public class PrototypePatternShapeEx {
    public static void main(String[] args) {
        PrototypeRegistry registry =new PrototypeRegistry();
        registry.getPrototype("red-circle").draw();

        Shape redCircle=registry.getPrototype("blue-circle");
        redCircle.draw();
    }
}
