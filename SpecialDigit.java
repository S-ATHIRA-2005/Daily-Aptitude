
public class SpecialDigit {
    public static void main(String[] args) {
        int lower=15;
        int high =45;
        int result;
        int d1;
        int d2;
        int sum;
        int product;
        for(int i=lower;i<=high;i++){
            d1=i%10;
            d2=i/10;
            sum=d1+d2;
            product=d1*d2;
            result=sum+product;
            if(result==i){
                System.out.println(i+" ");
            }
        }   
        } 
    }
    
