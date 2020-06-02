import java.util.Scanner;
public class ArrowPattern {
    public static void main(String[] args) {
        Scanner  s= new Scanner(System.in);
        int n;

        System.out.print("no. of Lines : ");
        n =s.nextInt();

        pattern(n);
    }

    public static void pattern(int n){
        int i, j;

        if(n%2==0)
            n++;

        for(i=0 ; i<n/2 ; System.out.println(""), i++){
            for(j=0 ; j<i ; System.out.print(" "), j++);
            for(j=0 ; j<i+1 ; System.out.print("*"), j++);
        }

        for(i=0 ; i<n-n/2 ; System.out.println(""), i++){
            for(j=0 ; j<n/2-i ; System.out.print(" "), j++);
            for(j=0 ; j<n/2+1-i ; System.out.print("*"), j++);
        }
    }
}
