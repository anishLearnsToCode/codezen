import java.util.Scanner;

public class AddBinary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n1, n2, ans;

        System.out.print("Number 1 : ");
        n1=s.nextLong();
        System.out.print("Number 2 : ");
        n2=s.nextLong();

        ans = addBinary(n1, n2);

        System.out.println(ans);
    }

    public static long addBinary(long n1, long n2){
        long num = BinToDec(n1)+ BinToDec(n2);
        long ans = DecToBin(num);
        return ans;
    }

    public static long BinToDec(long n){
        int i, sum;

        for(i=0, sum=0 ; n!=0 ; n/=10, i++){
            sum+=n%10*Math.pow(2, i);
        }

        return sum;
    }

    public static long DecToBin(long n){
        int i;
        long sum;

        for(i=0, sum=0 ; n!=0 ; n/=2, i++){
            sum= sum + n%2*((long)Math.pow(10, i));
        }

        return sum;
    }
}
