package ex13_ChatGPT.Beverage1;

public enum Beverage {

    // addQuantity, removeQuan

    COLA("콜라", 10),
    CIDER("사이다", 20),
    ORANGE_JUICE("오렌지주스", 15);


    private String name;
    private int quan;

    Beverage(String name, int quan){
        this.name=name;
        this.quan=quan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuan() {
        return quan;
    }

    public void setQuan(int quan) {
        this.quan = quan;
    }

    public void addQuan(int quan){
       this.quan+=quan;
    }

    public void removeQuan(int quan){
        if( this.quan > quan){
            this.quan-=quan;
        }else{
            System.out.println(name+"의 재고가 부족합니다.");
        }
    }


}
