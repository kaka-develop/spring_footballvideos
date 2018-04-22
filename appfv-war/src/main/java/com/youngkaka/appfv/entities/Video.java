package com.youngkaka.appfv.entities;

public class Video extends AbstractEntity{
	private String des;
	private String source;
	private int view;
	private String cId;
	private String rating;
	private String img;

	public Video() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Video(String id, String name,String des, String source, String img) {
		super.setId(id);
		super.setName(name);
		this.des = des;
		this.source = source;
		this.img = img;
	}



	public Video(String id, String name,String des, String source, int view, String cId, String rating, String img) {
		super.setId(id);
		super.setName(name);
		this.des = des;
		this.source = source;
		this.view = view;
		this.cId = cId;
		this.rating = rating;
		this.img = img;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	public int getView() {
		return view;
	}
	public void setView(int view) {
		this.view = view;
	}
	public String getcId() {
		return cId;
	}
	public void setcId(String cId) {
		this.cId = cId;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	
	
	
	
}
