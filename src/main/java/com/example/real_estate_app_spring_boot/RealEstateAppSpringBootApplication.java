package com.example.real_estate_app_spring_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.util.List;


@SpringBootApplication
public class RealEstateAppSpringBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(RealEstateAppSpringBootApplication.class, args);
        PropertyLists propertyLists = new PropertyLists();
        PropertyService propertyService = new PropertyService();
        List<PropertyEntity> cottageList = propertyLists.initCottageLists();
        List<PropertyEntity> houseList = propertyLists.initHouseList();
        List<PropertyEntity> villaList = propertyLists.initVillaLists();

        System.out.println(propertyService.totCottageCost(cottageList));
        System.out.println(propertyService.totHouseCost(houseList));
        System.out.println(propertyService.totVillaCost(villaList));
        System.out.println(propertyService.allTypeTotCost(villaList,cottageList,houseList));

        System.out.println(propertyService.AvgCottageLandSize(cottageList));
        System.out.println(propertyService.AvgHouseLandSize(houseList));
        System.out.println(propertyService.AvgVillaLandSize(villaList));
        System.out.println(propertyService.allTypesAvgLandSize(villaList, cottageList, houseList));

    }

}

