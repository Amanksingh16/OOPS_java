import java.util.*;
public class Longest_Subarray_OOPS {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array !");
		int n = sc.nextInt();
        
		int arr[] = new int[n];
        System.out.println("Enter the array elements !");
        for(int i=0; i<n; i++)
        {
        	arr[i] = sc.nextInt();    // To Print an array
        }
        
        Longest_Subarray l = new Longest_Subarray();
        l.display(arr,n);     
	}
	
}
