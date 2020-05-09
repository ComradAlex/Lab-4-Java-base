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

    
}
