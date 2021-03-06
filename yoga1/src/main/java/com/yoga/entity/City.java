package com.yoga.entity;

import java.util.List;

public class City {
    private List zones;
    private Province province;



    public List getZones() {
        return zones;
    }

    public void setZones(List zones) {
        this.zones = zones;
    }

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column city.cid
     *
     * @mbg.generated Tue Jun 09 20:15:58 GMT+08:00 2020
     */
    private String cid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column city.cname
     *
     * @mbg.generated Tue Jun 09 20:15:58 GMT+08:00 2020
     */
    private String cname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column city.pid
     *
     * @mbg.generated Tue Jun 09 20:15:58 GMT+08:00 2020
     */
    private String pid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column city.cid
     *
     * @return the value of city.cid
     *
     * @mbg.generated Tue Jun 09 20:15:58 GMT+08:00 2020
     */
    public String getCid() {
        return cid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column city.cid
     *
     * @param cid the value for city.cid
     *
     * @mbg.generated Tue Jun 09 20:15:58 GMT+08:00 2020
     */
    public void setCid(String cid) {
        this.cid = cid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column city.cname
     *
     * @return the value of city.cname
     *
     * @mbg.generated Tue Jun 09 20:15:58 GMT+08:00 2020
     */
    public String getCname() {
        return cname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column city.cname
     *
     * @param cname the value for city.cname
     *
     * @mbg.generated Tue Jun 09 20:15:58 GMT+08:00 2020
     */
    public void setCname(String cname) {
        this.cname = cname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column city.pid
     *
     * @return the value of city.pid
     *
     * @mbg.generated Tue Jun 09 20:15:58 GMT+08:00 2020
     */
    public String getPid() {
        return pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column city.pid
     *
     * @param pid the value for city.pid
     *
     * @mbg.generated Tue Jun 09 20:15:58 GMT+08:00 2020
     */
    public void setPid(String pid) {
        this.pid = pid;
    }

}