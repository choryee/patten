package ex13_ChatGPT.CollectionPractice.Iterator2;

public class Iterator<Object> {
    private int idx;
    private Object[] arr;  //private String[] arr;

    Iterator(Object[] t, int idx){
        arr=t;
        this.idx=idx;
    }

    public void getAll(){
        for(int i=0; i<arr.length; i++){
                System.out.println(arr[i]);
        }
    }

    public void put(){

    }

}
