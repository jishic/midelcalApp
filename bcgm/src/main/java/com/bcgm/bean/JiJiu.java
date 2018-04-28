package com.bcgm.bean;


public class JiJiu {
    String title;
    String description;
    String video;
    String image;
    
	public JiJiu() {
		super();
		// TODO Auto-generated constructor stub
	}
	public JiJiu(String title, String description, String video, String image) {
		super();
		this.title = title;
		this.description = description;
		this.video = video;
		this.image = image;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getVideo() {
		return video;
	}
	public void setVideo(String video) {
		this.video = video;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
    
}
