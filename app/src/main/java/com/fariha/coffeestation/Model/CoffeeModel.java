package com.fariha.coffeestation.Model;

public class CoffeeModel {

    String coffeeID;
    String coffeeName;
    int quantity, price;

    public CoffeeModel(){
    }

    public CoffeeModel(String CoffeeID, String CoffeeName, int Quantity, int Price){
        this.coffeeID = CoffeeID;
        this.coffeeName = CoffeeName;
        this.quantity = Quantity;
        this.price = Price;
    }

    public String getCoffeeID(){
        return coffeeID;
    }

    public void setCoffeeID(String coffeeID) {
        this.coffeeID = coffeeID;
    }

    public String getCoffeeName() {
        return coffeeName;
    }

    public void setCoffeeName(String coffeeName) {
        this.coffeeName = coffeeName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
