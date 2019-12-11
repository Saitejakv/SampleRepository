package com.cg.App.Entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Entity
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Account {
	
	@Id
	 @SequenceGenerator(name ="seq", sequenceName = "seq", initialValue =
	  100000,allocationSize = 100010)
	 @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
	 
	private int accountNum;
	
	@Size(min = 3, max = 25, message = "name should be minimum of 3 Characters")
	@Pattern(regexp = "^[a-z A-Z]*$", message = "a-z and A-Zare allowed")
	@NotNull(message = "FirstName Required")
	private String firstName;
	
	@Size(min = 3, max = 25, message = "name should be minimum of 3 Characters")
	@Pattern(regexp = "^[a-z A-Z]*$", message = "a-z and A-Zare allowed")
	@NotNull(message = "LastNAme Required")
	private String lastName;
	
	private String dob;
	private String accountCreationDate;
	
	@Pattern(regexp = "Male|Female")
	private String gender;
	
	private int basicdeposit;
	@Size(max =10,message  ="Contact number can't be less than 10")
	@Pattern(regexp = "^[0-9]*$", message ="0-9 numbers are allowed")
	private String contactNum;
	
	@Size(min = 3, max = 25, message = "Address Required")
	@Pattern(regexp = "^[a-z A-Z,()-/]*$", message = "a-z,A-Z,(,),/,- and , are allowed")
	private String address;
	
	@Pattern(regexp = "Business|Consumer")
	private String accountType;
	
	/*
	 * private int AccsubscriptionId;
	 * 
	 * 
	 * @JsonIgnore
	 * 
	 * @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	 * 
	 * @JoinColumn(name = "AccsubscriptionId", insertable = false, updatable =
	 * false) private Subscription subscription;
	 */

	public int getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getAccountCreationDate() {
		return accountCreationDate;
	}

	public void setAccountCreationDate(String accountCreationDate) {
		this.accountCreationDate = accountCreationDate;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getBasicdeposit() {
		return basicdeposit;
	}

	public void setBasicdeposit(int basicdeposit) {
		this.basicdeposit = basicdeposit;
	}

	public String getContactNum() {
		return contactNum;
	}

	public void setContactNum(String contactNum) {
		this.contactNum = contactNum;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	/*
	 * public Subscription getSubscription() { return subscription; }
	 * 
	 * public void setSubscription(Subscription subscription) { this.subscription =
	 * subscription; }
	 */

	@Override
	public String toString() {
		return "Account [accountNum=" + accountNum + ", firstName=" + firstName + ", lastName=" + lastName + ", dob="
				+ dob + ", accountCreationDate=" + accountCreationDate + ", gender=" + gender + ", basicdeposit="
				+ basicdeposit + ", contactNum=" + contactNum + ", address=" + address + ", accountType=" + accountType
				+ "]";
	}

	/*
	 * public int getAccsubscriptionId() { return AccsubscriptionId; }
	 * 
	 * public void setAccsubscriptionId(int accsubscriptionId) { AccsubscriptionId =
	 * accsubscriptionId; }
	 */

}
