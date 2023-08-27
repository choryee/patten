package ex13_ChatGPT.JavaTesting.EntryLevel1.personFactory;

public class TestPerson {
    public static void main(String[] args) {
        Person person1=createPerson.createPersons("jon", 12);
        System.out.println(person1.toString());

    }
}

class createPerson{
    public static Person createPersons(String name, int age){
        return new Person(name, age);
    }
}
