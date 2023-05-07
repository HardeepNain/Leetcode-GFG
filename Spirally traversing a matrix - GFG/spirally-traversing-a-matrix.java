//{ Driver Code Starts
import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int r = sc.nextInt();
            int c = sc.nextInt();
            
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                for(int j = 0; j < c; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix, r, c);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int A[][], int r, int c)
    {
        // code here 
        ArrayList<Integer> list = new ArrayList<>();
        
        int rmin = 0, cmin = 0, rmax = r-1, cmax = c-1;
        int count = 0 ;
         int totalEle = r * c;
        while(count < totalEle){
            
            for(int i = rmin , j = cmin ; j <= cmax &&  count < totalEle ; j++){
                list.add( A[i][j]); 
                count++;
            }

             for(int i = rmin+1 , j = cmax ; i <= rmax && count < totalEle; i++){
                list.add( A[i][j]); 
                count++;
            }

            for(int i = rmax , j = cmax-1 ; j >= cmin && count < totalEle; j--){
                list.add( A[i][j]); 
                count++;
            }

            for(int i = rmax-1 , j = cmin ; i >= rmin+1 && count < totalEle ; i--){
                list.add( A[i][j]); 
                count++;
                
            }

            rmin++;
            cmin++;
            rmax--;
            cmax--;
            
    }
    return list;
    }
}