package com.company;

import java.util.Arrays;

public class Products {
    private Product [] products;
    private int currentProductNumber;

    public Products(final int productsNumber){
        this.products = new Product[productsNumber];
        currentProductNumber = -1;
    }
    public Products findOverAvgCost(){
        Products products1 = new Products(products.length-1);
        float sum =0, avg;
        int i = 0;
        for (Product product: products) {
            i++;
            sum+=product.getCost();
        }
        avg=sum/i;
        for (Product product: products) {
            if (product.getCost()>avg){
                products1.addProduct(product);
            }
        }

        return products1;
    }

    @Override
    public String toString() {
        String result="";
        for (Product product: products) {
            if (product != null){
            result+= product + System.lineSeparator();
        }
        }
        return result;
    }

    public void addProduct(Product product)
    {
        if (++currentProductNumber<products.length){
            products[currentProductNumber]= product;
        }
    }
}

