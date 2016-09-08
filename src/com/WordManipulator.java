package com;

public class WordManipulator {

	public static void main(String[] args) {
		String filePath = DataReader.getFileFromArgs(args);
		String data = DataReader.getDataFromFile(filePath);
		System.out.println(data);
	}

}
