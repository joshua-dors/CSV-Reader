package reader;

/*
 * Author: Joshua Dors
 * Date: June 4th, 2021
 */

// imports for input
import java.util.Scanner;

//imports for output
import java.io.File;
import java.io.FileWriter;

public class CSVReader {
	public static void main(String[] args) throws Exception {

		// SET CSV LENGTH 	
		int csv_length = 308;
		
		//array length
		int array_length = (csv_length * 2);

		// filename
		String filename = "/Users/joshuadors/Desktop/BodyTypes.tsv";

		// reading in file from url(filename)
		Scanner sc = new Scanner(new File(filename));

		// array to store csv
		String[] makeModel = new String[array_length];

		// new output file
		FileWriter myWriter = new FileWriter("/Users/joshuadors/Desktop/BodyTypeTSV_NEW.txt");

		int i = 0;

		while (sc.hasNext()) {
			makeModel[i] = sc.next();		
			i++;
		}

		sc.close(); // closes the scanner
		
		try {
			for (int p = 0; p < makeModel.length; p += 2) {
				myWriter.write("if(value.contains(" + "\"" + makeModel[p] + "\"" + ")) {" + " bodyType = " + "\"" + makeModel[p + 1]
						+  "\"" + "; }" + "\n");
				myWriter.flush();
			}
		} finally {
			myWriter.close();
		}
	}
}
