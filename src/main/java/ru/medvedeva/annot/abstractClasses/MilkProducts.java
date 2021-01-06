package ru.medvedeva.annot.abstractClasses;

import ru.medvedeva.annot.interFaces.Products;

public abstract class MilkProducts implements Products {
    private String weightL="1L";

    public String getWeightL() {
        return weightL;
    }
}
