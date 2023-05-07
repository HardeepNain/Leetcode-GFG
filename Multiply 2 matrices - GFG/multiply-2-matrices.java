//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int[][] matrixA = new int[n][n];
            int[][] matrixB = new int[n][n];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < n; j++)
                    matrixA[i][j] = Integer.parseInt(S[j]);
            }
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < n; j++)
                    matrixB[i][j] = Integer.parseInt(S[j]);
            }
            Solution ob = new Solution();
            ob.Mutliply(matrixA, matrixB);
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    System.out.print(matrixA[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public void  Mutliply(int[][] mat1, int[][] mat2)
    {
        // code here
            int res[][] = new int[mat1.length][mat2[0].length];
            
            for(int i = 0 ; i < res.length ; i++){      // ye res matrix ki row ko target krega saathi hi mat1 ki rows ko bhi target krega
                for(int j = 0 ; j < res[0].length ; j++){  // ye res matrix ki col ko target krega saath hi mat2 ki col ko bhi target krega

                    for(int k = 0 ; k < mat2.length ; k++){   // mat1 ki col aur mat2 ki row ko target krne ke liye
                        res[i][j] = res[i][j] + (mat1[i][k] * mat2[k][j]);
                    }
                }
            }
            
            for(int i = 0 ; i < res.length ; i++){
                for(int j = 0 ; j < res[0].length ; j++){
                    mat1[i][j] = res[i][j];
                }
            }
    }
}