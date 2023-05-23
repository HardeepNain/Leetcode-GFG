//{ Driver Code Starts
import java.util.*;

class GFG
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n]; 
			for(int i=0;i<n;i++)
			{
				arr[i] = sc.nextInt();
			}
		
			Solution obj = new Solution();
			obj.selectionSort(arr, n);
			
			for(int i=0;i<n;i++)
		    	System.out.print(arr[i]+" ");
		    System.out.println();
			t--;
		}
		
	}
}

// } Driver Code Ends


class Solution
{
	int  select(int arr[], int i)
	{
        // code here such that selectionSort() sorts arr[]
        return 1;
	}
	
	void selectionSort(int arr[], int n)
	{
	    //code here
        for(int itr = 1 ; itr <= n-1 ; itr++){  // wahi BS wala scene 
            int minIdx = itr-1;                 // hum start karte hai 0 index se aur
                                            // usko ek ek karke uske aage bache hue element se check karte jaate hai
            for(int j = itr ; j < n ; j++){     // isiliye j ki value itr se start hai 
                if(!isGreater(arr,j,minIdx)){
                    minIdx = j;
                }
            }
            
            swap(arr,itr-1,minIdx);
        }
    }
    
    // used for swapping ith and jth elements of array
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // return true if ith element is smaller than jth element
    public static boolean isGreater(int[] arr, int i, int j) {
        if (arr[i] > arr[j]) {
            return true;
        } else {
            return false;
        }
    }
    
}