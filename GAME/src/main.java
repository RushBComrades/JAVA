import java.util.Scanner;
public class main {
	public static void main(String[] args) {
		
		System.out.println("Player 1 will choose his 8 ship locations first.");
		map.looper(0, "Player1");
		map.printMap(1);
		System.out.println("Player 2 will now choose his ship locations.");
		map.looper(0, "Player2");
		map.printMap(2);
		while(1==1) {
			attack.attack("Player2");
			attack.printAttackMap(2);
			attack.attack("Player1");
			attack.printAttackMap(1);
			if(attack.player1ships == 0) {
				System.out.println("Player 2 has won! \n Exiting game.");
				break;
			}
			if(attack.player2ships == 0) {
				System.out.println("Player 1 has won! \n Exiting game.");
				break;
			}
		}
		
	}
}
