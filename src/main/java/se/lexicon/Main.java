package se.lexicon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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

        HashMap<Integer,Car> cars = new HashMap<>();
        cars.put(1,skyline);
        cars.put(2,altima);

        System.out.println("\n" + "Exercise 12: HashMap of Objects");

        for (Map.Entry<Integer,Car> entry: cars.entrySet()) {
            System.out.println("Make: " + entry.getValue().getBrand());
        }
        //System.out.println(cars.get(1));
        // System.out.println(cars.get(1).getBrand());
    }
}