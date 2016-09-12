package com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public final class DataReader {
	
	public DataReader(){
		
	}
	
	public static String getFileFromArgs(String[] args){
		String filePath = null;
		
		if(args != null && args.length != 0){
			filePath = args[0];
		} else {
			filePath = UserPrompt.getFilePathFromUser();
		}
		
		return filePath;
	}
	
	public static String getDataFromFile(String filePath){
		String data = null;
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader(filePath));
			StringBuilder stringBuilder = new StringBuilder();
			
			String line = null;
			while ((line = br.readLine()) != null) {
				stringBuilder.append(line);
			}
			
			data = stringBuilder.toString();
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			closeQuietly(br);
		}	 
		
		return data;
	}

	private static void closeQuietly(BufferedReader br) {
		try {
			
			if(br != null){
				br.close();
			}
		} catch(IOException e){
			e.printStackTrace();
		}
	}
}
