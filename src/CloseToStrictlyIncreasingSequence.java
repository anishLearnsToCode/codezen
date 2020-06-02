import java.util.Scanner;

public class CloseToStrictlyIncreasingSequence {
    public static void main(String[] args) {
        Scanner  s= new Scanner(System.in);
        int size;
        boolean ans;

        System.out.print("Size : ");
        size=s.nextInt();

        int arr[] = new int[size];

        for(int i=0 ; i<size ; arr[i]=s.nextInt(), i++);

        ans = sequence(arr);
        System.out.println(ans);
    }

    public static boolean sequence(int arr[]){
        int i, j, k;
        boolean flag=true;

        for(i=1, k=0, j=0 ; i<arr.length ; i++){
            if(arr[i]<arr[j]) {
                k++;
            }else{
                j=i;
            }

            if(k==2){
                flag= false;
                break;
            }
        }

        return flag;
    }
}
