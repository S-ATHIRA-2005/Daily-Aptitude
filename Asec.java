
    import java .util.Scanner;
public class Asec {
    public static int findArraySum(int[]nums){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
            return sum;
        
        }
    
    // find sum of the element in the array
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int [n];
        for(int i=1;i<n;i++){
            nums[i]=sc.nextInt();    
        }
        //call the method
        int res=findArraySum(nums);
        System.out.println("Sum:"+res);

             
    }
}
        