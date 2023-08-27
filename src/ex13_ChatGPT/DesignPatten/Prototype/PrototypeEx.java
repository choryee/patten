package ex13_ChatGPT.DesignPatten.Prototype;


interface Prototype{
    Prototype clone();
}

class ConcretePrototype implements Prototype{
    private String name;

    ConcretePrototype(String name){
        this.name=name;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype(name);
    }

    public String getName(){
        return name;
    }


}


public class PrototypeEx {
    public static void main(String[] args) {
        ConcretePrototype original =new ConcretePrototype("Original Object");
        ConcretePrototype cloned= (ConcretePrototype) original.clone();
        System.out.println("Original Object: " + original.getName());
        System.out.println("Cloned Object: " + cloned.getName());
    }
}
