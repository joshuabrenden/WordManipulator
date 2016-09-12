package com;

import java.util.HashSet;
import java.util.List;

public class Results {
	private HashSet<String> uniqueWords;
	private List<String> palindromes;
	private Double averageLetters;
	private List<String> reversedSentences;

	public Results (HashSet<String> uniqueWords, List<String> palindromes, Double averageLetters,List<String> reversedSentences) {
		this.uniqueWords = uniqueWords;
		this.palindromes = palindromes;
		this.averageLetters = averageLetters;
		this.reversedSentences = reversedSentences;
	}

	public HashSet<String> getUniqueWords() {
		return uniqueWords;
	}

	public List<String> getPalindromes() {
		return palindromes;
	}

	public Double getAverageLetters() {
		return averageLetters;
	}

	public List<String> getReversedSentences() {
		return reversedSentences;
	}

}
