import java.util.Scanner;

public class MinimumAbsaluteDifference {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size;

        System.out.print("Size : ");
        size=s.nextInt();

        int arr[] = new int[size];

        initialize(arr);
        //arr_input(arr);
        absolute(arr);
        arr = mergeSort(arr);

        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+ " ");
        }

        //System.out.println(minAbsoluteDifference(arr));
        System.out.println("\n"+minDifference(arr));
    }

    public static void arr_input(int arr[]){
        Scanner s= new Scanner(System.in);
        for(int i=0 ; i<arr.length ; arr[i]=s.nextInt(), i++);
    }

    public static void initialize(int arr[]){
        for(int i=0 ; i<arr.length ; arr[i]=arr.length-i, i++);
    }

    public static void absolute(int arr[]){
        for(int i=0 ; i<arr.length ; arr[i]=Math.abs(arr[i]), i++);
    }

    public static int minAbsoluteDifference(int arr[]){
        int i, j, k;

        for(i=0, k=Integer.MAX_VALUE ; i<arr.length ; i++){
            for(j=i+1 ; j<arr.length ; j++){
                if(Math.abs(arr[i]-arr[j])<k)
                    k=Math.abs(arr[i]-arr[j]);
            }
        }

        return k;
    }

    public static int minDifference(int arr[]){
        int i, k;

        for(i=0, k=Integer.MAX_VALUE ; i<arr.length-1 ; i++){
            if((arr[i+1]-arr[i])<k)
                k=arr[i+1]-arr[i];
        }

        return k;
    }

    public static int[] mergeSort(int[] arr){
        // Write your code here

        int i, head=arr.length;

        if(arr.length==1){
            return arr;
        }

        int arr1[] = new int[head/2];
        int arr2[] = new int[(head+1)/2];

        for(i=0 ; i<head/2 ; arr1[i]=arr[i], i++);
        for(i=head/2 ; i<head ; arr2[i-head/2]=arr[i], i++);

        //System.out.println("");
        //base_cls.arr_display(arr1);
        //System.out.println("");
        //base_cls.arr_display(arr2);

        arr1=mergeSort(arr1);
        arr2=mergeSort(arr2);

        return merge(arr1, arr2);

    }

    public static int[] merge(int arr1[], int arr2[]){
        int i, j1, j2, k, p;
        int output[] = new int[arr1.length+arr2.length];
        boolean flag;

        for(i=0, j1=0, j2=0, flag=false ; i<output.length ; i++){
            if(arr1[j1]<arr2[j2]){
                output[i]=arr1[j1];
                j1++;
            }

            else if(arr2[j2]<=arr1[j1]){
                output[i]=arr2[j2];
                j2++;
            }

            if((j1==arr1.length) || (j2==arr2.length)){
                flag=true;
                break;
            }
        }

        if(flag){

            if(j2==arr2.length) {
                for (; j1 < arr1.length; j1++) {
                    for (k = j1 + 1, p=j1 ; k < arr1.length; k++) {
                        if (arr1[k] < arr1[p]) {
                            p = k;
                        }
                    }

                    output[j1+j2]=arr1[p];
                }


            }

            else{
                for( ; j2<arr2.length ; j2++){
                    for(k=j2+1 , p=j2 ; k<arr2.length ; k++){
                        if(arr2[k]<arr2[p]){
                            p = k;
                        }
                    }

                    output[j1+j2]=arr2[p];
                }
            }
        }

        return output;

    }
}

