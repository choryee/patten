package ex13_ChatGPT.CollectionPractice.Iterator;

import ex13_ChatGPT.CollectionPractice.List.List;

public class MyIterator<T> {
    private T[] elements; //private String[] elements; // String[] elements={"aa", "bb", "cc"}
    private int index;

    MyIterator(T[] array){
        elements=array;
        index=0;
    }

    public List<T> getAll(){
        List<T> lists=new List<T>();
        T t;
            for(int i=0; i<elements.length;i++){
                t=elements[i];
                lists.insert(t);
            }
        return lists;
    }

    public T getNext() {
        T t=null;
        for(int i=0;i<elements.length;i++) {
            t = elements[index];
            index++;
        }
        return t;
    }

    public boolean hasNext(){
        boolean hasNext=false;
        while (elements.length>1){
            hasNext=true;
            break;
        }
        return hasNext;
    }

}