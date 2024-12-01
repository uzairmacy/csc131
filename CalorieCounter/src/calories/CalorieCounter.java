package calories;

import java.util.ArrayList;
import java.util.List;

import user.User;
import food.Macronutrients;
import utils.Utils;

public class CalorieCounter {
	public static void main(String args[]) {
		Utils utils = new Utils();
		utils.Header();
		
		User newUser = new User(null, 0, 0, 0, null, 0);
		newUser.getUserInfo();
		
		System.out.println("Here's your BMI: " + String.format("%.2f", newUser.BMI()));
		
		float waterNeeded = newUser.WaterNeededaDay();
		
		System.out.println("You should be drinking this much more/less oz of water a day: " + waterNeeded);
		
		
		System.out.println("Hey " + newUser.getFullName() + "! What did you eat today?");
		
		List<Macronutrients> macros = new ArrayList<>();
		Macronutrients tmpMacros = new Macronutrients(null, 0, 0, 0, 0, 0);
		tmpMacros.getMacros();
		macros.add(tmpMacros);
		
		utils.Macromath(tmpMacros);
		
	}
}
