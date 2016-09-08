package com;

public class WordManipulator {

	public static void main(String[] args) {
		
		String filePath = args[0];
		String data = DataReader.getDataFromFile(filePath);
		System.out.println(data);
	}

}
