package ru.billing.stockList;

import java.util.Date;
import java.util.Objects;

public class FoodItem extends GenericItem {
    private Date dateOfIncome;
    private short expires;

    public FoodItem(String name, float price, GenericItem analog, Category category, Date dateOfIncome, short expires) {
        super(currentID++, name, price, category, analog);
        this.expires = expires;
        this.dateOfIncome = dateOfIncome;
    }

    public FoodItem(String name, float price, FoodItem analog, Date date, short expires) {
        this(name, price, analog, Category.FOOD, date, expires);
    }

    public FoodItem(String name, float price, short expires) {
        this(name, price, null, Category.FOOD, new Date(), expires);
    }

    public FoodItem(String name) {
        this(name, 0.0f, null, Category.FOOD, new Date(), (short)0);
    }

    public Date getDateOfIncome() {
        return dateOfIncome;
    }

    public short getExpires() {
        return expires;
    }


    public void setDateOfIncome(Date dateOfIncome) {
        this.dateOfIncome = dateOfIncome;
    }

    public void setExpires(short expires) {
        this.expires = expires;
    }

    @Override
    public void printAll() {
        System.out.println(this.toString());
    }


    public FoodItem clone() {
        return new FoodItem(getName(), getPrice(), getAnalog(), getCategory(), new Date(getDateOfIncome().getTime()), getExpires());
    }

    @Override
    public String toString() {
        return super.toString() + ", Date: " + this.dateOfIncome + ", Expires: " + this.expires;
    }

    @Override
    public boolean equals(Object o) {
        FoodItem foodItem = (FoodItem)o;
        return super.equals(o) && this.dateOfIncome.compareTo(foodItem.getDateOfIncome())==0 && (this.expires == foodItem.getExpires());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), dateOfIncome, expires);
    }
