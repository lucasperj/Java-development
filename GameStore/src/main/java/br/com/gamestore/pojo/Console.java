package br.com.gamestore.pojo;

import br.com.gamestore.enums.Size;

import java.util.List;

public class Console {
    private String name; // Encapsulation
    private String brand;
    protected double value; // Polymorphism - The attribute can be changed in all classes that extend the base class.
    private Size size;
    private List<AdditionalItem> additionalItems;

    public Console(String initialBrand, Size initialSize, double initialValue, String initialName) {
        // Constructor can define commands that will be executed during instantiation
        this.brand = initialBrand;
        this.size = initialSize;
        this.value = initialValue;
        this.name = initialName;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getBrand(){
        return this.brand;
    }

    public void setBrand(String newBrand) {
        this.brand = newBrand;
    }

    public double getValue() {
        return this.value;
    }

    public void setValue(double newValue) {
        if (newValue > 0) {
            this.value = newValue;
        } else {
            throw new IllegalArgumentException("Values must be greater than 0.");
        }
    }

    public Size getSize(){
        return this.size;
    }

    public void setSize(Size newSize) {
        this.size = newSize;
    }

    public List<AdditionalItem> getAdditionalItems(){
        return this.additionalItems;
    }

    public void setAdditionalItems(List<AdditionalItem> newAdditionalItem) {
        this.additionalItems = newAdditionalItem;
    }
}
