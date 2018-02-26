import java.util.Scanner;
public class map {
	//initial amount of ships
	//max ships
	static int MAXSHIPS = 8;
	//Array for both players
	static boolean [][] player1 = new boolean [5][5];
	static boolean [][] player2 = new boolean [5][5];
	//sets ships
	public static void looper(int a, String Player) {
		Scanner input = new Scanner(System.in);
		while(a<MAXSHIPS) {
			System.out.println("You have "+(MAXSHIPS - a)+ " ships left.");
			System.out.println("Enter the X coordinate");
			int x = input.nextInt();
			System.out.println("Enter the Y coordinate");
			int y = input.nextInt();
			if(Player.equals("Player1")) {
				player1[x][y] =true;
			}
			if(Player.equals("Player2")) {
				player2[x][y] =true;
			}
			a++;
		}
	}

	//set other values in array as false
	public static void setFalse() {
		for(int i = 0; i<player1.length; i++) {
			for(int j = 0; j<player1[i].length;j++) {
				if(player1[i][j] =! true) {
					player1[i][j] = false;
				}
			}
		}
		for(int i = 0; i<player2.length; i++) {
			for(int j = 0; j<player2[i].length;j++) {
				if(player2[i][j] =! true) {
					player2[i][j] = false;
				}
			}
		}
	}
	//print map for either player
	public static void printMap(int x) {
		if(x == 1) {
			for(int i = 0; i<player1.length;i++) {
				for(int j =0; j<player1[i].length;j++) {
					if(player1[i][j]==true) {
						System.out.print("X ");
					}else {
						System.out.print("O ");
					}
				}
				System.out.println("");
			}
		}else if(x ==2) {
			for(int i =0; i<player2.length;i++) {
				for(int j = 0;j<player2[i].length; j++) {
					if(player2[i][j]==true) {
						System.out.println("X ");
					}else {
						System.out.println("O ");
					}
				}
				System.out.println("");
			}
		}
	}
	
}
