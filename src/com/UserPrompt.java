package com;

import java.util.Scanner;

public final class UserPrompt {
	
	private UserPrompt() {
		
	}
	
	private static void sendInvalidFileMessage(){
		System.out.println("Please enter the full path of the file.\nWindows: Example\nLinux: Example\nMac: Example");
	}
	
	public static String getFilePathFromUser(){
		String filePath = null;
		Scanner scanner = new Scanner(System.in);
		
		sendInvalidFileMessage();
		filePath = scanner.nextLine();
		scanner.close();
		
		return filePath;
	}
	
	
}
