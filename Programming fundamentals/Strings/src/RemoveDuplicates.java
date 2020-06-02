import java.util.Scanner;
public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner  s= new Scanner(System.in);
        String str, ans;

        str = s.next();

        ans = removeConsecutiveDuplicates(str);
        System.out.println(ans);
    }

    public static String removeConsecutiveDuplicates(String str){
        String ans=str.charAt(0)+"";
        int i, j;

        for(i=1, j=0 ; i<str.length() ; i++){
            if(str.charAt(i)!=str.charAt(j)){
                ans = ans + str.charAt(i);
                j=i;
            }
        }
        return ans;
    }
}
