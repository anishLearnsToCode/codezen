import java.util.Scanner;
public class Pangram {
    public static void main(String[] args) {
        Scanner  s= new Scanner(System.in);
        String str;

        str = s.next();

        ans(str);
    }

    public static void ans(String str){
        int arr[] = new int[26];
        int i;
        boolean flag = true;

        str = str.toUpperCase();
        for(i=0 ; i<arr.length ; arr[i]=0, i++);
        for(i=0 ; i<str.length() ; arr[str.charAt(i) - 65]++, i++);

        for(i=0 ; i<arr.length ; i++){
            if(arr[i]==0){
                flag = false;
                break;
            }
        }

        if(flag)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
