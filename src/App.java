
import java.time.Year;
import java.util.Arrays;
import java.util.stream.IntStream;

import javax.management.loading.PrivateClassLoader;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

public class App {

	public static void main(String[] args) {
		
		// Question 1
		
		//Part A
		
		int[] ages = {3, 9, 23, 64, 2, 8, 28};
		
		int lengthOfArr = ages.length;
		int difference = Math.abs(ages[lengthOfArr - lengthOfArr] - ages[lengthOfArr - 1]);
		
		System.out.println("Difference of first and last element in ages[] = " + difference);
		
		int[] newAges = new int[ages.length];
		
		System.arraycopy(ages,  0, newAges, 0, ages.length);
		
		//Part B
		
		lengthOfArr = newAges.length;
		newAges[lengthOfArr - 1] = 45;
		difference = Math.abs(newAges[lengthOfArr - lengthOfArr] - newAges[lengthOfArr - 1]);
		
		System.out.println("Difference of first and last element in newAges[] = " + difference);
		
		//Part C
		
		int sum = 0;
		for (int i = 0; i < newAges.length; i++) {
			sum += newAges[i];
		}
		double average = sum / lengthOfArr;
		System.out.println("The average age in newAges[] = " + average );
		
		// Question 2 
		 
		//Part A
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		sum = 0;
		for (int i = 0; i < names.length; i++) {
			sum += names[i].length();
		}
		average = sum / names.length;
		System.out.println("The average number of letters per name in names[] = " + average );
		
		//Part B
		String allNames = "";
		for (int i = 0; i < names.length; i++) {
			allNames += names[i] + " ";
		}
		System.out.println(allNames);
		
		// Question 3
		 
		
		System.out.println("Use array[arr.length] to access the last element of an array");
		
		// Question 4
		
		System.out.println("Use array[0] to access the first element of an array");
		
		// Question 5
		
		int[] nameLengths = new int[names.length];
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length(); 
		}
		
		// Question 6
		
		sum = 0;
		for (int i = 0; i < nameLengths.length; i++) {
			sum += nameLengths[i];
		}
		System.out.println("The sum of all lengths in nameLengths[] = " + sum);
		
		// Question 7
		
		System.out.println(duplicateWord("Hello", 3));
		
		// Question 8
		
		System.out.println(getFullName("Misty", "Lingle"));
		
		// Question 9
		
		System.out.println("checkIfSumGreaterThan100() returns => " + checkIfSumGreaterThan100(ages));
		
		// Question 10
		
		double[] doubleArr = {4, 10, 278, 3548};
		double[] emptyDoubleArr = {};
		System.out.println("getAverageOfDoubleArr() returns => " + getAverageOfDoubleArr(doubleArr));
		System.out.println("Passing empty double[] to getAverageOfDoubleArr() returns => " + getAverageOfDoubleArr(emptyDoubleArr));
	
		// Question 11 
		
		double[] anotherDoubleArr = {9, 15, 45, 56};
		System.out.println("isFirstArrAvgGreater returns => " + isFirstArrAvgGreater(doubleArr, anotherDoubleArr));
		
		// Question 12 
		double moneyInPocket = 0;
		int temperature = 0;
		if ( moneyInPocket < 10.50 || (temperature >= 80)){
			System.out.println("I will buy a drink");
		}
	}		
		// Question 13
		
		public static String moneyAvailable(int moneyInBank, int costOfGas) {
			if (moneyInBank >= costOfGas) {
				return "yes";
			}
			return "no";

	}
	
	
	private static Object String (int i) {
		// TODO Auto-generated method stub
		return null;
	}

	private static String duplicateWord(String word, int n) {
		String duplicatedWord = "";
		for (int i = 0; i < n; i++) {
			duplicatedWord += word;
		}
		return "duplicatedWord() returns => " + duplicatedWord;
	}
	
	private static String getFullName(String firstName, String lastName) {
		return "getFullName() returns => " + firstName + " " + lastName;
	}
	
	private static Boolean checkIfSumGreaterThan100(int[] arr) {
		return Arrays.stream(arr).sum() > 100;
	}
	
	private static double getAverageOfDoubleArr(double[] arr) {
		// We need to use .orElse() in case an empty array is passed in
		return Arrays.stream(arr).average().orElse(Double.NaN);
	}
	
	private static boolean isFirstArrAvgGreater(double[] firstArr, double[] secondArr) {
		return getAverageOfDoubleArr(firstArr) > getAverageOfDoubleArr(secondArr); 
	}
	
}