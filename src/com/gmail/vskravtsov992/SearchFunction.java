package com.gmail.vskravtsov992;

public class SearchFunction {

	public FoldingBike searchFoldingBike(String brand, int weight, Boolean lights, String color, int price,
			int wheelSize, int gearsNumber, EcoBikeList list) {
		FoldingBike fb = new FoldingBike();
		for (Ecobike ecobike : list.getEcobikeCatalog()) {
			if (!brand.equals("") & !ecobike.getBrand().equalsIgnoreCase(brand)) {
				continue;
			}
			if (weight != 0 & ecobike.getWeight() != weight) {
				continue;
			}
			try {
				if (!lights.equals(null) & ecobike.isLights() != lights) {
					continue;
				}
			} catch (NullPointerException e) {
			}
			if (!color.equals("") & !ecobike.getColor().equalsIgnoreCase(color)) {
				continue;
			}
			if (price != 0 & ecobike.getPrice() != price) {
				continue;
			}
			fb = (FoldingBike) ecobike;
			if (wheelSize != 0 & fb.getWheelSize() != wheelSize) {
				continue;
			}
			if (gearsNumber != 0 & fb.getGearsNumber() != gearsNumber) {
				continue;
			}
			return fb;
		}
		return null;
	}

	public Speedelec searchSpeedelec(String brand, int weight, Boolean lights, String color, int price, int maxSpeed,
			int batteryCap, EcoBikeList list) {
		Speedelec se = new Speedelec();
		for (Ecobike ecobike : list.getEcobikeCatalog()) {
			if (!brand.equals("") & !ecobike.getBrand().equalsIgnoreCase(brand)) {
				continue;
			}
			if (weight != 0 & ecobike.getWeight() != weight) {
				continue;
			}
			try {
				if (!lights.equals(null) & ecobike.isLights() != lights) {
					continue;
				}
			} catch (NullPointerException e) {
			}
			if (!color.equals("") & !ecobike.getColor().equalsIgnoreCase(color)) {
				continue;
			}
			if (price != 0 & ecobike.getPrice() != price) {
				continue;
			}
			se = (Speedelec) ecobike;
			if (maxSpeed != 0 & se.getMaxSpeed() != maxSpeed) {
				continue;
			}
			if (batteryCap != 0 & se.getBatteryCap() != batteryCap) {
				continue;
			}
			return se;
		}
		return null;
	}

	public EBike searchEBike(String brand, int weight, Boolean lights, String color, int price, int maxSpeed,
			int batteryCap, EcoBikeList list) {
		EBike eb = new EBike();
		for (Ecobike ecobike : list.getEcobikeCatalog()) {
			if (!brand.equals(null) & !ecobike.getBrand().equalsIgnoreCase(brand)) {
				continue;
			}
			if (weight != 0 & ecobike.getWeight() != weight) {
				continue;
			}
			try {
				if (!lights.equals(null) & ecobike.isLights() != lights) {
					continue;
				}
			} catch (NullPointerException e) {
			}
			if (!color.equals("") & !ecobike.getColor().equalsIgnoreCase(color)) {
				continue;
			}
			if (price != 0 & ecobike.getPrice() != price) {
				continue;
			}
			eb = (EBike) ecobike;
			if (maxSpeed != 0 & eb.getMaxSpeed() != maxSpeed) {
				continue;
			}
			if (batteryCap != 0 & eb.getBatteryCap() != batteryCap) {
				continue;
			}
			return eb;
		}
		return null;
	}

	public void searchEcobike(String type, String brand, int weight, Boolean lights, String color, int price,
			int maxSpeed, int batteryCap, int wheelSize, int gearsNumber, EcoBikeList list) {
		try {
			if (type.equalsIgnoreCase("fb")) {
				FoldingBike fb = new FoldingBike();
				fb = searchFoldingBike(brand, weight, lights, color, price, wheelSize, gearsNumber, list);
				System.out.println(fb.toString());
			}
			if (type.equalsIgnoreCase("se")) {
				Speedelec se = new Speedelec();
				se = searchSpeedelec(brand, weight, lights, color, price, maxSpeed, batteryCap, list);
				System.out.println(se.toString());
			}
			if (type.equalsIgnoreCase("eb")) {
				EBike eb = new EBike();
				eb = searchEBike(brand, weight, lights, color, price, maxSpeed, batteryCap, list);
				System.out.println(eb.toString());
			}
		} catch (NullPointerException e) {
			System.out.println("No search result!");
			;
		}

	}

}
