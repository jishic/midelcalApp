package com.bcgm.bean;

public class Meditable {
    private String medicine;

    private String category;

    private String function;

    private String adaptation;

    private String ingrement;

    private String dosage;

    private String sideeffect;

    private String taboo;

    private String attention;

    public String getMedicine() {
        return medicine;
    }

    public void setMedicine(String medicine) {
        this.medicine = medicine == null ? null : medicine.trim();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function == null ? null : function.trim();
    }

    public String getAdaptation() {
        return adaptation;
    }

    public void setAdaptation(String adaptation) {
        this.adaptation = adaptation == null ? null : adaptation.trim();
    }

    public String getIngrement() {
        return ingrement;
    }

    public void setIngrement(String ingrement) {
        this.ingrement = ingrement == null ? null : ingrement.trim();
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage == null ? null : dosage.trim();
    }

    public String getSideeffect() {
        return sideeffect;
    }

    public void setSideeffect(String sideeffect) {
        this.sideeffect = sideeffect == null ? null : sideeffect.trim();
    }

    public String getTaboo() {
        return taboo;
    }

    public void setTaboo(String taboo) {
        this.taboo = taboo == null ? null : taboo.trim();
    }

    public String getAttention() {
        return attention;
    }

    public void setAttention(String attention) {
        this.attention = attention == null ? null : attention.trim();
    }
}