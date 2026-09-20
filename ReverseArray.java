 import java .util.Scanner;
public class ReverseArray {
    public static void revArray(int[]nums){
       
            
            int left=0;
            int right=nums.length;
            while(left<right){
                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                left++;right--;
            }
        }
            
        
        
    
    // find sum of the element in the array
    public static void main(String[]args){
      int nums[]={2,3,4,5,6,7};
      revArray(nums);
      System.out.println("After Reversing:"); 
       for(int i=0;i<nums.length;i++){
        System.out.println(nums[i]+" ");
       }

             
    }
}
        