package ex13_ChatGPT.CollectionPractice.Map;

import java.util.*;

public class MyMap1<K, V> {
    private List<Entry<K, V>> entries;

    public MyMap1() {
        entries = new ArrayList<>();
    }

    public void put(K key, V value) {
        Entry<K, V> entry = getEntry(key);
        if (entry != null) {
            entry.setValue(value);
        } else {
            entries.add(new Entry<>(key, value));
        }
    }

    public V get(K key) {
        Entry<K, V> entry = getEntry(key);
        if (entry != null) {
            return entry.getValue();
        }
        return null;
    }

    public boolean containsKey(K key) {
        return getEntry(key) != null;
    }

    public boolean containsValue(V value) {
        for (Entry<K, V> entry : entries) {
            if (entry.getValue().equals(value)) {
                return true;
            }
        }
        return false;
    }

    public void remove(K key) {
        Entry<K, V> entry = getEntry(key);
        if (entry != null) {
            entries.remove(entry);
        }
    }

    public int size() {
        return entries.size();
    }

    public boolean isEmpty() {
        return entries.isEmpty();
    }

    public Set<K> keySet() {
        Set<K> keySet = new HashSet<>();
        for (Entry<K, V> entry : entries) {
            keySet.add(entry.getKey());
        }
        return keySet;
    }

    public Collection<V> values() {
        List<V> values = new ArrayList<>();
        for (Entry<K, V> entry : entries) {
            values.add(entry.getValue());
        }
        return values;
    }

    public Set<Entry<K, V>> entrySet() {
        return new HashSet<>(entries);
    }

    public Entry<K, V> getEntry(K key) {
        for (Entry<K, V> entry : entries) {
            if (entry.getKey().equals(key)) {
                return entry;
            }
        }
        return null;
    }

    private static class Entry<K, V> {
        private K key;
        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Entry<?, ?> entry = (Entry<?, ?>) obj;
            return Objects.equals(key, entry.key) && Objects.equals(value, entry.value);
        }

        @Override
        public int hashCode() {
            return Objects.hash(key, value);
        }
    }
}
