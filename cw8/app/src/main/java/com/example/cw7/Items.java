package com.example.cw7;

import java.io.Serializable;

public class Items implements Serializable {

    public String itemName;
    public int itemImage;
    public double itemPrice;

    public Items(String iteName, int itemImage, double itemPrice) {
        this.itemName = iteName;
        this.itemImage = itemImage;
        this.itemPrice = itemPrice;
    }


    public String getIteName() {
        return itemName;
    }

    public int getItemImage() {
        return itemImage;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setIteName(String iteName) {
        this.itemName = iteName;
    }

    public void setItemImage(int itemImage) {
        this.itemImage = itemImage;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

}
