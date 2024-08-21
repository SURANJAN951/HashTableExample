import java.util.Hashtable;
import java.util.TreeMap;

public class HashTableExample {

    public static void main(String[] args) {
        //HashTable
        Hashtable ht = new Hashtable();
        ht.put(1,"rohit");
        ht.put(3,"Ramesh");
        ht.putIfAbsent(2,"Rohan");
        System.out.println(ht);

        //TreeMap
        TreeMap tm = new TreeMap();
        tm.put(2,"rohit");
        tm.put(1,"ramesh");
        tm.put(4,"rahul");
        tm.put(3,"roshan");
        System.out.println(tm);
    }
}
