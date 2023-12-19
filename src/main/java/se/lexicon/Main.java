package se.lexicon;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Collections.one();
        Collections.two();
        Collections.three();
        Collections.four();
        Collections.five();
        Collections.six();
        Collections.seven();
        Collections.eight();
        Collections.nine();
        Collections.ten();
        Collections.eleven();

        Car skyline = new Car(1,"Nissan","Skyline");
        Car altima = new Car(2,"Nissan", "Altima");
        Car nissan = new Car(2,"Nissan","Altima");

        HashMap<Integer,Car> cars = new HashMap<>();
        cars.put(1,skyline);
        cars.put(2,altima);
        cars.put(3,altima);

        System.out.println("\n" + "Exercise 12: HashMap of Objects");

        for (Map.Entry<Integer,Car> entry: cars.entrySet()) {
            System.out.println("Make: " + entry.getValue().getBrand());
        }
        System.out.println("\n" + "\"cars.get(1)\" = " + cars.get(1));
        // System.out.println(cars.get(1).getBrand());
        //System.out.println(altima.getId());

        System.out.println("\n" + "Testing HashSet");
        HashSet<Car> carsHashSet = new HashSet<>();
        carsHashSet.add(altima);
        carsHashSet.add(altima);
        carsHashSet.add(nissan);
        carsHashSet.add(skyline);

        System.out.println("carsHashSet = " + carsHashSet);
        Iterator<Car> carsIterator = carsHashSet.iterator();
        while (carsIterator.hasNext()) {
            System.out.println(carsIterator.next().toString());
        }
        System.out.println("Size of carsHashSet = " + carsHashSet.size());
        System.out.println("Altima hash " + altima.hashCode());
        System.out.println("Skyline hash " + skyline.hashCode());
        System.out.println("Nissan hash " + nissan.hashCode());
    }
}