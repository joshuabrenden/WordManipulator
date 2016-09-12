package com;

import java.util.HashSet;
import java.util.List;

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
		Double averageLetters = WordStatistics.getAverageLetterCount(uniqueWords);
		List<String> reversedSentences = WordStatistics.getReversedSentences(data);
		System.out.println(reversedSentences);
	}

}
