

package MainFrame.ChessMenuBar.ChessBar_Menus.Menu_Items.Help_MenuItems;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;


public class About_Chess_Game  extends JMenuItem
{
    
   /** Creates a new instance of About_Game_Programmers */
    public About_Chess_Game()
    {
        setText("About Chess Game");  
        addActionListener(new ActionListener()
        {
        	public void actionPerformed(ActionEvent e)
        	{
        		createAboutUsDisplay();
            
        	}
        });
    }
    
    //creates information pop up
    public void createAboutUsDisplay()
    {
    	Frame frame = new JFrame();
    	JOptionPane.showMessageDialog(frame, "Overview\nChess is a two-player strategy board game on a chessboard. \n"
    			+ "A chessboard is a checkered gameboard arranged in an 8 x 8 grid.\n"
    			+ "Each player begins with 16 pieces: one king, one queen, two rooks, two knights, two bishops, and eight pawns.\n"
    			+ "The player who plays with white pieces goes first."
    			+ "\n\nPieces\nRook\n"
    			+ "The rook moves in a straight line, horizontally or vertically. The rook may not jump over other pieces, that is:\n"
    			+ " all squares between the square where the rook starts its move and where the rook ends its move must be empty.\n"
    			+ "\nBishop\nThe bishop moves in a straight diagonal line. The bishop may also not jump over other pieces.\n"
    			+ "\nQueen\nThe queen may move in any straight line, horizontal, vertical, or diagonal.\n"
    			+ "\nKnight\nThe knight makes a move that consists of first one step in a horizontal or vertical direction,\n "
    			+ "and then one step diagonally in an outward direction.\n"
    			+ "\nPawn\nThe pawn moves differently regarding whether it moves to an empty square or whether it takes a piece of\n"
    			+ "the opponent.When a pawn does not take, it moves one square straight forward. When this pawn has not moved at all,\n"
    			+ "i.e., the pawn is still at the second row (from the owning players view), the pawn may make a double step straight forward.\n"
    			+ "When taking, the pawn goes one square diagonally forward.\n"
    			+ "\nKing\nThe king moves one square in any direction, horizontally, vertically, or diagonally.\n"
    			+ "\nCheck\nWhen the king of a player can be taken by a piece of the opponent, one says that the king is in check.\n"
    			+ "\nMate\nWhen a player is in check, and he cannot make a move such that after the move, the king is not in check,\n"
    			+ "then he is mated. The player that is mated lost the game, and the player that mated him won the game.", 
    			"About Chess Game", JOptionPane.PLAIN_MESSAGE);
    }
}



