import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TicTac {
	static String[][] myField = {{" ", " ", " "},{" ", " ", " "}, {" ", " ", " "}};
	static boolean playerX = false;
	static String player = "O";

	static boolean checkRow() {
		for (int k=0; k<3; k++) {
			if (myField[0][k] == myField[1][k] && myField[1][k]==myField[2][k] && myField[0][k]!=" ") {
				return true;
			}
		}
		return false;
	}
	static boolean checkSlope() {
		for (int k=0; k<3; k++) {
			if (myField[k][0] == myField[k][1] && myField[k][1]==myField[k][2] && myField[k][0]!=" ") {
				return true;
			}
		}
		return false;
	}
	static boolean checkWin() {
		if (playerX==false) {
			player = "O";
		} else {
			player = "X";
		}
		if (checkRow()== true || checkSlope()== true) {
			return true;
		}
		if  (myField[0][0]==myField[1][1] && myField[1][1]==myField[2][2] && myField[1][1] != " ") {
			return true;
		}
		if (myField[0][2]==myField[1][1] && myField[1][1]==myField[2][0] && myField[1][1] != " ") {
			return true;
		}
		return false;
	}
	static boolean play(int x, int y) {
			if (playerX == false) {
				myField[x][y] = "O";
				playerX = true;
			} else {
				myField[x][y] = "X";
				playerX = false;
			}
			return checkWin();
	}
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		
		frame.setSize(600, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		
		panel.setLayout(null);
		JLabel name = new JLabel("Tic-Tac-Toe");
		name.setBounds(265, 20, 100, 25);
		panel.add(name);
		
		JLabel lPlayer = new JLabel();
		lPlayer.setBounds(30, 20, 60, 25);
		lPlayer.setText("Player: "+player);
		panel.add(lPlayer);
		
		JLabel Won = new JLabel();
		Won.setVisible(false);
		Won.setBounds(30, 40, 150, 25);
		panel.add(Won);
		
		JButton a1 = new JButton(myField[0][2]);
		JButton a2 = new JButton(myField[1][2]);
		JButton a3 = new JButton(myField[2][2]);
		JButton b1 = new JButton(myField[0][1]);
		JButton b2 = new JButton(myField[1][1]);
		JButton b3 = new JButton(myField[2][1]);
		JButton c1 = new JButton(myField[0][0]);
		JButton c2 = new JButton(myField[1][0]);
		JButton c3 = new JButton(myField[2][0]);
		
		
		
		a1.addActionListener(new ActionListener()
	    {
		      public void actionPerformed(ActionEvent e)
		      {
		        if (play(0, 2) == true) {
		        	Won.setText("Player: "+player+" won the game!!!");
		        	Won.setVisible(true);
		        	a1.setEnabled(false);
		        	a2.setEnabled(false);
		        	a3.setEnabled(false);
		        	b1.setEnabled(false);
		        	b2.setEnabled(false);
		        	b3.setEnabled(false);
		        	c1.setEnabled(false);
		        	c2.setEnabled(false);
		        	c3.setEnabled(false);
		        }
		        a1.setText(myField[0][2]);
		        a1.setEnabled(false);
		        lPlayer.setText("Player: "+player);
		      }
		    });
		a2.addActionListener(new ActionListener()
	    {
		      public void actionPerformed(ActionEvent e)
		      {
		        if (play(1, 2) == true) {
		        	Won.setText("Player: "+player+" won the game!!!");
		        	Won.setVisible(true);
		        	a1.setEnabled(false);
		        	a2.setEnabled(false);
		        	a3.setEnabled(false);
		        	b1.setEnabled(false);
		        	b2.setEnabled(false);
		        	b3.setEnabled(false);
		        	c1.setEnabled(false);
		        	c2.setEnabled(false);
		        	c3.setEnabled(false);
		        }
		        a2.setText(myField[1][2]);
		        a2.setEnabled(false);
		        lPlayer.setText("Player: "+player);
		      }
		    });
		a3.addActionListener(new ActionListener()
	    {
		      public void actionPerformed(ActionEvent e)
		      {
		        if (play(2, 2) == true) {
		        	Won.setText("Player: "+player+" won the game!!!");
		        	Won.setVisible(true);
		        	a1.setEnabled(false);
		        	a2.setEnabled(false);
		        	a3.setEnabled(false);
		        	b1.setEnabled(false);
		        	b2.setEnabled(false);
		        	b3.setEnabled(false);
		        	c1.setEnabled(false);
		        	c2.setEnabled(false);
		        	c3.setEnabled(false);
		        }
		        a3.setText(myField[2][2]);
		        a3.setEnabled(false);
		        lPlayer.setText("Player: "+player);
		      }
		    });
		b1.addActionListener(new ActionListener()
	    {
		      public void actionPerformed(ActionEvent e)
		      {
		        if (play(0, 1) == true) {
		        	Won.setText("Player: "+player+" won the game!!!");
		        	Won.setVisible(true);
		        	a1.setEnabled(false);
		        	a2.setEnabled(false);
		        	a3.setEnabled(false);
		        	b1.setEnabled(false);
		        	b2.setEnabled(false);
		        	b3.setEnabled(false);
		        	c1.setEnabled(false);
		        	c2.setEnabled(false);
		        	c3.setEnabled(false);
		        }
		        b1.setText(myField[0][1]);
		        b1.setEnabled(false);
		        lPlayer.setText("Player: "+player);
		      }
		    });
		b2.addActionListener(new ActionListener()
	    {
		      public void actionPerformed(ActionEvent e)
		      {
		        if (play(1, 1) == true) {
		        	Won.setText("Player: "+player+" won the game!!!");
		        	Won.setVisible(true);
		        	a1.setEnabled(false);
		        	a2.setEnabled(false);
		        	a3.setEnabled(false);
		        	b1.setEnabled(false);
		        	b2.setEnabled(false);
		        	b3.setEnabled(false);
		        	c1.setEnabled(false);
		        	c2.setEnabled(false);
		        	c3.setEnabled(false);
		        }
		        b2.setText(myField[1][1]);
		        b2.setEnabled(false);
		        lPlayer.setText("Player: "+player);
		      }
		    });
		b3.addActionListener(new ActionListener()
	    {
		      public void actionPerformed(ActionEvent e)
		      {
		        if (play(2, 1) == true) {
		        	Won.setText("Player: "+player+" won the game!!!");
		        	Won.setVisible(true);
		        	a1.setEnabled(false);
		        	a2.setEnabled(false);
		        	a3.setEnabled(false);
		        	b1.setEnabled(false);
		        	b2.setEnabled(false);
		        	b3.setEnabled(false);
		        	c1.setEnabled(false);
		        	c2.setEnabled(false);
		        	c3.setEnabled(false);
		        }
		        b3.setText(myField[2][1]);
		        b3.setEnabled(false);
		        lPlayer.setText("Player: "+player);
		      }
		    });
		c1.addActionListener(new ActionListener()
	    {
		      public void actionPerformed(ActionEvent e)
		      {
		        if (play(0, 0) == true) {
		        	Won.setText("Player: "+player+" won the game!!!");
		        	Won.setVisible(true);
		        	a1.setEnabled(false);
		        	a2.setEnabled(false);
		        	a3.setEnabled(false);
		        	b1.setEnabled(false);
		        	b2.setEnabled(false);
		        	b3.setEnabled(false);
		        	c1.setEnabled(false);
		        	c2.setEnabled(false);
		        	c3.setEnabled(false);
		        }
		        c1.setText(myField[0][0]);
		        c1.setEnabled(false);
		        lPlayer.setText("Player: "+player);
		      }
		    });
		c2.addActionListener(new ActionListener()
	    {
		      public void actionPerformed(ActionEvent e)
		      {
		        if (play(0, 1) == true) {
		        	Won.setText("Player: "+player+" won the game!!!");
		        	Won.setVisible(true);
		        	a1.setEnabled(false);
		        	a2.setEnabled(false);
		        	a3.setEnabled(false);
		        	b1.setEnabled(false);
		        	b2.setEnabled(false);
		        	b3.setEnabled(false);
		        	c1.setEnabled(false);
		        	c2.setEnabled(false);
		        	c3.setEnabled(false);
		        }
		        c2.setText(myField[0][1]);
		        c2.setEnabled(false);
		        lPlayer.setText("Player: "+player);
		      }
		    });
		c3.addActionListener(new ActionListener()
	    {
		      public void actionPerformed(ActionEvent e)
		      {
		        if (play(0, 2) == true) {
		        	Won.setText("Player: "+player+" won the game!!!");
		        	Won.setVisible(true);
		        	a1.setEnabled(false);
		        	a2.setEnabled(false);
		        	a3.setEnabled(false);
		        	b1.setEnabled(false);
		        	b2.setEnabled(false);
		        	b3.setEnabled(false);
		        	c1.setEnabled(false);
		        	c2.setEnabled(false);
		        	c3.setEnabled(false);
		        }
		        c3.setText(myField[0][2]);
		        c3.setEnabled(false);
		        lPlayer.setText("Player: "+player);
		      }
		    });
		
		
		
		a1.setBounds(210, 130, 55, 55);
		a2.setBounds(280, 130, 55, 55);
		a3.setBounds(350, 130, 55, 55);
		b1.setBounds(210, 200, 55, 55);
		b2.setBounds(280, 200, 55, 55);
		b3.setBounds(350, 200, 55, 55);
		c1.setBounds(210, 270, 55, 55);
		c2.setBounds(280, 270, 55, 55);
		c3.setBounds(350, 270, 55, 55);
		
		panel.add(a1);
		panel.add(a2);
		panel.add(a3);
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(c1);
		panel.add(c2);
		panel.add(c3);
		
		
		frame.setVisible(true);
	}
	

}
