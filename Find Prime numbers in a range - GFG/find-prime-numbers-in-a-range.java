//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            int M = Integer.parseInt(S[0]);
            int N = Integer.parseInt(S[1]);
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.primeRange(M, N);
            for (int i : ans) System.out.print(i + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends



// User function Template for Java

class Solution {
    ArrayList<Integer> primeRange(int low, int high) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        for(;low<=high;low++)
        {
            int count=0;
            for(int i=2;i*i<=low;i++)  
            {

                if(low%i==0)
                {   count++;
                    break;
                }

            }
            if(count==0 && low != 1)
            list.add(low);
        }
        return list;
    }
}