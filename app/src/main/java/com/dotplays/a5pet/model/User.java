package com.dotplays.a5pet.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by MAC2015 on 3/13/17.
 */

public class User implements Serializable {
    @SerializedName("Email")
    @Expose
    private String email;
    @SerializedName("Avatar")
    @Expose
    private String avatar;
    @SerializedName("Password")
    @Expose
    private String password;
    @SerializedName("AddDate")
    @Expose
    private String addDate;
    @SerializedName("LoginLast")
    @Expose
    private String loginLast;
    @SerializedName("ChangePassLast")
    @Expose
    private String changePassLast;
    @SerializedName("FullName")
    @Expose
    private String fullName;
    @SerializedName("Phone")
    @Expose
    private String phone;
    @SerializedName("Address")
    @Expose
    private String address;
    @SerializedName("BirthDay")
    @Expose
    private String birthDay;
    @SerializedName("Sex")
    @Expose
    private String sex;
    @SerializedName("City")
    @Expose
    private String city;
    @SerializedName("Distric")
    @Expose
    private String distric;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Object getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddDate() {
        return addDate;
    }

    public void setAddDate(String addDate) {
        this.addDate = addDate;
    }

    public String getLoginLast() {
        return loginLast;
    }

    public void setLoginLast(String loginLast) {
        this.loginLast = loginLast;
    }

    public String getChangePassLast() {
        return changePassLast;
    }

    public void setChangePassLast(String changePassLast) {
        this.changePassLast = changePassLast;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistric() {
        return distric;
    }

    public void setDistric(String distric) {
        this.distric = distric;
    }
}
