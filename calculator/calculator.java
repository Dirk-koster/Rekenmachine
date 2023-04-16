package calculator;
	
public class calculator {

		public static int add(int number1, int number2) {
			int optellen = number1 + number2;
			System.out.println(number1+" + "+number2+" = "+optellen);
			
			return 0;
		}

		public static int subtract(int number1, int number2) {
			int aftrekken = number1 - number2;
			System.out.println(number1+" - "+number2+" = "+aftrekken);
			return 0;
		}

		public static int multiply(int number1, int number2) {	
			int antwoord = 0;
		for (int x= number2;x>0;x--)
				antwoord=antwoord+number1;
			System.out.println(number1+" x "+number2+" = "+antwoord);
			return 0;}
	
		static double devide(int number1, int number2) {
			// HINT: misschien kan je de methode subtract hierbij gebruiken.
			int z = number1;
			for(int i =number2;i>number1;i++)
				z=z+number1;
			System.out.println(number1+"/"+number2+"="+z);
			return 0;
		}	
		public static int square(int number1) {
			// HINT: multiply???
			int i= 2;
			System.out.println(Math.pow(number1, i));
			return 0;
		}
		
		public static int exponentiation(int number1, int number2) {
			// HINT: multiply???
			
			System.out.println(number1+" tot de macht "+number2+" = "+Math.pow(number1, number2));
			return 0;
		}	
	}
		
	
