//package ex11_DesignPatten_choijuho.AbstractFactory;
//
//
//interface BeverageFactory {
//    Coffee createCoffee();
//    Tea createTea();
//}
//
//class CoffeeFactory implements BeverageFactory{
//
//    @Override
//    public Coffee createCoffee() {
//        return new Espresso();
//    }
//
//    @Override
//    public Tea createTea() {
//        return new NullTea();
//    }
//}
//
//abstract class Beverage{
//    public abstract void serve();
//}
//
//interface Coffee extends  Beverage{
//
//}
//
//class Espresso implements Coffee{
//    @Override
//    public void serve(){
//        System.out.println("Espresso is served...");
//    }
//}
//
//public class AbstractFactoryPatternExample {
//    public static void main(String[] args) {
//        BeverageFactory coffeeFactory=new CoffeeFactory();
//        Coffee coffee= coffeeFactory.createCoffee();
//        coffee.
//    }
//}