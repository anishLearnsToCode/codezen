import java.util.Scanner;

public class BirthdayTask {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size, ans;

        System.out.print("Size : ");
        size=s.nextInt();

        int arr1[] = new int[size];
        int arr2[] = new int[size];

        arr_input(arr1);
        arr_input(arr2);

        ans = task(arr1, arr2);
        System.out.println(ans);
    }

    public static void arr_input(int arr[]){
        Scanner s = new Scanner(System.in);

        for(int i=0 ; i<arr.length ; i++){
            arr[i]=s.nextInt();
        }
    }

    public static int task(int arr1[], int arr2[]){
        int i, sum1, sum2, ans;

        for(i=0, sum1=0, sum2=0 ; i<arr1.length ; i++){
            if(i%2==0){
                sum1 += arr1[i];
                sum2 += arr2[i];
            }else{
                sum1 += arr2[i];
                sum2 += arr1[i];
            }
        }

        System.out.println("sum1 : "+sum1);
        System.out.println("sum2 : "+sum2);

        if(sum1>=sum2){
            ans = sum2;
        }
        else{
            ans = sum1;
        }

        return ans;
    }
}
