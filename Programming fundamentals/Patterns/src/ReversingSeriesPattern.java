import java.util.Scanner;
public class ReversingSeriesPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;

        System.out.print("Lines : ");
        n = s.nextInt();

        print(n);
    }

    public static void print(int n){
        int i, j, num;

        for(num=1, i=0 ; i<n ; System.out.println(""), i++){
            if((i+2)%2==0) {
                for (j = 0; j < i + 1; System.out.print(num + " "), j++, num++) ;
                num = num + i + 1;
            }
            else {
                for (j = 0; j < i + 1; System.out.print(num + " "), num--, j++) ;
                num = ((i+1)*(i+2))/2 + 1;
            }
        }
    }
}
