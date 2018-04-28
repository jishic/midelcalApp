package com.bcgm.bean;

public class HealthcareArticle {
    private Integer hAid;

    private String hTitle;

    private String hLabel;

    private Integer hModuleno;

    private String hImage;

    private String hContent;

    public HealthcareArticle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HealthcareArticle(Integer hAid, String hTitle, String hLabel, Integer hModuleno, String hImage,
			String hContent) {
		super();
		this.hAid = hAid;
		this.hTitle = hTitle;
		this.hLabel = hLabel;
		this.hModuleno = hModuleno;
		this.hImage = hImage;
		this.hContent = hContent;
	}

	public Integer gethAid() {
        return hAid;
    }

    public void sethAid(Integer hAid) {
        this.hAid = hAid;
    }

    public String gethTitle() {
        return hTitle;
    }

    public void sethTitle(String hTitle) {
        this.hTitle = hTitle == null ? null : hTitle.trim();
    }

    public String gethLabel() {
        return hLabel;
    }

    public void sethLabel(String hLabel) {
        this.hLabel = hLabel == null ? null : hLabel.trim();
    }

    public Integer gethModuleno() {
        return hModuleno;
    }

    public void sethModuleno(Integer hModuleno) {
        this.hModuleno = hModuleno;
    }

    public String gethImage() {
        return hImage;
    }

    public void sethImage(String hImage) {
        this.hImage = hImage == null ? null : hImage.trim();
    }

    public String gethContent() {
        return hContent;
    }

    public void sethContent(String hContent) {
        this.hContent = hContent == null ? null : hContent.trim();
    }
}