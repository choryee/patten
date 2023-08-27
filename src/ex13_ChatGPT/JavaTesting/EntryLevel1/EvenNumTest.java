package ex13_ChatGPT.JavaTesting.EntryLevel1;

import java.util.ArrayList;
import java.util.List;

public class EvenNumTest {

    public static int findIndex(int[] arr, int num){
        int idx=0;
        for(int i=0; i<arr.length;i++){
            if(arr[i] == num){
                return i;
            }
        }
        return -1;
    }



    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11,12};
        int[] number = {10, 20, 30, 40, 50};

        System.out.println(findIndex(number, 41));
    }


}
