import java.util.*;
class Anagram{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<t;i++){
            String a=sc.next();
            String b=sc.next();
            if(a.length()!=b.length()){
                System.out.println("False");
                continue;
            }
            int count[] =new int[26];
            for(int k=0;k<a.length();k++){
                count[a.charAt(k)-'a']++;
                count[b.charAt(k)-'a']--;
            }
            boolean isAnagram=true;
            for(int c:count){
                if(c!=0){
                    isAnagram=false;
                    break;
                    
                }
            }
            System.out.println(isAnagram ?"True":"False");
        }
    }
}