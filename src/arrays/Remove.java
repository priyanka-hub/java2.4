package arrays;
import java.util.Scanner;

public class Remove {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    int[] intArr = {1, 2, 5, 12, 7, 3, 8};
	    int[] newArr = null;
	    System.out.print("Enter Element to be deleted : ");
	    int elem = in.nextInt();
	        
	  for(int i = 0; i < intArr.length; i++){
	      
		  if(intArr[i] == elem){
	        newArr = new int[intArr.length - 1];
	        for(int index = 0; index < i; index++){
	          newArr[index] = intArr[index];
	        }
	        for(int j = i; j < intArr.length - 1; j++){
	          newArr[j] = intArr[j+1];
	        }
	        break;
	      }
	    }
	    System.out.println("Elements after removing specific element:" );      
	    for(int i = 0; i < newArr.length; i++){
	      System.out.print(" " + newArr[i]);
	    }                
	  }
	
	}
	

