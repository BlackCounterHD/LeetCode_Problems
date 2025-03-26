double findMedianSortedArrays(int* nums1, int nums1Size, int* nums2, int nums2Size) {
    
    int i=0,j=0,k=0,v3[2001];
    double m;
    while(i<nums1Size && j<nums2Size){
        if(nums1[i]>=nums2[j]){
           v3[k]=nums2[j];
           k++;
           j++;
        }
        else if(nums1[i]<=nums2[j]){
            v3[k]=nums1[i];
            i++;
            k++;
        }  
    }
    while(i<nums1Size){
        v3[k]=nums1[i];
            i++;
            k++;
        }  
    
     while(j<nums2Size){
        v3[k]=nums2[j];
            j++;
            k++;
        }  
    if(k%2==0)
      m=(v3[k/2]+v3[k/2-1])/2.0;
    else
      m=v3[k/2];
    return m;
      
       
}