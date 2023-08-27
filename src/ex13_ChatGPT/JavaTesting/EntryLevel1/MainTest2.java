package ex13_ChatGPT.JavaTesting.EntryLevel1;

public class MainTest2 {
    public static void main(String[] args) {
        Cat1 cat1=new Cat1();
        System.out.println(cat1.eat());
    }
}

class Animal1{
    public String eat(){
        return "Animal is eating..";
    }
}

class Cat1 extends Animal1{
    @Override
    public String eat() {
        return super.eat();
    }

    public String move(){
        return "Animal is moving..";
    }
}
