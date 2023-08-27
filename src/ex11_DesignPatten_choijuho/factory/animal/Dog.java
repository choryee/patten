package ex11_DesignPatten_choijuho.factory.animal;

public class Dog implements Animal{
    @Override
    public void makeSound() {
        System.out.println("Dog : walwal..");
    }
}
