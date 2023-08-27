package ex13_ChatGPT.Others.primeNumber;

public class PrimeNumber {
    public static void main(String[] args) {
        pNumber pNumber=new pNumber();
        System.out.println(pNumber.findNumber(6));

    }
}

class pNumber{

    public boolean findNumber(int number){
        int num=0;
        int idx=0;
        boolean found=false;
        for(int i=1; i<number; i++){
            if( number % i == 0){
                num=i;
            }
        }
        if( num == 1){
            found=true;
        }
        System.out.println("num>>"+num);
        return found;
    }
}
