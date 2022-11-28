package com.leaning;

import java.util.*;

public class CollectionsExample {

    public static void main(String[] args) {
        //iterable
        //collection
        //list -> ArrayList, LinkedList
        //queue -> LinkedList
        //set -> HashSet, LinekdHashSet
        //  sortedSet -> TreeSet
        //Stack

        //map -> HashMap, LinkedHashMap
        //  sortedMap -> TreeMap

        List<Integer> arrayList = new ArrayList<>(10); //duplicate, order, random access
        arrayList.get(5); //O(1)
        arrayList.add(4, 10); //O(N)

        //LinkedList   root -> (v1, next5) -> (vn, next1) -> (v2, next2) -> ...

        for (int i = 0; i < 10; i++) {
            System.out.println(arrayList.get(i));
        }

        List<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 10; i++) { //O(N^2)
            System.out.println(linkedList.get(i));
        }
        Iterator<Integer> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (Integer value : linkedList) {
            System.out.println(value);
        }

        Map<String, Integer> map = new HashMap<>();
        map.put("abc", 1); //O(1)
        map.put("abc", 2);
        map.get("abc"); //O(1)

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        //load factor = 75%

        //buckets (array)
        //bucket - array (1 element)
        /*
        *    []  []  []  [] [] [] [] []
        *    ()      ()     () () ()
        *    ()
        *
        *
        * */

        Object key = new Object() {
            @Override
            public int hashCode() {
                return new Random().nextInt(10);
            }
        };

    }

}
