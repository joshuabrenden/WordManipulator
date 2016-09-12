package com;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;

public class WordStatistics {
	
	private WordStatistics(){
		
	}
	
	public static HashSet<String> getUniqueWords(String words){
		return (new HashSet<String>(getLowercaseWordList(words)));
	}

	private static List<String> getLowercaseWordList(String words){
		return Arrays.asList(words.split(", |\\. |\\ |\\."))
			   .stream()
			   .map(String::toLowerCase)
		       .collect(Collectors.toList());
	}
	
	public static HashSet<String> getPalindromes(HashSet<String> words){
		return words
			  .stream()
			  .filter(word -> WordStatistics.isPalindrome(word))
			  .collect(Collectors.toCollection(HashSet::new));
	}
	
	private static boolean isPalindrome(String word){
		return StringUtils.equalsIgnoreCase(word, (new StringBuilder(word).reverse()));
	}
	
	public static Double getAverageLetterCount(HashSet<String> words){
		return null;
	}
	
}
