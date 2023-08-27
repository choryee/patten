package ex08_Java_ParkEunJong.Lamda;

public class IntNumber implements MyNumber{

    private int num1;
    private int num2;

    IntNumber(int num1, int num2){
        this.num1=num1;
        this.num2=num2;
    }

    @Override
    public int getMax(int num1, int num2) {
        return num1;
    }

    @Override
    public int add(int num1, int num2) {
        return 0;
    }
}
