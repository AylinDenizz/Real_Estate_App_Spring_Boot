package com.example.real_estate_app_spring_boot;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PropertyService {

    public BigDecimal totHouseCost(List<PropertyEntity> houselist ) {
        BigDecimal totalCost = BigDecimal.ZERO;
        for (PropertyEntity property: houselist){
            totalCost= totalCost.add(property.getCost());
        }
        return totalCost;

    }

    public BigDecimal totVillaCost(List<PropertyEntity> villalist) {
        BigDecimal totalCost = BigDecimal.ZERO;
        for (PropertyEntity property: villalist){
            totalCost =totalCost.add(property.getCost());
        }
        return totalCost;
    }
    public BigDecimal totCottageCost(List<PropertyEntity> cottageList) {
        BigDecimal totalCost = BigDecimal.ZERO;
        for (PropertyEntity property: cottageList){
            totalCost= totalCost.add(property.getCost());
        }
        return totalCost;
    }

    public BigDecimal allTypeTotCost(List<PropertyEntity> villalist, List<PropertyEntity> cottageList,
                                     List<PropertyEntity> houseList) {
        BigDecimal totalCost = BigDecimal.ZERO;
        for (PropertyEntity property: villalist){
            totalCost= totalCost.add(property.getCost());
        }
        for (PropertyEntity property: cottageList){
            totalCost= totalCost.add(property.getCost());
        }
        for (PropertyEntity property: houseList){
            totalCost= totalCost.add(property.getCost());
        }
        return totalCost;
    }

    public float AvgVillaLandSize(List<PropertyEntity> villaList) {
        float TotalLandSize = 0;
        float AvgLandSize;
        for (PropertyEntity property: villaList){
            TotalLandSize += property.getLandSize();
        }
        AvgLandSize = TotalLandSize / villaList.size();
        return AvgLandSize;

    }
    public float AvgCottageLandSize(List<PropertyEntity> cottageList) {
        float TotalLandSize = 0;
        float AvgLandSize;
        for (PropertyEntity property: cottageList){
            TotalLandSize += property.getLandSize();
        }
        AvgLandSize = TotalLandSize / cottageList.size();

        return AvgLandSize;

    }

    public float allTypesAvgLandSize(List<PropertyEntity> villaList, List<PropertyEntity> cottageList,
                                     List<PropertyEntity> houseList) {
        float TotalLandSize = 0;
        float AvgLandSize = 0;
        for (PropertyEntity property: villaList){
            TotalLandSize += property.getLandSize();
        }
        for (PropertyEntity property: cottageList){
            TotalLandSize += property.getLandSize();
        }
        for (PropertyEntity property: houseList){
            TotalLandSize += property.getLandSize();
        }
        float Listsize = villaList.size()+ houseList.size() + cottageList.size();
        AvgLandSize = TotalLandSize / Listsize;

        return AvgLandSize;

    }

    public float AvgHouseLandSize(List<PropertyEntity> houseList) {
        float TotalLandSize = 0;
        float AvgLandSize;
        for (PropertyEntity property: houseList){
            TotalLandSize += property.getLandSize();
        }
        AvgLandSize = TotalLandSize / houseList.size();
        return AvgLandSize;
    }

}
