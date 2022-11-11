import java.util.*;
public class CheckPowerOfTwoWhile {
    public static void povOfTwo(int n){
        while(n%2==0){
            n=n/2;
        }
        if(n==1){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num: ");
        int i = sc.nextInt();
        povOfTwo(i);
    }
}
