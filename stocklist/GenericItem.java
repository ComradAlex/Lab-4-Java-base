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

    public void printAll(){
        System.out.println(this.toString());
    }

    public void setAnalog(GenericItem analog) {
        this.analog = analog;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GenericItem genericItem = (GenericItem) o;
        return  (id == genericItem.id && this.name.equals(genericItem.name) && Float.compare(this.price, genericItem.price)==0) && category == genericItem.getCategory();
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price);
    }

    @Override
    public String toString() {
        Integer analogID = null;
        if (analog != null)
            analogID = analog.getId();
        return  this.getClass().getSimpleName()
                + " | "
                + "ID: " + this.id
                + ", Name: " + this.name
                + ", Price: " + this.price
                + ", Category: " + this.category
                + ", AnalogID: " + analogID;
    }

    public GenericItem clone() {
        if (analog == null) {
            return new GenericItem(this.id, this.name, this.price, this.category, null);
        }
        else
            return new GenericItem(this.id, this.name, this.price, this.category, this.analog);
    }

}
