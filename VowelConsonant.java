public class VowelConsonant {
    public static void main(String[] args) {
        String s="education";
        int vowels=0;
       int consonants=0;

        for(int i=0;i<s.length()-1;i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowels++;
   
            }else{
                consonants++;
            }
        }
        System.out.println("vowels:"+vowels + "consonants:"+consonants);
    }
    
}
