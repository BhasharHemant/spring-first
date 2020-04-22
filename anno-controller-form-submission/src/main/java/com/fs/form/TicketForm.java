package com.fs.form;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class TicketForm {
	private int journeyId;
	private String source;
	private String destination;
	@DateTimeFormat(pattern="yyyy/mm/dd")
	private Date travelDate;
	private double cost;
	private String busProviderName;
	private int busProviderId;
	private String passengerName;
	private int age;
	private String gender;
	private String contactNo;
	private String emailId;

	public TicketForm(int journeyId, String source, String destination, Date travelDate, double cost,
			String busProviderName, int busProviderId) {
		super();
		this.journeyId = journeyId;
		this.source = source;
		this.destination = destination;
		this.travelDate = travelDate;
		this.cost = cost;
		this.busProviderName = busProviderName;
		this.busProviderId = busProviderId;
	}

	public TicketForm() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getJourneyId() {
		return journeyId;
	}

	public void setJourneyId(int journeyId) {
		this.journeyId = journeyId;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Date getTravelDate() {
		return travelDate;
	}

	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getBusProviderName() {
		return busProviderName;
	}

	public void setBusProviderName(String busProviderName) {
		this.busProviderName = busProviderName;
	}

	public int getBusProviderId() {
		return busProviderId;
	}

	public void setBusProviderId(int busProviderId) {
		this.busProviderId = busProviderId;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

}
