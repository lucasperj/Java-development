package br.com.gamestore.pojo;

import br.com.gamestore.enums.Size;
import br.com.gamestore.interfaces.Favorite;

public class NationalConsole extends Console implements Favorite {
    private double nationalTax;

    public NationalConsole(String initialBrand, Size initialSize, double initialValue, String initialName) {
        super(initialBrand, initialSize, initialValue, initialName);
    }

    public double getNationalTax() {
        return nationalTax;
    }

    public void setNationalTax(double newNationalTax) {
        this.nationalTax = newNationalTax;
    }

    public double getFinalValue() {
        return getNationalTax() * getValue() + getValue();
    }

    public String getFavoriteData() {
        return this.getName() + " of " + this.getBrand() + " in the final value of: " + this.getFinalValue();
    }
}
