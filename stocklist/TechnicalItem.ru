package ru.billing.stockList;

import java.util.Objects;

public class TechnicalItem extends GenericItem {
    private short warrantyTime;

    public TechnicalItem(int id, String name, float price, GenericItem genericItem, Category category, short warrantyTime) {
        super(id, name, price, category, genericItem);
        this.warrantyTime = warrantyTime;
    }

    public short getWarrantyTime() {
        return warrantyTime;
    }

    public void setWarrantyTime(short warrantyTime) {
        this.warrantyTime = warrantyTime;
    }

    @Override
    public void printAll() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return super.toString() + ", Warranty Time: " + warrantyTime;
    }

    public TechnicalItem clone() {
        return new TechnicalItem(getId(), getName(), getPrice(), getAnalog(), getCategory(), getWarrantyTime());
    }

    @Override
    public boolean equals(Object o) {
        TechnicalItem technicalItem = (TechnicalItem)o;
        return super.equals(o) && this.warrantyTime == technicalItem.getWarrantyTime();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), warrantyTime);
    }
}
