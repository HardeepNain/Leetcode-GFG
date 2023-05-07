//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            obj.printTriangle(n);
        }
    }
}
// } Driver Code Ends


// Back-end complete function Template for Java

class Solution {

    void printTriangle(int n) {
        int num = 1;  //number intialization

        for (int r = 1; r <= n; r++)
        {
            for (int c = 1; c <= r; c++)
            {
                System.out.print(num + " "); // 	 for spcaes btw num.
                num++;
            }
            System.out.println();
        }
    }
}