/**
 * 
 */
package player;

/**
 * @author waseem
 *
 */
// using oop concept of encapsulation
public class Player {

	private String Name;
	private char PlayerSymbol;
	private boolean isActive; 
    public Player(){
    	
    }
    public Player(String name,char symbol,boolean active)
    {
    	this.Name=name;
    	this.PlayerSymbol=symbol;
    	this.isActive=active;
    }
	public void setPlayerName(String name) {
		Name = name;
	}

	public String getPlayerName() {
		return Name;
	}

	public void setPlayerSymbol(char symbol) {
		PlayerSymbol = symbol;
	}

	public char getPlayerSymbol() {
		return PlayerSymbol;
	}
	public void setPlayerStatus(boolean turn) {
		isActive = turn;
	}

	public boolean getPlayerStatus() {
		return isActive;
	}
}
