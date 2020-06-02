import java.util.Scanner;
public class InterestingAlphabets {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;

        System.out.print("Lines : ");
        n = s.nextInt();

        pattern(n);
    }

    public static void pattern(int n){
        int i, j;
        String str = (char)('A' + n -1) +"";

        for(i=0 ; i<n ; i++){
            System.out.println(str);
            str = (char)('A' + n-i-2) + str;
        }
    }
}
