
public class Longest_Subarray {
	
	public void display(int a[] , int size)
	{
		int max = 1 , count = 1;           // max is the maximum length and count is the length of the 
		                                    // possible increasing sub-array at any instance
				for (int i=1 ; i < size ; i++)
		{
			if(a[i]>a[i-1])            // for checking the longest possible increasing sub-array
			{
				count++;
			}
			else
			{
				if(max < count)         /* if the maximum length is less than the current length of sub-array
				                             then max is set to the value of count */ 
				{
					max = count;
				}
				count = 1;
			}
			
			if(max > size - i)           /* For terminating the check if no further maximum value is possible 
			                               than the current maximum length */
			{
				break;
			}
		}
				
		if(max < count)                   // To check the last possible sequence of longest subarray
		{
			max = count ;
		}
		
		System.out.println("The length of the longest increasing Subarray : " + max);
	}
	
}
