import java.util.Scanner;
public class DiamondOfNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;

        System.out.print("Lines : ");
        n = s.nextInt();

        print(n);
    }

    public static void print(int n){
        if(n%2==0)
            n++;

        int i, j;

        for(i=0 ; i<n/2 ; System.out.println(""), i++){
            for(j=0 ; j<n/2-i ; System.out.print(" "), j++);
            for(j=0; j<2*i+1 ; System.out.print(1+j), j++);
        }
        for(i=0 ; i<n - n/2 ; System.out.println(""), i++){
            for(j=0 ; j<i ; System.out.print(" "), j++);
            for(j=0 ; j<n - 2*i ; System.out.print(j+1), j++);
        }
    }
}
