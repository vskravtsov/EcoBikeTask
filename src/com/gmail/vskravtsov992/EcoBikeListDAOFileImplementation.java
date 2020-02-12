package com.gmail.vskravtsov992;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class EcoBikeListDAOFileImplementation implements EcoBikeListDAO {

	public int bikeTypeCheck(String text) {
		int check = 0;
		if (text.substring(0, 12).equals("FOLDING BIKE")) {
			check = 1;
		}
		if (text.substring(0, 9).equals("SPEEDELEC")) {
			check = 2;
		}
		if (text.substring(0, 6).equals("E-BIKE")) {
			check = 3;
		}
		return check;
	}

	public Ecobike identifyEcoBike(String text) {
		Ecobike eco = new Ecobike();
		int check = bikeTypeCheck(text);
		if (check == 1) {
			String[] splitText = text.substring(13, text.length()).split("; ");
			String brand = splitText[0];
			int wheelSize = Integer.valueOf(splitText[1]);
			int gearsNumber = Integer.valueOf(splitText[2]);
			int weight = Integer.valueOf(splitText[3]);
			boolean lights = splitText[4].equalsIgnoreCase("TRUE");
			String color = splitText[5];
			int price = Integer.valueOf(splitText[6]);
			FoldingBike fb = new FoldingBike(brand, weight, lights, color, price, wheelSize, gearsNumber);
			eco = fb;
			return eco;
		}
		if (check == 2) {
			String[] splitText = text.substring(10, text.length()).split("; ");
			String brand = splitText[0];
			int maxSpeed = Integer.valueOf(splitText[1]);
			int weight = Integer.valueOf(splitText[2]);
			boolean lights = splitText[3].equalsIgnoreCase("TRUE");
			int batteryCap = Integer.valueOf(splitText[4]);
			String color = splitText[5];
			int price = Integer.valueOf(splitText[6]);
			Speedelec se = new Speedelec(brand, weight, lights, color, price, maxSpeed, batteryCap);
			eco = se;
			return eco;
		}
		if (check == 3) {
			String[] splitText = text.substring(7, text.length()).split("; ");
			String brand = splitText[0];
			int maxSpeed = Integer.valueOf(splitText[1]);
			int weight = Integer.valueOf(splitText[2]);
			boolean lights = splitText[3].equalsIgnoreCase("TRUE");
			int batteryCap = Integer.valueOf(splitText[4]);
			String color = splitText[5];
			int price = Integer.valueOf(splitText[6]);
			EBike eb = new EBike(brand, weight, lights, color, price, maxSpeed, batteryCap);
			eco = eb;
			return eco;
		}
		return eco;
	}

	@Override
	public EcoBikeList loadEcoBikeList(String filename) throws IOException {
		File file = new File(filename);
		EcoBikeList catalog = new EcoBikeList();
		BufferedReader br = new BufferedReader(new FileReader(file));
		String text = "";
		for (; (text = br.readLine()) != null;) {
			catalog.addEcobike(identifyEcoBike(text));
		}
		return catalog;
	}

	@Override
	public void saveEcoBikeList(EcoBikeList ecobikeList, String filename) {
		try (PrintWriter pw = new PrintWriter(new File(filename))) {
			for (Ecobike ecobike : ecobikeList.getEcobikeCatalog()) {
				if (ecobike != null & ecobike.getClass().equals(FoldingBike.class)) {
					FoldingBike fb = (FoldingBike) ecobike;
					pw.println("FOLDING BIKE " + fb.getBrand() + "; " + fb.getWheelSize() + "; " + fb.getGearsNumber()
							+ "; " + fb.getWeight() + "; " + fb.isLights() + "; " + fb.getColor() + "; "
							+ fb.getPrice());
				}
				if (ecobike != null & ecobike.getClass().equals(Speedelec.class)) {
					Speedelec se = (Speedelec) ecobike;
					pw.println("SPEEDELEC " + se.getBrand() + "; " + se.getMaxSpeed() + "; " + se.getWeight() + "; "
							+ se.isLights() + "; " + se.getBatteryCap() + "; " + se.getColor() + "; " + se.getPrice());
				}
				if (ecobike != null & ecobike.getClass().equals(EBike.class)) {
					EBike eb = (EBike) ecobike;
					pw.println("E-BIKE " + eb.getBrand() + "; " + eb.getMaxSpeed() + "; " + eb.getWeight() + "; "
							+ eb.isLights() + "; " + eb.getBatteryCap() + "; " + eb.getColor() + "; " + eb.getPrice());
				}
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
