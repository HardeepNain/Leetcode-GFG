//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Solution obj = new Solution();
            obj.segregateElements(a, n);
            
            for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
            
            System.out.println();
        }
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    
    public void segregateElements(int arr[], int n)
    {
        
        // nyi arraylist bnai
        ArrayList<Integer> list = new ArrayList<>();
        
        // saare -ve numbers usme daale
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                list.add(arr[i]);
            }
        }
        
        // nya res array bnaya
        int[] res = new int[n];
        
        int j = 0; // res aaray ko fill up krne ke liye
        
        // saare +ve numbers res me daale
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                res[j] = arr[i];
                j++;
            }
        }
        
        // fir -ve numbers res me daale
        for (int val : list) {
            res[j] = val;
            j++;
        }
        

        for(int idx = 0; idx<n; idx++){
            arr[idx] = res[idx];
        }
    }
}