package user;

import java.util.Scanner;


class User{                      //Define all the classes and methods here
      private String fullName;
      private int age;
      private float height;
      private float weight;
      private String gender;

  //Setting variables to the proper names
  public User(String name, int age, float weight, float height, String gender){
     this.fullName= name;
     this.age= age;
     this.weight= weight;
     this.height= height;
     this.gender= gender;
  }


  private float BMI(){
      float BMI = weight/(height*height);
      return BMI;

  }
 public void getUserInfo(){

   Scanner scanner = new Scanner(System.in);
  System.out.print("Enter your full name: "); //Gets users Full name
  fullName = scanner.nextLine();
  System.out.print("Enter your age: ");    //Gets users age
  age = scanner.nextInt();
  scanner.nextLine(); // Consume newline character
  System.out.print("Enter your height (in inches): ");    //Gets users height
  height = scanner.nextFloat();
  scanner.nextLine(); // Consume newline character
  System.out.print("Enter your weight in (lbs): ");    //Gets users weight
  gender = scanner.nextLine();
  scanner.nextLine(); // Consume newline character
  System.out.print("Enter your gender (M/F): ");    //Gets users gender
  gender = scanner.nextLine();
  scanner.close();
 }
}