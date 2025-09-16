package tuition;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		
		 Scanner in = new Scanner(System.in);
	        System.out.print("Enter number: ");
	        int num = in.nextInt();

	        if (num == 1) {
	            System.out.println(num + " is not a twisted prime number");
	        }
	        else {
	            boolean isPrime = true;
	            for (int i = 2; i <= num/2 ; i++) {
	                if (num % i == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }
	            
	            if (isPrime) {
	                
	                int t = num;
	                int revNum = 0;
	                
	                while (t != 0) {
	                    int digit = t % 10;
	                    t /= 10;
	                    revNum = revNum * 10 + digit;
	                }
	                
	                for (int i = 2; i <= revNum/2; i++) {
	                    if (revNum % i == 0) {
	                        isPrime = false;
	                        break;
	                    }
	                }
	            }
	            
	            if (isPrime)
	                    System.out.println(num + " is a twisted prime number");
	                else
	                    System.out.println(num + " is not a twisted prime number");
	            }
        
		}
	}


