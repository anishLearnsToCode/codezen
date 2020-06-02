import java.util.Scanner;

public class TwistedString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str, ans;

        str = s.nextLine();

        ans = twist(str);

        System.out.println(ans);

        //System.out.println(retchar(str.charAt(0), 2));
    }

    public static String twist(String str){
        String ans="";
        int i, j;

        for(i=0, j=0 ; i<str.length() ; i++){
            if(str.charAt(i)==str.charAt(j)){
            }
            else{
                ans = ans + str.charAt(j) + retchar(str.charAt(j), i-j);
                j=i;
                System.out.println(ans);
            }

            if(i==str.length()-1){
                ans = ans + str.charAt(j)+retchar(str.charAt(j), i-j+1);
                break;
            }
        }

        return ans;
    }

    public static char spec_char(char ch, int k){
        char ans = (char)(ch+k);
        return ans;
    }

    public static char retchar(char ch, int k){
        if(k==0){
            return ch;
        }

        if(ch=='z'){
            return retchar('a', k-1);
        }else {
            return retchar((char) (ch + 1), k - 1);
        }
    }
}
