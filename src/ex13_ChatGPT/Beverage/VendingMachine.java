package ex13_ChatGPT.Beverage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VendingMachine <T extends Enum<T>>{
    private Map<T, Integer> stock;

    VendingMachine(){
        stock=new HashMap<>();
       // initializeStock();
    }

    private void initializeStock(){
        T[] values= (T[])Beverage.values();
    }

    public void addStock(T beverage, int quantity){//현재 수량이 있으면, 거기에 추가해야
        if (stock.containsKey(beverage)) {
            int currentQuantity = stock.get(beverage);
            stock.put(beverage, currentQuantity + quantity);
        } else { //현재 수량 없으면, 새로 추가.
            stock.put(beverage, quantity);
        }
    }

    public void removeStock(T beverage, int quantity){
        //Beverage beverage1=new Bever
        if(stock.containsKey(beverage)){
            int currentQuantity=stock.get(beverage);
            if(stock.get(beverage) >= quantity){
            stock.put(beverage, currentQuantity-quantity);
            }else{
               // System.out.println(beverage.getName() + " 재고가 부족합니다.");
                System.out.println( " 재고가 부족합니다.");
            }
        }else{
            System.out.println("해당 음료는 재고에 없습니다.");
        }
    }

    public int getStock(T beverage){
        int quantity=0;
        if(stock.containsKey(beverage)){
           quantity= stock.get(beverage);
        }else {
            System.out.println("해당 음료는 재고에 없습니다.");
        }
        return quantity;
    }

    public List<T> getAvailableBeverages(){
        List<T> list=new ArrayList<>();
        for( T beverage : stock.keySet()){
            list.add(beverage);
        }
        return list;
    }

    public Map<T, Integer> getAvailableBeveragesMap(){
        Map<T, Integer> map=new HashMap<>();
        for(T beverage : stock.keySet()){
            map.put(beverage, stock.get(beverage));
        }
        return map;
    }


}






















