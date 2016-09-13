package com;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
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
	
	public void printFormattedResults(){
		 try {
			FileWriter fileWriter = new FileWriter("output.txt");
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write(getFormattedResults());
			bufferedWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private String getFormattedResults(){
		return (new StringBuilder()
		.append("There are ")
		.append(uniqueWords.size())
		.append(" unique words: ")
		.append(uniqueWords)
		.append(System.getProperty("line.separator"))
		.append(palindromes.size())
		.append(" of them are palindromes: ")
		.append(palindromes)
		.append(System.getProperty("line.separator"))
		.append("The average number of letters per word is: ")
		.append(averageLetters)
		.append(System.getProperty("line.separator"))
		.append("The sentences in reverse are: ")
		.append(reversedSentences).toString());
	}
}
