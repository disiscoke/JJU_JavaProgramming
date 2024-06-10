package exam05;

import java.util.*;

public class app {

    public static void main(String[] args) {

        LinkedList<String> myLinkedList = new LinkedList<>();

        myLinkedList.add("transformer");
        myLinkedList.add("ironman");
        myLinkedList.add("jedai");
        myLinkedList.add("avatar");
        myLinkedList.add("terminator");

        System.out.println(myLinkedList);

        Collections.sort(myLinkedList);

        System.out.println(myLinkedList);

        int index = Collections.binarySearch(myLinkedList, "jedai");

        System.out.println("jedai is at index: " + index + " in the sorted list");
    }
}
