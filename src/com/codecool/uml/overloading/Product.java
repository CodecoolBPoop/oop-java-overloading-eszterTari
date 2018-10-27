package com.codecool.uml.overloading;

import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

public class Product {

    private int id = 1;
    private String name;
    private float defaultPrice;
    private Currency defaultCurreny;
    private ProductCategory productCategory;
    private Supplier supplier;
    private static List<Product> productList = new ArrayList<>();

    public Product() {
        id++;
    }

    public Product(String name, float defaultPrice, Currency defaultCurreny) {
        id++;
        this.name = name;
        this.defaultPrice = defaultPrice;
        this.defaultCurreny = defaultCurreny;
        productList.add(this);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getDefaultPrice() {
        return defaultPrice;
    }

    public void setDefaultPrice(float defaultPrice) {
        this.defaultPrice = defaultPrice;
    }

    public Currency getDefaultCurreny() {
        return defaultCurreny;
    }

    public void setDefaultCurreny(Currency defaultCurreny) {
        this.defaultCurreny = defaultCurreny;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public List<Product> getAllProductsBy(ProductCategory productCategory) {
        List<Product> getAllProductsByCategory = new ArrayList<>();
        for (Product product : productList) {
            if (product.getProductCategory().equals(productCategory)) {
                getAllProductsByCategory.add(product);
            }
        }
        return getAllProductsByCategory;
    }

    public List<Product> getAllProductsBy(Supplier supplier) {
        List<Product> productsBySupplier = new ArrayList<>();
        for (Product product: productList) {
            if (product.getSupplier().equals(supplier)) {
                productsBySupplier.add(product);
            }
        }
        return productsBySupplier;
    }

    public String toString() {
        StringBuilder buildString = new StringBuilder();
        buildString.append("id:" + getId() + ",");
        buildString.append("name:" + getName() + ",");
        buildString.append("defaultPrice:" + getDefaultPrice() + ",");
        buildString.append("defaultCurrency:" + getDefaultCurreny() + ",");
        buildString.append("productCategory:" + getProductCategory() + ",");
        buildString.append("supplier:" + getSupplier());

        return buildString.toString();
    }
}
