package com.myself.mykotlin.db.entity;

import com.myself.mykotlin.base.db.DBEntity;

import org.greenrobot.greendao.annotation.*;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit.

/**
 * Entity mapped to table "putao_wd_city".
 */
@Entity(nameInDb = "putao_wd_city")
public class CityDB extends DBEntity {
    private String province_id;

    @Id
    private String city_id;
    private String name;

    @Generated
    public CityDB() {
    }

    public CityDB(String city_id) {
        this.city_id = city_id;
    }

    @Generated
    public CityDB(String province_id, String city_id, String name) {
        this.province_id = province_id;
        this.city_id = city_id;
        this.name = name;
    }

    public String getProvince_id() {
        return province_id;
    }

    public void setProvince_id(String province_id) {
        this.province_id = province_id;
    }

    public String getCity_id() {
        return city_id;
    }

    public void setCity_id(String city_id) {
        this.city_id = city_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
