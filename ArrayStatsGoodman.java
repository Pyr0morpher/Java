import java.util.Scanner;
import java.lang.Math;
import java.util.Random;

public class Main
{
	public static void main(String[] args) 
	{
	    Scanner scan = new Scanner(System.in);
	    
	    // input array size - program stops if array length < 0
	    System.out.println("How long do you want the array?");
	    int arrayLength = scan.nextInt() - 1;
	    
	    if (arrayLength < 0)
	    {
	        System.out.println("Not a valid length!");
	    }
	    else
	    {
	        //initialize array and assign values
	        double stats[] = new double[arrayLength + 1];
	        
	        for (int x = 0; x <= arrayLength; x++)
	        {
	            System.out.println("Enter a number:");
	            int num = scan.nextInt();
	            stats[x] = num;
	        }
	        
	        // prints the array values
	        System.out.print("Your array is {");
	        
	        for (int y = 0; y <= arrayLength; y++)
	        {
	            System.out.print(stats[y] + " ");
	            
	        }
	        
	        System.out.print("} \n");
	        System.out.println("The average is " + findAvg(stats));
	        System.out.println("the range is " + findRange(stats));
	        System.out.println(arrayOrder(stats));
	    }
	    
	    
	}
	
	// checks if array is sorted and returns how its sorted 
	public static String arrayOrder(double[] a)
	{
	    String sortChoice = "";
	    
	    int inCount = 0;
	    int deCount = 0;
	    
	    for (int b = 0; b < a.length - 1; b++)
	    {
	        if (a[b] > a[b + 1])
	        {
	            inCount++;
	        }
	        else if (a[b] < a[b + 1])
	        {
	            deCount++;
	        }
	    }
	    
	    if (inCount > 0 && deCount == 0)
	    {
	        sortChoice = "The array is sorted in increasing order";
	    }
	    else if (deCount > 0 && inCount == 0)
	    {
	        sortChoice = "The array is sorted in decreasing order";
	    }
	    else
	    {
	        sortChoice = "the array is unsorted";
	    }
	    
	    return sortChoice;
	}
	
	//finds the highest number in the array
	public static double findHighest(double[] d)
	{
	    double highest = -999;
	    
	    for(int x = 0; x < d.length; x++)
	    {
	        if(d[x] > highest)
	        {
	            highest = d[x];
	        }
	    }
	    
	    return highest;
	}
	
	//finds the lowest number in the array
	public static double findLowest(double[] e)
	{
        double lowest = 999;
	    
        for(int x = 0; x < e.length - 1; x++)
        {
            if(e[x] < lowest)
            {
                lowest = e[x];
            }
        }
	    
        return lowest;
	}
	
    //finds the range of the array
    public static double findRange(double[] c)
    {
	    double range = findHighest(c) - findLowest(c);
	    
	    return range;
    }
	
	//finds the average of the array
	public static double findAvg(double[] b)
	{
	    String avgOut = "";
	    double average = b[0];
	    double total;
	    
	    for (int x = 0; x < b.length - 1; x++)
	    {
	       average = average + b[x + 1]; 
	    }
	    total = average / b.length;
	    
	    return total;
	}
}
