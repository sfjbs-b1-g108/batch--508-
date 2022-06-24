package com.chandra.groceries;

public class groceries {
	
	private int id;
	private String name;
	private int mrp;
	private int quantity;
	
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public groceries(int id, String name, int mrp ,int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.mrp = mrp;
		this.quantity=quantity;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSname() {
		return name;
	}
	public void setSname(String sname) {
		this.name = sname;
	}
	public int getMrp() {
		return mrp;
	}
	public void setMrp(int mrp) {
		this.mrp = mrp;
	}
	@Override
	public String toString() {
		return "groceries [id=" + id + ", name=" + name + ", mrp=" + mrp + ", quantity=" + quantity + "]";
	}
	
	
	
	

}
