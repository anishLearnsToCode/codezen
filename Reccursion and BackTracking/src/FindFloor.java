import java.util.Scanner;
public class FindFloor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n, x, ans;

        System.out.print("Size : ");
        n = s.nextInt();

        int arr[] = new int[n];
        arr_input(arr);

        System.out.print("Element : ");
        x =s.nextInt();

        ans = binarySearch(arr, x);
        System.out.println(arr[ans]);
    }

    public static void arr_input(int arr[]){
        Scanner s = new Scanner(System.in);
        for(int i=0 ; i<arr.length ; arr[i]=s.nextInt(), i++);
    }

    public static int binarySearch(int arr[], int x){
        int i, tail, head;

        for(i=0, tail=0, head=arr.length ;(tail!=head) && (tail!=head-1) ; ){

            if(arr[(tail + head)/2]==x){
                return (tail + head)/2;
            }
            else if(arr[(tail+head)/2]>x){
                head = (tail+head)/2;
            }
            else if(arr[(tail+head)/2]<x){
                tail = (tail+head)/2;
            }
        }

        return (tail+head)/2;
    }
}
