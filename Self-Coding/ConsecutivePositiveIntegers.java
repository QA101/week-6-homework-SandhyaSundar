import java.util.Arrays;
public class ConsecutivePositiveIntegers {

	
public static void main (String[] args) {

	int[] element=new int[] { 1,5,1,-1,1};
	int[] element2=new int[] {1,5,1,-1,1,1,1,1};
	
	int[] outputArray =positiveNumbers(element);
	int[] outputArray2=positiveNumbers(element2);
	
	System.out.println("Consecutive Positive numbers;"+Arrays.toString(outputArray));
	System.out.println("Consecutive Positive numbers;"+Arrays.toString(outputArray2));
		
}

public static int[] positiveNumbers(int [] inputArray) {
	// TODO Auto-generated method stub
	int start = 0;
	int i = 0;
	int maxLength = 0;
	int maxPartStart = 0;
	
	while(i<inputArray.length) {
		if(inputArray[i]<0) {
			start = i+1;
		} else {
			int currentLenght = i - start + 1;
			if(maxLength < currentLenght) {
				maxLength = currentLenght;
				maxPartStart = start;
			}
		}
		i++;
	}
	return Arrays.copyOfRange(inputArray, maxPartStart, maxPartStart+maxLength);
}
}
