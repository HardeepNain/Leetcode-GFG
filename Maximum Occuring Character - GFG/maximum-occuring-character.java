//{ Driver Code Starts
import java.lang.*;
import java.io.*;
import java.util.*;
class GFG
{
	public static void main (String[] args) throws IOException
	{
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 int tc=Integer.parseInt(br.readLine().trim());
	 
	 while(tc-- >0)
	 {
	     String line=br.readLine().trim();
	     
	     Solution obj = new Solution();
	     
	     System.out.println(obj.getMaxOccuringChar(line));
	     
	 }
	 }
}
// } Driver Code Ends



class Solution
{
    //Function to find the maximum occurring character in a string.
    public static char getMaxOccuringChar(String line)
    {
        // Your code here
        //BRUTE FORCE
        
        char hiFreqChar = ' ';
        int maxFreq = 0;
        
        for(int i= 0; i<line.length(); i++){
            
            char ch = line.charAt(i);
            int freq = 1;
            
            for(int j = i; j<line.length(); j++){
                if(line.charAt(j) == ch){
                    freq++;
                }
            }
            
            // System.out.println(ch +" "+freq);
            
            if(freq>maxFreq){
                maxFreq = freq;
                hiFreqChar = ch;
            }
            else if(freq == maxFreq && ch < hiFreqChar){
                hiFreqChar = ch;
            }
        }
        
        return hiFreqChar;
    }
    
}