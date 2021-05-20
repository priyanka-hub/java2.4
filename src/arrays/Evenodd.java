package arrays;

public class Evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int a[]={1,2,5,6,3,2};  
			System.out.print("Odd Numbers:");  
			
			for(int i=0;i<a.length;i++){  
			if(a[i]%2!=0){  
			System.out.print(a[i]);
			}  
			}
			
			System.out.print("Even Numbers:");
			for(int i=0;i<a.length;i++){  
			if(a[i]%2==0){  
			System.out.print(a[i]);  
			}  
			}  
			
	}}