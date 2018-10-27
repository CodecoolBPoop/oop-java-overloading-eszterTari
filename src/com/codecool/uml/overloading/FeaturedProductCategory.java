package com.codecool.uml.overloading;

import java.util.Date;

public class FeaturedProductCategory extends ProductCategory {

    private Date startDate;
    private Date endDate;

    public void schedule(Date startDate, Date endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        StringBuilder buildString = new StringBuilder();
        buildString.append("FeaturedProductCategory:");
        buildString.append("id:" + getId()+",");
        buildString.append("name:"+getName()+",");
        buildString.append("department:"+getDepartment()+",");
        buildString.append("description:"+getDescription());

        return buildString.toString();
    }

}
