import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num: ");
        int found =0;
        int aNum = sc.nextInt();
            for(int i=2; i<=aNum; i*=2){
                if(aNum%i==0){
                    found =1;
                }else{
                    found=0;
                }
            }if(found==1){
            System.out.println("yes its the factor of power of 2");
        }else{
            System.out.println("no its not the factor of power of 2");
        }

    }
}