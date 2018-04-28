package com.bcgm.bean;

import java.util.Date;

public class StepCount {
    private Date stepdate;

    private String userid;

    private String distance;

    private String steps;

    private String calorie;

    public Date getStepdate() {
        return stepdate;
    }

    public void setStepdate(Date stepdate) {
        this.stepdate = stepdate;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance == null ? null : distance.trim();
    }

    public String getSteps() {
        return steps;
    }

    public void setSteps(String steps) {
        this.steps = steps == null ? null : steps.trim();
    }

    public String getCalorie() {
        return calorie;
    }

    public void setCalorie(String calorie) {
        this.calorie = calorie == null ? null : calorie.trim();
    }
}