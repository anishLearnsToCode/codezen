import java.util.Scanner;
public class ValueOfDiamond {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n;

        System.out.print("Lines : ");
        n = s.nextInt();

        pattern(n);
    }

    public static void pattern(int n){
        int i, j;

        if(n%2==0)
            n++;

        for(i=0 ; i<n/2+1 ; System.out.println(""), i++){
            if(i==0){
                for(j=0 ; j<n ; System.out.print("*"), j++);
                continue;
            }

            for(j=0 ; j<n/2+1-i ; System.out.print("*"), j++);
            for(j=0 ; j<2*i-1 ; System.out.print(" "), j++);
            for(j=0 ; j<n/2 +1 -i ; System.out.print("*"), j++);
        }

        for(i=0 ; i<n/2 ; System.out.println(""), i++){
            if(i==n/2-1){
                for(j=0 ; j<n ; System.out.print("*"), j++);
                break;
            }

            for(j=0 ; j<i+2 ; System.out.print("*"), j++);
            for(j=0 ; j<n-2*(i+2) ; System.out.print(" "), j++);
            for(j=0 ; j<i+2 ; System.out.print("*"), j++);
        }

    }
}
