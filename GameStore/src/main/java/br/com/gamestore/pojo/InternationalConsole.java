package br.com.gamestore.pojo;

import br.com.gamestore.enums.Size;
import br.com.gamestore.interfaces.Favorite;

public class InternationalConsole extends Console implements Favorite {
    private double importTax;

    public InternationalConsole(String initialBrand, Size initialSize, double initialValue, String initialName) {
        super(initialBrand, initialSize, initialValue, initialName);
    }

    public void setValue(double newValue) { // Rewriting the rules of a base class method.
        if (newValue > -100) {
            this.value = newValue;
        } else {
            throw new IllegalArgumentException("Values must be greater than -100.");
        }
    }

    public double getImportTax() {
        return importTax;
    }

    public void setImportTax(double newImportTax) {
        this.importTax = newImportTax;
    }

    public double getFinalValue() {
        if (getValue() < 0) {
            System.out.println("What a great discount!");

            return getImportTax() * getValue() + getValue() * -1;
        } else {
            return getImportTax() * getValue() + getValue();
        }
    }

    public String getFavoriteData() {
        return this.getName() + " of " + this.getBrand() + " in the final value of: " + this.getFinalValue();
    }
}
