package com.fs.bo;

import java.util.Date;

public class JourneysWithBusProviderBo {
	private int journeyId;
	private String source;
	private String destination;
	private Date travelDate;
	private double cost;
	private BusProviderBo busProviderBo;

	public JourneysWithBusProviderBo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public JourneysWithBusProviderBo(int journeyId, String source, String destination, Date travelDate, double cost,
			BusProviderBo busProviderBo) {
		super();
		this.journeyId = journeyId;
		this.source = source;
		this.destination = destination;
		this.travelDate = travelDate;
		this.cost = cost;
		this.busProviderBo = busProviderBo;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
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

	public BusProviderBo getBusProviderBo() {
		return busProviderBo;
	}

	public void setBusProviderBo(BusProviderBo busProviderBo) {
		this.busProviderBo = busProviderBo;
	}

}
