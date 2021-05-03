
import java.util.Random;
import java.util.Scanner;

public class LuckySeven {

	public static void main(String[] args) {
		
		        
		        int money, randomNumber, randomNumber2, randomNumber3;
		        
		        Scanner scan = new Scanner(System.in);
		        int playAgain = 1;
		        Random random = new Random();
		        
		        
		        
		        do {
		        //Adding money with Scanner	
	            System.out.println("How much money do you have?");
		        
	           
	            
		        for (money = scan.nextInt(); money >= 0; money--) {
		        	   
		        	//Printing out 3 random numbers
		        	    
		        	    randomNumber = random.nextInt(10)+ 1;
				        randomNumber2 = random.nextInt(10)+ 1;
				        randomNumber3 = random.nextInt(10)+ 1;
				        
				        System.out.println(randomNumber);
				        System.out.println(randomNumber2);
				        System.out.println(randomNumber3);
				      
		        	
		        	if (randomNumber == 7 && randomNumber2== 7 && randomNumber3 ==7) {
		        		money += 10;
		        		System.out.println("You win! Your money is: " +money);
		        		
		        	   } else if (randomNumber == 7 && randomNumber2 == 7) {
		        		money += 5;
		        		System.out.println("You win! Your money is: " +money);
		        		
		        	   } else if (randomNumber == 7 && randomNumber3 == 7) {
		        		money += 5;
		        		System.out.println("You win! Your money is: " +money);
		        		
		        	   } else if (randomNumber2 == 7 && randomNumber3 == 7) {
		        	   	money += 5;
		        		System.out.println("You win! Your money is: " +money);
		        		
		        	   } else if (randomNumber == 7) {
		        		money += 3;
		        		System.out.println("You win! Your money is: " +money);
		        		
		        	   } else if (randomNumber2 == 7) {
		        		money += 3;
		        		System.out.println("You win! Your money is: " +money);
		        		
		        	   } else if (randomNumber3 == 7) {
		        	 	money += 3;
		        		System.out.println("You win! Your money is: " +money);
		        		
		        	   } else {
		        		System.out.println("You lose! Your money is: " +money);
		        	   }
		        	
		        	
		        	if (money == 0) {
		        		System.out.println("Do you want to play again? (yes = 1/no = 2)");
				        playAgain = scan.nextInt();
		        	} 
		        
		        
		        
		        }
		        
	           } while (playAgain == 1);
		        System.out.println("End"); 
		    }
		
	}


