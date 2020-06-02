import java.util.Scanner;

public class ElevationMap {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size, ans, ans2;

        System.out.print("Size : ");
        size=s.nextInt();

        int arr[] = new int[size];

        arr_input(arr);
        //ans = elevation(arr);
        //System.out.println(ans);
        ans2 = water(arr);
        System.out.println(ans2);
    }

    public static void arr_input(int arr[]){
        Scanner s = new Scanner(System.in);
        for(int i=0 ; i<arr.length ; i++){
            arr[i]=s.nextInt();
        }
    }

    public static int elevation(int arr[]){
        int i, j, k;

        for(i=1, k=0 ; i<arr.length ; i++){
            if(volume( maxtower(i, arr), i, arr) > k){
                k=volume(maxtower(i, arr), i, arr);
            }
            //System.out.println(volume(maxtower(i, arr), i, arr));
        }

        return k;
    }

    public static int maxtower(int index, int arr[]){
        int i, k;

        for(i=index-1, k=index-1 ; i>=0 ; i--){
            if(arr[i]>arr[k]){
                k=i;
            }
            if(arr[i]>arr[index]){
                break;
            }
        }

        return k;
    }

    public static int volume(int index1, int index2, int arr[]){
        int i, j, vol;
        vol = (index2-index1-1)*Math.min(arr[index1], arr[index2]);

        for(i=index1+1 ; i<index2 ; i++){
            vol = vol - arr[i];
        }

        return vol;
    }

    public static int water(int arr[]){
        int i, vol;

        for(i=arr.length-1, vol=0 ; i>0 ; ){
            if(arr[i]>0) {
                vol += volume(maxtower(i, arr), i, arr);
                i = maxtower(i, arr);
                System.out.println(vol +" "+i);
            }
            else{
                i--;
            }
        }
        return vol;
    }

    /*public static int getwater(int arr[]){
        int index1 = getindex1(arr);
        int index2 = getindex2(arr);
    }*/

    public static int getindex1(int arr[]){
        int i;

        for(i=0 ; i<arr.length ; i++){
            if(arr[i]>0){
                break;
            }
        }

        return i;
    }

    public static int getindex2(int arr[]){
        int i;

        for(i=arr.length-1 ; i>=0 ; i--){
            if(arr[i]>0){
                break;
            }
        }

        return i;
    }


}
