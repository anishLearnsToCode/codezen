import java.util.Scanner;

public class SmallestPair {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size, ans;

        System.out.print("Size : ");
        size=s.nextInt();

        int arr[] = new int[size];
        ElevationMap.arr_input(arr);
        ans = pair(size, arr);

        System.out.println(ans);
    }

    public static int pair(int n, int arr[]){
        int i, sum, j;

        for(i=0, sum=Integer.MAX_VALUE ; i<arr.length ;  i++){
            for(j=0 ; j<arr.length ; j++){
                if(i==j){
                    continue;
                }

                if(arr[i]+arr[j]<sum){
                    sum=arr[i]+arr[j];
                }
            }
        }

        return sum;
    }
}
