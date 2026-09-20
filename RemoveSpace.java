public class RemoveSpace {
    public static void main(String[] args) {
        String str="how are you";
        //approach 1 using replace
        String strReplace=str.replace( " ", "");
        System.out.println("After removing space:"+strReplace);

        //apprach 2 using for loop
        String newString="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch !=' '){
                newString=newString+ch;
            }
        }
        System.out.println("After remove space(for loop):"+newString);

    }
    
}
