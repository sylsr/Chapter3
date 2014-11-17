package chapter3;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;
public class Exercises 
{
	public static void main(String [] args)
	{/*
		//EX 3.1
		String overview = "Nothing matters";
		int lenght=overview.length();
		System.out.println(overview);
		System.out.print("The length of that string is:");
		System.out.println(lenght);
		//----------------------------------------------------------------------------------------------------------------------------
		//EX 3.2
		String introduction ="Chemistry makes me suicidal.";
		char indexValue = introduction.charAt(8);
		System.out.println(introduction);
		System.out.print("The eight character of that string is:");
		System.out.println(indexValue);
		//----------------------------------------------------------------------------------------------------------------------------
		//EX 3.3
		String original = "Homework is ruining my life";
		System.out.println("The original string was:" + original);
		//I did 'i' to 'j' because my string did not have an 'e' in it.
		String change = original.replace('i', 'j');
		System.out.println("The new string is:" + change);
		//----------------------------------------------------------------------------------------------------------------------------
		// EX 3.7
		Random rand = new Random();
		int ten= rand.nextInt(11);
		System.out.println(ten);
		int fiveHundred = rand.nextInt(500);
		System.out.println(fiveHundred);
		int startOne = rand.nextInt(9)+1;
		System.out.println(startOne);
		int stopFiveHundred = rand.nextInt(499)+1;
		System.out.println(stopFiveHundred);
		int negative = rand.nextInt(25)-10;
		System.out.println(negative);
		//---------------------------------------------------------------------------------------------------------------------------
		// EX 3.8
		double num1, num2, num3;
		num1=15;
		num2=10;
		num3= Math.sqrt(num1+num2);
		System.out.println("The square root of " + num1 +" and " +num2+" is: " + num3);
		//--------------------------------------------------------------------------------------------------------------------------
		//EX 3.9
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a integer to take the absolute value of.");
		int total=Math.abs( scan.nextInt());
		System.out.println(total);
		//--------------------------------------------------------------------------------------------------------------------------
		//EX 3.10
		System.out.println("Enter a value to be rounded to four decimal places");
		double rounding=scan.nextDouble();
		double rounded = (double)Math.round((rounding)*10000)/10000;
		System.out.println("The rounded number is: " + rounded);
		//--------------------------------------------------------------------------------------------------------------------------
		//EX 3.11
		System.out.println("Enter a number to have the fourth power of");
		double power=scan.nextDouble();
		double finish= Math.pow(power, 4);
		System.out.println(power +" to the fourth power is: " +finish);
		//--------------------------------------------------------------------------------------------------------------------------
		//PP 3.1
		System.out.println("Type your first name");
		String firstName = scan.next();
		System.out.println("Type your last name");
		String lastName = scan.next();
		int randomNumber = rand.nextInt(90)+10;
		char firstLetterFirst = firstName.charAt(0);
		String fiveLettersLast = lastName.substring(0,4);
		System.out.println(firstLetterFirst+fiveLettersLast+randomNumber);
		//-------------------------------------------------------------------------------------------------------------------------
		//PP 3.2
		System.out.println("Enter an integer");
		int firstInt=scan.nextInt();
		System.out.println("Enter another integer");
		int secondInt=scan.nextInt();
		int finalNumber=  (int) ((Math.pow(firstInt, 3))+(Math.pow(secondInt, 3)));
		System.out.println("The sum of cubes is: " + finalNumber);
		//-------------------------------------------------------------------------------------------------------------------------
		//PP 3.3
		System.out.println("A random phone number will now be generated");
		int random=rand.nextInt(642)+100;
		int random3=rand.nextInt(900)+100;
		int random2=rand.nextInt(9000)+1000;
		System.out.println(random3+"-"+random+"-"+random2);
		//-------------------------------------------------------------------------------------------------------------------------
		//PP 3.4
		System.out.println("Enter in an 'x' coord");
		double xCoord= scan.nextDouble();
		System.out.println("Enter in an 'y' coord");
		double yCoord= scan.nextDouble();
		System.out.println("Enter in another 'x' coord");
		double xCoord2= scan.nextDouble();
		System.out.println("Enter in another 'y' coord");
		double yCoord2= scan.nextDouble();
		double distance= Math.sqrt(Math.pow((xCoord2-xCoord), 2)+ Math.pow((yCoord2-yCoord), 2));
		System.out.println("The distance between the two points is: " +distance);
		//--------------------------------------------------------------------------------------------------------------------------
		//PP 3.5
		System.out.println("Enter in the radius of a sphere");
		double radius = scan.nextDouble();
		double fourThirds=1.33333333333333;
		double volume = ((double)(fourThirds)*(Math.PI)*(Math.pow(radius, 3)));
		double surfaceArea= 4*(Math.PI)*(Math.pow(radius, 2));
		System.out.println(fourThirds);
		System.out.println("The volume is: " + volume);
		System.out.println("The surface area is: " + surfaceArea);*/
		//--------------------------------------------------------------------------------------------------------------------------
		//PP 3.6
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter three sides of a triangle");
		double a= scan.nextDouble();
		double b= scan.nextDouble();
		double c= scan.nextDouble();
		double s= (a+b+c)/2;
		double area= Math.sqrt(s*(s-a)*(s-b)*(s-c));
		double finalArea= (double)Math.round(area*1000)/1000;
		System.out.println("Now displaying the area of the triangle to three decimal places: " +finalArea);
		
	}

}
