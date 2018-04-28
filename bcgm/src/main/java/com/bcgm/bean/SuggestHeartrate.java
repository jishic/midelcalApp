package com.bcgm.bean;

public class SuggestHeartrate {
    private String hresult;

    private String method;

    public String getHresult() {
        return hresult;
    }

    public void setHresult(String hresult) {
        this.hresult = hresult == null ? null : hresult.trim();
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method == null ? null : method.trim();
    }
}