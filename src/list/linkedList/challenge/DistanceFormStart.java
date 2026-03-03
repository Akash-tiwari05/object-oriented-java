package list.linkedList.challenge;

import java.util.LinkedList;
import java.util.Scanner;


record Place(String name, int distance){

    @Override
    public String toString() {
        return String.format("%s (%d)",name,distance);
    }
}


public class DistanceFormStart {

    public static void main(String[] args) {
        LinkedList<Place> town = new LinkedList<>();


        Place sydney = new Place("Sydney",0);
        addPlace(town,sydney);
        Place adelaide = new Place("Adelaide",1374);
        addPlace(town,adelaide);
        Place aliceSprings = new Place("Alice Springs",2771);
        addPlace(town,aliceSprings);
        Place Brisbane = new Place("Brisbane",917);
        addPlace(town,Brisbane);
        Place Darwin = new Place("Darwin",3974);
        addPlace(town,Darwin);
        Place Melbourne = new Place("Melbourne",877);
        addPlace(town,Melbourne);
        Place perth = new Place("Perth",3923);
        addPlace(town,perth);
        System.out.println(town);

        Scanner sc = new Scanner(System.in);
        var iterator = town.listIterator();
        boolean quitLoop = false;
        boolean forward = true;
        printMenu();
        while (!quitLoop){

            if(!iterator.hasPrevious()){
                System.out.println("Originating : "+iterator.next());
                forward = true;
            }

            if(!iterator.hasNext()){
                System.out.println("Final : "+iterator.previous());
                forward = false;
            }

            System.out.println("Enter value: ");
            String menuItem = sc.nextLine().toUpperCase().substring(0,1);
            switch (menuItem){
                case "F":
                    System.out.println("User want to move forward");

                    if(!forward){   //reversing direction
                        forward = true;
                        if(iterator.hasNext()){  //adjust position forward
                            iterator.next();
                        }
                    }

                    if(iterator.hasNext()){
                        System.out.println(iterator.next());
                    }
                    break;

                case "B":
                    System.out.println("User want to move backwards");

                    if(forward){   //reversing direction
                        forward = false;
                        if(iterator.hasPrevious()){  //adjust position backwords
                            iterator.previous();
                        }
                    }

                    if(iterator.hasPrevious()){
                        System.out.println(iterator.previous());
                    }
                    break;

                case "L":
                    System.out.println(town);
                    break;

                case "M":
                    printMenu();
                    break;

                default:
                    quitLoop = true;
                    break;
            }

        }
    }

    public static void addPlace(LinkedList<Place> town,
                                   Place place){

        if(town.contains(place)){
            System.out.println("Found duplicate = "+place.name());
            return;
        }

        for (Place p: town){
            if(p.name().equalsIgnoreCase(place.name())){
                System.out.println("Found duplicates = "+place);
                return;
            }
        }

        int matchedIndex = 0;
        for(var listPlaces:town){
            if(place.distance() < listPlaces.distance()){
                town.add(matchedIndex,place);
                return;
            }
            matchedIndex++;
        }

        town.add(place);
    }

    public static void printMenu(){
        System.out.println("""
                Available actions (select word or Letter):
                (F)orward
                (B)ackwards
                (L)ist Places
                (M)enu
                (Q)uit""");
    }
}
