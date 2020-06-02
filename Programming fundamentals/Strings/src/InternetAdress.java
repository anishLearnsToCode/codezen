import java.util.Scanner;
public class InternetAdress {
    public static void main(String[] args) {
        Scanner  s= new Scanner(System.in);
        String str;

        str = s.next();

        sol(str);
    }

    public static void sol(String str){
        String ans="", ftp="ftp://", http="http://";
        int index, i;

        if(str.charAt(0)=='f') {
            ans = ans + ftp;
            index = 3;
        }
        else {
            ans = ans + http;
            index = 4;
        }

        for(i=index ; i<str.length() ; i++){
            if((str.charAt(i)=='r') && (str.charAt(i+1)=='u')){
                ans = ans + str.substring(index, i)+".ru";
                break;
            }
        }

        if(i!=str.length()-2)
            ans = ans + "/" + str.substring(i+2);

        System.out.println(ans);
    }
}
