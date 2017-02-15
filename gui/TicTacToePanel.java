package gui;


import java.awt.event.*;

import javax.swing.*;



public class TicTacToePanel extends JPanel
{	

	private static final long serialVersionUID = 1L;

	private JLabel gameBoard;
	
	private JTextField player1TextField;
	private JTextField player2TextField; 
	
	private JLabel enterPlayer1JLabel;
	private JLabel enterPlayer2JLabel; 
	private JLabel displayPlayer1NameLabel;
	private JLabel displayPlayer2NameLabel;
	private JLabel displayWinner1Label;
	private JLabel displayWinner2Label;
	private JLabel displayDrawLabel;
	private JLabel enterPlayerNamesLabel;
	private JLabel startGameLabel;
	private JLabel Player1Turn;
	private JLabel Player2Turn;
	private JLabel BackGroundLabel;
	
	private JButton reset;
	
	private JButton submitPlayer1Button;
	private JButton submitPlayer2Button;
	
	private JButton XO;
	private JButton XO1;
	private JButton XO2;
	private JButton XO3;
	private JButton XO4;
	private JButton XO5;
	private JButton XO6;
	private JButton XO7;
	private JButton XO8;
	
	private ImageIcon imgBackGround = new ImageIcon(this.getClass().getResource("/resources/BackGround.png"));
	private ImageIcon imgStartGame = new ImageIcon(this.getClass().getResource("/resources/startGame.png"));
	private ImageIcon imgPlayer1Turn = new ImageIcon(this.getClass().getResource("/resources/Player1Turn.png"));
	private ImageIcon imgPlayer2Turn = new ImageIcon(this.getClass().getResource("/resources/Player2Turn.png"));
	private ImageIcon imgenterPlayerNames = new ImageIcon(this.getClass().getResource("/resources/enterPlayerNamesImage.png"));
	private ImageIcon imgplayer1Win = new ImageIcon(this.getClass().getResource("/resources/Player1WinImage.png"));
	private ImageIcon imgplayer2Win = new ImageIcon(this.getClass().getResource("/resources/Player2WinImage.png"));
	private ImageIcon imgDraw = new ImageIcon(this.getClass().getResource("/resources/Draw.png"));
	private ImageIcon imgGrid = new ImageIcon(this.getClass().getResource("/resources/Grid.png"));
	private ImageIcon imgBlank = new ImageIcon(this.getClass().getResource("/resources/blank.png"));
	private ImageIcon imgX = new ImageIcon(this.getClass().getResource("/resources/X.png"));
	private ImageIcon imgO = new ImageIcon(this.getClass().getResource("/resources/O.png"));
	
	private boolean gameStart = false; 
	private boolean gameStartIcon = false;
	
	private TicTacToePlayer player1;
	private TicTacToePlayer player2;
	
