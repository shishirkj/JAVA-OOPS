package javacourse;



import java.util.Scanner;

public class Prime {


    public static void main(String args[]) {

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int m  = n/2;
        if(n<=1){
            System.out.println("Not a prime number");
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                System.out.println("not a prime number");
                break;
            }
            else{
                System.out.println("prime number");
                break;
            }
        }




    }




}
