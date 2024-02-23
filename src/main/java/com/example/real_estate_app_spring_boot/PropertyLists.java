package com.example.real_estate_app_spring_boot;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PropertyLists {
    private List<PropertyEntity> houseList;
    private List<PropertyEntity> cottageList;
    private List<PropertyEntity> villaList;

    public List<PropertyEntity> getHouseList() {
        return houseList;
    }

    public void setHouseList(List<PropertyEntity> houseList) {
        this.houseList = houseList;
    }

    public List<PropertyEntity> getCottageList() {
        return cottageList;
    }

    public void setCottageList(List<PropertyEntity> cottageList) {
        this.cottageList = cottageList;
    }

    public List<PropertyEntity> getVillaList() {
        return villaList;
    }

    public void setVillaList(List<PropertyEntity> villaList) {
        this.villaList = villaList;
    }

    public List<PropertyEntity> initHouseList() {
        List<PropertyEntity> houseList = new ArrayList<>();
        PropertyEntity villageHouse = new PropertyEntity(PropertyEnum.HOUSE, 150, new BigDecimal(140000), 3, 1);
        PropertyEntity hillHouse = new PropertyEntity(PropertyEnum.HOUSE, 65, new BigDecimal(48000), 1, 1);
        PropertyEntity cityHouse = new PropertyEntity(PropertyEnum.HOUSE, 85, new BigDecimal(189000), 2, 1);
        houseList.add(villageHouse);
        houseList.add(hillHouse);
        houseList.add(cityHouse);
        this.setHouseList(houseList);

        return this.getHouseList();


    }


    public List<PropertyEntity> initVillaLists() {
        List<PropertyEntity> villaList = new ArrayList<>();
        PropertyEntity oceanSideVilla = new PropertyEntity(PropertyEnum.VILLA, 150, new BigDecimal(598000), 6, 3);
        PropertyEntity courtyardVilla = new PropertyEntity(PropertyEnum.VILLA, 65, new BigDecimal(568000), 5, 2);
        PropertyEntity townVilla = new PropertyEntity(PropertyEnum.VILLA, 85, new BigDecimal(7520000), 9, 4);
        villaList.add(oceanSideVilla);
        villaList.add(courtyardVilla);
        villaList.add(townVilla);
        this.setVillaList(villaList);
        return this.getVillaList();
    }

    public List<PropertyEntity> initCottageLists() {

        List<PropertyEntity> cottageList = new ArrayList<>();
        PropertyEntity seaSideCottage = new PropertyEntity(PropertyEnum.COTTAGE, 75, new BigDecimal(140000), 5, 2);
        PropertyEntity forestCottage = new PropertyEntity(PropertyEnum.COTTAGE, 185, new BigDecimal(125000), 3, 1);
        PropertyEntity riverCottage = new PropertyEntity(PropertyEnum.COTTAGE, 120, new BigDecimal(196000), 4, 2);
        cottageList.add(seaSideCottage);
        cottageList.add(forestCottage);
        cottageList.add(riverCottage);
        this.setCottageList(cottageList);

        return this.getCottageList();
    }

}
