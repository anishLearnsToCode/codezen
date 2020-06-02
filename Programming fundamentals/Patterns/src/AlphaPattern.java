import java.util.Scanner;
public class AlphaPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;

        System.out.print("Lines : ");
        n = s.nextInt();

        pattern(n);
    }

    public static void pattern(int n){
        int i, j;
        char ch='A';

        for(i=0 ; i<n ; System.out.println(""), i++){
            for(j=0 ; j<i+1 ; System.out.print(ch), j++);
            ch = (char)(ch + 1);
        }
    }
}
