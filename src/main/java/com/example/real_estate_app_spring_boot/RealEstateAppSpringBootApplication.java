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

        System.out.println("total cost of cottages = " + propertyService.totCottageCost(cottageList));
        System.out.println("total cost of houses = " + propertyService.totHouseCost(houseList));
        System.out.println("total cost of villas = " + propertyService.totVillaCost(villaList));
        System.out.println("total cost of all properties = " + propertyService.allTypeTotCost(villaList,cottageList,houseList));

        System.out.println("Average land size of cottages = " + propertyService.AvgCottageLandSize(cottageList));
        System.out.println("Average land size of houses = " + propertyService.AvgHouseLandSize(houseList));
        System.out.println("Average land size of villas = " + propertyService.AvgVillaLandSize(villaList));
        System.out.println("Average land size of all properties = " + propertyService.allTypesAvgLandSize(villaList, cottageList, houseList));

    }

}

