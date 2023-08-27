//package ex11_DesignPatten_choijuho.AbstractFactory;
//
//// Abstract Factory: 음료 팩토리 인터페이스
//interface BeverageFactory {
//    Coffee createCoffee();
//    Tea createTea();
//}
//
//// Concrete Factory 1: 커피 팩토리
//class CoffeeFactory implements BeverageFactory {
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
//// Concrete Factory 2: 차 팩토리
//class TeaFactory implements BeverageFactory {
//    @Override
//    public Coffee createCoffee() {
//        return new NullCoffee();
//    }
//
//    @Override
//    public Tea createTea() {
//        return new GreenTea();
//    }
//}
//
//// Abstract Product: 음료 인터페이스
//interface Beverage {
//    void serve();
//}
//
//// Concrete Product 1: 에스프레소
//class Espresso implements Coffee {
//    @Override
//    public void serve() {
//        System.out.println("Espresso is served.");
//    }
//}
//
//// Concrete Product 2: 녹차
//class GreenTea implements Tea {
//    @Override
//    public void serve() {
//        System.out.println("Green Tea is served.");
//    }
//}
//
//// Concrete Product 3: 커피 없음
//class NullCoffee implements Coffee {
//    @Override
//    public void serve() {
//        System.out.println("No Coffee available.");
//    }
//}
//
//// Concrete Product 4: 차 없음
//class NullTea implements Tea {
//    @Override
//    public void serve() {
//        System.out.println("No Tea available.");
//    }
//}
//
//public class AbstractFactoryPatternExample {
//    public static void main(String[] args) {
//        BeverageFactory coffeeFactory = new CoffeeFactory();
//        BeverageFactory teaFactory = new TeaFactory();
//
//        Coffee coffee = coffeeFactory.createCoffee();
//        coffee.serve(); // Output: Espresso is served.
//
//        Tea tea = teaFactory.createTea();
//        tea.serve(); // Output: Green Tea is served.
//    }
//}
