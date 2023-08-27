package ex13_ChatGPT.Beverage;

public class TestBeverage {
    public static void main(String[] args) {
        for(Beverage beverage : Beverage.values()){
            System.out.println(beverage.getName());
        }

        VendingMachine<Beverage> vm=new VendingMachine<>();
        vm.addStock(Beverage.COLA, 10);
        vm.addStock(Beverage.CIDER, 10);
        System.out.println(vm.getAvailableBeverages());

        System.out.println(vm.getAvailableBeveragesMap());

    }
}
