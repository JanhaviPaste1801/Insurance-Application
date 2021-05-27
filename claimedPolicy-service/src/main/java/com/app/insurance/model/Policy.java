package com.app.insurance.model;


public class Policy {

	
	private int policyId;

	private String policyName;

	private int duration;

	private float premiumAmount;
	
	private String policyType;

	private String description;
	
	public Policy() {
		// TODO Auto-generated constructor stub
	}

	public Policy(int policyId, String policyName, int duration, float premiumAmount, String policyType,
			String description) {
		super();
		this.policyId = policyId;
		this.policyName = policyName;
		this.duration = duration;
		this.premiumAmount = premiumAmount;
		this.policyType = policyType;
		this.description = description;
	}

	public int getPolicyId() {
		return policyId;
	}

	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}

	public String getPolicyName() {
		return policyName;
	}

	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public float getPremiumAmount() {
		return premiumAmount;
	}

	public void setPremiumAmount(float premiumAmount) {
		this.premiumAmount = premiumAmount;
	}

	public String getPolicyType() {
		return policyType;
	}

	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
