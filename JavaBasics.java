import java.util.Scanner;

public class JavaBasics {

    public static boolean isPrime(int n){
        if(n == 2){
            return true;
        }

        for(int i=0; i<=Math.sqrt(n); i++){
            if(n % 2 == 0){
                return false;
            }
        }
        return true;
    }

    public static void primeNo(int start, int end){
        for(int i=start; i<=end; i++){
            if(isPrime(i) == true){
                System.out.print(i+ " ");
            }
        }
        return;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        primeNo(1, 100);

        //Reverse Number
        // int n = 29052005;
        // int rev = 0;

        // for(int i=0; i<n; i++){
        //     int lastDigit = n % 10;
        //     rev = (rev * 10) + lastDigit;
        //     System.out.print(lastDigit);
        //     n = n / 10;
        // }

        // while(n > 0){
        //     int lastDigit = n % 10;
        //     System.out.print(lastDigit);
        //     n =  n / 10;
        // }
        // System.out.println();

        // while(n > 0){
        //     int lastDigit = n % 10;
        //     rev = (rev * 10) + lastDigit;
        //     n = n / 10;
        // }
        // System.out.println(rev);

    
        //Prime Number
        // System.out.print("Enter a number :");
        // int n = sc.nextInt(); 

        // if(n == 1){
        //     System.out.println("Prime Num.");
        // }else {
        //     boolean isPrime = true;
        //     for(int i=2; i<=Math.sqrt(n); i++){
        //         if(n % 2 == 0){
        //             isPrime = false;
        //         }
        //     }
        
        //     if(isPrime == true) {
        //         System.out.println("Prime Num.");
        //     }else{
        //         System.out.println("Not Prime Num.");
        //     }
        // }

        // (Question 2)
        // int even = 0;
        // int odd = 0;

        // System.out.println("Enter the start num: ");
        // int start = sc.nextInt();
        // System.out.println("Enter the last num: ");
        // int last = sc.nextInt();

        // for(int i=start; i<=last; i++){
        //     if(i % 2 == 0){
        //         even += i;
        //     }else {
        //         odd += i;
        //     }
        // }
        // System.out.println("The sum of even numbers is : " + even + " and odd number is : " + odd);

        //Factorial (Question 3) 
        // System.out.print("Enter a number whose factorial is to find : ");
        // int n = sc.nextInt();

        // int fact = 1;
        // for(int i=n; i>1; i--){
        //     fact = fact * i;
        // }
        // System.out.println("Factorial of number is : " + fact);

        //Multiplication Table (Question 4)
        // System.out.print("Enter the number whose table is to find : ");
        // int n = sc.nextInt();

        // for(int i=1; i<=10; i++){
        //     System.out.println(n * i);
        // }
    }
}
