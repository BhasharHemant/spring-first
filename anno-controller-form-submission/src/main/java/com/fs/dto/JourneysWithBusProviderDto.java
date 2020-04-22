package com.fs.dto;

import java.util.Date;

public class JourneysWithBusProviderDto {
	private int journeyId;
	private String source;
	private String destination;
	private Date travelDate;
	private double cost;
	private String busProviderName;
	private int busProviderId;

	public JourneysWithBusProviderDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public JourneysWithBusProviderDto(int journeyId, String source, String destination, Date travelDate, double cost,
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

}