	public TicTacToePanel()
	{
	
		setLayout(null);

		// creates two players from the TicTacToePlayer Class
		player1 = new TicTacToePlayer();
		player1.setPlayerNumber(1);
		player1.setPlayerTurn(true);
		player1.setPlayerWin(false);
	
		player2 = new TicTacToePlayer();
		player2.setPlayerNumber(2);
		player2.setPlayerTurn(false);
		player2.setPlayerWin(false);
////////////////////////////////////////////////////////////////////////////////
		
		startGameLabel = new JLabel("");
		startGameLabel.setBounds(45,20,400,75);
		startGameLabel.setVisible(false);
		startGameLabel.setIcon(imgStartGame);
		add(startGameLabel);
		
		enterPlayerNamesLabel = new JLabel("");
		enterPlayerNamesLabel.setBounds(45,20,400,75);
		enterPlayerNamesLabel.setVisible(true);
		enterPlayerNamesLabel.setIcon(imgenterPlayerNames);
		add(enterPlayerNamesLabel);
		
	
////////////////////////////////////////////////////////////////
		
		//Displays who won the game
	
		displayWinner1Label = new JLabel("");
		displayWinner1Label.setBounds(45,20,400,75);
		displayWinner1Label.setVisible(false);
		displayWinner1Label.setIcon(imgplayer1Win);
		add(displayWinner1Label);
		
		displayWinner2Label = new JLabel("");
		displayWinner2Label.setBounds(45,20,400,75);
		displayWinner2Label.setVisible(false);
		displayWinner2Label.setIcon(imgplayer2Win);
		add(displayWinner2Label);
		
		displayDrawLabel = new JLabel("");
		displayDrawLabel.setBounds(45,20,400,75);
		displayDrawLabel.setVisible(false);
		displayDrawLabel.setIcon(imgDraw);
		add(displayDrawLabel);
		
		// sets if its player 1 or player 2 turn
		
		Player1Turn = new JLabel("");
		Player1Turn.setBounds(45,20,400,75);
		Player1Turn.setVisible(false);
		Player1Turn.setIcon(imgPlayer1Turn);
		add(Player1Turn);
	
		Player2Turn = new JLabel("");
		Player2Turn.setBounds(45,20,400,75);
		Player2Turn.setVisible(false);
		Player2Turn.setIcon(imgPlayer2Turn);
		add(Player2Turn);
		
		//player JLabels
		displayPlayer1NameLabel = new JLabel(player1.toString());
		displayPlayer1NameLabel.setBounds(50,565,400,30); 
		add(displayPlayer1NameLabel);
		
		displayPlayer2NameLabel = new JLabel(player2.toString());
		displayPlayer2NameLabel.setBounds(50,600,400,30); 
		add(displayPlayer2NameLabel);
		
		enterPlayer1JLabel = new JLabel("Player 1 Enter Your Name");
		enterPlayer1JLabel.setBounds(50,475,200,30); 
		add(enterPlayer1JLabel);
		
		
		enterPlayer2JLabel = new JLabel("Player 2 Enter Your Name");
		enterPlayer2JLabel.setBounds(50,515,200,30); 
		add(enterPlayer2JLabel);
		
///////////////////////////////////////////////////////////////
		
		//Name text Fields
		player1TextField = new JTextField();
		player1TextField.setBounds(220, 480, 120, 25);
		add(player1TextField);
		
		player2TextField = new JTextField();
		player2TextField.setBounds(220, 520, 120, 25);
		add(player2TextField);
///////////////////////////////////////////////////////////////
		
		// Submit Buttons for the names
		submitPlayer1Button = new JButton("Submit");
		submitPlayer1Button.setBounds(350, 480, 80, 25);
		add(submitPlayer1Button);
		
		submitPlayer2Button = new JButton("Submit");
		submitPlayer2Button.setBounds(350, 520, 80, 25);
		submitPlayer2Button.setEnabled(false);
		add(submitPlayer2Button);
		
///////////////////////////////////////////////////////////////
		
		// Creates the Grid part of the game board
		gameBoard = new JLabel("");
		gameBoard.setBounds(56,71,400,400);
		gameBoard.setIcon(imgGrid);
		add(gameBoard);
///////////////////////////////////////////////////////////////
		
	
		
//**********ALL THE BUTTONS FOR THE XO *****************//
		XO = new JButton("");
		XO.setBounds(90,110,100,100);
		XO.setIcon(imgBlank);
		XO.setFocusable(false);
		XO.setBorder(null);
		add(XO);
		
		XO1 = new JButton("");
		XO1.setBounds(200,110,100,100);
		XO1.setIcon(imgBlank);
		XO1.setBorder(null);
		add(XO1);
		
		XO2 = new JButton("");
		XO2.setBounds(310,110,100,100);
		XO2.setIcon(imgBlank);
		XO2.setBorder(null);
		add(XO2);
		
		XO3 = new JButton("");
		XO3.setBounds(90,220,100,100);
		XO3.setIcon(imgBlank);
		XO3.setBorder(null);
		add(XO3);
		
		XO4 = new JButton("");
		XO4.setBounds(200,220,100,100);
		XO4.setIcon(imgBlank);
		XO4.setBorder(null);
		add(XO4);
		
		XO5 = new JButton("");
		XO5.setBounds(310,220,100,100);
		XO5.setIcon(imgBlank);
		XO5.setBorder(null);
		add(XO5);
		
		XO6 = new JButton("");
		XO6.setBounds(90,330,100,100);
		XO6.setIcon(imgBlank);
		XO6.setBorder(null);
		add(XO6);
	
		XO7 = new JButton("");
		XO7.setBounds(200,330,100,100);
		XO7.setIcon(imgBlank);
		XO7.setBorder(null);
		add(XO7);
		
		XO8 = new JButton("");
		XO8.setBounds(310,330,100,100);
		XO8.setIcon(imgBlank);
		XO8.setBorder(null);
		add(XO8);
/////////////////////////////////////////////////////////////////////
	
		// implements a game reset button
		reset = new JButton("NEW GAME");
		reset.setBounds(190,640,100,25);
		add(reset);
			
		BackGroundLabel = new JLabel("");
		BackGroundLabel.setBounds(0,0,500,700);
		BackGroundLabel.setVisible(true);
		BackGroundLabel.setIcon(imgBackGround);
		add(BackGroundLabel);
		
////////////////////////////////////////////////////////////////////
			
		// all the button listeners
		reset.addActionListener(new ButtonListener());
		XO.addActionListener(new ButtonListener());
		XO1.addActionListener(new ButtonListener());
		XO2.addActionListener(new ButtonListener());
		XO3.addActionListener(new ButtonListener());
		XO4.addActionListener(new ButtonListener());
		XO5.addActionListener(new ButtonListener());
		XO6.addActionListener(new ButtonListener());
		XO7.addActionListener(new ButtonListener());
		XO8.addActionListener(new ButtonListener());
		submitPlayer1Button.addActionListener(new ButtonListener());
		submitPlayer2Button.addActionListener(new ButtonListener());
		
//////////////////////////////////////////////////////////////////////	
		
		XO.setDisabledIcon(imgBlank);
		XO1.setDisabledIcon(imgBlank);
		XO2.setDisabledIcon(imgBlank);
		XO3.setDisabledIcon(imgBlank);
		XO4.setDisabledIcon(imgBlank);
		XO5.setDisabledIcon(imgBlank);
		XO6.setDisabledIcon(imgBlank);
		XO7.setDisabledIcon(imgBlank);
		XO8.setDisabledIcon(imgBlank);

	
	}//end of the TicTacToePanel
	
