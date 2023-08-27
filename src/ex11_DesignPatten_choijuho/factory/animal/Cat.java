package ex11_DesignPatten_choijuho.factory.animal;

public class Cat implements Animal{
    @Override
    public void makeSound() {
        System.out.println("cat : yum...");
    }
}
