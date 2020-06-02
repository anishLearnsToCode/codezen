import java.util.Scanner;
public class PrintThePattern {
    public static void main(String[] args) {
        Scanner  s= new Scanner(System.in);
        int n;

        System.out.print("Line : ");
        n = s.nextInt();

        pattern(n);
    }

    public static void pattern(int n){
        int i, j;

        for(i=0 ; i<(n+1)/2 ; System.out.println(""), i++){
            for(j=0 ; j<n ; System.out.print((2*n*i+1+j) + " "), j++);
        }

        for(i=0 ; i<n/2 ; System.out.println(""), i++){
            for(j=0 ; j<n ; System.out.print((n*((2*(n/2)-1)-2*i) + 1+j) + " "), j++);
        }
    }
}
