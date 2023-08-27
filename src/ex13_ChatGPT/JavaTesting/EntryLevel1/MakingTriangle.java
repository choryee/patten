package ex13_ChatGPT.JavaTesting.EntryLevel1;

public class MakingTriangle {

    public static void main(String[] args) {
// https://javanewbie.tistory.com/5

        int numRows = 5;

        for (int i = 1; i < numRows; i++) {

            for(int j=0; j<numRows-i; j++){ //numRows-i 4
                System.out.print("a");
            }

            for(int j=0; j<(2*i)-1; j++){
                System.out.print("*");
            }

//            for (int k = numRows-1; k > numRows-i; k--) { //4
//                    System.out.print("*");
//            }
//
//            for (int p = numRows; p > numRows-i; p--) {
//                System.out.print("*");
//            }


            System.out.println(" ");
        }

    }
}
