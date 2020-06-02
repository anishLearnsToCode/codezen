import java.util.Scanner;

public class MinimumSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size, ans;

        System.out.print("Size : ");
        size=s.nextInt();

        int arr1[] = new int[size];
        int arr2[] = new int[size];

        ElevationMap.arr_input(arr1);
        ElevationMap.arr_input(arr2);

        ans = min_sum(arr1, arr2);

        System.out.println(ans);
    }

    public static int min_sum(int arr1[], int arr2[]){
        int i, j, k=Integer.MAX_VALUE;

        for(i=0 ; i<arr1.length ; i++){
            for(j=0 ; j<arr2.length ; j++){
                if(i==j){
                    continue;
                }

                if(arr1[i]+arr2[j]<k){
                    k=arr1[i]+arr2[j];
                }
            }
        }

        return k;
    }

    public static int min_sum2(int arr[]){
        int i, j, k;

        int arr1[] = new int[arr.length/2];
        int arr2[] = new int[arr.length/2];

        for(i=0 ; i<arr.length ; arr1[i]=arr[i], i++);
        for(i=0 ; i<arr.length ; arr2[i]=arr[i+arr2.length], i++);

        return min_sum(arr1, arr2);
    }
}
