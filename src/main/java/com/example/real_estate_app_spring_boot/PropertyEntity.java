package com.example.real_estate_app_spring_boot;

import java.math.BigDecimal;

public class PropertyEntity {
    private PropertyEnum properyType;
    private float landSize;
    private BigDecimal cost;
    private int roomNumber;
    private int saloonNumber;

    public PropertyEntity(PropertyEnum properyType, float landSize, BigDecimal cost, int roomNumber, int saloonNumber) {
        this.properyType = properyType;
        this.landSize = landSize;
        this.cost = cost;
        this.roomNumber = roomNumber;
        this.saloonNumber = saloonNumber;
    }

    public float getLandSize() {
        return landSize;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public int getRoomNumber() {
        return roomNumber;
    }


    public int getSaloonNumber() {
        return saloonNumber;
    }


}
