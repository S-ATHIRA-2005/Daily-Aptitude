import java.util.Scanner;
public class Armstrong2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int arm=0;
        while(n>0){
            int rem=n%10;
            arm=rem*rem*rem+arm;
            n=n/10;
        }
        if(temp==arm){
            System.out.println(temp+"Armstrong Number");
        }else{
            System.out.println(temp+"not Armstrong Number");
        }


    }
    
}
