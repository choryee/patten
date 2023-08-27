package ex13_ChatGPT.DesignPatten.strategy;



interface PaymentStrategy{
    void pay(int amount);
}

class CreditCardPayment implements PaymentStrategy{
    private String cardNum;
    private String  expirationDate;

    CreditCardPayment(String cardNum, String expirationDate){
        this.cardNum=cardNum;
        this.expirationDate=expirationDate;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid $"+amount+" using credit-card..");
    }
}

class PaypalPayment implements PaymentStrategy{
    private String paypalNum;

    PaypalPayment(String paypalNum){
        this.paypalNum=paypalNum;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid $ "+amount+"using paypal..");
    }
}

class PaymentFactory{//그냥 팩토리패턴 넣음.
    public PaymentStrategy createPaymentType(String type){
        if(type.equalsIgnoreCase("paypal")){
            return new PaypalPayment("2563");
        }
        return null;
    }
}

class PaymentProcessor{
    private PaymentStrategy paymentStrategy;

    PaymentProcessor(PaymentStrategy paymentStrategy){
        this.paymentStrategy=paymentStrategy;
    }

    public void processPayment(int amount){
        paymentStrategy.pay(amount);
    }

}

public class StrategyEx {
    public static void main(String[] args) {
        PaymentStrategy creditCard=new CreditCardPayment("1001-2222", "2023-12-31");

        PaymentProcessor pp=new PaymentProcessor(creditCard);
        pp.processPayment(100);

        PaymentFactory pf=new PaymentFactory();
        PaymentStrategy ps=pf.createPaymentType("paypal");


    }

}
