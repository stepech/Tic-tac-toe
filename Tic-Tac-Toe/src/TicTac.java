import java.util.Scanner;

public class TicTac {
	static String[][] myField = {{"  ", "  ", "  "},{"  ", "  ", "  "}, {"  ", "  ", "  "}};
	static boolean playerX = false;
	static int x, y;
	static Scanner in = new Scanner(System.in);

	static void printIt() {
		System.out.println("+--+--+--+");
		System.out.println("|"+ myField[0][0] +"|"+ myField[0][1] +"|"+ myField[0][2] +"|");
		System.out.println("+--+--+--+");
		System.out.println("|"+ myField[1][0]+"|"+myField[1][1]+"|"+myField[1][2]+"|");
		System.out.println("+--+--+--+");
		System.out.println("|"+myField[2][0]+"|"+myField[2][1]+"|"+myField[2][2]+"|");
		System.out.println("+--+--+--+");
	}
	static void checkWin() {
		
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
				play();
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
