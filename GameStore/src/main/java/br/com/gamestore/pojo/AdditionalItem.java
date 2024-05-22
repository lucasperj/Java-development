package br.com.gamestore.pojo;

import java.util.List;

public class AdditionalItem {
    private String name;
    private int quantity;
    private List<String> additionalItems;

    public AdditionalItem(String defaultItemName, int defaultQuantity) {
        // Constructor can define commands that will be executed during instantiation
        this.name = defaultItemName;
        this.quantity = defaultQuantity;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setQuantity(int newQuantity){
        this.quantity = newQuantity;
    }

    public void setAdditionalItems(List<String> newAdditionalItem) {
        this.additionalItems = newAdditionalItem;
    }

}
