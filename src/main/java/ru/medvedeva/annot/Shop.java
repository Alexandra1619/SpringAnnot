package ru.medvedeva.annot;

import org.springframework.stereotype.Component;
import ru.medvedeva.annot.abstractClasses.MeatProduct;
import ru.medvedeva.annot.abstractClasses.MilkProducts;

import java.util.ArrayList;
import java.util.List;
@Component
public class Shop {
    private List<MilkProducts>milkProductsList=new ArrayList<>();
    private List<MeatProduct>meatProductList=new ArrayList<>();

    public void setMeatProductList(List<MeatProduct> meatProductList) {
        this.meatProductList = meatProductList;
    }

    public void setMilkProductsList(List<MilkProducts> milkProductsList) {
        this.milkProductsList = milkProductsList;
    }
    public void ProductFeedA(){
        for (MilkProducts milk:milkProductsList) {
            milk.PriceOfGoods();
        }
    }
    public void ProductFeedB(){
        for (MeatProduct meat:meatProductList) {
            meat.PriceOfGoods();
        }
    }
}
