package ra.dev;

public class GenericDemo<K,V> {
    private K key;
    private V value;

    public GenericDemo() {
    }

    public GenericDemo(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public String toString(){
        return "Key: "+this.key+" - Value: "+this.value;
    }
}
