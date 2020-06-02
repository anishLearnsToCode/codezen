import java.util.Scanner;
public class NumberPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;

        System.out.print("Lines : ");
        n = s.nextInt();

        pattern(n);
    }

    public static void pattern(int n){
        int i, j;

        for(i=0 ; i<n ; System.out.println(""), i++){
            for(j=0 ; j<n ; j++){
                if(j<i){
                    System.out.print(n-i+j);
                }else
                    System.out.print(n);
            }
        }
    }
}
