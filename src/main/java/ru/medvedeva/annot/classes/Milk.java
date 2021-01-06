package ru.medvedeva.annot.classes;

import org.springframework.stereotype.Component;
import ru.medvedeva.annot.abstractClasses.MilkProducts;
@Component
public class Milk extends MilkProducts {
    private int priseMilk;

    public int getPriseBeef() {
        return priseMilk;
    }

    public void setPriseBeef(int priseMilk) {
        this.priseMilk = priseMilk;
    }

    @Override
    public void PriceOfGoods() {
        System.out.println("Цена на молоко за "+getWeightL()+" "+priseMilk);
    }
}
