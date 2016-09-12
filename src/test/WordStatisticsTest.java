package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.WordStatistics;

public class WordStatisticsTest {
	
	private String words = "a, ac, aC, accumsan, aenean, Aenean, aliquam, aliquet, amet, amet. ante";

	@Test
	public void getUniqueWordsTest() {
		assertEquals(WordStatistics.getUniqueWords(words).size(), 8);
	}

}
