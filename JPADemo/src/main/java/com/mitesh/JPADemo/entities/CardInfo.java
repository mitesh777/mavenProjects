package com.mitesh.JPADemo.entities;



import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name="Payment_Card_Info")
public class CardInfo {
	@Id
	private String cardNumber;
	
	@Temporal(TemporalType.DATE)
	@Column(name="expiry_date")
	private Date expiryDate;
	
	private String cardHoldName;
	@Column(name="card_type")
	@Enumerated(EnumType.STRING)
	private CardType cardType;
	
	@ManyToOne//(cascade = CascadeType.MERGE)
	@JoinColumn(name="username")
	private User user;
	public CardInfo(String cardNumber, Date expiryDate, String cardHoldName, CardType cardType) {
		super();
		this.cardNumber = cardNumber;
		this.expiryDate = expiryDate;
		this.cardHoldName = cardHoldName;
		this.cardType = cardType;
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
		user.addCardInfo(this);
	}
	
	

	public CardInfo() {
		super();
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	
	
	
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	public String getCardHoldName() {
		return cardHoldName;
	}
	public void setCardHoldName(String cardHoldName) {
		this.cardHoldName = cardHoldName;
	}
	public CardType getCardType() {
		return cardType;
	}
	public void setCardType(CardType cardType) {
		this.cardType = cardType;
	}
	
	
	
}
