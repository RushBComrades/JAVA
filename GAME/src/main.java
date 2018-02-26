
public class main {
	public static void main(String[] args) {
		int player1Counter =0,player2Counter = 0;
		map.looper(player1Counter, "Player1");
		map.printMap(1);
		attack.attack("Player1");
		attack.printAttackMap(1);
	}
}
