import java.util.Scanner;

public class PrimeNumberChecker{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        int number= scanner.nextInt();
        if(Prime(number)){
            System.out.println(number+ " is a prime number");
        }
        else{
            System.out.println(number+ "is not a prime number");
        }
        scanner.close();


        
    }
    private static boolean Prime(int num){

        if(num<=1){
            return false;

        }
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    
}
