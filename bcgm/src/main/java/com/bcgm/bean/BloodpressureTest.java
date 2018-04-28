package com.bcgm.bean;

import java.util.Date;

public class BloodpressureTest {
    private Date bfcdate;

    private String userid;

    private String bloodpressureResult;

    public Date getBfcdate() {
        return bfcdate;
    }

    public void setBfcdate(Date bfcdate) {
        this.bfcdate = bfcdate;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getBloodpressureResult() {
        return bloodpressureResult;
    }

    public void setBloodpressureResult(String bloodpressureResult) {
        this.bloodpressureResult = bloodpressureResult == null ? null : bloodpressureResult.trim();
    }
}