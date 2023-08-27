package ex13_ChatGPT.CollectionPractice.Iterator;

public class TestMyIterator {
    public static void main(String[] args) {
        MyIterator<String> myIterator=new MyIterator<>(new String[]{"aa", "bb", "dd"});
        //MyIterator<Integer> myIterator=new MyIterator<>(new Integer[]{2,4,7});
        System.out.println(myIterator.hasNext());
        System.out.println(myIterator.getAll());
        System.out.println("-----------------");
        System.out.println(myIterator.getNext());



    }
}
