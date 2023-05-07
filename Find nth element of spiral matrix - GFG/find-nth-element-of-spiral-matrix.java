//{ Driver Code Starts
import java.util.*;

class Find_Given_Element_Of_Spiral_Matrix 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			int k = sc.nextInt();
			int arr[][] = new int[1000][1000];
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<m; j++ )
				{
					arr[i][j] = sc.nextInt();
				}
			}
			System.out.println(new GfG().findK(arr, n, m, k));
		t--;
		}
	}
}
// } Driver Code Ends



class GfG
{
    /*You are required to complete this method*/
    int findK(int A[][], int n, int m, int K)
    {
	    // Your code here
    	int rmin = 0, cmin = 0, rmax = n-1, cmax = m-1;
        int count = 0 ;
        int element = -1;
        while( element == -1){
            
            for(int i = rmin , j = cmin ; j <= cmax &&  element == -1 ; j++){
                count++;
                if(count==K){
                   element =  A[i][j];
                   break;
                }
            }

             for(int i = rmin+1 , j = cmax ; i <= rmax && element == -1; i++){
                count++;
                if(count==K){
                   element =  A[i][j];
                   break;
                }
            }

            for(int i = rmax , j = cmax-1 ; j >= cmin && element == -1; j--){
                count++;
                if(count==K){
                    element =  A[i][j];
                    break;
                }
            }

            for(int i = rmax-1 , j = cmin ; i >= rmin+1 && element == -1 ; i--){
                count++;
                if(count==K){
                   element =  A[i][j];
                   break;
                }
                
            }

            rmin++;
            cmin++;
            rmax--;
            cmax--;
            
    }
    return element;
}
}