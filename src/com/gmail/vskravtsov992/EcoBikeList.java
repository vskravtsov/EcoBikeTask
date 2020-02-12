package com.gmail.vskravtsov992;

import java.util.ArrayList;
import java.util.List;

public class EcoBikeList {

	private List<Ecobike> ecobikeCatalog;

	public EcoBikeList(List<Ecobike> ecobikeCatalog) {
		super();
		ecobikeCatalog = new ArrayList<>();
		this.ecobikeCatalog = ecobikeCatalog;
	}

	public EcoBikeList() {
		super();
		ecobikeCatalog = new ArrayList<>();
	}

	public List<Ecobike> getEcobikeCatalog() {
		return ecobikeCatalog;
	}

	public void setEcobikeCatalog(List<Ecobike> ecobikeCatalog) {
		this.ecobikeCatalog = ecobikeCatalog;
	}

	public void addEcobike(Ecobike ecobike) {
		try {

			if (ecobike == null) {
				throw new IllegalArgumentException();
			}
			ecobikeCatalog.add(ecobike);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			System.out.println();
		}
	}

	public void addFoldingBike(FoldingBike fb) {
		Ecobike ecobike = new Ecobike();
		ecobike = fb;
		ecobikeCatalog.add(ecobike);
	}

	public void addSpeedelec(Speedelec se) {
		Ecobike ecobike = new Ecobike();
		ecobike = se;
		ecobikeCatalog.add(ecobike);
	}

	public void addEBike(EBike eb) {
		Ecobike ecobike = new Ecobike();
		ecobike = eb;
		ecobikeCatalog.add(ecobike);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Ecobike ecobike : ecobikeCatalog) {
			if (ecobike != null) {
				sb.append(ecobike.toString());
				sb.append(System.lineSeparator());
			}
		}
		return sb.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ecobikeCatalog == null) ? 0 : ecobikeCatalog.hashCode());
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
		EcoBikeList other = (EcoBikeList) obj;
		if (ecobikeCatalog == null) {
			if (other.ecobikeCatalog != null)
				return false;
		} else if (!ecobikeCatalog.equals(other.ecobikeCatalog))
			return false;
		return true;
	}

}
