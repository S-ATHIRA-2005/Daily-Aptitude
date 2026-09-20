import java .util.Scanner;
public class Frequency {
    public static void main(String[]args){
        int nums[]={1,2,3,4,3,5,4,5};
        boolean visited[]=new boolean[nums.length];
        int len=nums.length;
        for(int i=0;i<len;i++){
            if(visited[i]==false){
               int count=1;
               visited[i]=true;
               for(int j=i+1;j<len;j++){
                if(nums[i]==nums[j]){
                     count++;
                     visited[j]=true;
                }
               }
               System.out.println(nums[i]+" ->" +count);

            }
        }
        }
    }
    

