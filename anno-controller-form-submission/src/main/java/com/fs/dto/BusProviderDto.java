package com.fs.dto;

public class BusProviderDto {
	private int busProviderId;
	private String busProviderName;

	public BusProviderDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BusProviderDto(int busProviderId, String busProviderName) {
		super();
		this.busProviderId = busProviderId;
		this.busProviderName = busProviderName;
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

}
