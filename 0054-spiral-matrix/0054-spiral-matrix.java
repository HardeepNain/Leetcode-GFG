class Solution {
    public List<Integer> spiralOrder(int[][] A) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        int rmin = 0, cmin = 0, rmax = A.length-1, cmax = A[0].length-1;
        int count = 0 ;
         int totalEle = A.length * A[0].length;
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