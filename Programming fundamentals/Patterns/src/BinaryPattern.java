import java.util.Scanner;
public class BinaryPattern {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n;

        System.out.print("Lines : ");
        n = s.nextInt();

        pattern(n);
    }

    public static void pattern(int n){
        int i, j;
        char ch;

        for(i=0 ; i<n ; System.out.println(""), i++){
            if((i+2)%2==0)
                ch='1';
            else
                ch='0';

            for(j=0 ; j<n-i ; System.out.print(ch), j++);
        }
    }
}
