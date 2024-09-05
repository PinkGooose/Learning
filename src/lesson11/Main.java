package lesson11;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        CollectionUtils collectionUtilsImpl = new CollectionUtilsImpl();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Set<Integer> set = new HashSet<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(collectionUtilsImpl.union(list, set));

//        Set<Integer> hashSet = new LinkedHashSet<>();
//
//        hashSet.add(1);
//        hashSet.add(4);
//        hashSet.add(2);
//        hashSet.add(7);
//        hashSet.add(4);
//
//        System.out.println(hashSet);




//        ArrayList<String> arrayList = new ArrayList<>();
//        List<String> linkedList = new LinkedList<>();
//
//        arrayList.add("djfhgjk");
//        arrayList.add("djfhgjk");
//        arrayList.add("djfhgjk");
//        arrayList.add("djfhgjk");
//        arrayList.add("djfhgjk");
//        arrayList.add("djfhgjk");
//
//        Iterator<String> iterator = arrayList.iterator();
//
//        while(iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//
//        long time1 = System.currentTimeMillis();
//        for(int i = 0; i < 100_000; i++) {
//            arrayList.add("very very long word" + i);
//        }
//
//        long time2 = System.currentTimeMillis();
//        for(int i = 0; i < 100000; i++) {
//            linkedList.add("very very long word" + i);
//        }
//
//        long time3 = System.currentTimeMillis();
//        for(int i = 0; i < 100000; i++) {
//            arrayList.get(i);
//        }
//
//        long time4 = System.currentTimeMillis();
//        for(int i = 0; i < 100000; i++) {
//            linkedList.get(i);
//        }
//
//        long time5 = System.currentTimeMillis();
//
//        System.out.println("ArrayList add --- " + (time2 - time1) + " ms");
//        System.out.println("LinkedList add --- " + (time3 - time2) + " ms");
//        System.out.println("ArrayList get --- " + (time4 - time3) + " ms");
//        System.out.println("LinkedList get --- " + (time5 - time4) + " ms");

    }
}
