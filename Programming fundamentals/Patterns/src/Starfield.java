import java.util.Scanner;
public class Starfield {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;

        System.out.print("Line : ");
        n = s.nextInt();

        print(n);
    }

    public static void print(int n){
        int i;

        for(i=0 ; i<n ; line(i, n), System.out.println(""), i++);
        for(i=n-2 ; i>=0 ; line(i, n), System.out.println(""), i--);
    }

    public static void line(int i, int n){
        int j, k;

        if(i==n-1){
            for(j=0 ; j<n ; System.out.print("* "), j++);
            return;
        }

        if((i+2)%2==0){
            for(j=0 ; j<i/2+1 ; System.out.print("* "), j++);

        }
    }
}
