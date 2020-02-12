package com.gmail.vskravtsov992;

public class FoldingBike extends Ecobike {

	private int wheelSize;
	private int gearsNumber;

	public FoldingBike(String brand, int weight, boolean lights, String color, int price, int wheelSize,
			int gearsNumber) {
		super(brand, weight, lights, color, price);
		this.wheelSize = wheelSize;
		this.gearsNumber = gearsNumber;
	}

	public FoldingBike() {
		super();
	}

	public int getWheelSize() {
		return wheelSize;
	}

	public void setWheelSize(int wheelSize) {
		this.wheelSize = wheelSize;
	}

	public int getGearsNumber() {
		return gearsNumber;
	}

	public void setGearsNumber(int gearsNumber) {
		this.gearsNumber = gearsNumber;
	}

	@Override
	public String toString() {
		return "FOLDING BIKE " + this.getBrand() + " with " + this.getGearsNumber() + " gear(s) and "
				+ this.lightsAvailable() + "head/tail light." + "\n" + "Price: " + this.getPrice() + " euros.";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + gearsNumber;
		result = prime * result + wheelSize;
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
		FoldingBike other = (FoldingBike) obj;
		if (gearsNumber != other.gearsNumber)
			return false;
		if (wheelSize != other.wheelSize)
			return false;
		return true;
	}

}
