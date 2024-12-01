package food;

import java.util.Scanner;


public class Macronutrients {
  private float fats;
  private String food;
  private float carbs;
  private float fiber;
  private float protein;
  private float calories;

  public Macronutrients(String food, float fats, float carbs, float fiber, float protein, float calories) {
    this.food = food;
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
  
  public float getCalories(){
    return calories;
  }
  
  public void setName(String food) {
	this.food = food;
  }
  
  public void setFats(float fats){
    this.fats = fats;
  }
  
  public void setCarbs(float carbs){
    this.carbs = carbs;
  }
  
  public void setFiber(float fiber){
    this.fiber = fiber;
  }
  
  public void setProtein(float protein){
    this.protein = protein;
  }
  
  public void setCalories(float calories){
    this.calories = calories;
  }
  public void getMacros() {
	   Scanner scanner = new Scanner(System.in);
	   System.out.println("What are you eating today big back?");
	   this.food = scanner.next();
	   System.out.print("Enter the amount of fats (g):");
	   this.fats = scanner.nextFloat();
	   System.out.print("Enter the amount of carbs (g):");    //Gets users age
	   this.carbs = scanner.nextFloat();
	   scanner.nextLine(); // Consume newline character
	   System.out.print("Enter the amount of fiber: ");    //Gets users height
	   this.fiber = scanner.nextFloat();
	   scanner.nextLine(); // Consume newline character
	   System.out.print("Enter the amount of protein: ");    //Gets users weight
	   this.protein = scanner.nextFloat();
	   scanner.nextLine(); // Consume newline character
	   scanner.close();
 }
}
