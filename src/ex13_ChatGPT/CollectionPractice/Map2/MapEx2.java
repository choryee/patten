package ex13_ChatGPT.CollectionPractice.Map2;


import java.util.*;

class Map<k, v>{
    private List<Entry<k,v>> entries=new ArrayList<>();

//    Map(List<Entry<k,v>> entries){
//        this.entries=entries;
//    }

    public void put(Entry<k,v> entry){
        entries.add(entry);
    }

    public void geKey(){
        for(Entry entry : entries){
            System.out.println(entry.getKey());
        }
    }

    public void getValue(){
        for(Entry entry : entries){
            System.out.println(entry.getValue());
        }
    }

    public int size(){
        int size=0;
        for(int i=0; i< entries.size(); i++){
            size++;
        }
        return size;
    }

    public boolean isEmpty(){
        boolean isEmpty=false;
        if(entries.size() == 0){
            isEmpty=true;
        }
        return isEmpty;
    }

    public boolean containsValue(k value){
        boolean containsValue=false;
        for(int i=0; i<entries.size(); i++){
            if( entries.get(i).getValue().equals(value)){
                containsValue=true;
            }
        }
        return containsValue;
    }

    public void iterator(){
        Iterator it= entries.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

    public Set<Entry<k,v>> entrySet(Entry<k, v> entry){
        Set<Entry<k,v>> set= new HashSet<>();
        set.add(entry);
        return set;
    }

    public void getAll(){
        for(int i=0; i<entries.size();i++){
            System.out.println(entries.get(i).toString());
        }

    }

}

class Entry<k, v>{
    private k key;
    private v value;

    Entry(k key, v value){
        this.key=key;
        this.value=value;
    }

    public k getKey() {
        return key;
    }

    public void setKey(k key) {
        this.key = key;
    }

    public v getValue() {
        return value;
    }

    public void setValue(v value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}

class Person{
    private String name;

    public void setName(String name ){
        this.name=name;
    }
}
public class MapEx2 {
    public static void main(String[] args) {
        Entry<String, String> entry1=new Entry<>("AA", "aa");
        Entry<String, String> entry2=new Entry<>("BB", "bb");


        Map<String, String> map=new Map<>();
        map.put(entry1);
        map.put(entry2);

        map.geKey();

        System.out.println(map.size());
        System.out.println(map.containsValue("bb"));
        System.out.println(map.isEmpty());

        System.out.println(map.entrySet(new Entry<>("CC", "cc")));
        System.out.println("---------");
        map.getAll();
        System.out.println("-----iterator----");
        map.iterator();

    }
}
