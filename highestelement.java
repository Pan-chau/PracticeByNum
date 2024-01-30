import package ****
import java.util.*;
class test{

public static void main(String [] args){

	int [] arr={12,35,1,10,34,1};
	int n = arr.length();

	for(int i=0; i<n ;i++){
	
		for(int i = i+1 ;j<n ;j++){

			if(arr[i]>arr[j]){
				
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;	

			

				}
		}
	}
	//printing the sorted array in assending order
	System.out.println(Arrays.Tostring (arr));

	// printing the second highest element of the array
	System.out.println(arr[n-1]);

}


}


