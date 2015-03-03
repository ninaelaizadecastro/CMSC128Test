/*
 * Author: Marie Betel B. de Robles
 * Program Description: This program computes for user's BMI and identifies the corresponding status.
 */

import java.util.Scanner;

public class BMICalc {
  public static void main(String[] args) {
    Scanner stdin;
    double weight, height, result;
    
    stdin = new Scanner(System.in);
    System.out.print("Weight (kg): ");
    weight = stdin.nextDouble();
    System.out.print("Height (m): ");
    height = stdin.nextDouble();

    result = computeBMI(height, weight);
	System.out.printf("%n Your BMI is " + Math.round(result) + ".");
	System.out.printf("%n You are " + getStatus(result) + ".");
  }
  
  public static double computeBMI(double height, double weight){
	  return (weight / (height * height));
  }
  
  public static String getStatus(double result) {
	  if (result < 18.5) {
		  return "underweight";
	  } else if (result < 25) {
		  return "normal";
	  } else if (result < 30) {
		  return "overweight";  
	  } else {
		  return "obese";
	  }	
  }
	
}