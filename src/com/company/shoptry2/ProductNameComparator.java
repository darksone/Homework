package com.company.shoptry2;

import java.util.Comparator;

public class ProductNameComparator implements Comparator<Product> {
    @Override
    public int compare(Product a, Product b) {
        return CharSequence.compare(a.getName(),b.getName());
    }
}
