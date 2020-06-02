import java.util.Scanner;

public class ReverseString_preserveSpace {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str;

        str=s.nextLine();

        str = reverse(str);
        System.out.println(str);
    }

    public static String reverse(String str){
        String ans="", ans2="";
        int i, j, a;

        for(i=str.length()-1 ; i>=0 ; i--){
            if(str.charAt(i)==' '){
                continue;
            }
            ans=ans + str.charAt(i);
        }

        System.out.println(ans);

        for(i=0, j=0, a=0 ; i<str.length() ; i++){
            if(str.charAt(i)==' '){
                ans2 = ans2+ ans.substring(j, i-a)+" ";
                j=i-a;
                a++;
            }

            if(i==str.length()-1){
                ans2 = ans2 + ans.substring(j, i-a+1);
            }
        }

        return ans2;
    }

}
