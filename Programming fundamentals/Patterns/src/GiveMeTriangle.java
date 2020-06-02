import java.util.Scanner;
public class GiveMeTriangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;

        System.out.print("Lines : ");
        n = s.nextInt();

        pattern(n);
    }

    public static void pattern(int n){
        int i, j;

        for(i=0 ; i<n ; System.out.println(""), i++){
            for(j=0 ; j<i ; System.out.print(" "), j++);
            for(j=0 ; j<n-i ; System.out.print("*"), j++);
        }
    }
}
