import java.util.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.*;
import java.util.Random;

public class Numbers{
	
	public static void main(String[] args)
	{
		
		int[] array = new int[10];
		int sum;
		int newSum = 0;
		int arrayP = 0;
		int arrayO = 0;
		
		Random randInt = new Random();
		
		for (int i = 0; i < array.length; i++){
			
			array[i] = randInt.nextInt(array.length) + 1;
			System.out.print(array[i] + "\n");
		}
		
		for (int i = 0; i <= array.length - 2; i++){
			sum = array[i] * array[i+1];
			
			if (sum > newSum){
				newSum = sum;
				arrayP = array[i];
				arrayO = array[i + 1];
			}
			else {
				newSum = newSum;
			}
		}
		System.out.print("The two adjacent numbers with the greatest product are " + arrayP + " and " + arrayO + "\n");
		System.out.print("The value of the product of those two adjacent numbers is " + newSum + "\n");
		
			
			
			
		
		
	}
	
	
	
	
	
	
}