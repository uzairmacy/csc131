package utils;

import java.util.*;
import food.Macronutrients;
import java.util.Scanner;


public class Utils{

  public static void Header(){
      System.out.println("This will Calculate your BMI and Macronutrients for the foods you have or will eat");
      System.out.println("First step is to push the macronutrients up hamzas ass until his lemmas have been pumped n hes legal");
      
  }

  public void getMacros() {
	   Scanner scanner = new Scanner(System.in);
	   System.out.print("Enter the amount of fats (g):");
	   fullName = scanner.nextLine();
	   System.out.print("Enter the amount of carbs (g):");    //Gets users age
	   age = scanner.nextInt();
	   scanner.nextLine(); // Consume newline character
	   System.out.print("Enter the amount of fiber: ");    //Gets users height
	   height = scanner.nextFloat();
	   scanner.nextLine(); // Consume newline character
	   System.out.print("Enter the amount of protein: ");    //Gets users weight
	   gender = scanner.nextLine();
	   scanner.nextLine(); // Consume newline character
	   scanner.close();
  }




}