package firstproject;

import java.util.Arrays;

public class Main {
//every project needs a main.java file
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int age = 13;
		double speed = 3.66;
		double secondNumber =  156.01;
		boolean isStudent = true;
				
		for (int i = 0; i <= 20; i++) {
			System.out.println("Im a student " + i);
		}
		
		int j = 0;
		while (j < 20 ) {
			System.out.println("I'm a student " + j);
			j = j +1;
		}
		
		
		if (age >= 18) {
			System.out.println("You are an adult!");
		} else {
			System.out.println("You are a minor!");
		}*/
		
		int[] grades = {10, 5, 9, 7};
		//int myGrades = grades[0];
		
		//System.out.println(Arrays.toString(grades));
		//System.out.println(grades.length);
		
		for (int i = 0; i < grades.length; i++) {
			//System.out.println(grades[i]);
		}
		
		double[] numbers = {9.2, 3.3, 4.9, 6.9, 5.1};
		double sum = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];
		}
		double average = sum/numbers.length;
		System.out.println(average);
	}

}
