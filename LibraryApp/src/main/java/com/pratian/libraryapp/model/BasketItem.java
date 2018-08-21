package com.pratian.libraryapp.model;

public class BasketItem {
	//private int itemId;
	private int bookId;
	private int quantity;
	private int orderId;
	public BasketItem(int bookId, int quantity, int orderId) {
		super();
		this.bookId = bookId;
		this.quantity = quantity;
		this.orderId = orderId;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public BasketItem(int bookId, int quantity) {
		super();
		this.bookId = bookId;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "BasketItem [bookId=" + bookId + ", quantity=" + quantity + ", orderId=" + orderId + "]";
	}
	
}
