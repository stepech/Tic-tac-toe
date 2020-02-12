import java.util.Scanner;

public class TicTac {
	static String[][] myField = {{"  ", "  ", "  "},{"  ", "  ", "  "}, {"  ", "  ", "  "}};
	static boolean playerX = false;
	static int x, y;
	static Scanner in = new Scanner(System.in);
	static int turn = 0;
	static String player;

	static void printIt() {
		System.out.println("+--+--+--+");
		System.out.println("|"+ myField[0][2] +"|"+ myField[1][2] +"|"+ myField[2][2] +"|");
		System.out.println("+--+--+--+");
		System.out.println("|"+ myField[0][1]+"|"+myField[1][1]+"|"+myField[2][1]+"|");
		System.out.println("+--+--+--+");
		System.out.println("|"+myField[0][0]+"|"+myField[1][0]+"|"+myField[2][0]+"|");
		System.out.println("+--+--+--+");
	}
	static boolean checkRow() {
		for (int k=0; k<3; k++) {
			if (myField[0][k] == myField[1][k] && myField[1][k]==myField[2][k] && myField[0][k]!="  ") {
				return true;
			}
		}
		return false;
	}
	static boolean checkSlope() {
		for (int k=0; k<3; k++) {
			if (myField[k][0] == myField[k][1] && myField[k][1]==myField[k][2] && myField[k][0]!="  ") {
				return true;
			}
		}
		return false;
	}
	static boolean checkWin() {
		if (playerX==false) {
			player = "OO";
		} else {
			player = "XX";
		}
		if (checkRow()== true || checkSlope()== true) {
			System.out.println(player + " won the game");
			return true;
		}
		if  (myField[0][0]==myField[1][1] && myField[1][1]==myField[2][2] && myField[1][1] != "  ") {
			System.out.println(player + " won the game");
			return true;
		}
		if (myField[0][2]==myField[1][1] && myField[1][1]==myField[2][0] && myField[1][1] != "  ") {
			System.out.println(player + " won the game");
			return true;
		}
		turn ++;
		if (turn==9) {
			System.out.println("Everything is full! Nobody wins");
			return true;
		}
		return false;
	}
	static void play() {
		if (playerX == true) {
			System.out.println("Player 2's turn - X");
		} else {
			System.out.println("Player 1's turn - ◯");
		}
		System.out.println("Enter number of slope from the left, then hit enter");
		x = in.nextInt();
		System.out.println("Enter number of row from the bottom, then hit enter");
		System.out.println("To change slope - enter 0");
		y = in.nextInt();
		if (x<4 && y<4 && x>0 && y>0) {
			if (myField[(x-1)][(y-1)] == "  ") {
				if (playerX == false) {
					myField[(x-1)][(y-1)] = "OO";
					printIt();
					if (checkWin()==false) {
						playerX = true;
						play();
					} else {
						System.out.println("Thanks for playing - ©stepech");
					}
				} else {
					myField[(x-1)][(y-1)] = "XX";
					printIt();
					if (checkWin()==false) {
						playerX = false;
						play();
					} else {
						System.out.println("Thanks for playing - ©stepech");
					}
				}
			} else {			
				System.out.println("Choose area which is empty");
				play();
			}
		} else if (y == 0) {
			play();
		} else {
			System.out.println("Slopes and rows can be only higher than 0 and lower than 4");
			play();
		}
	}
	public static void main(String[] args) {
		printIt();
		System.out.println("This is your field");
		System.out.println("Starting with player 1 - ◯, player 2 - X");
		play();
		

	}

}
