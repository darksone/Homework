package com.company.shoptry2;

import java.time.LocalDate;

public class Basket {
    private Product product;
    private LocalDate localDate;

    public Basket(Product product, LocalDate localDate) {
        this.localDate = localDate;
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    public void setProducts(Product[] products) {
        this.product = product;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }


}


