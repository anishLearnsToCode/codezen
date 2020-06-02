import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner  s= new Scanner(System.in);
        int n, m, i, j, ans;

        System.out.print("Enter row and col : ");
        n =s.nextInt();
        m = s.nextInt();

        int arr[][] = new int[n][m];

        for(i=0 ; i<n ; i++){
            for(j=0 ; j<m ; j++)
                arr[i][j] = s.nextInt();
        }

        ans = coverage(arr);
        System.out.println(ans);
    }

    public static int coverage(int arr[][]){
        int i, j, sum;

        for(i=0, sum=0 ; i<arr.length ; i++){
            for(j=0 ; j<arr[0].length ; j++){
                if(arr[i][j] == 0){
                    sum += countCoverage(i, j, arr);
                }
            }
        }

        return sum;
    }

    public static int countCoverage(int index1, int index2, int arr[][]){
        int sum, i;

        //vertical
        for(i = index1-1, sum=0 ; i<=index1+1 ; i++){
            if((i==index1) || !(i>=0) || !(i<arr.length))
                continue;

            sum += arr[i][index2];
        }
        //System.out.println(sum);

        //horizontal
        for(i=index2-1 ; i<=index2+1 ; i++){
            if((i==index2) || !(i>=0) || !(i<arr[0].length))
                continue;

            sum += arr[index1][i];
        }
        //System.out.println(sum);

        return sum;
    }
}