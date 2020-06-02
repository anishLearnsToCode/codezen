import java.util.Scanner;
public class RatInAMaze {
    public static void main(String[] args) {
        Scanner  s= new Scanner(System.in);
        int n, i, j, ans;

        System.out.print("n : ");
        n = s.nextInt();

        int arr[][] = new int[n][n];
        int position[][] = new int[n][n];
        int tempArr[] = new int[n];
        for(i=0 ; i<n ; i++){
            for(j=0 ; j<n ; j++){
                position[i][j]=0;
            }
        }

        arr_input2D(arr);
        //arr_display2D(position);

        ratInAMaze2(0, 0, arr, position, n);

        initialize(position);
        ratInAMaze(0, 0, arr, position, n);

        initialize(position);
        maze(0, 0, arr, position, n);

        initialize(position);
        maze2(0, 0, arr, position, n);
    }

    public static void arr_input2D(int arr[][]){
        Scanner  s= new Scanner(System.in);
        int i, j;

        for(i=0 ; i<arr.length ; i++){
            for(j=0 ; j<arr[0].length ; arr[i][j] = s.nextInt(), j++);
        }
    }

    public static void arr_display2D(int arr[][]){
        int i, j;

        for(i=0 ; i<arr.length ; System.out.println(""), i++){
            for(j=0 ; j<arr[i].length ; j++){
                System.out.print(arr[i][j]+" ");
            }
        }
    }

    public static void initialize(int arr[][]){
        int i, j;

        for(i=0 ; i<arr.length ; i++){
            for(j=0 ; j<arr.length ; j++){
                arr[i][j]=0;
            }
        }

        System.out.println("");
    }

    public static void ratInAMaze(int row, int col, int arr[][], int position[][], int n){
        //System.out.println(row + " " + col);
        //arr_display2D(position);
        //System.out.println("");

        if((row == n-1) && (col == n-1)){
            System.out.println("result");
            position[n-1][n-1]=1;
            print(position, n);
            position[n-1][n-1]=0;
            return;
        }

        //Up
        if((row>0) && (position[row-1][col]!=1) && (arr[row-1][col]!=0)){
            position[row][col]=1;
            ratInAMaze(row-1, col, arr, position, n);
        }
        //Right
        if((col<n-1) && (position[row][col+1]!=1) && (arr[row][col+1]!=0)){
            position[row][col]=1;
            ratInAMaze(row, col+1, arr, position, n);
        }
        //Down
        if((row<n-1) && (position[row+1][col]!=1) && (arr[row+1][col]!=0)){
            position[row][col]=1;
            ratInAMaze(row+1, col, arr, position, n);
        }
        //Left
        if((col>0) && (position[row][col-1]!=1) && (arr[row][col-1]!=0)){
            position[row][col]=1;
            ratInAMaze(row, col-1, arr, position, n);
        }

        position[row][col]=0;
        return;
    }

    public static void ratInAMaze2(int row, int col, int arr[][], int position[][], int n){
        //System.out.println(row + " " + col);
        //arr_display2D(position);
        //System.out.println("");

        if((row == n-1) && (col == n-1)){
            System.out.println("result");
            position[n-1][n-1]=1;
            print(position, n);
            position[n-1][n-1]=0;
            return;
        }

        //Down
        if((row<n-1) && (position[row+1][col]!=1) && (arr[row+1][col]!=0)){
            position[row][col]=1;
            ratInAMaze(row+1, col, arr, position, n);
        }
        //Up
        if((row>0) && (position[row-1][col]!=1) && (arr[row-1][col]!=0)){
            position[row][col]=1;
            ratInAMaze(row-1, col, arr, position, n);
        }
        //Right
        if((col<n-1) && (position[row][col+1]!=1) && (arr[row][col+1]!=0)){
            position[row][col]=1;
            ratInAMaze(row, col+1, arr, position, n);
        }

        //Left
        if((col>0) && (position[row][col-1]!=1) && (arr[row][col-1]!=0)){
            position[row][col]=1;
            ratInAMaze(row, col-1, arr, position, n);
        }

        position[row][col]=0;
        return;
    }

    public static void maze(int row, int col, int arr[][], int position[][], int n){
        if((row == n-1) && (col == n-1)){
            System.out.println("result");
            position[n-1][n-1]=1;
            print(position, n);
            position[n-1][n-1]=0;
            return;
        }

        //Left
        if((col>0) && (position[row][col-1]!=1) && (arr[row][col-1]!=0)){
            position[row][col]=1;
            ratInAMaze(row, col-1, arr, position, n);
        }
        //Right
        if((col<n-1) && (position[row][col+1]!=1) && (arr[row][col+1]!=0)){
            position[row][col]=1;
            ratInAMaze(row, col+1, arr, position, n);
        }
        //Up
        if((row>0) && (position[row-1][col]!=1) && (arr[row-1][col]!=0)){
            position[row][col]=1;
            ratInAMaze(row-1, col, arr, position, n);
        }
        //Down
        if((row<n-1) && (position[row+1][col]!=1) && (arr[row+1][col]!=0)){
            position[row][col]=1;
            ratInAMaze(row+1, col, arr, position, n);
        }

        position[row][col]=0;
        return;
    }

    public static void maze2(int row, int col, int arr[][], int position[][], int n){
        if((row == n-1) && (col == n-1)){
            System.out.println("result");
            position[n-1][n-1]=1;
            print(position, n);
            position[n-1][n-1]=0;
            return;
        }

        //Up
        if((row>0) && (position[row-1][col]!=1) && (arr[row-1][col]!=0)){
            position[row][col]=1;
            ratInAMaze(row-1, col, arr, position, n);
        }
        //Left
        if((col>0) && (position[row][col-1]!=1) && (arr[row][col-1]!=0)){
            position[row][col]=1;
            ratInAMaze(row, col-1, arr, position, n);
        }
        //Down
        if((row<n-1) && (position[row+1][col]!=1) && (arr[row+1][col]!=0)){
            position[row][col]=1;
            ratInAMaze(row+1, col, arr, position, n);
        }
        //Right
        if((col<n-1) && (position[row][col+1]!=1) && (arr[row][col+1]!=0)){
            position[row][col]=1;
            ratInAMaze(row, col+1, arr, position, n);
        }

        position[row][col]=0;
        return;
    }

    public static void print(int arr[][], int n){
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<n ; j++){
                System.out.print(arr[i][j]+" ");
            }
        }
        System.out.println("");
    }
}
