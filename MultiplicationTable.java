import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(); 
     int arm=0;
     int temp=n;
     while(n>0){
        int rem=n%10;
        arm=rem*rem*rem+arm;
        n=n/10;
     }
     if(temp==arm){
        System.out.println("arms");
     }else{
        System.out.println("not arm");
     }
    }
}
