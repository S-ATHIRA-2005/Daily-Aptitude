import java.util.Scanner;
class Natureofnumber{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        if(number >0){
            System.out.println("Profit");
        }else if(number<0){
            System.out.println("Loss" );
        }else{
            System.out.println("No profit, No loss");
        }
    }
}