package com.bcgm.bean;

public class SuggestBloodsuger {
    private String bsresult;

    private String method;

    public String getBsresult() {
        return bsresult;
    }

    public void setBsresult(String bsresult) {
        this.bsresult = bsresult == null ? null : bsresult.trim();
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method == null ? null : method.trim();
    }
}