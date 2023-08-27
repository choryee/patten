package ex13_ChatGPT.JavaTesting.EntryLevel1.insertSort;

import java.util.Scanner;

public class P11399_ATM_1 {
    public static void main(String[] args) {
        int[] arr=new int[]{3,1,4,3,2};

        for (int i = 1; i < arr.length; i++) { //삽입 정렬
            int insert_point = i;
            int insert_value = arr[i];
            for (int j = i-1; j >= 0; j--) {
               if(arr[j]>arr[i]){
                   insert_point=j; //0
                   break;
               }
                arr[insert_point]=insert_value;
            }//--안쪽 for문 j

        }
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}