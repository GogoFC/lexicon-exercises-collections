package se.lexicon;

import java.util.HashMap;
import java.util.Objects;
import java.util.StringJoiner;

public class Car {

    private Integer id;

    private String brand;

    private String model;


    public Car(Integer id, String brand, String model) {
        setId(id);
        setBrand(brand);
        setModel(model);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Car.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("brand='" + brand + "'")
                .add("model='" + model + "'")
                .toString();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(id, car.id) && Objects.equals(brand, car.brand) && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, brand, model);
    }
}
