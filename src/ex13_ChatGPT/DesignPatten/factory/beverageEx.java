package ex13_ChatGPT.DesignPatten.factory;



interface Beverage{
    void serve();
}

class Coffee implements Beverage{

    @Override
    public void serve() {
        System.out.println("Coffee is served...");
    }
}

class Tea implements Beverage{

    @Override
    public void serve() {
        System.out.println("Tea is served...");
    }
}

class BeverageFactory{
    public Beverage createBeverage(String type){
        if(type.equalsIgnoreCase("coffee")){
            return new Coffee();
        }else if(type.equals("tea")){
            return new Tea();
        }else {
            throw new IllegalArgumentException("그런건 없어..");
        }
    }
}

public class beverageEx {
    public static void main(String[] args) {
        BeverageFactory bf=new BeverageFactory();
       // bf.createBeverage("coffee").serve();
        Beverage coffee=bf.createBeverage("coffee");


    }
}