package arrays;
import java.util.Arrays; 
public class Difference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 {
		    int[] myarray = {25,30,40,60,70,80,90};
			
		    System.out.println("Original Array: "+Arrays.toString(myarray)); 
			int max = myarray[0];
			int min = myarray[0];
			
			for(int i = 1; i < myarray.length; i++)
			{
				if(myarray[i] > max)
					max = myarray[i];
				else if(myarray[i] < min)
					min = myarray[i];
			}
			System.out.println("Difference between the largest and smallest array element is: "+(max - min));	
		 }
		}
	}


