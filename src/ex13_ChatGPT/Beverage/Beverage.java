package ex13_ChatGPT.Beverage;

public enum Beverage {
    COLA("콜라", 10),
    CIDER("사이다", 20),
    ORANGE_JUICE("오렌지 주스", 15);

    private String name;
    private int quantity;

    Beverage(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }



    public void addQuantity(int quantity) {
        this.quantity += quantity;
    }

    public void removeQuantity(int quantity){
        if(this.quantity < quantity ){
            this.quantity-=quantity;
        }else {
            System.out.println(name + " 재고가 부족합니다.");
        }
    }
    
}
