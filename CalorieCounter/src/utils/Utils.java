//Utils class will calculate and output

package utils;

import java.util.*;
import food.Macronutrients;
import java.util.Scanner;


public class Utils{

  public static void Header(){
	  System.out.println("========================================================================================");
	  System.out.println("This will calculate your BMI and Macronutrients for the foods you have eaten or will eat");
      System.out.println("========================================================================================");
      
  }

  
 public void Macromath (Macronutrients Macros) {
	 
  float fatcals = Macros.getFats() * 9;
  float carbcals = Macros.getCarbs() * 4;
  float fibercals = Macros.getFiber() * 2;
  float proteincals = Macros.getProtein() * 4;
  float totalcal = fatcals + carbcals + fibercals + proteincals;
  System.out.println("\n========================================================================================");
  System.out.println("                             Calories you have consumed ");
  System.out.println("========================================================================================");
  System.out.println("Fats: " + fatcals);
  System.out.println("Carbs: " + carbcals);
  System.out.println("Fibers: " + fibercals);
  System.out.println("Protein: " + proteincals);
  System.out.println("Total Calories consumed: " + totalcal);
  
  

 }
  
 public void FoodSuggestions() {
	 
	  System.out.println("\n========================================================================================");
	  System.out.println("                                Food Suggestions ");
	  System.out.println("========================================================================================");
	  System.out.println("High in Healthy Fats: \nAvacado, Salmon, Nuts, Dairy Products, Fish");
	  System.out.println("Low in Healthy Fats: \nVegetables, Fruits, Nonfat & low-fat products, Egg whites");
	  System.out.println("--------------------------------------------------------------------------------------");
	  System.out.println("High in Healthy Carbs: \nWhole grains, White rice, Wheat bread, beans, WHole eggs");
	  System.out.println("Low in Healthy Carbs: \nEgg whites, Vegetables, Greek yogurt, Fish, Sugar free dairy products");
	  System.out.println("--------------------------------------------------------------------------------------");
	  System.out.println("High in Healthy Fibers: \nBeans, Fruits, Chia seeds, Nuts & Seeds, Avacados");
	  System.out.println("Low in Healthy Fibers: \nCereal, Meats, Pasta, Rice, Baked goods");
	  System.out.println("--------------------------------------------------------------------------------------");
	  System.out.println("High in Healthy Proteins: \nChicken breast, Salmon, Whole eggs, Brown rice, Lentils, Tofu");
	  System.out.println("Low in Healthy Proteins: \nFruits, Vegetable, Healthy fats, Grains");
	  System.out.println("--------------------------------------------------------------------------------------");
	 
 }
  }

