package ru.billing.warehouse;

import ru.billing.stockList.GenericItem;

import java.util.ArrayList;
import java.util.HashMap;

public class ItemCatalog {
    private HashMap<Integer, GenericItem> catalog = new HashMap<>();
    private ArrayList<GenericItem> arrListCatalog = new ArrayList<>();

    public HashMap<Integer, GenericItem> getCatalog() {
        return catalog;
    }

    public void setCatalog(HashMap<Integer, GenericItem> catalog) {
        this.catalog = catalog;
    }

    public ArrayList<GenericItem> getArrListCatalog() {
        return arrListCatalog;
    }

    public void setArrListCatalog(ArrayList<GenericItem> arrListCatalog) {
        this.arrListCatalog = arrListCatalog;
    }

    public void addItem(GenericItem item) {
        catalog.put(item.getId(), item);
        arrListCatalog.add(item);
    }

    public void printItems() {
        for (GenericItem elem: arrListCatalog) {
            System.out.println(elem);
        }
    }

    public GenericItem findItemByID(int id) {
        if (!catalog.containsKey(id)) {
            return null;
        }
        return catalog.get(id);
    }

    public GenericItem findItemByIDInArrayList(int id) {
        for (GenericItem elem : arrListCatalog) {
            if (elem.getId() == id)
                return elem;
        }
        return null;
    }

    
}
