package food;

import java.util.Scanner;
import java.util.*;


public class Macronutrients {
  private String name;
  private float fats;
  private float carbs;
  private float fiber;
  private float protein;
  private float calories;

  public Macronutrients(String name, float fats, float carbs, float fiber, float protein, float calories) {
    this.name = name;
	this.fats = fats;
    this.carbs = carbs;
    this.fiber = fiber;
    this.protein = protein;
    this.calories = calories;
  }

  public float getFats(){
    return fats;
  }
  
  public float getCarbs(){
    return carbs;
  }
  
  public float getFiber(){
    return fiber;
  }
  
  public float getProtein(){
    return protein;
  }
  
  public void getMacros() {
	   Scanner scanner = new Scanner(System.in);
	   System.out.println("Enter the food you've eaten:");
	   name = scanner.nextLine();
	   System.out.print("Enter the amount of fats (g):");
	   fats = scanner.nextFloat();
	   System.out.print("Enter the amount of carbs (g):");    //Gets users age
	   carbs = scanner.nextFloat();
	   scanner.nextLine(); // Consume newline character
	   System.out.print("Enter the amount of fiber: ");    //Gets users height
	   fiber = scanner.nextFloat();
	   scanner.nextLine(); // Consume newline character
	   System.out.print("Enter the amount of protein: ");    //Gets users weight
	   protein = scanner.nextFloat();
	   scanner.nextLine(); // Consume newline character
	   scanner.close();
 }
}
