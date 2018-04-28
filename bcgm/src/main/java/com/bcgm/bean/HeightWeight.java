package com.bcgm.bean;

import java.util.Date;

public class HeightWeight {
    private Date hwcdate;

    private String userid;

    private Short age;

    private String sex;

    private Short height;

    private Short weight;

    private String hwresult;

    public Date getHwcdate() {
        return hwcdate;
    }

    public void setHwcdate(Date hwcdate) {
        this.hwcdate = hwcdate;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public Short getAge() {
        return age;
    }

    public void setAge(Short age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Short getHeight() {
        return height;
    }

    public void setHeight(Short height) {
        this.height = height;
    }

    public Short getWeight() {
        return weight;
    }

    public void setWeight(Short weight) {
        this.weight = weight;
    }

    public String getHwresult() {
        return hwresult;
    }

    public void setHwresult(String hwresult) {
        this.hwresult = hwresult == null ? null : hwresult.trim();
    }
}