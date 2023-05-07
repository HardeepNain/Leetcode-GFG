//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.armstrongNumber(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    static String armstrongNumber(int n){
        // code here
        int originalno = n; // n to sumofpower nikalne me use ho jaayega isiliye last me compare krne ke liye originalno me n save kraya h
        int count = 0;
        int temp = n; // count calc krne ne use hoyega temp
        
        while (temp != 0)
        {
            count++;
            temp = temp / 10;
        }
        
        int sumofpower = 0;
        
        while (n != 0)
        {
            int digit = n % 10;
            sumofpower += Math.pow(digit,count);
            n /= 10;
        }
        
        if(sumofpower == originalno){
            return "Yes";
        }
        else{
            return "No";
        }
    }
}