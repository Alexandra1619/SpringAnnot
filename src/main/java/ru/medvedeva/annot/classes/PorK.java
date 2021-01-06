package ru.medvedeva.annot.classes;


import ru.medvedeva.annot.abstractClasses.MeatProduct;

public class PorK extends MeatProduct {
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
