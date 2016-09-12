package com;

import java.util.HashSet;

public class WordManipulator {

	public static void main(String[] args) {
		WordManipulator wordManipulator = new WordManipulator();
		wordManipulator.execute(args);
	}
	
	private void execute(String[] args){
		String filePath = DataReader.getFileFromArgs(args);
		String data = DataReader.getDataFromFile(filePath);
		HashSet<String> uniqueWords = WordStatistics.getUniqueWords(data);
		HashSet<String> palindromes = WordStatistics.getPalindromes(uniqueWords);
		System.out.println(palindromes.size());
		System.out.println(palindromes);
	}

}
