import java.util.Scanner;
public class map {
	//initial amount of ships
	//max ships
	static int MAXSHIPS = 8;
	//Array for both players
	static int [][] player1 = new int [5][5];
	static int [][] player2 = new int [5][5];
	static boolean [][] player1Hits = new boolean [5][5];
	static boolean [][] player2Hits = new boolean [5][5];
	//sets ships
	public static void looper(int a, String Player) {
		Scanner input = new Scanner(System.in);
		while(a<1) {
			System.out.println("You have "+(MAXSHIPS - a)+ " ships left.");
			System.out.println("Enter the X coordinate");
			int x = input.nextInt();
			System.out.println("Enter the Y coordinate");
			int y = input.nextInt();
			if(Player.equals("Player1")) {
				player1[x][y] =1;
			}
			if(Player.equals("Player2")) {
				player2[x][y] =1;
			}
			a++;
		}
	}

	//print map for either player
	public static void printMap(int x) {
		if(x == 1) {
			for(int i = 0; i<player1.length;i++) {
				for(int j =0; j<player1[i].length;j++) {
					if(player1[i][j]==1) {
						System.out.print("1 ");
					}else{
						System.out.print("O ");
					}
				}
				System.out.println("");
			}
		}else if(x ==2) {
			for(int i =0; i<player2.length;i++) {
				for(int j = 0;j<player2[i].length; j++) {
					if(player2[i][j]==1) {
						System.out.print("1 ");
					}else {
						System.out.print("O ");
					}
				}
				System.out.println("");
			}
		}
	}
	
}
