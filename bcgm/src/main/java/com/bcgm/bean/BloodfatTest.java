package com.bcgm.bean;

import java.util.Date;

public class BloodfatTest {
    private Date bfcdate;

    private String userid;

    private String bloodfatResult;

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

    public String getBloodfatResult() {
        return bloodfatResult;
    }

    public void setBloodfatResult(String bloodfatResult) {
        this.bloodfatResult = bloodfatResult == null ? null : bloodfatResult.trim();
    }
}