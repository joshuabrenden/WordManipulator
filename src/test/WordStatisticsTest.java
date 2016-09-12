package test;

import static org.junit.Assert.*;

import java.util.HashSet;

import org.junit.Before;
import org.junit.Test;

import com.WordStatistics;

public class WordStatisticsTest {
	private String words = "a, ac aC accumsan. aenean, Aenean aliquam aliquet, amet amet. ante non";
	private HashSet<String> wordSet;
	
	@Before
	public void setUp() throws Exception {
		wordSet = WordStatistics.getUniqueWords(words);
	}

	@Test
	public void testGetUniqueWords() {
		assertEquals(wordSet.size(), 9);
	}

	@Test
	public void testGetPalindromes() {
		assertEquals(WordStatistics.getPalindromes(wordSet).size(), 2);
	}

	@Test
	public void testGetAverageLetterCount() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetReversedSentences() {
		fail("Not yet implemented");
	}

}
