package com.company;


import org.jetbrains.annotations.NotNull;

public class Product {
    private String name;
    private int numb;
    private double cost;
    private String madeBy;
    private String date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.substring(0,1).toUpperCase()+name.substring(1).toLowerCase();
    }

    public int getNumb() {
        return numb;
    }

    public void setNumb(int numb) {
        this.numb = Math.abs(numb);
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = Math.abs(cost);
    }

    public String getMadeBy() {
        return madeBy;
    }

    public void setMadeBy(String madeBy) {
        this.madeBy = madeBy;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
}
    public Product(String name, int numb, double cost, String madeBy, String date) {
        setName(name);
        setNumb(numb);
        setCost(cost);
        setMadeBy(madeBy);
        setDate(date);
    }



    @Override
    public String toString() {
        return "Product{" +
                "name = '" + name + '\'' +
                ", numb = " + numb +
                ", cost = " + cost +
                ", madeBy = '" + madeBy + '\'' +
                ", date = " + date +
                '}';
    }
}
