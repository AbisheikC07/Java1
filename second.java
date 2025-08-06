package over;
import java.util.Scanner;

public class second {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter a number: ");
	        int num = scanner.nextInt();
	        
	        if (isPrime(num)) {
	            System.out.println(num + " is a prime number.");
	        } else {
	            System.out.println(num + " is not a prime number.");
	        }
	        
	        scanner.close();
	    }
	    
	    public static boolean isPrime(int n) {
	        if (n <= 1) {
	            return false;  
	        }
	        
	        // Check for factors from 2 to sqrt(n)
	        for (int i = 2; i <= Math.sqrt(n); i++) {
	            if (n % i == 0) {
	                return false; 
	            }
	        }
	        return true;
	    }
	}



