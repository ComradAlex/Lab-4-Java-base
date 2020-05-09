package ru.billing.stockList;

import java.util.Objects;

public class GenericItem {
    static int currentID = 0;

    private int id;
    private String name;
    private float price;
    private Category category;
    private GenericItem analog;

    public GenericItem(int id, String name, float price, Category category, GenericItem analog) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
        this.analog = analog;
    }

    public GenericItem(String name, float price, Category category) {
        this(currentID++, name, price, category, null);
    }

    public GenericItem(String name, float price, GenericItem analog) {
        this(currentID++, name, price, Category.GENERAL, analog);
    }

    public GenericItem() {
        this(currentID++, null, 0.0f, Category.GENERAL, null);
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public Category getCategory() {
        return category;
    }

    public GenericItem getAnalog() {
        return analog;
    }


}
