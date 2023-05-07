class Solution {
    public int[] searchRange(int[] arr, int k) {

        int fi = firstIdx(arr,k);
        int li = lastIdx(arr,k);
        
        int[] res = {fi,li};

        return res ;
    }

    public static int firstIdx(int arr[],int k){
        int lo = 0 , hi = arr.length-1;
        int fi = -1;

        while(lo <= hi){
            int mid = (lo + hi)/2;

            if(arr[mid] == k){
                fi = mid;
                hi = mid-1;
            }else if(arr[mid] < k){
                lo = mid+1;
            }else if(arr[mid] > k){
                hi = mid-1;
            }
        }

        return fi;
    }

    public static int lastIdx(int arr[],int k){
        int lo = 0 , hi = arr.length-1;
        int li = -1;

        while(lo <= hi){
            int mid = (lo + hi)/2;

            if(arr[mid] == k){
                li = mid;
                lo = mid+1;
            }else if(arr[mid] < k){
                lo = mid+1;
            }else if(arr[mid] > k){
                hi = mid-1;
            }
        }

        return li;
    }
    }
