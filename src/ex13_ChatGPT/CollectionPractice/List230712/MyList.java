package ex13_ChatGPT.CollectionPractice.List230712;

import java.util.Arrays;

public class MyList {
    public static final int ARRAY_CAPACITY=5;
    private Object[] elements;
    private int idx;

    MyList(){
        elements=new Object[ARRAY_CAPACITY];
        idx=0;
    }

    @Override
    public String toString() {
        return "MyList{" +
                "elements=" + Arrays.toString(elements) +
                '}';
    }

    public void put(Object object){
        if(idx < ARRAY_CAPACITY){
            for(int i=0; i<elements.length; i++){
                elements[idx] = object;
                idx++;
            }
        }
    }

//    public String get(){
////        for(int i=0; i<elements.length;i++){
////            System.out.println(elements[i]);
////        }
//        return Arrays.toString(elements);
//    }

    public void get(){
        for(int i=0; i <= idx; i++){
            System.out.println(elements[i]);
        }
    }


}
