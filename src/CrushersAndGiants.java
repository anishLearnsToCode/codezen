import java.util.Scanner;

public class CrushersAndGiants {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str;
        int ans;

        System.out.print("Enter string : ");
        str = s.next();

        ans = crusherAndGiant(str);
        System.out.println(ans);
    }

    public static int crusherAndGiant(String str){
        int i, sum, pointer, giant;

        for(i=0, sum=0, pointer=-1 ; i<str.length() ; i++) {
            if ((i == 0) && (str.charAt(i) == 'G')) {
                pointer = -1;
                continue;
            }

            if(str.charAt(i) == 'C'){
                giant = i-pointer-1;
                if(pointer == -1){
                    if(giant <= 2)
                        sum += giant;
                    else
                        sum += 2;
                }else {
                    if (giant <= 4)
                        sum += giant;
                    else
                        sum += 4;
                }

                pointer = i;
                continue;
            }

            if((i == str.length()-1) && (str.charAt(i) == 'G')){
                giant = str.length() - 1-pointer;
                if(giant<=2)
                    sum += giant;
                else
                    sum += 2;

                break;
            }
        }

        return sum;
    }
}
