package ex13_ChatGPT.CollectionPractice.Map;

public class TestMyMap {
    public static void main(String[] args) {
    MyMap<String, String> myMap=new MyMap<>();

    myMap.put("bb", "BB");
    myMap.put("aa", "AA");
    myMap.put("cc", "CC");
    System.out.println(myMap.getAll());

    System.out.println(myMap.getEntry("aa", "AA"));
    System.out.println(myMap.isContains("bb"));
    System.out.println(myMap.keySet());
    System.out.println(myMap.valueSet());
    System.out.println(myMap.isEmpty());
    System.out.println(myMap.remove("aa"));
    System.out.println(myMap.getAll());
    System.out.println(myMap.isContainValue("BB"));
    System.out.println(myMap.size());
    System.out.println(myMap.values());




    }

}
