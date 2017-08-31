import java.util.Scanner;

public class FortuneSeek {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in); 
		

		String firstName;
		String lastName;
		int age;
		int birthMonth;
		String favColor;
		int siblings;

			
		
		System.out.print("What is your first name? ");
		 firstName = input.next();
		
		System.out.print("What is your last name? ");
		 lastName = input.next();
		
		System.out.print("How old are you? ");
		 age = input.nextInt();
		 
			if (age % 2 == 0) {
				age = "You will join the Illuminati.";
		
		}
			else {
				age = "You will find the Key to the Matrix.";
			
			}
		
	
		System.out.print("What is your birth month? ");
		 birthMonth = input .nextInt();
		
		
		System.out.print("How many siblings do you have? ");
		 siblings = input.nextInt();
		
		
		
		if (siblings < 0) {
           siblings = "You will live in the Ghost Realm";
		}
		
		else if (siblings > 3) {
			siblings = "You live with the inner terrestrials of Earth.";
		}
		else 
			siblings = "You will live in the very home you imagine.";
		
			
		System.out.println("What is your favorite ROYGBIV color? ");
		
		System.out.println("If You don't know the acronym for ROYGBIV type in 'help'.");
			favColor = input.next();
			
			if (favColor.equals)
		
		if (favColor.equals("red")) {
			favColor = "A broom stick will be your mode of transportation.";
			
		}	else if (favColor.equals("blue")) {

		favColor = "Hoverboard";
		}
		if (favColor.equals("green")) {
			favColor = "Scooter.";
		
		}
		else if (favColor.equals("orange")) {
			favColor = "Dark Matter Skates.";
		
		} 
		
		
		if (favColor.equals("yellow")) {
			favColor = "A solar powered car will be your primary mode of transportation.";
		
		}
			
			else if (favColor.equals("violet")) {
				favColor = "A Honda Civic will be your Mode of tansportation.";
			
				
				
				
			}
					
		System.out.println(firstName + " " + lastName + " You will join the illuminati", will );
		
			
			}
		
		
		
	
	}

}
