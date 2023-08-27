package ex11_DesignPatten_choijuho.factory.animal;

public class AnimalFactory {

    public Animal createAnimal(String animalType) {


        if(animalType.equals("dog")){
            return new Dog();
        } else if (animalType.equals("cat")) {
            return new Cat();
        }else {
            throw new IllegalArgumentException("그런거 없어요.!!");
        }

    }
}
