package calories;

import java.util.ArrayList;
import java.util.List;

import user.User;
import food.Macronutrients;
import utils.Utils;

public class CalorieCounter {
	public static void main(String args[]) {
		Utils utils = new Utils();
		
		User newUser = new User(null, 0, 0, 0, null);
		newUser.getUserInfo();
		
		System.out.println("heres your bmi " + String.format("%.2f", newUser.BMI()));
		
		
		System.out.println("Hey " + newUser.getFullName() + "! What did you eat today?");
		
		List<Macronutrients> macros = new ArrayList<>();
		Macronutrients tmpMacros = new Macronutrients(null, 0, 0, 0, 0, 0);
		tmpMacros.getMacros();
		macros.add(tmpMacros);
		
		utils.Macromath(tmpMacros);
		
	}
}
