/**
 * 
 */
package visual;

/**
 * @author waseem
 *
 */
//This class is responsible for drawing TicTacToe Game Board
public class Visualizer{
	
	private String GameTitle;
	public void setGameTitle(String gametitle)
	{
		GameTitle=gametitle;
	}
	public String getGameTitle()
	{
		return GameTitle;
	}
	//Draw the TicTacToe Board
	public void DrawTicTacToeBoard(char[] BoardData)
	{
        System.out.println(  "\t\t" + BoardData [0] + "   | " +BoardData [1]+ "  | " +BoardData [2]);
        System.out.println(  " \t\t ---|----|---" );
        System.out.println(  "\t\t" + BoardData [3]+ "   | " +BoardData [4]+ "  | " +BoardData [5]);
        System.out.println(  " \t\t ---|----|---" );
        System.out.println(  "\t\t" + BoardData [6]+ "   | " +BoardData [7]+ "  | " +BoardData [8]); 
	}
}
