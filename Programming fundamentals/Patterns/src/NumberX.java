import java.util.Scanner;
public class NumberX {
    public static void main(String[] args) {
        Scanner  s= new Scanner(System.in);
        int n;

        System.out.print("Lines : ");
        n = s.nextInt();

        pattern(n);
    }

    public static void pattern(int n){
        int i, j;

        for(i=0 ; i<n-1 ; System.out.println(""), i++){
            for(j=0 ; j<i ; System.out.print(" "), j++);
            System.out.print(i+1);
            for(j=0 ; j<2*(n-1-i)-1 ; System.out.print(" "), j++);
            System.out.print(i+1);
        }

        for(j=0 ; j<n-1 ; System.out.print(" "), j++);
        System.out.print(n + "\n");

        for(i=0 ; i<n-1 ; System.out.println(""), i++){
            for(j=0 ; j<n-2-i ; System.out.print(" "), j++);
            System.out.print(n-1-i);
            for(j=0 ; j<2*i+1 ; System.out.print(" "), j++);
            System.out.print(n-1-i);
        }
    }
}
