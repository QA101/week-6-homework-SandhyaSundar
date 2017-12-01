import java.util.Arrays;

public class IntergerArray_Panlindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int r,sum=0,temp;    
		  int n=45354;//It is the number variable to be checked for palindrome  
		  
		  temp=n;    
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
		
	
	
	int[] element=new int[] {4,5,3,2,3,5,4};
	int[] inputArray= new int[] {2,3,4,5,7,8};
	boolean outputArray = numberPalindrome(element);
	
	
	if (numberPalindrome(element)) {
	System.out.println("This is a Palindrome array");
	}
	if (numberPalindrome(inputArray)) {
		System.out.println("This is a Palindrome array");
	}
	else {
		System.out.println("This is not a Palindrome array");
	}
		
}
	public static boolean numberPalindrome(int[] methodInput) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<methodInput.length/2;i++) {
			 if(methodInput[i]!=methodInput[methodInput.length-(i+1)]) {
				 return false;
			 }			
	}  
		return true;
		}  
}


