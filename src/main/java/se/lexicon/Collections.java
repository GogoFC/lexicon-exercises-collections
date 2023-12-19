package se.lexicon;

import java.util.*;

public class Collections {

    public static void one() {
        ArrayList<String> days = new ArrayList<>();

        days.add("måndag");
        days.add("tisdag");
        days.add("onsdag");
        days.add("torsdag");
        days.add("fredag");
        days.add("lördag");
        days.add("söndag");
        System.out.println("\n" + "Exercise 1: Print Array");
        System.out.println(days);
    }

    public static void two() {
        ArrayList<String> days = new ArrayList<>();
        days.add("måndag");
        days.add("tisdag");
        days.add("onsdag");
        days.add("torsdag");
        days.add("fredag");
        days.add("lördag");
        days.add("söndag");

        Iterator<String> daysIterator = days.iterator();
        System.out.println("\n" + "Exercise 2: Print Array with While Loop");
        while (daysIterator.hasNext()){
            System.out.println(daysIterator.next());
        }
    }

    public static void three() {
        ArrayList<String> days = new ArrayList<>();
        days.add("måndag");
        days.add("tisdag");
        days.add("onsdag");
        days.add("fredag");
        days.add("lördag");
        days.add("söndag");

        days.add(3,"torsdag");
        System.out.println("\n" + "Exercise 3: Add Array element to index");
        System.out.println(days);
    }

    public static void four() {
        ArrayList<String> days = new ArrayList<>();
        days.add("måndag");
        days.add("tisdag");
        days.add("onsdag");
        days.add("fredag");
        days.add("lördag");
        days.add("söndag");

        List<String> workdays = new ArrayList<>();
        workdays = days.subList(0,3);
        System.out.println("\n" + "Exercise 4: subList");
        System.out.println(workdays);
    }

    public static void five() {
        HashSet<String> days = new HashSet<>();
        days.add("måndag");
        days.add("tisdag");
        days.add("onsdag");
        days.add("fredag");
        days.add("lördag");
        days.add("söndag");
        Set<String> arrangedDays = new TreeSet<>(days);
        System.out.println("\n" + "Exercise 5: HashSet and convert to TreeSet");
        System.out.println(days);
        System.out.println(arrangedDays);
    }

    public static void six() {
        HashSet<String> days = new HashSet<>();
        days.add("måndag");
        days.add("tisdag");
        days.add("onsdag");
        days.add("fredag");
        days.add("lördag");
        days.add("söndag");
        //List<String> arrayDays = new ArrayList<>(days); //This worked also
        // https://stackoverflow.com/a/20406398
        ArrayList<String > arrayDays = new ArrayList<>(days);
        System.out.println("\n" + "Exercise 6: HashSet to ArrayList convert");
        System.out.println(arrayDays);
    }

    public static void seven () {
        HashSet<String> names = new HashSet<>();
        names.add("John");
        names.add("James");
        names.add("David");
        names.add("Michael");
        names.add("Joe");
        names.add("Anne");
        names.add("Björn");
        ArrayList<String> namesArray = new ArrayList<>(names);
        System.out.println("\n" + "Exercise 7: HashSet --> ArrayList & Sort");
        java.util.Collections.sort(namesArray);
        System.out.println(namesArray);
    }

    public static void eight () {
        HashSet<String> names = new HashSet<>();
        names.add("John");
        names.add("James");
        names.add("David");
        names.add("Michael");
        names.add("Joe");
        names.add("Anne");
        names.add("Björn");
        ArrayList<String> namesArray = new ArrayList<>(names);
        System.out.println("\n" + "Exercise 8: HashSet Sort using Set");
        Set<String> sortedNames = new TreeSet<>(names);
        System.out.println(sortedNames);
        //Set<String> navigableSet = new SortedSet<>(names);
        // Abstract NavigableSet and SortedSet. Can not instantiate.
        // https://www.javatpoint.com/set-in-java
    }

    public static void nine() {
        HashMap<Integer,String> cars = new HashMap<>();
        cars.put(0,"Volvo");
        cars.put(1,"SAAB");
        cars.put(2,"Nissan");
        cars.put(3,"Volkswagen");
        cars.put(4,"Toyota");
        cars.put(5,"Rimac");
        System.out.println("\n" + "Exercise 9: HashMap");
        System.out.println(cars);
    }

    public static void ten() {
        HashMap<Integer,String> cars = new HashMap<>();
        cars.put(0,"Volvo");
        cars.put(1,"SAAB");
        cars.put(2,"Nissan");
        cars.put(3,"Volkswagen");
        cars.put(4,"Toyota");
        cars.put(5,"Rimac");
        System.out.println("\n" + "Exercise 10: HashMap print Keys");
        for (Map.Entry<Integer, String> entry: cars.entrySet()) {
            System.out.println("Key: " + entry.getKey());
        }
    }

    public static void eleven() {
        HashMap<Integer,String> cars = new HashMap<>();
        cars.put(0,"Volvo");
        cars.put(1,"SAAB");
        cars.put(2,"Nissan");
        cars.put(3,"Volkswagen");
        cars.put(4,"Toyota");
        cars.put(5,"Rimac");
        System.out.println("\n" + "Exercise 11: HashMap print Values");
        for (Map.Entry<Integer, String> entry: cars.entrySet()) {
            System.out.println("Value: " + entry.getValue());
        }
    }









}
