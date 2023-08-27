package ex13_ChatGPT.Others;

import java.text.SimpleDateFormat;
import java.util.Date;

public class javaUtils {

    public static boolean isSidesMatched(String str1) {
        //level
        //공백은 무시는 구현 안 함.

        String str=str1.trim();
        boolean isSidesMatched = false;
        //System.out.println(str.length()); // level -->5
        int last=str.length()-1;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == str.charAt(last-i)){
                isSidesMatched=true;
            }else {
                isSidesMatched=false;
                break;
            }
        }
        return isSidesMatched;
    }

    public static char[] reverseAndPrint(String str){
        char[] reverse = new char[str.length()];
        for(int i=0; i<str.length(); i++){
            reverse[i]=str.charAt(str.length()-1-i);
        }
//        for (int i=0; i<reverse.length; i++){
//            System.out.print(reverse[i]);
//        }
        return reverse;
    }


    public static int returnIndex(String str, char c) {
        int idx = 0;
        if (str.indexOf(c) > 0) {
            for (int i = 0; i < str.length(); i++) {
                if (str.indexOf(c) == i)
                    idx = i;
            }
        } else {
            System.out.println("겹치는 문자가 없습니다.!!");
        }
        return idx;
    }

    public static Boolean isEmpty(String str) {
        boolean isEmpty = false;
        if (str.length() == 0) {
            isEmpty = true;
        }
        return isEmpty;
    }

    public static int findMaxValue1(int[] arr) { //int[] arr=new int[3];
        int length=3;
        int idx1=0;
        int idx2=0;
        int left, right;
        int max=0;

       // arr=new int[length];

//        arr[0]=14;
//        arr[1]=9;
//        arr[2]=15;

            for(int i=0; i<arr.length; i++){
                if(arr[idx1] < arr[idx1+1]){
    //                left++;
    //                right++;
                       max=arr[idx1+1];
                       idx1++;
                       if(max > arr[arr.length-1]){
                           break;
                       }
                }
                if(arr[idx2] > arr[idx2+1]){
    //                left++;
    //                right++;
                       max=arr[idx2];
                       idx2++;
                       if( max < arr[arr.length-1]){
                           max=arr[arr.length-1];
                       }
                }
            }
        return max;
    }

    public static int findMaxValue2(int[] arr){
        int max=arr[0];
        int second=0;
        int last=0; //113,9,21

            if(max > arr[1]){
                second=arr[1];
                if( second > arr[2]){
                    max=second;
                }else{
                    max=arr[2];
                }

            }else if(max < arr[1]){
                if(arr[1] > arr[2]){
                    max=arr[1];
                }else{
                    max=arr[2];
                }
            }

        return max;
    }

    public static int findMaxValue(int[] arr) {
        int max = arr[0];
        int num=0;
        for(int i=0; i< arr.length-1; i++){
            if( max > arr[i] ){
                if( max > arr[i+1]){
                    break;
                }else {
                    max=arr[i+1];
                }
            }else {
                if( arr[i] < arr[i+1]){
                    max=arr[i+1];
                }else{
                    max=arr[i];
                }
            }
        }
        return max;
    }

    public static int findMinValue(int[] arr){
        int min=arr[0];
        for(int num : arr){
            if( num < min){
                min=num;
            }
        }
        return min;
    }

    public static int sumIntArrary(int[] arr){
        int sum=0;
        for(int num : arr){
            sum+=num;
        }
        return sum;
    }

    public static String dateToString(){
        Date date1=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat();
         return sdf.format(date1);

    }

    public static boolean findIntArrary(int[] arr, int target){
        boolean found=false;
        for(int num : arr){
            if(num == target){
                found=true;
                break;
            }
        }
        return found;
    }


}
