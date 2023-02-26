/*Dave Gerald C. Booc
 * Creating Methods : Version 1
 */


import java.util.Scanner;

public class CreatingMethods {
	public static void main(String[] args) {
		
		//function method call
		CalcuPosition();
		PlayerNamePosition();
			
	}
	
public static void CalcuPosition() {
		
		int plscore = 0;
		int plposition = 0;
		
		Scanner scn = new Scanner(System.in);
		//user input player's score
		System.out.print("Enter Players Score : ");
		plscore = scn.nextInt();
		
		//players scores  match with equivalent positions	
		if (plscore >= 1000)
			plposition = 1;
		else if( plscore < 1000 && plscore >= 500)
			plposition = 2;
		else if(plscore > 100 && plscore < 500 )
			plposition = 3;
		else 
			plposition = 4;
		
		
		//display scores and position
		System.out.println();
		System.out.println("     Score" +     " Position "    );
		System.out.println("     "+ plscore + "  =    " + plposition );
		
	
		
		}
		
	
public static void PlayerNamePosition() {
		
		String playerName;
		int playerPos;
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("");
		
		//user input player name and position 1 - 4 
		System.out.print("Enter player's name: ");
		playerName = scan.nextLine();
		
		System.out.print("Enter player's position [1-4]: ");
		playerPos = scan.nextInt();
		if (playerPos > 4)
			System.out.println("Invalid position, Please Rerun the program.'");
		else {
			//display player's name and position
			System.out.println();
			System.out.println("     Player Name " + "    Position "          );
			System.out.println("       "+playerName + "        " + playerPos );
		}
		
	}
	
	

}