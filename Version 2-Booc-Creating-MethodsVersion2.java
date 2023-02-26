/*Dave Gerald C. Booc
 * Creating Methods : Version 2
 */


import java.util.Scanner;

public class CreatingMethods {
	
	static int position; // global variables declarations
	static int plposition;
	public static void main(String[] args) {
		
		int score = 0;
		String  playerName;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter Player's name: ");
		playerName = scn.nextLine();
		
		System.out.print("Enter Player's score : ");
		score = scn.nextInt();
		
		CalcuPosition(score);
	
		PlayerNamePosition(playerName);
		
		
		
	}
	
	public static void CalcuPosition(int plscore) {
		
		//players scores  match with equivalent positions
		if (plscore >= 1000)
			plposition = 1;
		else if( plscore < 1000 && plscore >= 500)
			plposition = 2;
		else if(plscore > 100 && plscore < 500 )
			plposition = 3;
		else if (plscore > 0)
			System.out.println("score and position is undefined");
		else 
			plposition = 4;
		
		//display score and position
		System.out.println();
		System.out.println("     Score" +     " Position "    );
		System.out.println("     "+ plscore + "  =    " + plposition );
		
		
		
		}
		
	
	public static void PlayerNamePosition(String playerName) {
		
		//display player's name and position
		System.out.println();
		System.out.println("     Player Name " + "    Position "          );
		System.out.println("       "+playerName + "        " + plposition );
		
	
		
		
	}
	
	

}
