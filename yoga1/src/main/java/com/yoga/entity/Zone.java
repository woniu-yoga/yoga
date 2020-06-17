package com.yoga.entity;

public class Zone {
    private City city;




    private String zid;


    private String zname;

    private String cid;


    public String getZid() {
        return zid;
    }


    public void setZid(String zid) {
        this.zid = zid;
    }


    public String getZname() {
        return zname;
    }


    public void setZname(String zname) {
        this.zname = zname;
    }


    public String getCid() {
        return cid;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
    public void setCid(String cid) {
        this.cid = cid;
    }
    @Override
    public String toString() {
        return "Zone{" +
                "city=" + city +
                ", zid='" + zid + '\'' +
                ", zname='" + zname + '\'' +
                ", cid='" + cid + '\'' +
                '}';
    }


}