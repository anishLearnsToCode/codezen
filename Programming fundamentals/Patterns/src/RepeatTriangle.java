import java.util.Scanner;
public class RepeatTriangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;

        System.out.print("Lines : ");
        n = s.nextInt();

        print(n);
    }

    public static void print(int n){
        int i, j;
        char ch='A';
        String first="", last="";

        for(i=0 ; i<n ; i++){
            first = first + (char)('A'+i);
            last = (char)('A'+i) + last;
        }

        for(i=0 ; i<n ; i++){
            for(j=0 ; j<i ; System.out.print(" "), j++);
            System.out.print(first.substring(0, first.length()-i));
            System.out.println(last.substring(i));
        }
    }
}
