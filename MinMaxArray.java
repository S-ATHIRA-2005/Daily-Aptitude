import java .util.Scanner;
public class MinMaxArray {
    // find minimum value
    public static void findMin(int[]nums) {
         int min=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }
        }
        System.out.println("Minimun value:"+min);
        
    }
    //find maximum value
    public static void findMax(int[]nums){
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        System.out.println("Maximum value:" +max);
    }
        
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int []nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        //Method to find maximum value
        findMax(nums);
        //Method to find minimum value
        findMin(nums);

    }
    
}
