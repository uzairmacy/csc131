package utils;

import java.util.*;
import food.Macronutrients;
import java.util.Scanner;


public class Utils{

  public static void Header(){
      System.out.println("This will Calculate your BMI and Macronutrients for the foods you have or will eat");
      System.out.println("First step is to push the macronutrients up hamzas ass until his lemmas have been pumped n hes legal");
      
  }

  
 public void Macromath (Macronutrients Macros) {
	 
  float fatcals = Macros.getFats() * 9;
  float carbcals = Macros.getCarbs() * 4;
  float fibercals = Macros.getFiber() * 2;
  float proteincals = Macros.getProtein() * 4;
  float totalcal = fatcals + carbcals + fibercals + proteincals;
  
  
  System.out.println("Total Calories from Fats: " + fatcals);
  System.out.println("Total Calories from Carbs: " + carbcals);
  System.out.println("Total Calories from Fibers: " + fibercals);
  System.out.println("Total Calories from Protein: " + proteincals);
  System.out.println("Total Calories consumed: " + totalcal);

 }
  
 
  }

