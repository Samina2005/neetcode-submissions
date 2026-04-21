class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        int t = m+n;
        int arr[] = new int[t];

        int i = 0;
        int j = 0;
        int k =0;

        while(i < m && j<n){
            if(nums1[i]<nums2[j]){
                arr[k++] = nums1[i];
                i++;
            }
            else{
                arr[k++]= nums2[j];
                j++;
            }
        }

        while(i<m){
            arr[k++] = nums1[i++];
        }

        while(j<n){
            arr[k++] = nums2[j++];
        }

        int h = arr.length;
        if(h%2==0){
            return ((double)arr[h/2 - 1] + (double)arr[h/2]) / 2.0;
        }
        else{
            return (double)arr[h/2];
        }

    }
}
