package com.mitesh.productapp.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue
	private int id;
	private String brandName;
	private String category;
	private String description;
	private float prive;
	private boolean inStock;
	private int discount;
	@Override
	public String toString() {
		return "Product [id=" + id + ", brandName=" + brandName + ", category=" + category + ", description="
				+ description + ", prive=" + prive + ", inStock=" + inStock + ", discount=" + discount + "]";
	}
	public Product() {
		super();
	}
	public Product(String brandName, String category, String description, float prive, boolean inStock, int discount) {
		super();
		this.brandName = brandName;
		this.category = category;
		this.description = description;
		this.prive = prive;
		this.inStock = inStock;
		this.discount = discount;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getPrive() {
		return prive;
	}
	public void setPrive(float prive) {
		this.prive = prive;
	}
	public boolean isInStock() {
		return inStock;
	}
	public void setInStock(boolean inStock) {
		this.inStock = inStock;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
	
}
