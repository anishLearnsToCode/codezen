import java.util.Scanner;

public class Pattern_ify {
    public static void main(String[] args) {
        Scanner  s = new Scanner(System.in);
        int n;

        System.out.print("Enter no. of lines : ");
        n = s.nextInt();

        pattern(n);
    }

    public static void pattern(int n){
        int i, j;

        for(i=0 ; i<n ; i++){
            for(j=0 ; j<n-i ; System.out.print("*"), j++);
            System.out.println("");
        }
    }
}
