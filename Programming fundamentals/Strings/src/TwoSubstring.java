import java.util.Scanner;
public class TwoSubstring {
    public static void main(String[] args) {
        Scanner  s= new Scanner(System.in);
        String str;

        str = s.next();

        twoSubstrings(str);
    }

    public static void twoSubstrings(String str){
        int i, index;
        boolean flag, flag2;

        for(i=0, flag=false, flag2=false, index=0 ; i<str.length()-1 ; i++){
            if((str.charAt(i)=='A') && (str.charAt(i+1) == 'B')){
                index = i;
                flag = true;
                break;
            }
        }

        if(flag){
            for(i=0 ; i<str.length()-1 ; i++){
                if(i==index+1)
                    continue;

                if((str.charAt(i)=='B') && (str.charAt(i+1)=='A')){
                    flag2 = true;
                    break;
                }
            }
        }

        if(flag2)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
