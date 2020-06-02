import java.util.Scanner;
public class TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner  s= new Scanner(System.in);
        int n;

        n = s.nextInt();

        pattern(n);
    }

    public static void pattern(int n){
        int i, j, num;

        for(i=0, num=1 ; i<n ; System.out.println(""), i++){
            for(j=0 ; j<n-i-1 ; System.out.print(" "), j++);
            for(j=0, num=i+1 ; j<i+1 ; System.out.print(num), j++, num++);
            for(j=0 ; j<i ; System.out.print(num), j++, num--){
                if(j==0)
                    num = num-2;
            }
        }
    }
}
