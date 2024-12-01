package food;

import java.util.scanner


public class Macronutrients{
  private float fats; 
  private float carbs;
  private float fiber;
  private float protein;
  private float calories;

  public Macronutrients(float fats, float carbs, float fiber, float protein, float calories){
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
  public float getprotein(){
    return protein;
  }
  public float getCalories(){
    return calories;
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
  public void printMacronutrients()



System.out.println("Fats: " + fats + "g");

System.out.println("Carbs: " + carbs + "g");

System.out.println("Fiber: " + fiber + "g");

System.out.println("Protein: " + protein + "g");






}

