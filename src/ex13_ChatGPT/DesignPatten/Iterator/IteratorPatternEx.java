package ex13_ChatGPT.DesignPatten.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class MyList<T> implements Iterable<T>{
    private List<T> items=new ArrayList<>();

    public void addItem(T item){
        items.add(item);
    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator<>(items);
    }
}

class MyIterator<T> implements Iterator<T>{
    private List<T> items;
    private int currentIndex=0;

    MyIterator(List<T> items){
        this.items=items;
    }

    @Override
    public boolean hasNext() {
        return currentIndex<items.size();
    }

    @Override
    public T next() {
        return items.get(currentIndex++);
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }
}

public class IteratorPatternEx {
    public static void main(String[] args) {
        MyList<String> myList1=new MyList<>();
        myList1.addItem("aa");
        myList1.addItem("bb");

        System.out.println(myList1.iterator().hasNext());
        System.out.println(myList1.iterator().next());


    }
}
