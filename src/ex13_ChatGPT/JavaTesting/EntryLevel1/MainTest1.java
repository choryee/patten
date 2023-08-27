package ex13_ChatGPT.JavaTesting.EntryLevel1;



interface Animal {
    String eat();
    String move();
}

interface Carnivore{
    String hunt();

}

class Cat implements Animal, Carnivore{
    @Override
    public String eat() {
        return "Mammal is eating.";
    }

    @Override
    public String move() {
        return "Mammal is moving.";
    }

    @Override
    public String hunt() {
        return "Cat is hunting for prey!!";
    }
}



public class MainTest1 {
    public static void main(String[] args) {
        Cat cat=new Cat();

        cat.eat();
        System.out.println(cat.eat());
        System.out.println(cat.hunt());
        System.out.println("test...");
    }
}


