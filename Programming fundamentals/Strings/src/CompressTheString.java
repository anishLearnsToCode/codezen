import java.util.Scanner;
public class CompressTheString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str, ans;

        str = s.next();

        ans = compress(str);
        System.out.println(ans);
    }

    public static String compress(String str){
        int i, j;
        String ans="";

        for(i=1, j=0 ; i<str.length() ; ){
            if(i==str.length()-1){
                if(str.charAt(i)==str.charAt(j))
                    ans = ans + str.charAt(j) + (i-j+1);
                else
                    ans = ans + str.substring(j);

                break;
            }

            if(str.charAt(i)==str.charAt(j)){
                i++;
            }
            else if(i-j > 1){
                ans = ans + str.charAt(j) + (i-j);
                j=i;
                i++;
            }
            else{
                ans = ans + str.charAt(j);
                j=i;
                i++;
            }
        }

        return ans;
    }
}
