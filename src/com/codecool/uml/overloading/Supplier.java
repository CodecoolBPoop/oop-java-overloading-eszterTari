package com.codecool.uml.overloading;

import java.util.List;

public class Supplier {

    private int id = 0;
    private String name;
    private String description;

    Supplier() {
        id++;
    }

    Supplier(String name, String description) {
        id++;
        this.name = name;
        this.description = description;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Product> getProducts() {
        return Product.getAllProductsBy(this);
    }

    public String toString() {
        StringBuilder buildString = new StringBuilder();
        buildString.append("id:" + getId() + ",");
        buildString.append("name:" + getName() + ",");
        buildString.append("description:" + getDescription());

        return buildString.toString();
    }
}
