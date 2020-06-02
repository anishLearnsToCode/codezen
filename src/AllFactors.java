import java.util.Scanner;

public class AllFactors {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n, ans[], i;

        n = s.nextInt();

        ans = factors2(n);

        for (i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }

        System.out.println(cubefree(ans));

        cube_function(n);

        for(i=1 ; i<=n ; i++){
            System.out.println(i+ " "+ cubefree(factors2(i)));
        }
    }

    public static int[] factors(int n) {
        int i, j;
        int small_ans[] = {};

        if (n == 1) {
            int ans[] = new int[1];
            ans[0] = 1;
            return ans;
        }

        for (i = 2; i <= n; i++) {
            if (n % i == 0) {
                small_ans = factors(n / i);
            } else {
                i++;
            }
        }

        int ans[] = new int[small_ans.length + 1];
        return ans;
    }

    public static int[] factors2(int n) {
        int i, c, j, num = n;

        if(n==1){
            int ans[] = new int[1];
            ans[0]=1;
            return ans;
        }

        for (i = 2, c = 0; n != 1; ) {
            if (n % i == 0) {
                c++;
                n /= i;
                //System.out.println(i);
            } else {
                i++;
            }
        }

        int ans[] = new int[c];

        for (i = 2, j = 0; num != 1; ) {
            if (num % i == 0) {
                ans[j] = i;
                j++;
                num /= i;
            } else {
                i++;
            }
        }

        return ans;
    }

    public static boolean cubefree(int arr[]) {

        int i, j, c, k;
        boolean flag = true;

        for (i = 0, k = arr[0], c = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                c++;
                if (c == 3) {
                    flag = false;
                    break;
                }
            } else {
                c = 1;
                k = arr[i];
            }
        }

        return flag;
    }


    public static void cube_function(int n) {
        int ans[] = factors2(n);
        int i, c;

        if (cubefree(ans)) {
            for (i = 1, c = 0; i <= n; i++) {
                System.out.println(i);
                if (cubefree(factors2(i))) {
                    c++;
                }
            }

            System.out.println(c);
        } else {
            System.out.println("Not Cube Free");
        }
    }
}
