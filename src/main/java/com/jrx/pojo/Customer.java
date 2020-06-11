package com.jrx.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.sql.Date;

@ApiModel("客户实体类")
public class Customer {
    @ApiModelProperty("客户号")
    private int cust_id;

    @ApiModelProperty("客户姓名")
    private String surname;

    @ApiModelProperty("性别")
    private String gender;//性别

    @ApiModelProperty("教育状况")
    private String educa_des;

    @ApiModelProperty("婚姻状况")
    private String mar_des;

    @ApiModelProperty("生日")
    private Date birthday;

    @ApiModelProperty("地址")
    private String address;

    public Customer() {
    }

    public Customer(int cust_id, String surname, String gender, String educa_des, String mar_des, Date birthday, String address) {
        this.cust_id = cust_id;
        this.surname = surname;
        this.gender = gender;
        this.educa_des = educa_des;
        this.mar_des = mar_des;
        this.birthday = birthday;
        this.address = address;
    }

    public int getCust_id() {
        return cust_id;
    }

    public void setCust_id(int cust_id) {
        this.cust_id = cust_id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEduca_des() {
        return educa_des;
    }

    public void setEduca_des(String educa_des) {
        this.educa_des = educa_des;
    }

    public String getMar_des() {
        return mar_des;
    }

    public void setMar_des(String mar_des) {
        this.mar_des = mar_des;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cust_id=" + cust_id +
                ", surname='" + surname + '\'' +
                ", gender='" + gender + '\'' +
                ", educa_des='" + educa_des + '\'' +
                ", mar_des='" + mar_des + '\'' +
                ", birthday=" + birthday +
                ", address='" + address + '\'' +
                '}';
    }



}
