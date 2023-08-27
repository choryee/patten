package ex13_ChatGPT.JavaTesting.EntryLevel1;

public class FindEvenNumber {

     boolean IsEvenNum(int num){
        return num%2==0;
    }

        public int newArray(int num){
         int number=0;
          if(IsEvenNum(num)){
              number=num;
          }
          return number;
        }

//    void print(){
//        for(int i=0; i<arr.length; i++){
//            System.out.println(arr[i]);
//        }
//    }


}
