package com.bcgm.bean;

import java.util.Date;

public class HeartrateTest {
    private Date hcdate;

    private String userid;

    private String heartResult;

    public Date getHcdate() {
        return hcdate;
    }

    public void setHcdate(Date hcdate) {
        this.hcdate = hcdate;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getHeartResult() {
        return heartResult;
    }

    public void setHeartResult(String heartResult) {
        this.heartResult = heartResult == null ? null : heartResult.trim();
    }
}