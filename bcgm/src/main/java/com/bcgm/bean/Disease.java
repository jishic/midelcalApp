package com.bcgm.bean;

public class Disease {
    private Integer ddq_id;

    private String ddq_name;

    private String ddq_symptom_index;

    private String ddq_symptom;

    private String ddq_description;

    private String ddq_cure;

    private Integer ddq_gender;

    private String loc_gtd_id;

	public Disease(Integer ddq_id, String ddq_name, String ddq_symptom_index, String ddq_symptom,
			String ddq_description, String ddq_cure, Integer ddq_gender, String loc_gtd_id) {
		super();
		this.ddq_id = ddq_id;
		this.ddq_name = ddq_name;
		this.ddq_symptom_index = ddq_symptom_index;
		this.ddq_symptom = ddq_symptom;
		this.ddq_description = ddq_description;
		this.ddq_cure = ddq_cure;
		this.ddq_gender = ddq_gender;
		this.loc_gtd_id = loc_gtd_id;
	}



	public Integer getDdq_id() {
		return ddq_id;
	}



	public void setDdq_id(Integer ddq_id) {
		this.ddq_id = ddq_id;
	}



	public String getDdq_name() {
		return ddq_name;
	}



	public void setDdq_name(String ddq_name) {
		this.ddq_name = ddq_name;
	}



	public String getDdq_symptom_index() {
		return ddq_symptom_index;
	}



	public void setDdq_symptom_index(String ddq_symptom_index) {
		this.ddq_symptom_index = ddq_symptom_index;
	}



	public String getDdq_symptom() {
		return ddq_symptom;
	}



	public void setDdq_symptom(String ddq_symptom) {
		this.ddq_symptom = ddq_symptom;
	}



	public String getDdq_description() {
		return ddq_description;
	}



	public void setDdq_description(String ddq_description) {
		this.ddq_description = ddq_description;
	}



	public String getDdq_cure() {
		return ddq_cure;
	}

	public void setDdq_cure(String ddq_cure) {
		this.ddq_cure = ddq_cure;
	}

	public Integer getDdq_gender() {
		return ddq_gender;
	}



	public void setDdq_gender(Integer ddq_gender) {
		this.ddq_gender = ddq_gender;
	}



	public String getLoc_gtd_id() {
		return loc_gtd_id;
	}

	public void setLoc_gtd_id(String loc_gtd_id) {
		this.loc_gtd_id = loc_gtd_id;
	}

	@Override
	public String toString() {
		return "Disease [ddq_id=" + ddq_id + ", ddq_name=" + ddq_name + ", ddq_symptom_index=" + ddq_symptom_index
				+ ", ddq_symptom=" + ddq_symptom + ", ddq_description=" + ddq_description + ", ddq_cure=" + ddq_cure
				+ ", ddq_gender=" + ddq_gender + ", loc_gtd_id=" + loc_gtd_id + "]";
	}

}