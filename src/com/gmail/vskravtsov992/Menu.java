package com.gmail.vskravtsov992;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

	public static void show() {
		System.out.println("Please make your choice:" + "\n" + "1 - Show the entire EcoBike catalog" + "\n"
				+ "2 – Add a new folding bike" + "\n" + "3 – Add a new speedelec" + "\n" + "4 – Add a new e-bike" + "\n"
				+ "5 – Find the first item of a particular brand" + "\n" + "6 – Write to file" + "\n"
				+ "7 – Stop the program");
	}

	public void showEcoBikeCatalog(EcoBikeList list) {
		System.out.println("EcoBike catalog:");
		System.out.println(list.toString());
		System.out.println();
	}

	public void addNewFoldingBike(EcoBikeList list) {
		for (;;) {
			System.out.println("Adding Folding Bike");
			Scanner sc = new Scanner(System.in);
			String brand;
			int weight;
			boolean lights = false;
			String color;
			int price;
			int wheelSize;
			int gearsNumber;
			try {
				System.out.println("Input the name of the brand. (Input Menu to return to the menu)");
				brand = sc.nextLine();
				if (brand.equalsIgnoreCase("menu")) {
					break;
				}
				if (brand.equals("")) {
					System.out.println("Wrong input. Please try again.");
					continue;
				}

				System.out.println("Input the weight(in grams). Integer only.");
				weight = sc.nextInt();
				if (negativeValueCheck(weight) == true) {
					negativeValueInputMessage();
					continue;
				}

				System.out.println("Input the availability of lights at front and back. true/false only.");
				lights = sc.nextBoolean();
				sc.nextLine();

				System.out.println("Input the color.");
				color = sc.nextLine();
				if (color.equals("")) {
					System.out.println("Wrong input. Please try again.");
					continue;
				}

				System.out.println("Input the price(in euro). Integer only.");
				price = sc.nextInt();
				if (negativeValueCheck(price) == true) {
					negativeValueInputMessage();
					continue;
				}

				System.out.println("Input the size of wheels(in inches). Integer only.");
				wheelSize = sc.nextInt();
				if (negativeValueCheck(wheelSize) == true) {
					negativeValueInputMessage();
					continue;
				}

				System.out.println("Input the number of gears. Integer only.");
				gearsNumber = sc.nextInt();
				if (negativeValueCheck(gearsNumber) == true) {
					negativeValueInputMessage();
					continue;
				}
			} catch (InputMismatchException e) {
				System.out.println("Wrong input. Please try again.");
				System.out.println();
				continue;
			}
			list.addFoldingBike(new FoldingBike(brand, weight, lights, color, price, wheelSize, gearsNumber));
			System.out.println("Folding bike added!");
			System.out.println();
			break;
		}
	}

	public void addNewSpeedelec(EcoBikeList list) {
		for (;;) {
			System.out.println("Adding Speedelec");
			Scanner sc = new Scanner(System.in);
			String brand;
			int weight;
			boolean lights;
			String color;
			int price;
			int maxSpeed;
			int batteryCap;
			try {
				System.out.println("Input the name of the brand. (Input Menu to return to the menu)");
				brand = sc.nextLine();
				if (brand.equalsIgnoreCase("menu")) {
					break;
				}
				if (brand.equals("")) {
					System.out.println("Wrong input. Please try again.");
					continue;
				}

				System.out.println("Input the weight(in grams). Integer only.");
				weight = sc.nextInt();
				if (negativeValueCheck(weight) == true) {
					negativeValueInputMessage();
					continue;
				}

				System.out.println("Input the availability of lights at front and back. true/false only.");
				lights = sc.nextBoolean();
				sc.nextLine();

				System.out.println("Input the color.");
				color = sc.nextLine();
				if (color.equals("")) {
					System.out.println("Wrong input. Please try again.");
					continue;
				}

				System.out.println("Input the price(in euro). Integer only.");
				price = sc.nextInt();
				if (negativeValueCheck(price) == true) {
					negativeValueInputMessage();
					continue;
				}

				System.out.println("Input the maximum speed(in km/h). Integer only.");
				maxSpeed = sc.nextInt();
				if (negativeValueCheck(maxSpeed) == true) {
					negativeValueInputMessage();
					continue;
				}

				System.out.println("Input the battery capacity(in mAh). Integer only.");
				batteryCap = sc.nextInt();
				if (negativeValueCheck(batteryCap) == true) {
					negativeValueInputMessage();
					continue;
				}
			} catch (InputMismatchException e) {
				System.out.println("Wrong input. Please try again/");
				System.out.println();
				continue;
			}
			list.addSpeedelec(new Speedelec(brand, weight, lights, color, price, maxSpeed, batteryCap));
			System.out.println("Speedelec added!");
			System.out.println();
			break;
		}
	}

	public void addNewEBike(EcoBikeList list) {
		for (;;) {
			System.out.println("Adding E-Bike");
			Scanner sc = new Scanner(System.in);
			String brand;
			int weight;
			boolean lights;
			String color;
			int price;
			int maxSpeed;
			int batteryCap;
			try {
				System.out.println("Input the name of the brand. (Input Menu to return to the menu)");
				brand = sc.nextLine();
				if (brand.equalsIgnoreCase("menu")) {
					break;
				}
				if (brand.equals("")) {
					System.out.println("Wrong input. Please try again.");
					continue;
				}

				System.out.println("Input the weight(in grams). Integer only.");
				weight = sc.nextInt();
				if (negativeValueCheck(weight) == true) {
					negativeValueInputMessage();
					continue;
				}

				System.out.println("Input the availability of lights at front and back. true/false only.");
				lights = sc.nextBoolean();
				sc.nextLine();

				System.out.println("Input the color.");
				color = sc.nextLine();
				if (color.equals("")) {
					System.out.println("Wrong input. Please try again.");
					continue;
				}

				System.out.println("Input the price(in euro). Integer only.");
				price = sc.nextInt();
				if (negativeValueCheck(price) == true) {
					negativeValueInputMessage();
					continue;
				}

				System.out.println("Input the maximum speed(in km/h). Integer only.");
				maxSpeed = sc.nextInt();
				if (negativeValueCheck(maxSpeed) == true) {
					negativeValueInputMessage();
					continue;
				}

				System.out.println("Input the battery capacity(in mAh). Integer only.");
				batteryCap = sc.nextInt();
				if (negativeValueCheck(batteryCap) == true) {
					negativeValueInputMessage();
					continue;
				}
			} catch (InputMismatchException e) {
				System.out.println("Wrong input. Please try again.");
				System.out.println();
				continue;
			}
			list.addEBike(new EBike(brand, weight, lights, color, price, maxSpeed, batteryCap));
			System.out.println("E-Bike added!");
			System.out.println();
			break;
		}
	}

	public void searchFirstItem(EcoBikeList list) {
		SearchFunction sf = new SearchFunction();
		for (;;) {
			System.out.println("Search");
			Scanner sc = new Scanner(System.in);
			String type;
			String brand;
			int weight;
			Boolean lights = false;
			String color;
			int price;
			int maxSpeed = -1;
			int batteryCap = -1;
			int wheelSize = -1;
			int gearsNumber = -1;
			try {
				System.out.println(
						"Input the type of the EcoBike. FB - for folding bike. SE - for Speedelec. EB - for E-Bike. (Input Menu to return to the menu)");
				type = sc.nextLine();
				if (type.equalsIgnoreCase("menu")) {
					break;
				}
				if (!type.equalsIgnoreCase("fb") & !type.equalsIgnoreCase("se") & !type.equalsIgnoreCase("eb")) {
					System.out.println("Wrong input. Plsease try again.");
					System.out.println();
					continue;
				}
				if (type.equalsIgnoreCase("fb")) {
					System.out.println("Input the name of the brand.");
					brand = sc.nextLine();
					if (brand.equals("")) {
						System.out.println("Wrong input. Plsease try again.");
						System.out.println();
						continue;
					}

					System.out.println(
							"Input the weight(in grams). Integer only. Input 0 - to not use this parameter for search.");
					weight = sc.nextInt();

					System.out.println(
							"Input the availability of lights at front and back. true/false only. Do not input anything to not use this parameter for search.");
					String light = sc.nextLine();
					if (light.equalsIgnoreCase("true")) {
						lights = true;
					}
					if (light.equalsIgnoreCase("false")) {
						lights = false;
					}
					if (light.equalsIgnoreCase("")) {
						lights = null;
					}
					sc.nextLine();

					System.out.println("Input the color. Do not input anything to not use this parameter for search.");
					color = sc.nextLine();

					System.out.println(
							"Input the price(in euro). Integer only. Input 0 - to not use this parameter for search.");
					price = sc.nextInt();

					System.out.println(
							"Input the size of wheels(in inches). Integer only. Input 0 - to not use this parameter for search.");
					wheelSize = sc.nextInt();

					System.out.println(
							"Input the number of gears. Integer only. Input 0 - to not use this parameter for search.");
					gearsNumber = sc.nextInt();

					System.out.println("Search result:");
					sf.searchEcobike(type, brand, weight, lights, color, price, maxSpeed, batteryCap, wheelSize,
							gearsNumber, list);
				}
				if (type.equalsIgnoreCase("se")) {
					System.out.println("Input the name of the brand.");
					brand = sc.nextLine();
					if (brand.equals("")) {
						System.out.println("Wrong input. Plsease try again.");
						System.out.println();
						continue;
					}

					System.out.println(
							"Input the weight(in grams). Integer only. Input 0 - to not use this parameter for search.");
					weight = sc.nextInt();

					System.out.println(
							"Input the availability of lights at front and back. true/false only. Do not input anything to not use this parameter for search.");
					String light = sc.nextLine();
					if (light.equalsIgnoreCase("true")) {
						lights = true;
					}
					if (light.equalsIgnoreCase("false")) {
						lights = false;
					}
					if (light.equalsIgnoreCase("")) {
						lights = null;
					}
					sc.nextLine();

					System.out.println("Input the color. Do not input anything to not use this parameter for search.");
					color = sc.nextLine();

					System.out.println(
							"Input the price(in euro). Integer only. Input 0 - to not use this parameter for search.");
					price = sc.nextInt();

					System.out.println(
							"Input the maximum speed(in km/h). Integer only. Input 0 - to not use this parameter for search.");
					maxSpeed = sc.nextInt();

					System.out.println(
							"Input the battery capacity(in mAh). Integer only. Input 0 - to not use this parameter for search.");
					batteryCap = sc.nextInt();

					System.out.println("Search result:");
					sf.searchEcobike(type, brand, weight, lights, color, price, maxSpeed, batteryCap, wheelSize,
							gearsNumber, list);
				}
				if (type.equalsIgnoreCase("eb")) {
					System.out.println("Input the name of the brand.");
					brand = sc.nextLine();
					if (brand.equals("")) {
						System.out.println("Wrong input. Plsease try again.");
						System.out.println();
						continue;
					}

					System.out.println(
							"Input the weight(in grams). Integer only. Input 0 - to not use this parameter for search.");
					weight = sc.nextInt();

					System.out.println(
							"Input the availability of lights at front and back. true/false only. Do not input anything to not use this parameter for search.");
					String light = sc.nextLine();
					if (light.equalsIgnoreCase("true")) {
						lights = true;
					}
					if (light.equalsIgnoreCase("false")) {
						lights = false;
					}
					if (light.equalsIgnoreCase("")) {
						lights = null;
					}
					sc.nextLine();

					System.out.println("Input the color. Do not input anything to not use this parameter for search.");
					color = sc.nextLine();

					System.out.println(
							"Input the price(in euro). Integer only. Input 0 - to not use this parameter for search.");
					price = sc.nextInt();

					System.out.println(
							"Input the maximum speed(in km/h). Integer only. Input 0 - to not use this parameter for search.");
					maxSpeed = sc.nextInt();

					System.out.println(
							"Input the battery capacity(in mAh). Integer only. Input 0 - to not use this parameter for search.");
					batteryCap = sc.nextInt();

					System.out.println("Search result:");
					sf.searchEcobike(type, brand, weight, lights, color, price, maxSpeed, batteryCap, wheelSize,
							gearsNumber, list);
				}
			} catch (InputMismatchException e) {
				System.out.println("Wrong input. Please try again.");
				System.out.println();
				continue;
			}
			break;
		}
	}

	public EcoBikeList writeToFile(EcoBikeList list) {
		EcoBikeList listSaved = new EcoBikeList();
		for (;;) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Writing file.");
			System.out.println(
					"Input pathway where you want to save the catalog (e.g. C:\\\\Program Files\\\\ecobike.txt) or input just the name of the file(e.g ecobike.txt) if  you want it to be located in the program folder.");
			String filename = sc.nextLine();
			try {
				if (!filename.substring(filename.length() - 4, filename.length()).equalsIgnoreCase(".txt")) {
					System.out
							.println("Wrong input. EcoBike catalog file should be in '.txt' format. Please try again.");
					System.out.println();
					continue;
				}
			} catch (StringIndexOutOfBoundsException e1) {
				System.out.println("Wrong input. EcoBike catalog file should be in '.txt' format. Please try again.");
				System.out.println();
				continue;
			}

			EcoBikeListDAOFileImplementation dao = new EcoBikeListDAOFileImplementation();
			dao.saveEcoBikeList(list, filename);
			try {
				listSaved = dao.loadEcoBikeList(filename);
			} catch (IOException e) {
			}
			System.out.println("Catalog saved.");
			System.out.println();
			break;
		}
		return listSaved;
	}

	public boolean negativeValueCheck(int value) {
		boolean check = false;
		if (value < 0) {
			check = true;
			return check;
		} else {
			return check;
		}
	}

	public static void negativeValueInputMessage() {
		System.out.println("Wrong input (negative value). Please try again.");
		System.out.println();
	}

}
