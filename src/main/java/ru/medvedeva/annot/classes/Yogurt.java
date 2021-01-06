package ru.medvedeva.annot.classes;

import org.springframework.stereotype.Component;
import ru.medvedeva.annot.abstractClasses.MilkProducts;
@Component
public class Yogurt extends MilkProducts {
    private int priseYogurt;

    public int getPriseBeef() {
        return priseYogurt;
    }

    public void setPriseBeef(int priseYogurt) {
        this.priseYogurt = priseYogurt;
    }

    @Override
    public void PriceOfGoods() {
        System.out.println("Цена на кефир за "+getWeightL()+" "+priseYogurt);
    }
}
