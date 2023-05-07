//{ Driver Code Starts
import java.util.Scanner;
class Matrix{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
			int n = sc.nextInt();
			int[][] a = new int[n][n];
			int[][] b = new int[n][n];
			int[][] c = new int[n][n];
			for(int i = 0; i < n; i++)
				for(int j = 0; j < n; j++)
					a[i][j]=sc.nextInt();
			for(int i = 0 ;i < n; i++)
				for(int j = 0; j < n; j++)
					b[i][j]=sc.nextInt();
			GfG g = new GfG();
			g.multiply(a,b,c,n);
			for (int i = 0; i < n; i++)
			{for (int j = 0; j < n; j++)
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}
// } Driver Code Ends


/*Complete the function below*/
class GfG
{
      public static void multiply(int mat1[][], int mat2[][], int res[][], int N)
        {

            // matrix multiplication

            for(int i = 0 ; i < res.length ; i++){      // ye res matrix ki row ko target krega saathi hi mat1 ki rows ko bhi target krega
                for(int j = 0 ; j < res[0].length ; j++){  // ye res matrix ki col ko target krega saath hi mat2 ki col ko bhi target krega

                    for(int k = 0 ; k < mat2.length ; k++){   // mat1 ki col aur mat2 ki row ko target krne ke liye
                        res[i][j] = res[i][j] + (mat1[i][k] * mat2[k][j]);
                    }
                }
            }
        }
}