package Regex;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void main(String args[]) {
		// The regex pattern
		final String REGEX_PATTERN = "fooa*bar";
		final String inputFileName = "C:\\Users\\brijesh.rawat\\Downloads\\ExerciseInputFiles\\regex01.txt";
		// Create a Pattern object
		Pattern r = Pattern.compile(REGEX_PATTERN);

//		// Read the input file line by line
//		try (BufferedReader bufferedReader = new BufferedReader(
//				new InputStreamReader(Regex.class.getClassLoader().getResourceAsStream("testout.txt")))) {
//			String line;
//			while ((line = bufferedReader.readLine()) != null) {
//
//				// Now create matcher object.
//				Matcher m = r.matcher(line);
//
//				// Apply the regex pattern to each line
//				// If pattern matches, output the current line.
//				if (m.find()) {
//					System.out.println(line);
//				}
//
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\brijesh.rawat\\Downloads\\ExerciseInputFiles\\regex01.txt"));
			String line = bufferedReader.readLine();
			
			
		
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
				Matcher m = r.matcher(line);

				if (m.find()) {
					System.out.println(line);
				}

			}
			
			bufferedReader.close();
			} catch (IOException e) {
			System.out.println("Error while retrieving data…");
			}
    	

	}}


