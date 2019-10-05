import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class MyNameIsKhan {

	/*
	 * Complete the function below.
	 */
	static String findQualifiedNumbers(int[] numberArray) {
		if(numberArray.length <= 0) 
			return "-1";	

		int[] integerArray = new int[numberArray.length];
		int incr = 0;
		for (int i = 0; i < numberArray.length; i++) {
			String integerString = Integer.toString(numberArray[i]);
			if(integerString.contains("1") && integerString.contains("2") && integerString.contains("3")) {
				integerArray[incr] = numberArray[i];
				incr +=1;
			}
		}

		if(incr == 0)
			return "-1";

		for(int i =0; i<incr;i++) {
			for(int j=i;j<incr;j++) {
				if(integerArray[i] > integerArray[j]) {
					int swap = integerArray[i];
					integerArray[i] = integerArray[j];
					integerArray[j] = swap;
				}
			}
		}

		String resString ="";

		for(int integer : integerArray) {
			if(integer > 0)
				resString = resString + integer +",";
		}


		return resString.substring(0,resString.lastIndexOf(","));	
	}


	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		final String fileName = System.getenv("OUTPUT_PATH");
		BufferedWriter bw = null;
		if (fileName != null) {
			bw = new BufferedWriter(new FileWriter(fileName));
		}
		else {
			bw = new BufferedWriter(new OutputStreamWriter(System.out));
		}

		String res;
		int numberArray_size = 0;
		numberArray_size = Integer.parseInt(in.nextLine().trim());

		int[] numberArray = new int[numberArray_size];
		for(int i = 0; i < numberArray_size; i++) {
			int numberArray_item;
			numberArray_item = Integer.parseInt(in.nextLine().trim());
			numberArray[i] = numberArray_item;
		}

		res = findQualifiedNumbers(numberArray);
		bw.write(res);
		bw.newLine();

		bw.close();
	}
}
