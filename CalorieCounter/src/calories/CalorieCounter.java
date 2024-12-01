package calories;

import user.User;
import food.Macronutrients;
import utils.Utils;

public class CalorieCounter {
	public static void main(String args[]) {
		User newUser = new User(null, 0, 0, 0, null);
		newUser.getUserInfo();
		Macronutrients macros = new Macronutrients(null, 0, 0, 0, 0, 0);
		macros.getMacros();
		
		
	}
}
