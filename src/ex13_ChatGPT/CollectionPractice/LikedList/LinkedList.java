package ex13_ChatGPT.CollectionPractice.LikedList;


public class LinkedList<T> {
    private Node<T> head; // 노드를 가리키는 포인터
    private int size;

    LinkedList(){
        head=null;
        size=0;
    }
    // 노드 클래스
    private static class Node<T> { //Node라는 static클래스는 T타입의 data와, Node타입의 next를 변수를 가짐.
        T data;
                //네, 클래스 내부에 클래스와 동일한 변수명을 사용하는 것은 가능합니다. 자바에서는 변수의 스코프(scope)를 기준으로 변수를 구분하기 때문에 같은 이름의 변수가 클래스 내부에 선언되어도 충돌하지 않습니다.
                //위에서 주어진 코드에서 Node<T> next;는 Node 클래스 내부에 선언된 변수입니다. 클래스 내부에서 정의된 next 변수는 Node<T> 타입이므로, 현재 클래스인 Node의 인스턴스를 가리키는 역할을 합니다. 이는 연결 리스트에서 다음 노드를 가리키기 위한 포인터로 사용됩니다.
        Node<T> next; // 노드를 가리키는 포인터

        Node(T data){
            this.data=data;
            this.next=null;
        }

    }

    public static void main(String[] args) {
        LinkedList<String> linkedList=new LinkedList<>();
        linkedList.add("AA");

    }

    // 리스트에 요소 추가
    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> currentNode = head;
      //currentNode.next는 현재 노드의 다음 노드를 가리키는 포인터입니다.
            while (currentNode.next != null) {
              // 다음 포인터를 현재 포인터와 일치 시킨다(연결시킨다)
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }//--else
        size++;
    }


}
