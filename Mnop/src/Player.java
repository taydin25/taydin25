/**
 This class is used to represent the player in this game. 
 **/
import java.util.Scanner;
public class Player {
	private int Money=1500;//we have 1500$ first 
	private int totalAssets;
	private int spaceNum;//blank spaces of board
	private int playerNum;
	private int playerAge;//must be older than 8;
	private boolean isTurn = false;
	private boolean buyornot=false;
	private String nameofPlayer;//enter name of player
	private int playerx=0;//location of player x axis
	private int playery=0;//location of player y axis
	
	public Player() {
		System.out.println("Enter Number of player.");
		@SuppressWarnings("resource")
		Scanner myObj = new Scanner(System.in);
		this.playerNum=myObj.nextInt();;
	}
	public Player(int money, String NewnameOfPlayer) {
		this.Money = money;
		this.nameofPlayer = NewnameOfPlayer;
	}
	public int getPlayerX() {
		return this.playerx;
	}public int getPlayerY() {
		return this.playery;
	}
	public void setPlayerX(int x) {
		this.playerx=x;
		
	}public void setPlayerY(int y) {
		this.playery=y;
		
	}
	public int getCash() {
		return Money;
	}

	public void setCash(int cash) {
		Money+=cash;
	}
	
	public int getTotalAssets() {
		return totalAssets;
	}
	
	public void setTurn(boolean turn) {
		isTurn = turn;
	}
	
	public boolean isTurn() {
		return isTurn;
	}

	public int getSpaceNum() {
		return spaceNum;
	}

	public void setSpaceNum(int spaceNum) {
		this.spaceNum = spaceNum;
	}

	public int getPlayerNum() {
		return playerNum;
	}

	public void setPlayerNum(int playerNum) {
		this.playerNum = playerNum;
	}
	public boolean getBuyornot() {
		return this.buyornot;
	}
	public void setBuyornot(boolean buyornot) {
		this.buyornot =buyornot;
	}
	
	public String getName() {
		return nameofPlayer;
	}
	public int setPlayerAge() {
		System.out.println("Enter Age of player.");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		this.playerAge=scan.nextInt();
		if(playerAge<=8) {
			System.out.println("that player can not play the game.");
		}
		return playerAge;
	}
	public int getPlayerAge() {
		
		return this.playerAge;
	}
	public boolean getTurn() {
		return this.isTurn;
	}
}
