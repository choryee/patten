package ex13_ChatGPT.JavaTesting.EntryLevel1;

public class InsertSort {
    public static void main(String[] args) {
        int[] arr=new int[]{3,11,4,5,2,7};

        for(int i=1; i<arr.length; i++){
            int insert_point = i;
            int insert_value = arr[i];
            for (int j = i-1; j >= 0; j--) {
                if (arr[j] < arr[i])
                {
                    insert_point = j+1;
            System.out.println(insert_point);
                    break;
                }
                if(j==0) {
                    insert_point = 0;
                }
            }
//            for (int j = i; j > insert_point; j--) {
//                arr[j] = arr[j-1];
//            }
//            arr[insert_point] =insert_value;
//
//            System.out.print(arr[i]+" ");
        }// --바깥 for




    }


}
