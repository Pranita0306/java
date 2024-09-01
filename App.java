package com.gfg.technicalscripter; 

import java.io.File; 
import java.io.FileNotFoundException; 

public class App { 
	public static void main(String[] args) 
		throws FileNotFoundException 
	{ 
		File file 
			= new File("src/main/java/student-list.json"); 
		String content = FileReaderUtility.readText(file); 
		System.out.print(content); 
		// Now we will get the correct output 
	} 
}
