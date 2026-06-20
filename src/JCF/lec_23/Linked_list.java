package JCF.lec_23;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;

public class Linked_list {
    public static void main() {
        List<Integer> list = new LinkedList<>();

        //add
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        list.add(40);
        System.out.println(list);

        //remove
        list.remove(0);
        System.out.println(list);

        //addAll
        List<Integer> list2 = new LinkedList<>();
        list2.add(101);
        list2.add(102);
        list2.add(103);

        list.addAll(list2);       //add all elements of list2 in list1
        System.out.println(list);
        list.removeAll(list2);   //remove all elements of list2 from list1
        System.out.println(list);

        System.out.println(list.size());

        //clear
        System.out.println("printing list2: " + list2);
        list2.clear();
        System.out.println(list2.size());

        //traverse list using iterator
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println("Element: " + iterator.next());
        }
//
        List<Integer> list3 = new LinkedList<>();
        list3.add(11);
        list3.add(12);
        list3.add(14);
       System.out.println(list3.get(2));
        System.out.println("before set: " + list3);
        list3.set(0, 100);
       System.out.println("after  set: " + list3);



        // toArray
        Object[] arr = list3.toArray();
        for (Object obj : arr){
            System.out.println(obj);
        }

        //contains
        System.out.println(list3.contains(100));

        list.add(12);
        list.add(6);
        System.out.println("printing Entire list: "+ list);
        Collections.sort(list);
        System.out.println("printing Entire list: "+ list);

        //LinkedList<Integer> newList = (LinkedList<Integer>)list.clone();
        list.add(30);
        list.add(24);
        list.add(30);
        System.out.println("printing original list: " + list);
        //System.out.println(list.indexOf(40));
        System.out.println(list.lastIndexOf(30));

        //addFirst and addLast
        list.remove(3);
        list.remove(3);
        list.remove(3);
        list.remove(3);

        System.out.println("printing original list: " + list);

        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(10);
        System.out.println(ll);
        ll.addFirst(1);
        System.out.println(ll);
        ll.addLast(101);
        System.out.println(ll);

        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        System.out.println(ll.peek());
        System.out.println("before poll "+ ll);
        System.out.println("polling: " + ll.poll());
        System.out.println("after poll "+ ll);
//        ll.removeLast();
//        System.out.println(ll);
//        ll.removeFirst();
//        System.out.println(ll);



    }
}
