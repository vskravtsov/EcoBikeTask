package com.gmail.vskravtsov992;

public class Ecobike {

	private String brand;
	private int weight;
	private boolean lights;
	private String color;
	private int price;

	public Ecobike(String brand, int weight, boolean lights, String color, int price) {
		super();
		this.brand = brand;
		this.weight = weight;
		this.lights = lights;
		this.color = color;
		this.price = price;
	}

	public Ecobike() {
		super();
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public boolean isLights() {
		return lights;
	}

	public void setLights(boolean lights) {
		this.lights = lights;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String lightsAvailable() {
		String check;
		if (this.lights == true) {
			check = "";
		} else {
			check = "no ";
		}
		return check;
	}

	@Override
	public String toString() {
		return "Ecobike [brand=" + brand + ", weight=" + weight + ", lights=" + lights + ", color=" + color + ", price="
				+ price + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + (lights ? 1231 : 1237);
		result = prime * result + price;
		result = prime * result + weight;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ecobike other = (Ecobike) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (lights != other.lights)
			return false;
		if (price != other.price)
			return false;
		if (weight != other.weight)
			return false;
		return true;
	}

}
