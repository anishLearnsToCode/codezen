import java.util.Scanner;
public class AmazingStrings {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str1, str2, str3;

        str1 = s.next();
        str2 = s.next();
        str3 = s.next();

        answer(str1, str2, str3);
    }

    public static void answer(String str1, String str2, String output){
        int arr[] = new int[26];
        int i;
        boolean flag = true;

        for(i=0 ; i<26 ; arr[i]=0, i++);

        for(i=0 ; i<str1.length() ; arr[str1.charAt(i)-65]++, i++);
        for(i=0 ; i<str2.length() ; arr[str2.charAt(i)-65]++, i++);

        for(i=0 ; i<output.length() ; arr[output.charAt(i)-65]--, i++);

        for(i=0 ; i<arr.length ; i++){
            if(arr[i]!=0){
                flag = false;
                break;
            }
        }

        if(flag)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
