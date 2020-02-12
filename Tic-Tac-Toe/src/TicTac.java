import java.util.Scanner;

public class TicTac {
	static String[][] myField = {{"  ", "  ", "  "},{"  ", "  ", "  "}, {"  ", "  ", "  "}};
	static boolean playerX = false;
	static int x, y;
	static Scanner in = new Scanner(System.in);
	static int turn = 0;

	static void printIt() {
		System.out.println("+--+--+--+");
		System.out.println("|"+ myField[0][0] +"|"+ myField[0][1] +"|"+ myField[0][2] +"|");
		System.out.println("+--+--+--+");
		System.out.println("|"+ myField[1][0]+"|"+myField[1][1]+"|"+myField[1][2]+"|");
		System.out.println("+--+--+--+");
		System.out.println("|"+myField[2][0]+"|"+myField[2][1]+"|"+myField[2][2]+"|");
		System.out.println("+--+--+--+");
	}
	static boolean checkY() {
		for (int k=0; k<3; k++) {
			if (myField[0][k] == myField[1][k] && myField[1][k]==myField[2][k]) {
				return true;
			}
		}
		return false;
	}
	static boolean checkX() {
		for (int k=0; k<3; k++) {
			if (myField[k][0] == myField[k][1] && myField[k][1]==myField[k][2]) {
				return true;
			}
		}
		return false;
	}
	static boolean checkWin() {
		String player;
		if (playerX==false) {
			player = "OO";
		} else {
			player = "XX";
		}
		if (checkY()== true || checkX()== true) {
			System.out.println(player + "won the game");
			return true;
		}
		if  (myField[0][0]==myField[1][1] && myField[1][1]==myField[2][2]) {
			System.out.println(player + "won the game");
			return true;
		}
		if (myField[0][2]==myField[1][1] && myField[1][1]==myField[2][0]) {
			System.out.println(player + "won the game");
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
		System.out.println("Enter x coordinate, then hit enter");
		x = in.nextInt();
		System.out.println("Enter y coordinate, then hit enter");
		y = in.nextInt();
		if (x<4 && y<4 && x>0 && y>0) {
			if (myField[(x-1)][(y-1)] == "  ") {
				if (playerX == false) {
					myField[(x-1)][(y-1)] = "OO";
					playerX = true;
				} else {
					myField[(x-1)][(y-1)] = "XX";
					playerX = false;
				}
				printIt();
				if (checkWin()==false) {
					play();
				}
			} else {
				System.out.println("Choose area which is empty");
				play();
			}
		} else {
			System.out.println("Coordinates x and y can be only higher than 0 and lower than 4");
			play();
		}
	}
	public static void main(String[] args) {
		printIt();
		System.out.println("This is your field");
		System.out.println("Starting with player O");
		play();
		

	}

}
