package com.fs.form;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class JourneyForm {
	private int busProviderId;
	private String busProviderName;
	private String source;
	private String destination;
	@DateTimeFormat(pattern = "yyyy/mm/dd")
	private Date travelDate;
	private double cost;

	public JourneyForm() {
		super();
		// TODO Auto-generated constructor stub
	}

	public JourneyForm(int busProviderId, String busProviderName, String source, String destination, Date travelDate,
			double cost) {
		super();
		this.busProviderId = busProviderId;
		this.busProviderName = busProviderName;
		this.source = source;
		this.destination = destination;
		this.travelDate = travelDate;
		this.cost = cost;
	}

	public int getBusProviderId() {
		return busProviderId;
	}

	public void setBusProviderId(int busProviderId) {
		this.busProviderId = busProviderId;
	}

	public String getBusProviderName() {
		return busProviderName;
	}

	public void setBusProviderName(String busProviderName) {
		this.busProviderName = busProviderName;
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

}
