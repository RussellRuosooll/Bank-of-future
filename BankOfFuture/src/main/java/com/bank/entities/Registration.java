package com.bank.entities;

import java.sql.Date;
import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "registration")
public class Registration {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "acc_no")
	private long accNo;
	
	@Column(name = "acc_type")
	private String accType;
	
	@Column(name = "currency")
	private String currency;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "middle_name")
	private String middleName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "telephone")
	private String telephone;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "street_address")
	private String streetAddress;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "division")
	private String division;
	
	@Column(name = "postal_code")
	private String postalCode;
	
	@Column(name = "country")
	private String country;
	
	@Column(name = "citizenship")
	private String citizenship;
	
	@Column(name = "dob")
	private Date dob;
	
	@Column(name = "pp_photo")
	private byte[] ppPhoto;
	
	@Column(name = "sign_photo")
	private byte[] signPhoto;
	
	@Column(name = "marital_status")
	private String maritalStatus;
	
	@Column(name = "language")
	private String language;
	
	@Column(name = "occupation")
	private String occupation;
	
	@Column(name = "employer")
	private String employer;
	
	@Column(name = "monthly_income")
	private long monthlyIncome;
	
	@Column(name = "nationality")
	private String nationality;
	
	@Column(name = "national_id")
	private String nationalId;
	
	@Column(name = "status")
	private String status = "pending"; //pending 
	
	@Column(name = "reg_date")
	private Date regDate;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "pin")
	private String pin;

	public Registration() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Registration(long id, long accNo, String accType, String currency, String title, String firstName,
			String middleName, String lastName, String telephone, String email, String streetAddress, String city,
			String division, String postalCode, String country, String citizenship, Date dob, byte[] ppPhoto,
			byte[] signPhoto, String maritalStatus, String language, String occupation, String employer,
			long monthlyIncome, String nationality, String nationalId, String status, Date regDate, String password,
			String pin) {
		super();
		this.id = id;
		this.accNo = accNo;
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
		this.status = status;
		this.regDate = regDate;
		this.password = password;
		this.pin = pin;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getAccNo() {
		return accNo;
	}

	public void setAccNo(long accNo) {
		this.accNo = accNo;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "Registration [id=" + id + ", accNo=" + accNo + ", accType=" + accType + ", currency=" + currency
				+ ", title=" + title + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName="
				+ lastName + ", telephone=" + telephone + ", email=" + email + ", streetAddress=" + streetAddress
				+ ", city=" + city + ", division=" + division + ", postalCode=" + postalCode + ", country=" + country
				+ ", citizenship=" + citizenship + ", dob=" + dob + ", ppPhoto=" + Arrays.toString(ppPhoto)
				+ ", signPhoto=" + Arrays.toString(signPhoto) + ", maritalStatus=" + maritalStatus + ", language="
				+ language + ", occupation=" + occupation + ", employer=" + employer + ", monthlyIncome="
				+ monthlyIncome + ", nationality=" + nationality + ", nationalId=" + nationalId + ", status=" + status
				+ ", regDate=" + regDate + ", password=" + password + ", pin=" + pin + "]";
	}

}
