package ex13_ChatGPT.Others.forPractice;

public class forExample {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-----------");

        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 6; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println("-----------");

        for (int i = 0; i < 5; i++) {
            for (int j = 1; j < 6; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("-----------");

        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 6; j++) {
                System.out.print(i + j);
            }
            System.out.println();
        }
        System.out.println("-----------");

        for (int i = 2; i <= 4; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d * %d =%2d\t", i,j,i*j);
            }
            System.out.println();
        }
        System.out.println("-----------");






    }
}
