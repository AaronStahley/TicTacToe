package main;

import javax.swing.*;

import gui.TicTacToePanel;


public class TicTacToeMain{
	

	//-----------------------------------------------------------------
//  Creates and displays the main program frame.
//-----------------------------------------------------------------
	public static void main (String[] args)
	{
		 TicTacToePanel panel = new TicTacToePanel();
		JFrame frame = new JFrame ("Tic Tac Toe");
		frame.setVisible(true);
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(panel);
		frame.setSize(500,700);
		frame.setResizable(false);


	}
}
