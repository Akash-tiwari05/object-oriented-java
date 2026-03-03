package list.linkedList;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Stack;

public class DemoLinkedList {

    public static void main(String[] args) {

        //LinkedList<String> linkedList = new LinkedList<>();

        var placesToVisit = new LinkedList<String>();
        placesToVisit.add("Sydney");
        placesToVisit.add(0,"Delhi");
        System.out.println(placesToVisit);
        addMoreElement(placesToVisit);
        System.out.println(placesToVisit);

        removeElements(placesToVisit);
        System.out.println(placesToVisit);

        gettingElements(placesToVisit);
        printItinerary(placesToVisit);
        printItinerary2(placesToVisit);
    }

    private static void addMoreElement(LinkedList<String> list){
        list.addFirst("Mumbai");
        list.addLast("Lucknow");
        System.out.println("-".repeat(50));
        //queue methods
        list.offer("Kolkata");
        list.offerFirst("Pune");
        System.out.println("-".repeat(50));
        //Stack methods
        list.push("Shimla");
        list.push("Ujjain");
    }

    private static void removeElements(LinkedList<String> list){
        System.out.println("-".repeat(50));
        list.remove(4);
        list.remove("Delhi");

        System.out.println("-".repeat(50));
        System.out.println(list);
        String s1 = list.remove();//remove first element
        System.out.println(s1 +" was Removed");
    }

    private static void gettingElements(LinkedList<String> list){

        System.out.println("Retrieved Element = "+list.get(4));
        System.out.println("First Element = "+list.getFirst());
        System.out.println("Last Element = "+list.getLast());
        System.out.println("Mumbai is at the position of = "
                +list.indexOf("Mumbai"));

        System.out.println("-".repeat(50));
        //queue methods
        System.out.println("Element from element() = "+list.element());
        System.out.println("Element from peekFirst() = "+list.peekFirst());
        System.out.println("Element from peekLast() = "+list.peekLast());

        System.out.println("-".repeat(50));
    }

    public static void printItinerary(LinkedList<String> list){

        System.out.println("Trip start with = "+list.getFirst());

        for (int i = 1; i < list.size(); i++) {
            System.out.print(" --> "+ list.get(i- 1) +" to "+list.get(i));
        }
        System.out.println();
        System.out.println("Trip ends with = "+list.getLast());

    }

    public static void printItinerary2(LinkedList<String> list){

        System.out.println("Trip start with = "+list.getFirst());
        String previous = list.getFirst();
        ListIterator<String> iterator = list.listIterator(1);
        while (iterator.hasNext()){
            var town = iterator.next();
            System.out.print(" --> "+ previous +" to "+town);
            previous = town;
        }
        System.out.println();
        System.out.println("Trip ends with = "+list.getLast());

    }
}
