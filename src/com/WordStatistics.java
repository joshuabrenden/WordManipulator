package com;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class WordStatistics {
	
	public WordStatistics(){
		
	}
	
	public static HashSet<String> getUniqueWords(String words){
		return (new HashSet<String>(getLowercaseWordList(words)));
	}

	private static List<String> getLowercaseWordList(String words){
		return Arrays.asList(words.split(", |\\. |\\ |\\."))
			  .stream()
			  .map(String::toLowerCase)
			  .map(w -> w.replaceAll(" ", ""))
		      .collect(Collectors.toList());
	}
	
	public static HashSet<String> getPalindromes(HashSet<String> words){
		return words
			  .stream()
			  .filter(word -> WordStatistics.isPalindrome(word))
			  .collect(Collectors.toCollection(HashSet::new));
	}
	
	private static boolean isPalindrome(String word){
		return word.equals(new StringBuilder(word).reverse().toString());
	}
	
	public static Double getAverageLetterCount(HashSet<String> words){
		return words
			  .stream()
			  .mapToDouble((w) -> w.length())
			  .summaryStatistics()
			  .getAverage();
	}
	
	public static List<String> getReversedSentences(String words){
		
		return Arrays.asList(words.split("(?<=[a-z])\\.\\s+"))
			  .stream()
			  .map(w -> new StringBuilder(w).reverse().toString())
			  .collect(Collectors.toList());	
	}
}
