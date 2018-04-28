package com.bcgm.bean;

import java.util.Date;

public class BloodsugerTest {
    private Date bscdate;

    private String userid;

    private String bloodsugerResult;

    public Date getBscdate() {
        return bscdate;
    }

    public void setBscdate(Date bscdate) {
        this.bscdate = bscdate;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getBloodsugerResult() {
        return bloodsugerResult;
    }

    public void setBloodsugerResult(String bloodsugerResult) {
        this.bloodsugerResult = bloodsugerResult == null ? null : bloodsugerResult.trim();
    }
}