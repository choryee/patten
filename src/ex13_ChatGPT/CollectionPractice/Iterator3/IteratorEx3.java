package ex13_ChatGPT.CollectionPractice.Iterator3;


import java.util.ArrayList;
import java.util.List;

interface MyIterator<E>{
    boolean hasNext();
    void next();
}

class Iterator<E> implements MyIterator{
    private List<E> lists;

    public void setLists(List<E> lists){
        this.lists=lists;
    }


    @Override
    public boolean hasNext() {
        boolean hasNext=false;

        for(int i=0; i<lists.size(); i++){
            hasNext=true;
        }

        return hasNext;
    }

    @Override
    public void next() {
        for(int i=0; i<lists.size(); i++){
            System.out.println(lists.get(i));
        }
        return ;
    }
}


public class IteratorEx3 {
    public static void main(String[] args) {
        Iterator iterator=new Iterator();
        List<String> myList=new ArrayList<>();
        myList.add("aa");
        myList.add("bb");
        iterator.setLists(myList);

        System.out.println(iterator.hasNext());

        iterator.next();

    }


}
