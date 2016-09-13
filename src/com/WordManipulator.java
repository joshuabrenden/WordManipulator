package com;

import java.util.HashSet;
import java.util.List;

public class WordManipulator {

	public static void main(String[] args) {
		WordManipulator wordManipulator = new WordManipulator();
		wordManipulator.execute(args);
	}
	
	private void execute(String[] args){
		String data = DataReader.getDataFromFile(args);
		
		HashSet<String> uniqueWords = WordStatistics.getUniqueWords(data);
		List<String> palindromes = WordStatistics.getPalindromes(uniqueWords);
		Double averageLetters = WordStatistics.getAverageLetterCount(uniqueWords);
		List<String> reversedSentences = WordStatistics.getReversedSentences(data);
		
		Results results = new Results(uniqueWords, palindromes, averageLetters, reversedSentences);
		results.printFormattedResults();
	}

}
