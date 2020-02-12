package com.gmail.vskravtsov992;

import java.io.IOException;

public interface EcoBikeListDAO {

	public void saveEcoBikeList(EcoBikeList ecobikeList, String filename);

	public EcoBikeList loadEcoBikeList(String filename) throws IOException;

}
