package ru.medvedeva.annot.classes;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import ru.medvedeva.annot.abstractClasses.MeatProduct;
@Component
public class PorK extends MeatProduct {
@Value("${pork.pricePork}")
    private int prisePork;

    public int getPriseBeef() {
        return prisePork;
    }

    public void setPriseBeef(int prisePork) {
        this.prisePork = prisePork;
    }

    @Override
    public void PriceOfGoods() {
        System.out.println("Цена на свинину за "+getWeightKg()+" "+prisePork);
    }
}
