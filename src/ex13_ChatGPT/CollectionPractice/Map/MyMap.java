package ex13_ChatGPT.CollectionPractice.Map;

import java.util.*;

public class MyMap<K, V> {
    private List<Entry<K, V>> entries;


    public MyMap() {
        entries = new ArrayList<>();

    }

    public Entry<K,V> getEntry(K key, V value){
        for(Entry<K,V> entry : entries){
           if( entry.getKey().equals(key) ){
               return entry;
           }
        }
        return null;
    }

    public List<Entry<K,V>> getAll(){
        return entries;
    }

    public void put(K key, V value){
      Entry<K,V> entry=new Entry<>();
      entry.setKey(key);
      entry.setValue(value);
      entries.add(entry);
    }

    public boolean isContains(K key){
        boolean isContain=false;
        for(Entry<K,V> entry : entries){
            if(entry.getKey().equals(key)){
                isContain=true;
                break;
            }
        }
        return isContain;
    }

    public boolean isContainValue  (V value){
        boolean isContainValue=false;
        for(Entry<K,V> entry : entries){
            if(entry.getValue().equals(value)){
                isContainValue=true;
                break;
            }
        }
        return isContainValue;
    }

    public Set<K> keySet() {
        Set<K> set=new HashSet<>();
        for(Entry<K, V> entry : entries){
            set.add(entry.getKey());
        }
        return set;
    }

    public Set<V> valueSet(){
        Set<V> set=new HashSet<>();
        for(Entry<K, V> entry : entries){
            set.add(entry.getValue());
        }
        return set;
    }

    public boolean isEmpty(){
        boolean isEmpty=false;
        for(Entry<K, V> entry : entries){
            if(entry.getKey() == null){
                isEmpty=true;
            }
        }
        return isEmpty;
    }

    public boolean remove(K key) {
        boolean isRemoved=false;
        for(Entry<K,V> entry:entries){
            if(entry.getKey().equals(key)){
                entries.remove(entry);
                isRemoved=true;
                break;
            }
        }
        return isRemoved;
    }

    public int size(){
        return entries.size();
    }

    public Collection<V> values() {
        Set<V> set=new HashSet<>();
        for(Entry<K,V> entry : entries){
            set.add(entry.getValue());
        }
        return set;
    }

    static class Entry<K, V> {
        private K key;
        private V value;

        public K getKey(){
            return key;
        }

        public void setKey(K key){
            this.key=key;
        }

        public void setValue(V value){
            this.value=value;
        }

        public V getValue(){
            return value;
        }

        @Override
        public String toString() {
            return "Entry{" +
                    "key=" + key +
                    ", value=" + value +
                    '}';
        }
    }

}
