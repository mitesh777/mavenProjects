package com.mitesh.JPADemo.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Users")
public class User implements Serializable{
	
	@Id
	@Column(name="user_name")
	private String userName;
	private String password;
	@Embedded
	private Address address;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="profile_id")
	private Profile profile;
	//@OneToMany(cascade=CascadeType.ALL)
	@OneToMany(cascade=CascadeType.ALL,mappedBy="user")
	private List<CardInfo> cardInfoList = new ArrayList<CardInfo>();
	//a no argument constructor is a must for a pojo and orm to create
	
	public void addCardInfo(CardInfo cardInfo) {
		//cardInfo.setUser(this);
		cardInfoList.add(cardInfo);
		
	}
	
	public List<CardInfo> getCardInfoList() {
		return cardInfoList;
	}



	public User() {
		super();
	}
	
	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
		profile.setUser(this);
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public User(String userName, String password, Address address) {
		super();
		this.userName = userName;
		this.password = password;
		this.address = address;
	}

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
