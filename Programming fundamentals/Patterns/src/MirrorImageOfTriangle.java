import java.util.Scanner;
public class MirrorImageOfTriangle {
    public static void main(String[] args) {
        Scanner  s= new Scanner(System.in);
        int n;

        System.out.print("Lines : ");
        n = s.nextInt();

        print(n);
    }

    public static void print(int n){
        int i, j;

        for(i=0 ; i<n ; System.out.println(""), i++){
            for(j=0 ; j<n-i-1 ; System.out.print(" "), j++);
            for(j=0 ; j<i ; System.out.print(i+-j), j++);
            System.out.print("0");
            for(j=0 ; j<i ; System.out.print(1+j), j++);
        }
    }
}
