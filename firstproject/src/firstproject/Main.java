package firstproject;

public class Main {
//every project needs a main.java file
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 13;
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
		}
		
		
		
		
	}

}
