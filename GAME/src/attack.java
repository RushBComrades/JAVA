import java.util.Scanner;
public class attack extends map{
	static int player1ships = 8;
	static int player2ships =8;
	/*
	 *attack.attack("Player1"); code to hit P1
	 *attack.printAttackMap(1); code for player 2 to view their hit on P1
	 */
	public static void attack(String A) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the X-Coordinate of where you would like to attack");
		int x = input.nextInt();
		System.out.println("Enter the Y-Coordinate of where you would like to attack");
		int y = input.nextInt();
		if(A.equals("Player2")) {
			if(player2[x][y] == 1) {
				player2[x][y]= 0;
				player2Hits[x][y] = true;
				System.out.println("Hit at "+"("+x +","+y+")");
				player2ships--;
			}else {
				System.out.println("Miss at "+"("+x +","+y+")");
			}
		}else if(A.equals("Player1")) {
			if(player1[x][y] ==1) {
				player1[x][y]= 0;
				player1Hits[x][y] = true;
				System.out.println("Hit at "+"("+x +","+y+")");
				player1ships--;
			}else {
				System.out.println("Miss at "+"("+x +","+y+")");
			}
		}
	}
	public static void printAttackMap(int x) {
		if(x == 1) {
			for(int i = 0; i<player1Hits.length;i++) {
				for(int j =0; j<player1Hits[i].length;j++) {
					if(player1Hits[i][j]==true) {
						System.out.print("X ");
					}else{
						System.out.print("O ");
					}
				}
				System.out.println("");
			}
		}else if(x ==2) {
			for(int i =0; i<player2Hits.length;i++) {
				for(int j = 0;j<player2Hits[i].length; j++) {
					if(player2Hits[i][j]==true) {
						System.out.print("X ");
					}else {
						System.out.print("O ");
					}
				}
				System.out.println("");
			}
		}
	}
}
