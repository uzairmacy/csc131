    package calories;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import user.User;
import food.Macronutrients;
import utils.Utils;

public class CalorieCounter {
	public static void main(String args[]) {
		Utils utils = new Utils();
		char answer = ' ';
		Scanner scanner = new Scanner(System.in);
		
		utils.Header();
		
		User newUser = new User(null, 0, 0, 0, null, 0);
		newUser.getUserInfo();
		
		System.out.println("\n================================================================================================");
		System.out.println("Thank you for the information, here is you bmi and how much more water you need to drink.");
		System.out.println("================================================================================================");
		
		System.out.println("Your BMI: " + String.format("%.2f", newUser.BMI()));
		
		float waterNeeded = newUser.WaterNeededaDay();
		
		System.out.println("You should be drinking this much more/less ounces of water a day: " + waterNeeded);
		
		System.out.println("\n================================================================================================");
		System.out.println("Hey " + newUser.getFullName() + "! Now list me what you ate today.");
		System.out.println("================================================================================================");
		
		List<Macronutrients> macros = new ArrayList<>();
		Macronutrients tmpMacros = new Macronutrients(null, 0, 0, 0, 0, 0);
		tmpMacros.getMacros();
		macros.add(tmpMacros);
		
		utils.Macromath(tmpMacros);
		System.out.println("\n\n================================================================================================");
		System.out.println("Would you like to see some healthy food suggestions? (Enter Y or y, any other charecter to exit.)");
		System.out.println("================================================================================================");
		answer = scanner.next().charAt(0);
		if(answer == 'Y' || answer == 'y') {
			
			utils.FoodSuggestions();
			
		}
		else {
			System.out.println("Program exited, have a good day.");
		}
		scanner.close();
		
	}
}
