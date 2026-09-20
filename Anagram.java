import java.util.HashMap;
public class Anagram  {
    public static boolean isAnagram(String s,String t){
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length()-1;i++){
            char ch=s.charAt(i);
            if(!map.containsKey(ch)){
           map.put(ch,1);
            }else{
                map.put(ch,map.get(ch)+1);
            }
            }
           for(int i=0;i<t.length();i++){
            char cht=t.charAt(i);
            if(map.containsKey(cht)){
                map.put(cht,map.get(cht)-1);
            }
           }
           for(int val:map.values()){
            if(val!=0){
                return false;
            }
           }
           return true;
        }
    public static void main(String[]args){
        String s="cat";
        String t="rat";
        boolean result =isAnagram(s,t);
        System.out.println(result);
    }
}


