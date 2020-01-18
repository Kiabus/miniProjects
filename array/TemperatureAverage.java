package array;

import java.util.Scanner;

public class TemperatureAverage {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double[] temperature = new double[7];
		double sumTemp = 0;
		
		System.out.println("Enter 7 temperatures");
		
		int index; 
		
		for(index = 0; index < 7; index++) {
			
			temperature[index] = input.nextDouble();
			sumTemp = sumTemp + temperature[index];
		}
		
		//temperature average
		double average = sumTemp / 7; 
		
		System.out.println("The average temperature is " + average);
		
		for(index = 0; index < 7; index++) {
			
		if(temperature[index] < average) {
			System.out.println("Temperature " + temperature[index] + " is below average");
			
		}else if (temperature[index] == average) {
			
			System.out.println("Temperature " + temperature[index] + " is on average");
			
		}else System.out.println("Temperature " + temperature[index] + " is above average");
		}

	}

}
