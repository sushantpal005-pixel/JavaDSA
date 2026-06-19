package JCF.lec_23;

import java.util.*;

public class Main {
    static void main() {

        //ArrayList -> concrete class
        ArrayList<Integer> list = new ArrayList<>();

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
        List<Integer> list2 = new ArrayList<>();
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

        List<Integer> list3 = new ArrayList<>();
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

        //cloning a list
        ArrayList<Integer> newList = (ArrayList<Integer>)list.clone();
        System.out.println("original list : " + list);
        System.out.println("Clone : " + newList);
        ArrayList<Integer> marks = new ArrayList<>();
        marks.ensureCapacity(100);
        System.out.println(newList.isEmpty());
        System.out.println(marks.isEmpty());
        System.out.println(newList.indexOf(40));
    }
}
