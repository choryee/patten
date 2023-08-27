package ex13_ChatGPT.Beverage1;

import java.util.HashMap;
import java.util.Map;

public class VendingMachine < T extends Enum<T>> {

    //addStock, removeStock, getStock, getAvailableBeverages, getAvailableBeveragesMap
    Map<T, Integer> stock; // T <--Beverage.COLA

    VendingMachine(){
        stock=new HashMap<>();
    }

    public void addStock(T beverage, int quan){
       if(stock.containsKey(beverage)){ //기존 음료 종류가 있을때
           int currentQuan=stock.get(beverage);
           stock.put(beverage, currentQuan+quan);
       }else{
           stock.put(beverage, quan); // 매개변수를 새로운 종류로 넣는다.
       }
    }

    public void removeStock(T beverage, int quan){
        if(stock.containsKey(beverage)){
            int currentQuan=stock.get(beverage);
            if(currentQuan >= quan){
                stock.put(beverage, currentQuan-quan);
            }else {
                System.out.println("재고가 부족합니다.");
            }
        }
    }


}
