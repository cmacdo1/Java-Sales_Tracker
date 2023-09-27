// ***************************************************************
// Sales.java
//
// Reads in and stores sales for each of 5 salespeople. Displays
// sales entered by salesperson id and total sales for all salespeople.
//
// ***************************************************************
import java.util.Scanner;

public class Sales
{
	public static void main(String[] args)
	{
		//int SALESPEOPLE = 5;
		int SALESPEOPLE;
		int sum;
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter the number of sales people: ");
        SALESPEOPLE = scan.nextInt();
        int[] sales = new int[SALESPEOPLE];
		
		for (int i=0; i<sales.length; i++)
		{
			System.out.print("Enter sales for salesperson " + (i + 1) + ": ");
			sales[i] = scan.nextInt();
		}

		System.out.println("\nSalesperson Sales");
		System.out.println("------------------");
		
		sum = 0;
		int maxSale = sales[0];
		int minSale = sales[0];
		int minid = 1;
		int maxid = 1;
		
		for (int i=0; i<sales.length; i++)
		{
			System.out.println(" " + (i + 1) + " " + sales[i]);
			sum += sales[i];
			
			if(maxSale < sales[i])
			{
				maxSale = sales[i];
				maxid = i+1;
			}
			
			else if(minSale > sales[i])
			{
				minSale = sales[i];
				minid = i+1;
			}
				
			
		
		}	
		System.out.println("\nTotal sales: " + sum);
		System.out.println("Average sale: " + (sum / SALESPEOPLE));
		System.out.println("Salesperson " + maxid + " had the highest sale with " + maxSale);
		System.out.println("Salesperson " + minid + " had the lowest sale with " + minSale);
		System.out.print("Enter target amount: ");
	
		int target = scan.nextInt();
		int count = 0;
		
		for (int i = 0; i < sales.length; i++)
		{
			if(sales[i] > target)
			{
				count++;
				System.out.println("Salesperson "+ (i+1) + " exceeded given amount. (Number of sales: " + sales[i] +")");
				
			}
		}
		System.out.println("Number of people who exceeded target amount: "+ count);
	}
}