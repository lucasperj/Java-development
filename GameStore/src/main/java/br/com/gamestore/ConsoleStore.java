package br.com.gamestore;
import br.com.gamestore.enums.Size;
import br.com.gamestore.pojo.*;
import br.com.gamestore.pojo.Console;
import br.com.gamestore.pojo.InternationalConsole;

import java.util.ArrayList;
import java.util.List;

public class ConsoleStore {

    public static void main(String[] args) {
        Console myConsole = new Console("Microsoft", Size.SLIM, 4779.99, "Xbox Series S");

        List<AdditionalItem> additionalItems = new ArrayList<>();

        AdditionalItem additionalItem = new AdditionalItem("Controle", 2);
        additionalItems.add(additionalItem);

        AdditionalItem additionalItem2 = new AdditionalItem("Manual", 1);
        additionalItems.add(additionalItem2);

        myConsole.setAdditionalItems(additionalItems);

        System.out.println("The console has been successfully added to inventory! \n  " + "Brand: " + myConsole.getBrand() + "\n  Model: " + myConsole.getName() + "\n  Model size: " + myConsole.getSize() + "\nComes with the additional items below:");

        for (AdditionalItem actualItem : myConsole.getAdditionalItems()) {
            System.out.println( actualItem.getName() + " X " +  actualItem.getQuantity());
        }

        System.out.println("\n==========\n");

        NationalConsole myNationalProduct = new NationalConsole("Nintendo", Size.HATCH, 900, "Wii U");
        myNationalProduct.setNationalTax(0.55789);
        System.out.println(myNationalProduct.getFavoriteData()); // Use of interfaces

        System.out.println("\n==========\n");

        InternationalConsole myInternationalProduct = new InternationalConsole("Sony", Size.FAT, -10000, "Playstation 5"); // Allowed negative values due to rule change in InternationalConsole class
        myInternationalProduct.setImportTax(0.84);
        System.out.println(myInternationalProduct.getFavoriteData());
    }

}