import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {

		TicTacToe game = new TicTacToe();
		Scanner s = new Scanner(System.in);
		int x=0,y=0;
		
		displayMap();
		do {
			System.out.println(game.player == game.X?"Player X turn":"Player O turn");
			System.out.println("Enter x and y places");
			x=s.nextInt();
			y=s.nextInt();
			System.out.println();
			
			game.putSign(x, y);
			System.out.println(game.toString());
			System.out.println("_____________________________");
			game.displayWinner();

		}while(game.isEmpty);
	}
	
	
	public static void displayMap() {

		System.out.println("--- TicTacToe Map ---\n");
		System.out.println(" 0 0 | 0 1 | 0 2");
		System.out.println("----------------");
		System.out.println(" 1 0 | 1 1 | 1 2");
		System.out.println("----------------");
		System.out.println(" 2 0 | 2 1 | 2 2");
		System.out.println();
		
	}// String displayMap()
	
	
}



