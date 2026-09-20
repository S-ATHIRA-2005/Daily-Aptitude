
public class conif{
    public static void main(String[]args){
        int age=3;
        if(age <=3){
            System.out.println("Child" );
        }
        else if(age>=4 && age<=12){
            System.out.println("kid");
        }
        else if(age >=13 && age<=18){
            System.out.println("Teenage");
        }
        else if(age >=19 && age<=60){
            System.out.println("Adult");
        }
        else{
            System.out.println("old");
        }
    }
}