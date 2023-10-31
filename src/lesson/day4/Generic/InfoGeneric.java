package lesson.day4.Generic;


interface MTP<K,V> {
    public K getKey();
    public V getValue();
}
class OrderedMTP<K,V> implements MTP<K,V> {
    private K key;
    private V value;
    public OrderedMTP(K key,V value) {
        this.key = key;
        this.value = value;
    }
    public K getKey() { return key; }
    public V getValue() { return value; }
}
public class InfoGeneric
{
    public static void main(String[] args){
        MTP<String, Integer> m1 = new OrderedMTP<String, Integer> ("홍길동",1000);
        System.out.println("이름 : " + m1.getKey() + " " + "값 : " + m1.getValue());
        MTP<String, Integer> m2 = new OrderedMTP<String, Integer> ("김길동",2000);
        System.out.println("이름 : " + m2.getKey() + " " + "값 : " + m2.getValue());
    }
}

