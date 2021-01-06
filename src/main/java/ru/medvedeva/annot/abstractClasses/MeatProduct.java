package ru.medvedeva.annot.abstractClasses;

import ru.medvedeva.annot.interFaces.Products;

public abstract class MeatProduct implements Products {
   private String weightKg="1 Kg";

   public String getWeightKg() {
      return weightKg;
   }
}
