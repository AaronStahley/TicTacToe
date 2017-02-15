package gui;

public class TicTacToePlayer {
	
	private int playerNumber;
	private String playerName;
	private int numberOfWins;
	private boolean playerTurn;
	private boolean playerWin;

	
	
	public TicTacToePlayer()
	{
		playerNumber = 0;
		playerName = "unknown";
		numberOfWins = 0;
		playerTurn = false; 
		playerWin = false;

	}
	
	public int getPlayerNumber()
	{
		return playerNumber; 
	}
	
	public String getPlayerName()
	{
		return playerName;
	}
	
	public int getNumberOfWins()
	{
		return numberOfWins;
	}
	
	public boolean getPlayerTurn()
	{
		return playerTurn; 
	}
	
	public boolean getPlayerWin()
	{
		return playerWin;
	}

	public void setPlayerNumber(int playerNum)
	{
		playerNumber = playerNum;
	}
	
	public void setPlayerName(String name)
	{
		playerName = name;
	}
	
	public void setNumberOfWins(int wins)
	{
		numberOfWins = wins;
	}
	
	public void setPlayerTurn(boolean turn)
	{
		playerTurn = turn; 
	}
	
	public void setPlayerWin(boolean win)
	{
		playerWin = win; 
	}
	
	public String toString()
	{
		return("Player " + playerNumber + " , " + playerName + ", Wins: " +  numberOfWins );
	}
	
	

}
