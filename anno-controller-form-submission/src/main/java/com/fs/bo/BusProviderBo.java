package com.fs.bo;

public class BusProviderBo {
	private int busProviderId;
	private String busProviderName;
	private String contactNo;
	private String emailAddress;
	private String status;

	public BusProviderBo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BusProviderBo(int busProviderId, String busProviderName, String contactNo, String emailAddress,
			String status) {
		super();
		this.busProviderId = busProviderId;
		this.busProviderName = busProviderName;
		this.contactNo = contactNo;
		this.emailAddress = emailAddress;
		this.status = status;
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

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
