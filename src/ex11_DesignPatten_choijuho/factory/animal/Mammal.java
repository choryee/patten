package ex11_DesignPatten_choijuho.factory.animal;

public class Mammal {
    Cat cat;
    Dog dog;

    Mammal(){
        cat=new Cat();
        dog=new Dog();
    }

    public void test(){
        cat.makeSound();
    }
}
