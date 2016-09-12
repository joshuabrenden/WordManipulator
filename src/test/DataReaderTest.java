package test;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

import com.DataReader;

import junit.framework.TestCase;

public class DataReaderTest extends TestCase {
	
	private String[] fullFilePathArgs;
	
	@Override
    protected void setUp() throws Exception{
		String relativeFilePath = new File("").getAbsolutePath();
		String fileName = "/src/doc/input.txt";
		fullFilePathArgs[0] = relativeFilePath + fileName;
    }
	
	@Test
	public void testGetDataFromFile() {
		assertNotNull(DataReader.getDataFromFile(fullFilePathArgs));
	}
}
