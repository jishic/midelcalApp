package com.bcgm.bean;

public class SuggestBloodpressure {
    private String bpresult;

    private String method;

    public String getBpresult() {
        return bpresult;
    }

    public void setBpresult(String bpresult) {
        this.bpresult = bpresult == null ? null : bpresult.trim();
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method == null ? null : method.trim();
    }
}