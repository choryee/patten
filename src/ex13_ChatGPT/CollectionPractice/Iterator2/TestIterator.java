package ex13_ChatGPT.CollectionPractice.Iterator2;

public class TestIterator {
    public static void main(String[] args) { //230723
        //Iterator<String> it=new Iterator<>({"aa", "bb"}, 2);
        //Iterator<String> it=new Iterator<>({"aa", "bb"}, 2); 이것은 왜 틀렸나?
        //
        //ChatGPT
        //제가 이전에 말씀드린 대로, Java에서는, 배열{}을 선언할 때, 중괄호 {}로 직접 요소를 초기화하는 문법은 사용할 수 없습니다.
        // 중괄호로 직접 요소를 초기화할 때,는 배열 선언 시에만 사용할 수 있습니다.
        //따라서, Iterator<String> it = new Iterator<>({"aa", "bb"}, 2);는 올바른 문법이 아닙니다.
        // 배열을 초기화하려면 new String[]{"aa", "bb"}와 같이 배열을 생성하고 값을 넣어주어야 합니다.
        //
        //올바른 문법으로는 아래와 같이 수정해야 합니다:
        Iterator<String> it=new Iterator<>(new String[]{"aa", "bb"}, 2);


        //String[] arr=new String[2];
        String[] arr;
        arr= new String[]{"AA", "BB"};

        String[] array={"11", "22"};

        it.getAll();


    }



}
