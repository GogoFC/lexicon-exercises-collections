package se.lexicon;

import java.util.HashMap;

public class Car {

    private Integer id;

    private String brand;

    private String model;


    public Car(Integer id, String brand, String model) {
        setId(id);
        setBrand(brand);
        setModel(model);
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
}
