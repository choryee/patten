package ex13_ChatGPT.Others.LinkedList;



import java.util.ArrayList;
import java.util.List;

public class LinkedList<T> {
    //node연결은 그냥 서로 newnode=node이런식으로 하면 됨.

    private Node<T> head; // 필드는 이거 하나만 있음.

    List<Node<T>> lists=new ArrayList<>();
    public void add(T data){ // 그냥 data만 있으면 되고, node는 서로 = 하면 됨.
        // newNode는 추가하는 매소드

        Node<T> newNode=new Node<>(data);

        if( head == null){
            head=newNode;
        }else{ //currentNode가 있다는 것
           Node<T> currentNode=head;
                while (currentNode.nextNode!=null){
                    currentNode=currentNode.nextNode;
                }
            currentNode.nextNode=newNode;
        }

        lists.add(head);
        lists.add(newNode);
    }

    public List<Node<T>> getAll(){
        for(int i=0; i<lists.size(); i++){
            System.out.println(lists.get(i).data);
        }
        return lists;

    }



}// --public class LinkedList<T> {

// 외부 클래스
    class Node<T>{
        T data;
        Node<T> nextNode;

        Node(T data){
            this.data=data;
            this.nextNode=null;
        }


    } //--class Node<T>{


