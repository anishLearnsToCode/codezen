import java.util.Scanner;

public class CubeFree {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;

        n=s.nextInt();

        //cube_free(n);
        System.out.println(is_cubeFree(n));
    }

    public static void cube_free(int num){

        int i, c, p;
        boolean flag=true;

        for(i=2, p=1 ; i<num/2 ; ){
            if(num%i==0){
                p*=i;
                if(!is_CubeFree(i)){
                    flag = false;
                    break;
                }
            }
            else{
                i++;
            }
        }

        if(flag){
            for(i=1, c=0 ; i<=num ; i++){
                if(is_CubeFree(i))
                    c++;
            }

            System.out.println(c);
        }else{
            System.out.println("Not Cube Free");
        }
    }



    public static boolean is_CubeFree(int num){

        int i;
        boolean flag=true;

        if(num==1){
            return true;
        }
        else if(num==2){
            return true;
        }
        else if(num==8){
            return false;
        }

        for(i=2 ; Math.pow(i, 3)<=num ; i++){
            if(Math.pow(i, 3)==num){
                flag =false;
                break;
            }
        }

        return flag;
    }

    public static boolean is_cubeFree(int n){

        int i, j;
        int arr[] = new int[intlen(n)];
        for(i=0 ; i<arr.length ; arr[i]=1, i++);

        for(i=2, j=0 ; i<n/2 ; ){
            if(n%i==0){
              arr[j]=i;
              n/=i;
              j++;
            }
            else{
                i++;
            }
        }

        for(i=0 ; i<arr.length ; i++){
            System.out.println(arr[i]+" ");
        }

        boolean flag=true;

        for(i=0 ; i<arr.length ; i++){
            flag = flag&&is_CubeFree(arr[i]);
        }

        return flag;
    }

    public static int intlen(int n){
        int i;

        for(i=0 ; n!=0 ; n/=10, i++);

        return i;
    }
}
