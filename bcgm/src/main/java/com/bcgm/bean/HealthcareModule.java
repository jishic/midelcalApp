package com.bcgm.bean;

public class HealthcareModule {
    private Integer hModuleno;

    private String hModulename;

    public Integer gethModuleno() {
        return hModuleno;
    }

    public void sethModuleno(Integer hModuleno) {
        this.hModuleno = hModuleno;
    }

    public String gethModulename() {
        return hModulename;
    }

    public void sethModulename(String hModulename) {
        this.hModulename = hModulename == null ? null : hModulename.trim();
    }
}