	 private class ButtonListener implements ActionListener
	    {
			public void actionPerformed(ActionEvent event) 
			{
				if (event.getSource() == submitPlayer1Button)
				{
					player1.setPlayerName(player1TextField.getText()); 
					displayPlayer1NameLabel.setText(player1.toString());
					player1TextField.setEditable(false);
					submitPlayer1Button.setEnabled(false);
					player2TextField.setEditable(true);
					submitPlayer2Button.setEnabled(true);
				}
				
				if (event.getSource() == submitPlayer2Button)
				{
					player2.setPlayerName(player2TextField.getText()); 
					displayPlayer2NameLabel.setText(player2.toString());
					player2TextField.setEditable(false);
					submitPlayer2Button.setEnabled(false);
					enterPlayerNamesLabel.setVisible(false);
					gameStart = true;
					startGameLabel.setVisible(true);
					gameStartIcon = true;
					
				}
			
				if(event.getSource() == reset)
				{

					XO.setEnabled(true);
					XO1.setEnabled(true);
					XO2.setEnabled(true);
					XO3.setEnabled(true);
					XO4.setEnabled(true);
					XO5.setEnabled(true);
					XO6.setEnabled(true);
					XO7.setEnabled(true);		
					XO8.setEnabled(true);	
					
					XO.setDisabledIcon(imgBlank);
					XO1.setDisabledIcon(imgBlank);
					XO2.setDisabledIcon(imgBlank);
					XO3.setDisabledIcon(imgBlank);
					XO4.setDisabledIcon(imgBlank);
					XO5.setDisabledIcon(imgBlank);
					XO6.setDisabledIcon(imgBlank);
					XO7.setDisabledIcon(imgBlank);
					XO8.setDisabledIcon(imgBlank);
					
					XO.setIcon(imgBlank);
					XO1.setIcon(imgBlank);
					XO2.setIcon(imgBlank);
					XO3.setIcon(imgBlank);
					XO4.setIcon(imgBlank);
					XO5.setIcon(imgBlank);
					XO6.setIcon(imgBlank);
					XO7.setIcon(imgBlank);
					XO8.setIcon(imgBlank);
					
					displayWinner1Label.setVisible(false);
					displayWinner2Label.setVisible(false);
					displayDrawLabel.setVisible(false);
			

				}
				
//------------------------------------------------------------------------------------------//
				
				if(event.getSource() == XO)
				{
					if(XO.getIcon() == imgBlank && gameStart == true)
					{
					if(player1.getPlayerTurn() == true)
					{
						XO.setIcon(imgX);
						player1.setPlayerTurn(false);
						player2.setPlayerTurn(true); 
						XO.setEnabled(false);
						XO.setDisabledIcon(imgX);
						startGameLabel.setVisible(false);
						Player2Turn.setVisible(true);
						Player1Turn.setVisible(false);
						gameStartIcon = false;
						
						
					}
					
					else if(player2.getPlayerTurn() == true)
					{
						XO.setIcon(imgO);
						player1.setPlayerTurn(true);
						player2.setPlayerTurn(false);
						XO.setEnabled(false);
						XO.setDisabledIcon(imgO);
						startGameLabel.setVisible(false);
						Player2Turn.setVisible(false);
						Player1Turn.setVisible(true);
						gameStartIcon = false;

					}
					}
					else
					{
					
					}
				}
				
//------------------------------------------------------------------------------------------//
				
				if(event.getSource() == XO1)
				{
					if(XO1.getIcon() == imgBlank  && gameStart == true)
					{
					if(player1.getPlayerTurn() == true)
					{
						XO1.setIcon(imgX);
						player1.setPlayerTurn(false);
						player2.setPlayerTurn(true); 
						XO1.setEnabled(false);
						XO1.setDisabledIcon(imgX);
						startGameLabel.setVisible(false);
						Player2Turn.setVisible(true);
						Player1Turn.setVisible(false);
						gameStartIcon = false;

						
						
					}
					
					else if(player2.getPlayerTurn() == true)
					{
						XO1.setIcon(imgO);
						player1.setPlayerTurn(true);
						player2.setPlayerTurn(false);
						XO1.setEnabled(false);
						XO1.setDisabledIcon(imgO);
						startGameLabel.setVisible(false);
						Player2Turn.setVisible(false);
						Player1Turn.setVisible(true);
						gameStartIcon = false;

					}
					}
					else
					{
					}
				}
				
//------------------------------------------------------------------------------------------//
				
				if(event.getSource() == XO2)
				{
					if(XO2.getIcon() == imgBlank  && gameStart == true)
					{
					if(player1.getPlayerTurn() == true)
					{
						XO2.setIcon(imgX);
						player1.setPlayerTurn(false);
						player2.setPlayerTurn(true); 
						XO2.setEnabled(false);
						XO2.setDisabledIcon(imgX);
						startGameLabel.setVisible(false);
						Player2Turn.setVisible(true);
						Player1Turn.setVisible(false);
						gameStartIcon = false;

						
					}
					
					else if(player2.getPlayerTurn() == true)
					{
						XO2.setIcon(imgO);
						player1.setPlayerTurn(true);
						player2.setPlayerTurn(false);
						XO2.setEnabled(false);
						XO2.setDisabledIcon(imgO);
						startGameLabel.setVisible(false);
						Player2Turn.setVisible(false);
						Player1Turn.setVisible(true);
						gameStartIcon = false;

					}
					}
					else
					{
						
					}
				}
				
//------------------------------------------------------------------------------------------//
				
				if(event.getSource() == XO3)
				{
					if(XO3.getIcon() == imgBlank  && gameStart == true)
					{
					if(player1.getPlayerTurn() == true)
					{
						XO3.setIcon(imgX);
						player1.setPlayerTurn(false);
						player2.setPlayerTurn(true); 
						XO3.setEnabled(false);
						XO3.setDisabledIcon(imgX);
						startGameLabel.setVisible(false);
						Player2Turn.setVisible(true);
						Player1Turn.setVisible(false);
						gameStartIcon = false;

						
					}
					
					else if(player2.getPlayerTurn() == true)
					{
						XO3.setIcon(imgO);
						player1.setPlayerTurn(true);
						player2.setPlayerTurn(false);
						XO3.setEnabled(false);
						XO3.setDisabledIcon(imgO);
						startGameLabel.setVisible(false);
						Player2Turn.setVisible(false);
						Player1Turn.setVisible(true);
						gameStartIcon = false;

					}
					}
					else
					{
					}
				}
				
//------------------------------------------------------------------------------------------//
				
				if(event.getSource() == XO4)
				{
					if(XO4.getIcon() == imgBlank  && gameStart == true)
					{
					if(player1.getPlayerTurn() == true)
					{
						XO4.setIcon(imgX);
						player1.setPlayerTurn(false);
						player2.setPlayerTurn(true); 
						XO4.setEnabled(false);
						XO4.setDisabledIcon(imgX);
						startGameLabel.setVisible(false);
						Player2Turn.setVisible(true);
						Player1Turn.setVisible(false);
						gameStartIcon = false;

						
					}
					
					else if(player2.getPlayerTurn() == true)
					{
						XO4.setIcon(imgO);
						player1.setPlayerTurn(true);
						player2.setPlayerTurn(false);
						XO4.setEnabled(false);
						XO4.setDisabledIcon(imgO);
						startGameLabel.setVisible(false);
						Player2Turn.setVisible(false);
						Player1Turn.setVisible(true);
						gameStartIcon = false;

					}
					}
					else
					{
					}
				}
				
//------------------------------------------------------------------------------------------//

				if(event.getSource() == XO5)
				{
					if(XO5.getIcon() == imgBlank  && gameStart == true)
					{
					if(player1.getPlayerTurn() == true)
					{
						XO5.setIcon(imgX);
						player1.setPlayerTurn(false);
						player2.setPlayerTurn(true); 
						XO5.setEnabled(false);
						XO5.setDisabledIcon(imgX);
						startGameLabel.setVisible(false);
						Player2Turn.setVisible(true);
						Player1Turn.setVisible(false);
						gameStartIcon = false;

						
					}
					
					else if(player2.getPlayerTurn() == true)
					{
						XO5.setIcon(imgO);
						player1.setPlayerTurn(true);
						player2.setPlayerTurn(false);
						XO5.setEnabled(false);
						XO5.setDisabledIcon(imgO);
						startGameLabel.setVisible(false);
						Player2Turn.setVisible(false);
						Player1Turn.setVisible(true);
						gameStartIcon = false;

					}
					}
					else
					{
					}
				}
				
//------------------------------------------------------------------------------------------//				

				if(event.getSource() == XO6)
				{
					if(XO6.getIcon() == imgBlank  && gameStart == true)
					{
					if(player1.getPlayerTurn() == true)
					{
						XO6.setIcon(imgX);
						player1.setPlayerTurn(false);
						player2.setPlayerTurn(true); 
						XO6.setEnabled(false);
						XO6.setDisabledIcon(imgX);
						startGameLabel.setVisible(false);
						Player2Turn.setVisible(true);
						Player1Turn.setVisible(false);
						gameStartIcon = false;

						
					}
					
					else if(player2.getPlayerTurn() == true)
					{
						XO6.setIcon(imgO);
						player1.setPlayerTurn(true);
						player2.setPlayerTurn(false);
						XO6.setEnabled(false);
						XO6.setDisabledIcon(imgO);
						startGameLabel.setVisible(false);
						Player2Turn.setVisible(false);
						Player1Turn.setVisible(true);
						gameStartIcon = false;

					}
					}
					else
					{
					}
				}
				
//------------------------------------------------------------------------------------------//

				if(event.getSource() == XO7)
				{
					if(XO7.getIcon() == imgBlank  && gameStart == true)
					{
					if(player1.getPlayerTurn() == true)
					{
						XO7.setIcon(imgX);
						player1.setPlayerTurn(false);
						player2.setPlayerTurn(true); 
						XO7.setEnabled(false);
						XO7.setDisabledIcon(imgX);
						startGameLabel.setVisible(false);
						Player2Turn.setVisible(true);
						Player1Turn.setVisible(false);
						gameStartIcon = false;

						
						
					}
					
					else if(player2.getPlayerTurn() == true)
					{
						XO7.setIcon(imgO);
						player1.setPlayerTurn(true);
						player2.setPlayerTurn(false);
						XO7.setEnabled(false);
						XO7.setDisabledIcon(imgO);
						startGameLabel.setVisible(false);
						Player2Turn.setVisible(false);
						Player1Turn.setVisible(true);
						gameStartIcon = false;

					}
					}
					else
					{
					}
				}
				
//------------------------------------------------------------------------------------------//
				
				if(event.getSource() == XO8)
				{
					if(XO8.getIcon() == imgBlank  && gameStart == true)
					{
					if(player1.getPlayerTurn() == true)
					{
						XO8.setIcon(imgX);
						player1.setPlayerTurn(false);
						player2.setPlayerTurn(true);
						XO8.setEnabled(false);
						XO8.setDisabledIcon(imgX);
						startGameLabel.setVisible(false);
						Player2Turn.setVisible(true);
						Player1Turn.setVisible(false);
						gameStartIcon = false;

						
					}
					
					else if(player2.getPlayerTurn() == true)
					{
						XO8.setIcon(imgO);
						player1.setPlayerTurn(true);
						player2.setPlayerTurn(false);
						XO8.setEnabled(false);
						XO8.setDisabledIcon(imgO);
						startGameLabel.setVisible(false);
						Player2Turn.setVisible(false);
						Player1Turn.setVisible(true);
						gameStartIcon = false;

					}
					}
					else
					{
					}
				}
//------------------------Changes the number of wins for player1 ------------------------//
				
				if(
						XO.getIcon() == imgX && XO1.getIcon() == imgX && XO2.getIcon() == imgX || XO3.getIcon() == imgX && XO4.getIcon() == imgX && XO5.getIcon() == imgX
						|| XO6.getIcon() == imgX && XO7.getIcon() == imgX && XO8.getIcon() == imgX || XO.getIcon() == imgX && XO3.getIcon() == imgX && XO6.getIcon() == imgX
						|| XO1.getIcon() == imgX && XO4.getIcon() == imgX && XO7.getIcon() == imgX || XO2.getIcon() == imgX && XO5.getIcon() == imgX && XO8.getIcon() == imgX
						|| XO.getIcon() == imgX && XO4.getIcon() == imgX && XO8.getIcon() == imgX || XO2.getIcon() == imgX && XO4.getIcon() == imgX && XO6.getIcon() == imgX
				  )
							{
					
								player1.setNumberOfWins(player1.getNumberOfWins() +1 );
								displayPlayer1NameLabel.setText(player1.toString());
								displayWinner1Label.setVisible(true);
								player1.setPlayerWin(true);
								
								Player1Turn.setVisible(false);
								Player2Turn.setVisible(false);
								
								XO.setEnabled(false);
										
								XO1.setEnabled(false);
						
								XO2.setEnabled(false);
									
								XO3.setEnabled(false);
					
								XO4.setEnabled(false);
								
								XO5.setEnabled(false);
								
								XO6.setEnabled(false);
							
								XO7.setEnabled(false);		
								
								XO8.setEnabled(false);
							
								
							}
				
//------------------------Changes the number of wins for player2 ------------------------//		
				
				else if(
					XO.getIcon() == imgO && XO1.getIcon() == imgO && XO2.getIcon() == imgO || XO3.getIcon() == imgO && XO4.getIcon() == imgO && XO5.getIcon() == imgO
					|| XO6.getIcon() == imgO && XO7.getIcon() == imgO && XO8.getIcon() == imgO || XO.getIcon() == imgO && XO3.getIcon() == imgO && XO6.getIcon() == imgO
					|| XO1.getIcon() == imgO && XO4.getIcon() == imgO && XO7.getIcon() == imgO || XO2.getIcon() == imgO && XO5.getIcon() == imgO && XO8.getIcon() == imgO
					|| XO.getIcon() == imgO && XO4.getIcon() == imgO && XO8.getIcon() == imgO || XO2.getIcon() == imgO && XO4.getIcon() == imgO && XO6.getIcon() == imgO
				  )
							{
					
								player2.setNumberOfWins(player2.getNumberOfWins() + 1);
								displayPlayer2NameLabel.setText(player2.toString());
								displayWinner2Label.setVisible(true);
								player2.setPlayerWin(true);
								
								Player1Turn.setVisible(false);
								Player2Turn.setVisible(false);
								
								XO.setEnabled(false);
								
								XO1.setEnabled(false);
								
								XO2.setEnabled(false);
								
								XO3.setEnabled(false);
			
								XO4.setEnabled(false);
								
								XO5.setEnabled(false);
								
								XO6.setEnabled(false);
								
								XO7.setEnabled(false);
								
								XO8.setEnabled(false);
						
								
							}
				
				// Sets the player who won to a Draw and it does not change the number of wins that the player has. 
				
				else if ( XO.getIcon() != imgBlank && XO1.getIcon() != imgBlank
						&& XO2.getIcon() != imgBlank && XO3.getIcon() != imgBlank && XO4.getIcon() != imgBlank && XO5.getIcon() != imgBlank
						&& XO6.getIcon() != imgBlank && XO7.getIcon() != imgBlank && XO8.getIcon() != imgBlank)
				{
					displayDrawLabel.setVisible(true);
					Player1Turn.setVisible(false);
					Player2Turn.setVisible(false);
				}
				
			
				
				if(event.getSource() == reset)
				{
				if(gameStart == true && gameStartIcon == false)
					if(player1.getPlayerTurn() == true)
					{
						Player1Turn.setVisible(true);
						Player2Turn.setVisible(false);
					}
					
					if(player2.getPlayerTurn() == true)
					{
						Player2Turn.setVisible(true);
						Player1Turn.setVisible(false);
					}
					

				}
				
		   }
			
	  }
	
}

