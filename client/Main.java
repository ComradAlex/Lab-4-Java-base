package ru.billing.client;

import ru.billing.stockList.Category;
import ru.billing.stockList.FoodItem;
import ru.billing.stockList.GenericItem;
import ru.billing.stockList.TechnicalItem;
import ru.billing.warehouse.ItemCatalog;

import java.util.Date;
public class Main {

    public static void main(String[] args) {

        ItemCatalog itemCatalog = new ItemCatalog();
        CatalogLoader loader = new CatalogStubLoader();
        loader.load(itemCatalog);
        itemCatalog.printItems();
        GenericItem genericItem1 = new GenericItem("Smart TV", 5067.0f, Category.GENERAL);
        GenericItem genericItem2 = new GenericItem("Vertu", 10056000.00f, Category.GENERAL);
        GenericItem genericItem3 = new GenericItem("CD", 56.0f, Category.GENERAL);

        Date date = new Date();
        short expires = 10;
        short warrantyTime = 25;

        FoodItem foodItem1 = new FoodItem("bread", 145.0f, null, Category.FOOD, date, expires);
        FoodItem foodItem2 = new FoodItem("cheese", 845.0f, foodItem1, Category.FOOD, date, expires);
        TechnicalItem technicalItem1 = new TechnicalItem(11, "technic", 10500.0f, null, Category.GENERAL, warrantyTime);
        FoodItem foodItem3 = new FoodItem("pineapple", 54.0f, expires);
        FoodItem foodItem4 = new FoodItem("cherry", 53.0f, expires);
        FoodItem foodItem5 = new FoodItem("apple", 52.0f, expires);
        GenericItem genericItem = new GenericItem("Eggs", 5055.0f, Category.GENERAL);
        itemCatalog.addItem(genericItem1);
        itemCatalog.addItem(genericItem2);
        itemCatalog.addItem(genericItem3);
        itemCatalog.addItem(foodItem1);
        itemCatalog.addItem(foodItem2);
        itemCatalog.addItem(technicalItem1);
        itemCatalog.addItem(foodItem3);
        itemCatalog.addItem(foodItem4);
        itemCatalog.addItem(foodItem5);
        itemCatalog.addItem(genericItem);

        long begin = new Date().getTime();

        for(int i=0; i<100000;i++)
            itemCatalog.findItemByID(10);
        long end = new Date().getTime();
        System.out.println("In HashMap: "+(end - begin));
        begin = new Date().getTime();
        for(int i=0; i<100000;i++)
            itemCatalog.findItemByIDInArrayList(10);
        end = new Date().getTime();
        System.out.println("In ArrayList: "+(end - begin));

    }
}
