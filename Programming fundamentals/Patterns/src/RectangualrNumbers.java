import java.util.Scanner;
public class RectangualrNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;

        System.out.print("Line : ");
        n = s.nextInt();

        pattern(n);
    }

    public static void pattern(int n){
        int i, j, k;

        for(i=0 ; i<n ; System.out.println(""), i++){
            for(j=0, k=n ; j<n-1 ; j++){
                System.out.print(k);

                if(j<i)
                    k--;
            }
            System.out.print(n-i);
            for(j=0, k=parse(n-i) ; j<n-1 ; j++){
                System.out.print(k);

                if(j>n-i-3)
                    k++;
            }
        }

        for(i=0 ; i<n-1 ; System.out.println(""), i++){
            for(j=0, k=n ; j<n-1 ; j++){
                System.out.print(k);

                if(j<n-i-2)
                    k--;
            }
            System.out.print(2+i);
            for(j=0, k=2+i ; j<n-1 ; j++){
                System.out.print(k);

                if(j>i-1)
                    k++;
            }
        }
    }

    public static int parse(int n){
        int ans;

        if(n==1)
            ans =2;
        else
            ans = n;

        return ans;
    }
}
