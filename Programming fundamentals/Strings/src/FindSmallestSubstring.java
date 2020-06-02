import java.util.Scanner;
public class FindSmallestSubstring {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String large, small, ans;

        large = s.nextLine();
        small = s.nextLine();

        ans = findMinSubstringContainingString(large, small);
        System.out.println(ans);

        //arr_display(index(large));
        //arr_display(index(small));
        //System.out.println(index_compare(index(large), index(small)));
    }

    public static void arr_display(int arr[]){
        for(int i=0 ; i<arr.length ; System.out.print(arr[i]+" "), i++);
        System.out.println();
    }

    public static String findMinSubstringContainingString(String large, String small){
        int i, j, k, largeArr[][], smallArr[][] = index(small);
        String ans="", sub="";
        boolean flag = false;

        for(i=0 ; i<=large.length() - small.length() ; sub="", i++){

            for(j=0, k=i ; j<small.length() ; j++, k++){
                if(j == large.length()-1)
                    break;

                sub += large.charAt(k);
                if(large.charAt(k)==' ')
                    j--;
            }

            largeArr = index(sub);

            if(index_compare(smallArr, largeArr)){
                ans = sub;
                flag = true;
                break;
            }
        }

        if(!flag)
            ans = "null";
        else{
            if(ans.charAt(0)==' '){
                for(i=0 ; i<ans.length() ; i++){
                    if(ans.charAt(i)!=' '){
                        ans = ans.substring(i);
                        break;
                    }
                }
            }
        }

        return ans;
    }

    public static int[][] index(String str){
        int ans[][] = new int[2][26];
        int i;

        for(i=0 ; i<26 ; ans[0][i]=0, ans[1][i]=0, i++);

        for(i=0 ; i<str.length() ; i++){
            if((str.charAt(i)==' ') || is_upper((str.charAt(i))))
                continue;

            ans[0][str.charAt(i)-97]++;
        }

        for(i=0 ; i<str.length() ; i++){
            if((str.charAt(i)==' ') || is_lower(str.charAt(i)))
                continue;

            ans[1][str.charAt(i)-65]++;
        }

        return ans;
    }

    public static boolean index_compare(int arr1[][], int arr2[][]){
        int i;
        boolean flag=true;

        for(i=0 ; i<arr1[0].length ; i++){
            if(arr1[0][i]!=arr2[0][i]){
                flag = false;
                break;
            }
        }

        if(flag){
            for(i=0 ; i<arr1[1].length ; i++){
                if(arr1[1][i]!=arr2[1][i]){
                    flag=false;
                    break;
                }
            }
        }

        return flag;
    }

    public static boolean is_upper(char ch){
        return ((ch<=90) && (ch>=65));
    }

    public static boolean is_lower(char ch){
        return ((ch<=122) && (ch>=97));
    }
}
