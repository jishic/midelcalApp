package com.bcgm.bean;

public class SuggestBloodfat {
    private String bfresult;

    private String method;

    public String getBfresult() {
        return bfresult;
    }

    public void setBfresult(String bfresult) {
        this.bfresult = bfresult == null ? null : bfresult.trim();
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method == null ? null : method.trim();
    }
}