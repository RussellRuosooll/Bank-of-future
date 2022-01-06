package com.bank.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="client")
public class Client {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long accountNo;
	private String accType;
	private String currency;
	private String title;
	private String firstName;
	private String middleName;
	private String lastName;
	private String telephone;
	private String email;
	private String streetAddress;
	private String city;
	private String division;
	private String postalCode;
	private String country;
	private String citizenship;
	private Date dob;
	private byte[] ppPhoto;
	private byte[] signPhoto;
	private String maritalStatus;
	private String language;
	private String occupation;
	private String employer;
	private long monthlyIncome;
	private String nationality;
	private String nationalId;
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Client(long accountNo, String accType, String currency, String title, String firstName,
			String middleName, String lastName, String telephone, String email, String streetAddress, String city,
			String division, String postalCode, String country, String citizenship, Date dob, byte[] ppPhoto,
			byte[] signPhoto, String maritalStatus, String language, String occupation, String employer,
			long monthlyIncome, String nationality, String nationalId) {
		super();

		this.accountNo = accountNo;
		this.accType = accType;
		this.currency = currency;
		this.title = title;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.telephone = telephone;
		this.email = email;
		this.streetAddress = streetAddress;
		this.city = city;
		this.division = division;
		this.postalCode = postalCode;
		this.country = country;
		this.citizenship = citizenship;
		this.dob = dob;
		this.ppPhoto = ppPhoto;
		this.signPhoto = signPhoto;
		this.maritalStatus = maritalStatus;
		this.language = language;
		this.occupation = occupation;
		this.employer = employer;
		this.monthlyIncome = monthlyIncome;
		this.nationality = nationality;
		this.nationalId = nationalId;
	}
	

	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCitizenship() {
		return citizenship;
	}
	public void setCitizenship(String citizenship) {
		this.citizenship = citizenship;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public byte[] getPpPhoto() {
		return ppPhoto;
	}
	public void setPpPhoto(byte[] ppPhoto) {
		this.ppPhoto = ppPhoto;
	}
	public byte[] getSignPhoto() {
		return signPhoto;
	}
	public void setSignPhoto(byte[] signPhoto) {
		this.signPhoto = signPhoto;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getEmployer() {
		return employer;
	}
	public void setEmployer(String employer) {
		this.employer = employer;
	}
	public long getMonthlyIncome() {
		return monthlyIncome;
	}
	public void setMonthlyIncome(long monthlyIncome) {
		this.monthlyIncome = monthlyIncome;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getNationalId() {
		return nationalId;
	}
	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}
	
	

}
