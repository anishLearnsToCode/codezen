import java.util.Scanner;

public class NewPosition {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n, k, ans;

        System.out.print("Numbers : ");
        n=s.nextLong();
        System.out.print("Position : ");
        k=s.nextLong();

        ans = position(n , k);

        System.out.println(ans);
        //System.out.println(n/2);
        //System.out.println((n+1)/2);
    }

    public static long position(long n, long k){
        long ans=0;

        if(k<=(n+1)/2){
            ans = 2*k-1;
        }
        else{
            ans = 2*(k-(n+1)/2);
        }

        return ans;
    }
}
