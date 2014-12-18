/**
 * 
 */
package player;

/**
 * @author waseem
 *
 */
// using oop concept of encapsulation
public interface Player {
	public char getPlayerSymbol();
	public void setPlayerStatus(boolean turn);
	public boolean getPlayerStatus();
	public String getPlayerName();
	public void setPlayerName(String name);
}
