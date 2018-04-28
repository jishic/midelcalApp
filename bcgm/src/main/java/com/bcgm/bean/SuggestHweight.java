package com.bcgm.bean;

public class SuggestHweight {
    private String hwresult;

    private String method;

    public String getHwresult() {
        return hwresult;
    }

    public void setHwresult(String hwresult) {
        this.hwresult = hwresult == null ? null : hwresult.trim();
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method == null ? null : method.trim();
    }
}