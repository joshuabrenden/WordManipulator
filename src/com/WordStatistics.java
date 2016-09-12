package com;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class WordStatistics {
	
	public WordStatistics(){
		
	}
	
	/* 
	 * To accomplish the task of removing duplicate words, I added the words to a HashSet. 
	 * Since the properties of a HashSet do not allow nulls, and has add performance of O(1), 
	 * it was a concise and efficient solution.
	 */
	public static HashSet<String> getUniqueWords(String words){
		return (new HashSet<String>(getLowercaseWordList(words)));
	}

	/*	
	 * Before adding the words to the HashSet, the data needed to be adjusted slightly. 
	 * The string containing all of the data from the file first needs to split apart
	 * by several possible delimiters. Due to the rules given, capitalization isn't 
	 * important, so all words are made lower case and all extra spaces are removed. 
	 */
	private static List<String> getLowercaseWordList(String words){
		return Arrays.asList(words.split(", |\\. |\\ |\\."))
			  .stream()
			  .map(String::toLowerCase)
			  .map(w -> w.replaceAll(" ", ""))
		      .collect(Collectors.toList());
	}
	
	/* 
	 * All non-palindromes are filtered from the HashSet using Java 8 streams.
	 */
	public static List<String> getPalindromes(HashSet<String> words){
		return words
			  .stream()
			  .filter(word -> WordStatistics.isPalindrome(word))
			  .collect(Collectors.toList());
	}
	
	/* 
	 * The method to check if a word is a palindrome is quite simple. It compares the
	 * original string with its reversal using StringBuilder's reverse method.
	 */		
	private static boolean isPalindrome(String word){
		return word.equals(new StringBuilder(word).reverse().toString());
	}
	
	/* 
	 * The length of each word is collected and then averaged using the getAverage 
	 * function from the DoubleSummaryStatisticts class.
	 */
	public static Double getAverageLetterCount(HashSet<String> words){
		return words
			  .stream()
			  .mapToDouble((w) -> w.length())
			  .summaryStatistics()
			  .getAverage();
	}
	
	/* The entire data file is split into sentences using a regex that identifies 
	 * a lower case letter followed by a period and whitespace. Each element is then
	 * reversed and collected into a list
	 */ 
	public static List<String> getReversedSentences(String words){
		
		return Arrays.asList(words.split("(?<=[a-z])\\.\\s+"))
			  .stream()
			  .map(w -> new StringBuilder(w).reverse().toString())
			  .collect(Collectors.toList());	
	}
}
