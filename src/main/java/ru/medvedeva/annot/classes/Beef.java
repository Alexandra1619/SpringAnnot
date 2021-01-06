package ru.medvedeva.annot.classes;

import org.springframework.stereotype.Component;
import ru.medvedeva.annot.abstractClasses.MeatProduct;
@Component
public class Beef extends MeatProduct {
    private int priseBeef;

    public int getPriseBeef() {
        return priseBeef;
    }

    public void setPriseBeef(int priseBeef) {
        this.priseBeef = priseBeef;
    }

    @Override
    public void PriceOfGoods() {
        System.out.println("Цена на говядину за "+getWeightKg()+" "+priseBeef);
    }
}
