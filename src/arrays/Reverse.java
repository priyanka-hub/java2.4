package arrays;

import java.util.Arrays; 
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array= {10,34,48,56,99};
        
       System.out.println("Original array : "+Arrays.toString(array));
       for(int i = 0; i < array.length/2 ; i++)
       
    	   {
    	   int temp= array[i];
      
       array[i] = array[array.length - i - 1];
       array[array.length - i - 1] = temp;
     }
       
        System.out.print("Reverse of an array is :" +Arrays.toString(array));
       
        }
    }
	


