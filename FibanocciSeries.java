public class FibanocciSeries {
    public static void main(String[] args) {
        int n=5;
        int a=0;
        int b=1;
        System.out.println(a+" "+b+" ");
        int c;
        for(int i=2;i<n;i++){
            c=a+b;
            System.out.println(c+" ");
            a=b;
            b=c;
        }
    
    }
    
}
