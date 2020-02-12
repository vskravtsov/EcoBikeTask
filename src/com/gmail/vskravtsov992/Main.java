package com.gmail.vskravtsov992;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		EcoBikeList list = new EcoBikeList();
		EcoBikeList listForSearch = new EcoBikeList();
		EcoBikeList listSaved = new EcoBikeList();
		EcoBikeListDAOFileImplementation dao = new EcoBikeListDAOFileImplementation();
		String fileName = "";
		Menu menu = new Menu();
		boolean closeProgram = false;

		System.out.println(
				"Hello! Please input pathway to the EcoBike catalog file (e.g. C:\\Program Files\\ecobike.txt) or input just the name of the file(e.g ecobike.txt) if it is located in the program folder.");
		System.out.println("To close the program - type 'close'.");
		for (;;) {
			fileName = sc.nextLine();
			if (fileName.equals("")) {
				System.out.println("Wrong input. Please try again.");
				continue;
			}
			if (fileName.equalsIgnoreCase("close")) {
				closeProgram = true;
				break;
			}
			try {
				if (!fileName.substring(fileName.length() - 4, fileName.length()).equalsIgnoreCase(".txt")) {
					System.out
							.println("Wrong input. EcoBike catalog file should be in '.txt' format. Please try again.");
					continue;
				}
			} catch (StringIndexOutOfBoundsException e1) {
				System.out.println("Wrong input. EcoBike catalog file should be in '.txt' format. Please try again.");
				continue;
			}
			try {
				list = dao.loadEcoBikeList(fileName);
				listForSearch = dao.loadEcoBikeList(fileName);
			} catch (IOException e) {
				System.out.println("Incorect pathway. File does not exist. Please try again.");
				continue;
			}
			try {
				if (list.getEcobikeCatalog().isEmpty() || list.getEcobikeCatalog().get(0).getBrand().equals(null)) {
					System.out.println("File is not an EcoBike catalog. Please try again.");
					continue;
				}
			} catch (NullPointerException e) {
				System.out.println("File is not an EcoBike catalog. Please try again.");
				continue;
			}
			System.out.println("File downloaded.");
			break;
		}

		for (;;) {
			if (closeProgram) {
				System.out.println("Program closed.");
				break;
			}
			Menu.show();
			Scanner sc3 = new Scanner(System.in);
			int i = 0;
			try {
				i = sc3.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Wrong input. Please try again.");
				System.out.println();
				continue;
			}
			if (i <= 0 || i > 7) {
				System.out.println("Wrong input. Please try again.");
				System.out.println();
				continue;
			}
			if (i == 7 & (list.equals(listForSearch) || list.equals(listSaved))) {
				System.out.println("Program closed.");
				break;
			}
			if ((i == 7) & (!list.equals(listForSearch) | !list.equals(listSaved))) {
				Scanner sc2 = new Scanner(System.in);
				System.out.println(
						"There is an unsaved data. Are you sure you want to close the program. (Type yes/no).");
				String answer = sc2.nextLine();
				if (answer.equalsIgnoreCase("yes")) {
					System.out.println("Program closed.");
					break;
				}
				if (answer.equalsIgnoreCase("no")) {
					continue;
				}
				if (!answer.equalsIgnoreCase("yes") & answer.equalsIgnoreCase("no")) {
					System.out.println("Wrong input. Please try again.");
					continue;
				}
			}

			switch (i) {
			case 1:
				menu.showEcoBikeCatalog(list);
				continue;
			case 2:
				menu.addNewFoldingBike(list);
				continue;
			case 3:
				menu.addNewSpeedelec(list);
				continue;
			case 4:
				menu.addNewEBike(list);
				continue;
			case 5:
				menu.searchFirstItem(listForSearch);
				continue;
			case 6:
				listSaved = menu.writeToFile(list);
				continue;
			}

		}

	}

}
