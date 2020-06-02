import java.util.Scanner;
public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str;

        str = s.next();

        str = removeConsecutiveDuplicates(str);
        System.out.println(str);
    }

    public static String removeConsecutiveDuplicates(String str){
        int i, j;
        String ans="";

        for(i=1, j=0 ; i<str.length() ; ){
            if(i==str.length()-1){
                if(str.charAt(i)==str.charAt(j))
                    ans = ans + str.charAt(j);
                else
                    ans = ans + str.substring(j);

                break;
            }

            if((i==1) && (str.charAt(i)!=str.charAt(j))){
                ans = str.substring(0, 2);
            }

            if(str.charAt(i)!=str.charAt(j)){
                ans = ans + str.charAt(j);
                j=i;
                i++;
            }
            else
                i++;
        }

        return ans;
    }
}
