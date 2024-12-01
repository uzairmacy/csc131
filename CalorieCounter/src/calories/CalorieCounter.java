package calories;

import java.util.ArrayList;
import java.util.List;

import user.User;
import food.Macronutrients;
import utils.Utils;

public class CalorieCounter {
	public static void main(String args[]) {
		User newUser = new User(null, 0, 0, 0, null);
		newUser.getUserInfo();
		
		System.out.println("Hey " + newUser.get);
		
		List<Macronutrients> macros = new ArrayList<>();
		Macronutrients tmpMacros = new Macronutrients(null, 0, 0, 0, 0, 0);
		tmpMacros.getMacros();
		macros.add(tmpMacros);
		
		
	}
}
