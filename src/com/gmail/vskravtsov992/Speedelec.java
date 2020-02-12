package com.gmail.vskravtsov992;

public class Speedelec extends Ecobike {

	private int maxSpeed;
	private int batteryCap;

	public Speedelec(String brand, int weight, boolean lights, String color, int price, int maxSpeed, int batteryCap) {
		super(brand, weight, lights, color, price);
		this.maxSpeed = maxSpeed;
		this.batteryCap = batteryCap;
	}

	public Speedelec() {
		super();
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getBatteryCap() {
		return batteryCap;
	}

	public void setBatteryCap(int batteryCap) {
		this.batteryCap = batteryCap;
	}

	@Override
	public String toString() {
		return "SPEEDELEC " + this.getBrand() + " with " + this.getBatteryCap() + " mAh battery and "
				+ this.lightsAvailable() + "head/tail light." + "\n" + "Price: " + this.getPrice() + " euros.";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + batteryCap;
		result = prime * result + maxSpeed;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Speedelec other = (Speedelec) obj;
		if (batteryCap != other.batteryCap)
			return false;
		if (maxSpeed != other.maxSpeed)
			return false;
		return true;
	}

}
