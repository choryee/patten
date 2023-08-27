package ex11_DesignPatten_choijuho.factory.animal;

public class TestAnimal {
    public static void main(String[] args) throws ClassNotFoundException {
        AnimalFactory af=new AnimalFactory();
       af.createAnimal("dog").makeSound();

        Animal cat=af.createAnimal("cat");
        cat.makeSound();

        Animal cow=af.createAnimal("cow");
        cow.makeSound();
    }
}
