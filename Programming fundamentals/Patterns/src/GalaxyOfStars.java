import java.util.Scanner;
public class GalaxyOfStars {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;

        System.out.print("Line : ");
        n = s.nextInt();

        print(n);
    }

    public static void print(int n){
        int i, j;

        for(i=0 ; i<n/2 ; System.out.println(""),  i++){
            for(j=0 ; j<i+1 ; System.out.print("*"), j++);
        }

        for(i=0 ; i< n- n/2 ; System.out.println(""), i++){
            for(j=0 ; j<n/2+1-i ; System.out.print("*"), j++);
        }
    }
}
