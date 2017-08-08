
package MainFrame.ChessFrame.players;


import MainFrame.ChessFrame.players.Pieces.Castle;
import MainFrame.ChessFrame.players.Pieces.Bishop;
import MainFrame.ChessFrame.players.Pieces.Knight;
import MainFrame.ChessFrame.players.Pieces.Queen;
import MainFrame.ChessFrame.players.Pieces.Pawn;
import MainFrame.ChessFrame.players.Pieces.King;
import java.awt.Button;
import java.awt.Canvas;
import java.awt.Checkbox;
import java.awt.CheckboxMenuItem;
import java.awt.Choice;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Label;
import java.awt.List;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.Point;
import java.awt.PopupMenu;
import java.awt.PrintJob;
import java.awt.ScrollPane;
import java.awt.Scrollbar;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.datatransfer.Clipboard;
import java.awt.dnd.DragGestureEvent;
import java.awt.dnd.InvalidDnDOperationException;
import java.awt.dnd.peer.DragSourceContextPeer;
import java.awt.im.InputMethodHighlight;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.awt.peer.ButtonPeer;
import java.awt.peer.CanvasPeer;
import java.awt.peer.CheckboxMenuItemPeer;
import java.awt.peer.CheckboxPeer;
import java.awt.peer.ChoicePeer;
import java.awt.peer.DialogPeer;
import java.awt.peer.FileDialogPeer;
import java.awt.peer.FontPeer;
import java.awt.peer.FramePeer;
import java.awt.peer.LabelPeer;
import java.awt.peer.ListPeer;
import java.awt.peer.MenuBarPeer;
import java.awt.peer.MenuItemPeer;
import java.awt.peer.MenuPeer;
import java.awt.peer.PanelPeer;
import java.awt.peer.PopupMenuPeer;
import java.awt.peer.ScrollPanePeer;
import java.awt.peer.ScrollbarPeer;
import java.awt.peer.TextAreaPeer;
import java.awt.peer.TextFieldPeer;
import java.awt.peer.WindowPeer;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Map;
import java.util.Properties;


public class Player1 {
    
    /** Creates a new instance of player1 */
    public Castle whiteCastle1;
    public Castle whiteCastle2;
    public Knight whiteKnight1;
    public Knight whiteKnight2;
    public Queen whiteQueen;
    public Bishop whiteBishop1;
    public Bishop whiteBishop2;
    public Pawn[] whitePawns=new Pawn[8];
    public King whiteKing;
    private int inHand=-1;
    private boolean kingIsCheck=false;
    private int choosenOne;
    String Color="white";
    private Point other;
    int ate_to_protect;
    
    
    
    public Player1() {
        String fileSeparator = new String(System.getProperty("file.separator"));
        whiteCastle1=new Castle("src" + fileSeparator + "Icons" + fileSeparator + "Player1Icons" +fileSeparator + "wr.gif",8,8);
        whiteCastle2=new Castle("src" + fileSeparator + "Icons" + fileSeparator + "Player1Icons" +fileSeparator + "wr.gif",1,8);
        whiteKnight1=new Knight("src" + fileSeparator + "Icons" + fileSeparator + "Player1Icons" +fileSeparator + "wn.gif",2,8);
        whiteKnight2=new Knight("src" + fileSeparator + "Icons" + fileSeparator + "Player1Icons" +fileSeparator + "wn.gif",7,8);
        whiteBishop1=new Bishop("src" + fileSeparator + "Icons" + fileSeparator + "Player1Icons" +fileSeparator + "wb.gif",3,8);
        whiteBishop2=new Bishop("src" + fileSeparator + "Icons" + fileSeparator + "Player1Icons" +fileSeparator + "wb.gif",6,8);
        whiteQueen=new Queen("src" + fileSeparator + "Icons" + fileSeparator + "Player1Icons" +fileSeparator + "wq.gif",4,8);
        whiteKing=new King("src" + fileSeparator + "Icons" + fileSeparator + "Player1Icons" +fileSeparator + "wk.gif",5,8);
        int j=1;
        for(int  i=0;i<=7;i++,j++) {
            whitePawns[i]=new Pawn("src" + fileSeparator + "Icons" + fileSeparator + "Player1Icons" +fileSeparator + "wp.gif",j,7);
        }
    }
    public Point returnPostion(int i) {
        
        switch(i) {
            
            case 17:return whiteCastle1.returnPostion();
            case 18:return whiteCastle2.returnPostion();
            case 19:return whiteKnight1.returnPostion();
            case 20:return whiteKnight2.returnPostion();
            case 21:return whiteBishop1.returnPostion();
            case 22:return whiteBishop2.returnPostion();
            case 23:return whiteQueen.returnPostion();
            case 24:return whiteKing.returnPostion();
            case 25:return  whitePawns[0].returnPostion();
            case 26:return  whitePawns[1].returnPostion();
            case 27:return  whitePawns[2].returnPostion();
            case 28:return  whitePawns[3].returnPostion();
            case 29:return  whitePawns[4].returnPostion();
            case 30:return  whitePawns[5].returnPostion();
            case 31:return  whitePawns[6].returnPostion();
            case 32:return  whitePawns[7].returnPostion();
        }
        return new Point(-1,-1);
    }
    public Point returnOldPostion(int i) {
        
        switch(i) {
            
            case 17:return whiteCastle1.returnOld();
            case 18:return whiteCastle2.returnOld();
            case 19:return whiteKnight1.returnOld();
            case 20:return whiteKnight2.returnOld();
            case 21:return whiteBishop1.returnOld();
            case 22:return whiteBishop2.returnOld();
            case 23:return whiteQueen.returnOld();
            case 24:return whiteKing.returnOld();
            case 25:return  whitePawns[0].returnOld();
            case 26:return  whitePawns[1].returnOld();
            case 27:return  whitePawns[2].returnOld();
            case 28:return  whitePawns[3].returnOld();
            case 29:return  whitePawns[4].returnOld();
            case 30:return  whitePawns[5].returnOld();
            case 31:return  whitePawns[6].returnOld();
            case 32:return  whitePawns[7].returnOld();
        }
        return new Point(-1,-1);
    }
    public Image returnIconImage(int i) {
        
        switch(i) {
            
            case 17:
            {return whiteCastle1.returnPieceImage();}
            case 18:
            {return whiteCastle2.returnPieceImage();}
            case 19:
            {return whiteKnight1.returnPieceImage();}
            case 20:
            {return whiteKnight2.returnPieceImage();}
            case 21:return whiteBishop1.returnPieceImage();
            case 22:return whiteBishop2.returnPieceImage();
            case 23:return whiteQueen.returnPieceImage();
            case 24:return whiteKing.returnPieceImage();
            case 25:return  whitePawns[0].returnPieceImage();
            case 26:return  whitePawns[1].returnPieceImage();
            case 27:return  whitePawns[2].returnPieceImage();
            case 28:return  whitePawns[3].returnPieceImage();
            case 29:return  whitePawns[4].returnPieceImage();
            case 30:return  whitePawns[5].returnPieceImage();
            case 31:return  whitePawns[6].returnPieceImage();
            case 32:return  whitePawns[7].returnPieceImage();
        }
        return null;
    }
    public void changePostion(Point newPoint,int i) {
        switch(i) {
            
            case 17:whiteCastle1.setPoint(newPoint);break;
            case 18:whiteCastle2.setPoint(newPoint);break;
            case 19:whiteKnight1.setPoint(newPoint);break;
            case 20:whiteKnight2.setPoint(newPoint);break;
            case 21: whiteBishop1.setPoint(newPoint);break;
            case 22: whiteBishop2.setPoint(newPoint);break;
            case 23: whiteQueen.setPoint(newPoint);break;
            case 24: whiteKing.setPoint(newPoint);break;
            case 25:  whitePawns[0].setPoint(newPoint);break;
            case 26:  whitePawns[1].setPoint(newPoint);break;
            case 27:  whitePawns[2].setPoint(newPoint);break;
            case 28:  whitePawns[3].setPoint(newPoint);break;
            case 29:  whitePawns[4].setPoint(newPoint);break;
            case 30:  whitePawns[5].setPoint(newPoint);break;
            case 31:  whitePawns[6].setPoint(newPoint);break;
            case 32:  whitePawns[7].setPoint(newPoint);break;
        }
        
    }
    public void changePostionToOld(Point newPoint,int i) {
        switch(i) {
            
            case 17:whiteCastle1.toOld(newPoint);break;
            case 18:whiteCastle2.toOld(newPoint);break;
            case 19:whiteKnight1.toOld(newPoint);break;
            case 20:whiteKnight2.toOld(newPoint);break;
            case 21: whiteBishop1.toOld(newPoint);break;
            case 22: whiteBishop2.toOld(newPoint);break;
            case 23: whiteQueen.toOld(newPoint);break;
            case 24: whiteKing.toOld(newPoint);break;
            case 25:  whitePawns[0].toOld(newPoint);break;
            case 26:  whitePawns[1].toOld(newPoint);break;
            case 27:  whitePawns[2].toOld(newPoint);break;
            case 28:  whitePawns[3].toOld(newPoint);break;
            case 29:  whitePawns[4].toOld(newPoint);break;
            case 30:  whitePawns[5].toOld(newPoint);break;
            case 31:  whitePawns[6].toOld(newPoint);break;
            case 32:  whitePawns[7].toOld(newPoint);break;
        }
    }
    
    public void changePixel(int newPixelX,int newPixelY,int i) {
        choosenOne=i;
        switch(choosenOne) {
            
            case 17:whiteCastle1.setPixels(newPixelX,newPixelY);break;
            case 18:whiteCastle2.setPixels(newPixelX,newPixelY);break;
            case 19:whiteKnight1.setPixels(newPixelX,newPixelY);break;
            case 20:whiteKnight2.setPixels(newPixelX,newPixelY);break;
            case 21: whiteBishop1.setPixels(newPixelX,newPixelY);break;
            case 22: whiteBishop2.setPixels(newPixelX,newPixelY);break;
            case 23: whiteQueen.setPixels(newPixelX,newPixelY);break;
            case 24: whiteKing.setPixels(newPixelX,newPixelY);break;
            case 25:  whitePawns[0].setPixels(newPixelX,newPixelY);break;
            case 26:  whitePawns[1].setPixels(newPixelX,newPixelY);break;
            case 27:  whitePawns[2].setPixels(newPixelX,newPixelY);break;
            case 28:  whitePawns[3].setPixels(newPixelX,newPixelY);break;
            case 29:  whitePawns[4].setPixels(newPixelX,newPixelY);break;
            case 30:  whitePawns[5].setPixels(newPixelX,newPixelY);break;
            case 31:  whitePawns[6].setPixels(newPixelX,newPixelY);break;
            case 32:  whitePawns[7].setPixels(newPixelX,newPixelY);break;
        }
    }
    public Point getPixelPoint(int i) {
        choosenOne=i;
        switch(choosenOne) {
            
            case 17:return whiteCastle1.getpixelPoint();
            case 18:return whiteCastle2.getpixelPoint();
            case 19:return whiteKnight1.getpixelPoint();
            case 20:return whiteKnight2.getpixelPoint();
            case 21: return whiteBishop1.getpixelPoint();
            case 22: return whiteBishop2.getpixelPoint();
            case 23: return whiteQueen.getpixelPoint();
            case 24: return whiteKing.getpixelPoint();
            case 25: return  whitePawns[0].getpixelPoint();
            case 26:  return whitePawns[1].getpixelPoint();
            case 27: return  whitePawns[2].getpixelPoint();
            case 28:  return whitePawns[3].getpixelPoint();
            case 29: return  whitePawns[4].getpixelPoint();
            case 30: return whitePawns[5].getpixelPoint();
            case 31: return whitePawns[6].getpixelPoint();
            case 32: return whitePawns[7].getpixelPoint();
        }
        return null;
    }
    public boolean checkthemove(Point newP,int i) {
        choosenOne=i;
        switch(choosenOne) {
            
            case 17:return whiteCastle1.Canmove(newP.x,newP.y);
            case 18:return whiteCastle2.Canmove(newP.x,newP.y);
            case 19:return whiteKnight1.Canmove(newP.x,newP.y);
            case 20:return whiteKnight2.Canmove(newP.x,newP.y);
            case 21: return whiteBishop1.Canmove(newP.x,newP.y);
            case 22: return whiteBishop2.Canmove(newP.x,newP.y);
            case 23: return whiteQueen.Canmove(newP.x,newP.y);
            case 24: return whiteKing.Canmove(newP.x,newP.y);
            case 25: return  whitePawns[0].Canmove(newP.x,newP.y,Color);
            case 26:  return whitePawns[1].Canmove(newP.x,newP.y,Color);
            case 27: return  whitePawns[2].Canmove(newP.x,newP.y,Color);
            case 28:  return whitePawns[3].Canmove(newP.x,newP.y,Color);
            case 29: return  whitePawns[4].Canmove(newP.x,newP.y,Color);
            case 30: return whitePawns[5].Canmove(newP.x,newP.y,Color) ;
            case 31: return whitePawns[6].Canmove(newP.x,newP.y,Color);
            case 32: return whitePawns[7].Canmove(newP.x,newP.y,Color);
        }
        return false;
    }
    public boolean setSeenToSiliders(int i,Point P) {
        switch(i) {
            case 25:   return  whitePawns[0].setSeenbychecking(P,"white");
            case 26:   return whitePawns[1].setSeenbychecking(P,"white");
            case 27:  return   whitePawns[2].setSeenbychecking(P,"white");
            case 28:  return    whitePawns[3].setSeenbychecking(P,"white");
            case 29:  return  whitePawns[4].setSeenbychecking(P,"white");
            case 30:  return  whitePawns[5].setSeenbychecking(P,"white");
            case 31:  return  whitePawns[6].setSeenbychecking(P,"white");
            case 32: return whitePawns[7].setSeenbychecking(P,"white");
        }
        return false;
    }
    public boolean returnPawnSeen(int i) {
        switch(i) {
            case 25:   return  whitePawns[0].returnMyseen();
            case 26:   return whitePawns[1].returnMyseen();
            case 27:  return   whitePawns[2].returnMyseen();
            case 28:  return    whitePawns[3].returnMyseen();
            case 29:  return  whitePawns[4].returnMyseen();
            case 30:  return  whitePawns[5].returnMyseen();
            case 31:  return  whitePawns[6].returnMyseen();
            case 32: return whitePawns[7].returnMyseen();
        }
        return false;
    }
    public boolean checktheWay(Point newP,Point postionFromOthers,int i) {
        switch(i) {
            
            
            case 17:return whiteCastle1.PieceInMYway(newP.x,newP.y,postionFromOthers);
            case 18:return whiteCastle2.PieceInMYway(newP.x,newP.y,postionFromOthers);
            case 21: return whiteBishop1.PieceInMYway(newP.x,newP.y,postionFromOthers);
            case 22: return whiteBishop2.PieceInMYway(newP.x,newP.y,postionFromOthers);
            case 23: return whiteQueen.PieceInMYway(newP.x,newP.y,postionFromOthers);
            case 25: return  whitePawns[0].PieceInMYway(newP.x,newP.y,postionFromOthers,Color);
            case 26:  return whitePawns[1].PieceInMYway(newP.x,newP.y,postionFromOthers,Color);
            case 27: return  whitePawns[2].PieceInMYway(newP.x,newP.y,postionFromOthers,Color);
            case 28:  return whitePawns[3].PieceInMYway(newP.x,newP.y,postionFromOthers,Color);
            case 29: return  whitePawns[4].PieceInMYway(newP.x,newP.y,postionFromOthers,Color);
            case 30: return whitePawns[5].PieceInMYway(newP.x,newP.y,postionFromOthers,Color);
            case 31: return whitePawns[6].PieceInMYway(newP.x,newP.y,postionFromOthers,Color);
            case 32: return whitePawns[7].PieceInMYway(newP.x,newP.y,postionFromOthers,Color);
            
        }
        return false;
    }
    public boolean killedPiece(int i) {
        Point out=new Point(13,13);
        switch(i) {
            
            case 17:  whiteCastle1.setPoint(out);return true;
            case 18:   whiteCastle2.setPoint(out);return true;
            case 19:  whiteKnight1.setPoint(out);return true;
            case 20:  whiteKnight2.setPoint(out);return true;
            case 21:   whiteBishop1.setPoint(out);return true;
            case 22:   whiteBishop2.setPoint(out);return true;
            case 23:   whiteQueen.setPoint(out);return true;
            case 24:    return false;
            case 25:    whitePawns[0].setPoint(out);return true;
            case 26:   whitePawns[1].setPoint(out);return true;
            case 27:   whitePawns[2].setPoint(out);return true;
            case 28:    whitePawns[3].setPoint(out);return true;
            case 29:    whitePawns[4].setPoint(out);return true;
            case 30:   whitePawns[5].setPoint(out);return true;
            case 31:   whitePawns[6].setPoint(out);return true;
            case 32:   whitePawns[7].setPoint(out);return true;
        }
        
        return false;
    }
    public boolean checKing(Point p1,Point p2,int i) {
        switch(i) {
            
            case 17:return  whiteCastle1.checkKing(p1.x,p1.y,p2);
            case 18:return whiteCastle2.checkKing(p1.x,p1.y,p2);
            case 19:return  whiteKnight1.Canmove(p1.x,p1.y);
            case 20:return  whiteKnight2.Canmove(p1.x,p1.y);
            case 21:return   whiteBishop1.checkKing(p1.x,p1.y,p2);
            case 22:return   whiteBishop2.checkKing(p1.x,p1.y,p2);
            case 23:return   whiteQueen.checkKing(p1.x,p1.y,p2);
            
            case 25:return    whitePawns[0].Canmove(p1.x,p1.y,Color);
            case 26:return   whitePawns[1].Canmove(p1.x,p1.y,Color);
            case 27:return   whitePawns[2].Canmove(p1.x,p1.y,Color);
            case 28:return    whitePawns[3].Canmove(p1.x,p1.y,Color);
            case 29:return    whitePawns[4].Canmove(p1.x,p1.y,Color);
            case 30: return  whitePawns[5].Canmove(p1.x,p1.y,Color);
            case 31:return   whitePawns[6].Canmove(p1.x,p1.y,Color);
            case 32:return   whitePawns[7].Canmove(p1.x,p1.y,Color);
        }
        return false;
    }
    
    
    
    public int returnChosen() {
        return choosenOne;
    }
    public void setInHand(int i ) {
        inHand=i;
    }
    public int getInHand() {
        return inHand;
    }
    public boolean canMove(int x,int y) {
        return true;
    }
    public void checkKing(boolean newkingcheck) {
        kingIsCheck=newkingcheck;
    }
    public boolean returnCheckKing() {
        
        
        return kingIsCheck;
    }
    
    public boolean ifMyKingInCheck(Player2 Black) {
        boolean isCheckmate=false;
        boolean flag=false;
        
        
        
        
        
        
        return false;
    }
    public boolean checkmateGameOver(Player2 Enemy) {
        
        
        
        
        if(! kingGenerateMoves(Enemy)) {
            
            inHand=-1;
            return false;
        } else if(!castleGenerateMoves(Enemy,whiteCastle1)) {
            
            inHand=-1;
            return false;
        } else if(!castleGenerateMoves(Enemy,whiteCastle2)) {
            
            inHand=-1;
            return false;
        } else if(!bishopGenerateMoves(Enemy,whiteBishop1)) {
            
            inHand=-1;
            return false;
        } else if(!bishopGenerateMoves(Enemy,whiteBishop2)) {
            
            inHand=-1;
            return false;
        } else if(!knightGenerateMoves(Enemy,whiteKnight1)) {
            
            inHand=-1;
            return false;
        } else if(!knightGenerateMoves(Enemy,whiteKnight2)) {
            
            inHand=-1;
            return false;
        }
        
        else if(!queenGenerateMoves(Enemy)) {
            
            inHand=-1;
            return false;
        }
        
        for(int i=0;i<=7;i++) {
            inHand=25+i;
            if(!pawnGenerateMoves(Enemy,whitePawns[i])) {
                
                inHand=-1;
                System.out.println("I Killed Solider 1");
                return false;
            }
        }
        
        inHand=-1;
        return true;
        
        
        
        
    }
    public boolean  seeKingCheck(Player2 Black) {
        
        Point My_King_Postion=whiteKing.returnPostion();
        boolean flag=false;
        
        
        //////////    Start Checking the King ////////////
        for(int i=1;i<17;i++) {
            if(i<9) {
                if(Black.checkTheMove(My_King_Postion,i)) {
                    
                    flag=true;
                    for(int j=1;j<33;j++) {
                        
                        if(j<17) {
                            
                            if(Black.checkTheWay(My_King_Postion,Black.returnPostion(j),i)) {
                                //Means there is something in the Way so can't move'
                                
                                flag=false;
                                
                                
                            }
                        }
                        
                        else {
                            
                            if(j!=24)
                                if(Black.checkTheWay(My_King_Postion,returnPostion(j),i)) {
                                
                                flag=false;
                                //Means there is something in the Way so can't move'
                                
                                
                                }
                            
                        }
                        
                    }
                    
                    if(flag) {
                        
                        break;
                    }
                    
                }
            } else {
                // For soliders
                if(Black.setSeenToSiliders(i,My_King_Postion)) {
                    
                    break;
                    
                }
            }
            //   if(stillIn_Check){ return true;}//Here Means White king is in check !!!
            if(i==16) {
                
                return false; }
        }
        
        return true;
    }
    
    
    public boolean pieceAlreadyThere(Point newP) {
        Point samePostion;
        for(int i=17;i<=32;i++) {
            if(getInHand()!=i)// There is no need to check the inHand pice
            {
                
                
                //Check if there is White Pices in the new Point
                //If so we Can't move (Same Color)!!
                
                
                
                samePostion=returnPostion(i);
                if(newP.x==samePostion.x&&newP.y==samePostion.y) {
                    
                    return false;
                    
                }
            }
        }
        
        
        return true;
    }
    public boolean pieceAlreadyThereFromEnemy(Point newP,Player2 enemy) {
        Point samePostion;
        for(int i=1;i<=16;i++) {
            samePostion=enemy.returnPostion(i);
            if(newP.x==samePostion.x&&newP.y==samePostion.y) {
                
                return false;
                
            }
        }
        
        
        return true;
    }
    public int getPieceAlreadyThereFromEnemy(Point newP,Player2 enemy) {
        Point samePostion;
        for(int i=1;i<=16;i++) {
            samePostion=enemy.returnPostion(i);
            if(newP.x==samePostion.x&&newP.y==samePostion.y) {
                
                return i;
                
            }
        }
        
        
        return -1;
    }
    
    
    public boolean kingGenerateMoves(Player2 enemy) {
        boolean somthing_killed=false;
        Point Oldp=new Point();
        
        Point PlaceCheck=new Point();
        inHand=24;
        
        int x=whiteKing.returnX();
        int y=whiteKing.returnY();
        Oldp.x=x;
        Oldp.y=y;
        
        if(x+1<=8) {
            
            
            whiteKing.setX(x+1);
            whiteKing.setY(y);
            PlaceCheck.x=x+1;
            PlaceCheck.y=y;
            
            
            if(killToProtectKing(enemy,returnPostion(inHand))) {
                somthing_killed=true;
            }
            if(pieceAlreadyThere(PlaceCheck))
                if(!seeKingCheck(enemy)) {
                
                
                whiteKing.setPoint(Oldp);
                if(somthing_killed) {
                    enemy.changePostion(other,ate_to_protect);
                    somthing_killed=false;
                }
                return false;
                }
            
        }
        whiteKing.setPoint(Oldp);
        if(somthing_killed) {
            enemy.changePostion(other,ate_to_protect);
            somthing_killed=false;
        }
        if(y+1<=8) {
            
            
            whiteKing.setX(x);
            whiteKing.setY(y+1);
            PlaceCheck.x=x;
            PlaceCheck.y=y+1;
            if(killToProtectKing(enemy,returnPostion(inHand))) {
                somthing_killed=true;
            }
            if(pieceAlreadyThere( PlaceCheck))
                if(!seeKingCheck(enemy)) {
                
                whiteKing.setPoint(Oldp);
                if(somthing_killed) {
                    enemy.changePostion(other,ate_to_protect);
                    somthing_killed=false;
                }
                return false;
                
                }
            
        }
        whiteKing.setPoint(Oldp);
        if(somthing_killed) {
            enemy.changePostion(other,ate_to_protect);
            somthing_killed=false;
        }
        
        if(y-1>0) {
            
            whiteKing.setX(x);
            whiteKing.setY(y-1);
            
            PlaceCheck.x=x;
            PlaceCheck.y=y-1;
            
            if(killToProtectKing(enemy,returnPostion(inHand))) {
                somthing_killed=true;
            }
            
            if(pieceAlreadyThere( PlaceCheck))
                if(!seeKingCheck(enemy)) {
                
                whiteKing.setPoint(Oldp);
                if(somthing_killed) {
                    enemy.changePostion(other,ate_to_protect);
                    somthing_killed=false;
                }
                
                return false;
                }
            
        }
        whiteKing.setPoint(Oldp);
        if(somthing_killed) {
            enemy.changePostion(other,ate_to_protect);
            somthing_killed=false;
        }
        if(x-1>0) {
            
            whiteKing.setX(x-1);
            whiteKing.setY(y);
            
            PlaceCheck.x=x-1;
            PlaceCheck.y=y;
            if(killToProtectKing(enemy,returnPostion(inHand))) {
                somthing_killed=true;
            }
            if(pieceAlreadyThere( PlaceCheck))
                if(!seeKingCheck(enemy)) {
                if(somthing_killed) {
                    enemy.changePostion(other,ate_to_protect);
                    somthing_killed=false;
                }
                whiteKing.setPoint(Oldp);
                return false;
                }
            
        }
        whiteKing.setPoint(Oldp);
        if(somthing_killed) {
            enemy.changePostion(other,ate_to_protect);
            somthing_killed=false;
        }
        if(y-1>0&&x-1>0) {
            
            whiteKing.setX(x-1);
            whiteKing.setY(y-1);
            
            PlaceCheck.x=x-1;
            PlaceCheck.y=y-1;
            
            if(killToProtectKing(enemy,returnPostion(inHand))) {
                somthing_killed=true;
            }
            if(pieceAlreadyThere( PlaceCheck))
                if(!seeKingCheck(enemy)) {
                
                if(somthing_killed) {
                    enemy.changePostion(other,ate_to_protect);
                    somthing_killed=false;
                }
                whiteKing.setPoint(Oldp);
                return false;
                }
            
        }
        whiteKing.setPoint(Oldp);
        if(somthing_killed) {
            enemy.changePostion(other,ate_to_protect);
            somthing_killed=false;
        }
        if(y+1<=8&&x+1<=8) {
            
            whiteKing.setX(x+1);
            whiteKing.setY(y+1);
            
            PlaceCheck.x=x+1;
            PlaceCheck.y=y+1;
            if(killToProtectKing(enemy,returnPostion(inHand))) {
                somthing_killed=true;
            }
            if(pieceAlreadyThere( PlaceCheck))
                if(!seeKingCheck(enemy)) {
                
                if(somthing_killed) {
                    enemy.changePostion(other,ate_to_protect);
                    somthing_killed=false;
                }
                whiteKing.setPoint(Oldp);
                return false;
                }
            
        }
        whiteKing.setPoint(Oldp);
        if(somthing_killed) {
            enemy.changePostion(other,ate_to_protect);
            somthing_killed=false;
        }
        if(y-1>0&&x+1<=8) {
            
            whiteKing.setX(x+1);
            whiteKing.setY(y-1);
            
            PlaceCheck.x=x+1;
            PlaceCheck.y=y-1;
            if(killToProtectKing(enemy,returnPostion(inHand))) {
                somthing_killed=true;
            }
            if(pieceAlreadyThere( PlaceCheck))
                if(!seeKingCheck(enemy)) {
                if(somthing_killed) {
                    enemy.changePostion(other,ate_to_protect);
                    somthing_killed=false;
                }
                whiteKing.setPoint(Oldp);
                return false;
                }
            
        }
        whiteKing.setPoint(Oldp);
        if(somthing_killed) {
            enemy.changePostion(other,ate_to_protect);
            somthing_killed=false;
        }
        if(y+1<=8&&x-1>0) {
            
            
            whiteKing.setX(x-1);
            whiteKing.setY(y+1);
            
            PlaceCheck.x=x-1;
            PlaceCheck.y=y+1;
            if(killToProtectKing(enemy,returnPostion(inHand))) {
                somthing_killed=true;
            }
            if(pieceAlreadyThere( PlaceCheck))
                if(!seeKingCheck(enemy)) {
                if(somthing_killed) {
                    enemy.changePostion(other,ate_to_protect);
                    somthing_killed=false;
                }
                whiteKing.setPoint(Oldp);
                return false;
                }
            
        }
        
        if(somthing_killed) {
            enemy.changePostion(other,ate_to_protect);
            somthing_killed=false;
        }
        
        
        whiteKing.setPoint(Oldp);
        return true;
        
        
        
        
    }
    
    public boolean castleGenerateMoves(Player2 enemy,Castle whiteCastle) {
        boolean somthing_killed=false;
        Point Oldp1=new Point();
        
        Point PlaceCheck=new Point();
        int x1=whiteCastle.returnX();
        int y1=whiteCastle.returnY();
        
        if(whiteCastle==whiteCastle1) {
            inHand=17;
        } else {
            inHand=18;
        }
        /////////////////////
        
        Oldp1.x=x1;
        Oldp1.y=y1;
        
        PlaceCheck.y=y1;
        
        if(x1!=20) {
            for(int i=1;i<=8;i++) {
                whiteCastle.setX(i);
                PlaceCheck.x=i;
                
                if(checkTheWayToPostion(enemy,Oldp1)) {
                    if(killToProtectKing(enemy,returnPostion(inHand))) {
                        somthing_killed=true;
                    }
                    if(pieceAlreadyThere(PlaceCheck))
                        if(!seeKingCheck(enemy)) {
                        whiteCastle.setX(Oldp1.x);
                        whiteCastle.setY(Oldp1.y);
                        
                        if(somthing_killed) {
                            enemy.changePostion(other,ate_to_protect);
                            somthing_killed=false;
                        }
                        return false;
                        }
                }
                
                if(somthing_killed) {
                    enemy.changePostion(other,ate_to_protect);
                    somthing_killed=false;
                }
                
            }
            whiteCastle.setX(Oldp1.x);
            PlaceCheck.x=Oldp1.x;
            
            if(somthing_killed) {
                enemy.changePostion(other,ate_to_protect);
                somthing_killed=false;
            }
            for(int i=1;i<=8;i++) {
                whiteCastle.setY(i);
                PlaceCheck.y=i;
                if(checkTheWayToPostion(enemy,Oldp1)) {
                    if(killToProtectKing(enemy,returnPostion(inHand))) {
                        somthing_killed=true;
                    }
                    if(pieceAlreadyThere(PlaceCheck) )
                        if(!seeKingCheck(enemy)) {
                        whiteCastle.setX(Oldp1.x);
                        whiteCastle.setY(Oldp1.y);
                        
                        if(somthing_killed) {
                            enemy.changePostion(other,ate_to_protect);
                            somthing_killed=false;
                        }
                        return false;
                        }
                }
                
                if(somthing_killed) {
                    enemy.changePostion(other,ate_to_protect);
                    somthing_killed=false;
                }
                
            }
            whiteCastle.setY(Oldp1.y);
        }
        //////////////////////////////////////////
        ///////////////////////////
        
        if(somthing_killed) {
            enemy.changePostion(other,ate_to_protect);
            somthing_killed=false;
        }
        whiteCastle.setX(Oldp1.x);
        whiteCastle.setY(Oldp1.y);
        return true;
    }
    
    public  boolean bishopGenerateMoves(Player2 enemy,Bishop whiteBishop) {
        boolean somthing_killed=false;
        Point Oldp1=new Point();
        Point PlaceCheck=new Point();
        
        Oldp1=whiteBishop.returnPostion();
        
        if(whiteBishop==whiteBishop1) {
            inHand=21;
        } else {
            inHand=22;
        }
        
        if(Oldp1.x!=20) {
            for(int x= Oldp1.x,y= Oldp1.y;x>=1&&y<=8;x--,y++) {
                
                whiteBishop.setX(x);
                whiteBishop.setY(y);
                PlaceCheck.x=x;
                PlaceCheck.y=y;
                if(checkTheWayToPostion(enemy, Oldp1)) {
                    if(killToProtectKing(enemy,returnPostion(inHand))) {
                        somthing_killed=true;
                    }
                    if(pieceAlreadyThere(PlaceCheck))
                        if(!seeKingCheck(enemy)) {
                        
                        if(somthing_killed) {
                            enemy.changePostion(other,ate_to_protect);
                            somthing_killed=false;
                        }
                        whiteBishop.setPoint(Oldp1);
                        return false;
                        }
                }
                
                if(somthing_killed) {
                    enemy.changePostion(other,ate_to_protect);
                    somthing_killed=false;
                }
                
            }
            if(somthing_killed) {
                enemy.changePostion(other,ate_to_protect);
                somthing_killed=false;
            }
            for(int x=Oldp1.x,y=Oldp1.y;y>=1&&x<=8;x++,y--) {
                
                whiteBishop.setX(x);
                whiteBishop.setY(y);
                PlaceCheck.x=x;
                PlaceCheck.y=y;
                if(checkTheWayToPostion(enemy, Oldp1)) {
                    if(killToProtectKing(enemy,returnPostion(inHand))) {
                        somthing_killed=true;
                    }
                    if(pieceAlreadyThere(PlaceCheck))
                        if(!seeKingCheck(enemy)) {
                        if(somthing_killed) {
                            enemy.changePostion(other,ate_to_protect);
                            somthing_killed=false;
                        }
                        whiteBishop.setPoint(Oldp1);
                        return false;
                        }
                }
                
                if(somthing_killed) {
                    enemy.changePostion(other,ate_to_protect);
                    somthing_killed=false;
                }
                
            }
            whiteBishop.setPoint(Oldp1);
            
        }
        
        whiteBishop.setPoint(Oldp1);
        
        
        if(somthing_killed) {
            enemy.changePostion(other,ate_to_protect);
            somthing_killed=false;
        }
        
        return true;
    }
    
    public boolean knightGenerateMoves(Player2 enemy,Knight whiteKnight) {
        Point oldp1=new Point();
        boolean somthing_killed=false;
        oldp1=whiteKnight.returnPostion();
        
        Point PlaceCheck=new Point();
        
        if(whiteKnight==whiteKnight1) {
            inHand=19;
        } else {
            inHand=20;
        }
        
        
        int x=oldp1.x;
        int y=oldp1.y;
        
        if(x!=20) {
            
            if(x+1<=8&&y+1<=8) {
                whiteKnight.setX(x+1);
                whiteKnight.setY(y+2);
                PlaceCheck.x=x+1;
                PlaceCheck.y=y+2;
                
                if(killToProtectKing(enemy,returnPostion(inHand))) {
                    somthing_killed=true;
                }
                
                if(pieceAlreadyThere(PlaceCheck) )
                    if(!seeKingCheck(enemy)) {
                    whiteKnight.setPoint(oldp1);
                    
                    if(somthing_killed) {
                        enemy.changePostion(other,ate_to_protect);
                        somthing_killed=false;
                    }
                    
                    return false;
                    }
            }
            if(somthing_killed) {
                enemy.changePostion(other,ate_to_protect);
                somthing_killed=false;
            }
            
            if(x+1<=8&&y-2>=1) {
                whiteKnight.setX(x+1);
                whiteKnight.setY(y-2);
                PlaceCheck.x=x+1;
                PlaceCheck.y=y-2;
                if(killToProtectKing(enemy,returnPostion(inHand))) {
                    somthing_killed=true;
                }
                
                if(pieceAlreadyThere(PlaceCheck) )
                    if(!seeKingCheck(enemy)) {
                    if(somthing_killed) {
                        enemy.changePostion(other,ate_to_protect);
                        somthing_killed=false;
                    }
                    whiteKnight.setPoint(oldp1);
                    return false;
                    }
            }
            if(somthing_killed) {
                enemy.changePostion(other,ate_to_protect);
                somthing_killed=false;
            }
            
            if(x+2<=8&&y+1<=8) {
                whiteKnight.setX(x+2);
                whiteKnight.setY(y+1);
                PlaceCheck.x=x+2;
                PlaceCheck.y=y+1;
                
                if(killToProtectKing(enemy,returnPostion(inHand))) {
                    somthing_killed=true;
                }
                
                if(pieceAlreadyThere(PlaceCheck) )
                    if(!seeKingCheck(enemy)) {
                    if(somthing_killed) {
                        enemy.changePostion(other,ate_to_protect);
                        somthing_killed=false;
                    }
                    whiteKnight.setPoint(oldp1);
                    return false;
                    }
            }
            
            if(somthing_killed) {
                enemy.changePostion(other,ate_to_protect);
                somthing_killed=false;
            }
            if(x+2<=8&&y-1>=1) {
                whiteKnight.setX(x+2);
                whiteKnight.setY(y-1);
                PlaceCheck.x=x+2;
                PlaceCheck.y=y-1;
                if(killToProtectKing(enemy,returnPostion(inHand))) {
                    somthing_killed=true;
                }
                
                if(pieceAlreadyThere(PlaceCheck) )
                    if(!seeKingCheck(enemy)) {
                    if(somthing_killed) {
                        enemy.changePostion(other,ate_to_protect);
                        somthing_killed=false;
                    }
                    whiteKnight.setPoint(oldp1);
                    return false;
                    }
            }
            if(somthing_killed) {
                enemy.changePostion(other,ate_to_protect);
                somthing_killed=false;
            }
            
            if(x-1>=1&&y+2<=8) {
                whiteKnight.setX(x-1);
                whiteKnight.setY(y+2);
                PlaceCheck.x=x-1;
                PlaceCheck.y=y+2;
                
                if(killToProtectKing(enemy,returnPostion(inHand))) {
                    somthing_killed=true;
                }
                
                if(pieceAlreadyThere(PlaceCheck) )
                    if(!seeKingCheck(enemy)) {
                    if(somthing_killed) {
                        enemy.changePostion(other,ate_to_protect);
                        somthing_killed=false;
                    }
                    whiteKnight.setPoint(oldp1);
                    return false;
                    }
            }
            if(somthing_killed) {
                enemy.changePostion(other,ate_to_protect);
                somthing_killed=false;
            }
            
            if(x-1>=1&&y-2>=1) {
                whiteKnight.setX(x-1);
                whiteKnight.setY(y-2);
                PlaceCheck.x=x-1;
                PlaceCheck.y=y-2;
                if(killToProtectKing(enemy,returnPostion(inHand))) {
                    somthing_killed=true;
                }
                
                if(pieceAlreadyThere(PlaceCheck) )
                    if(!seeKingCheck(enemy)) {
                    if(somthing_killed) {
                        enemy.changePostion(other,ate_to_protect);
                        somthing_killed=false;
                    }
                    whiteKnight.setPoint(oldp1);
                    return false;
                    }
            }
            if(somthing_killed) {
                enemy.changePostion(other,ate_to_protect);
                somthing_killed=false;
            }
            
            if(x-2>=1&&y+1<=8) {
                whiteKnight.setX(x-2);
                whiteKnight.setY(y+1);
                PlaceCheck.x=x-2;
                PlaceCheck.y=y+1;
                
                if(killToProtectKing(enemy,returnPostion(inHand))) {
                    somthing_killed=true;
                }
                if(pieceAlreadyThere(PlaceCheck) )
                    if(!seeKingCheck(enemy)) {
                    if(somthing_killed) {
                        enemy.changePostion(other,ate_to_protect);
                        somthing_killed=false;
                    }
                    whiteKnight.setPoint(oldp1);
                    return false;
                    }
            }
            
            if(somthing_killed) {
                enemy.changePostion(other,ate_to_protect);
                somthing_killed=false;
            }
            
            if(x-2>=1&&y-1>=1) {
                whiteKnight.setX(x-2);
                whiteKnight.setY(y-1);
                PlaceCheck.x=x-2;
                PlaceCheck.y=y-1;
                
                if(killToProtectKing(enemy,returnPostion(inHand))) {
                    somthing_killed=true;
                }
                
                if(pieceAlreadyThere(PlaceCheck) )
                    if(!seeKingCheck(enemy)) {
                    if(somthing_killed) {
                        enemy.changePostion(other,ate_to_protect);
                        somthing_killed=false;
                    }
                    whiteKnight.setPoint(oldp1);
                    return false;
                    }
            }
            if(somthing_killed) {
                enemy.changePostion(other,ate_to_protect);
                somthing_killed=false;
            }
            
        }
        whiteKnight.setPoint(oldp1);
        
        
        return true;
    }
    
    public boolean queenGenerateMoves(Player2 enemy) {
        boolean somthing_killed=false;
        
        Point Oldp1=new Point();
        
        Oldp1=whiteQueen.returnPostion();
        
        Point PlaceCheck=new Point();
        
        inHand=23;
        
        if(Oldp1.x!=20) {
            for(int x= Oldp1.x,y= Oldp1.y;x>=1&&y<=8;x--,y++) {
                
                whiteQueen.setX(x);
                whiteQueen.setY(y);
                PlaceCheck.x=x;
                PlaceCheck.y=y;
                if(checkTheWayToPostion(enemy, Oldp1)) {
                    if(killToProtectKing(enemy,returnPostion(inHand))) {
                        somthing_killed=true;
                    }
                    
                    if(pieceAlreadyThere(PlaceCheck))
                        if(!seeKingCheck(enemy)) {
                        whiteQueen.setPoint(Oldp1);
                        
                        if(somthing_killed) {
                            enemy.changePostion(other,ate_to_protect);
                            somthing_killed=false;
                        }
                        return false;
                        }
                }
                
                if(somthing_killed) {
                    enemy.changePostion(other,ate_to_protect);
                    somthing_killed=false;
                }
                
            }
            if(somthing_killed) {
                enemy.changePostion(other,ate_to_protect);
                somthing_killed=false;
            }
            for(int x=Oldp1.x,y=Oldp1.y;y>=1&&x<=8;x++,y--) {
                
                whiteQueen.setX(x);
                whiteQueen.setY(y);
                PlaceCheck.x=x;
                PlaceCheck.y=y;
                if(checkTheWayToPostion(enemy, Oldp1)) {
                    if(killToProtectKing(enemy,returnPostion(inHand))) {
                        somthing_killed=true;
                    }
                    if(pieceAlreadyThere(PlaceCheck))
                        if(!seeKingCheck(enemy)) {
                        whiteQueen.setPoint(Oldp1);
                        if(somthing_killed) {
                            enemy.changePostion(other,ate_to_protect);
                            somthing_killed=false;
                        }
                        return false;
                        }
                }
                
                if(somthing_killed) {
                    enemy.changePostion(other,ate_to_protect);
                    somthing_killed=false;
                }
                
            }
            whiteQueen.setPoint(Oldp1);
            PlaceCheck.x=Oldp1.x;
            PlaceCheck.y=Oldp1.y;
            
            if(somthing_killed) {
                enemy.changePostion(other,ate_to_protect);
                somthing_killed=false;
            }
            
            
            for(int i=1;i<=8;i++) {
                whiteQueen.setX(i);
                
                PlaceCheck.x=i;
                if(checkTheWayToPostion(enemy, Oldp1)) {
                    if(killToProtectKing(enemy,returnPostion(inHand))) {
                        somthing_killed=true;
                    }
                    if(pieceAlreadyThere(PlaceCheck) )
                        if(!seeKingCheck(enemy)) {
                        whiteQueen.setX(Oldp1.x);
                        if(somthing_killed) {
                            enemy.changePostion(other,ate_to_protect);
                            somthing_killed=false;
                        }
                        return false;
                        }
                }
                
                if(somthing_killed) {
                    enemy.changePostion(other,ate_to_protect);
                    somthing_killed=false;
                }
                
            }
            whiteQueen.setX(Oldp1.x);
            PlaceCheck.x=Oldp1.x;
            
            if(somthing_killed) {
                enemy.changePostion(other,ate_to_protect);
                somthing_killed=false;
            }
            
            
            for(int i=1;i<=8;i++) {
                whiteQueen.setY(i);
                PlaceCheck.y=i;
                if(checkTheWayToPostion(enemy, Oldp1)) {
                    if(killToProtectKing(enemy,returnPostion(inHand))) {
                        somthing_killed=true;
                    }
                    if(pieceAlreadyThere(PlaceCheck) )
                        if(!seeKingCheck(enemy)) {
                        whiteQueen.setY(Oldp1.y);
                        if(somthing_killed) {
                            enemy.changePostion(other,ate_to_protect);
                            somthing_killed=false;
                        }
                        return false;
                        }
                }
                
                if(somthing_killed) {
                    enemy.changePostion(other,ate_to_protect);
                    somthing_killed=false;
                }
                
            }
            whiteQueen.setY(Oldp1.y);
        }
        
        
        if(somthing_killed) {
            enemy.changePostion(other,ate_to_protect);
            somthing_killed=false;
        }
        
        
        return true;
        
    }
    public boolean pawnGenerateMoves(Player2 enemy, Pawn Sold) {
        Point Oldp1=new Point();
        Oldp1=Sold.returnPostion();
        Point PlaceCheck=new Point();
        PlaceCheck.x=Oldp1.x;
        PlaceCheck.y=Oldp1.y;
        
        
        
        if(Oldp1.x!=20) {
            if(Sold.Canmove(Oldp1.x,Oldp1.y-2,Color)&&Oldp1.y-2>=1) {
                Sold.setY(Oldp1.y-2);
                
                PlaceCheck.y=Oldp1.y-1;
                
                if(pieceAlreadyThere(PlaceCheck))
                    if(pieceAlreadyThereFromEnemy(PlaceCheck,enemy)) {
                    if(!seeKingCheck(enemy)) {
                        
                        Sold.setPoint(Oldp1);
                        return false;
                    }
                    }
                
            }
            if(Sold.Canmove(Oldp1.x,Oldp1.y-1,Color)&&Oldp1.y-1>=1) {
                Sold.setY(Oldp1.y-1);
                PlaceCheck.y=Oldp1.y-1;
                
                
                if(pieceAlreadyThere(PlaceCheck))
                    if(pieceAlreadyThereFromEnemy(PlaceCheck,enemy)) {
                    
                    if(!seeKingCheck(enemy)) {
                        Sold.setPoint(Oldp1);
                        System.out.println("dff");
                        System.out.println("dff");
                        System.out.println("dff");
                        return false;
                    }
                    }
            }
            
            if(!pieceAlreadyThereFromEnemy(new Point(Oldp1.x-1,Oldp1.y-1),enemy))
                if(killToProtectKing(enemy,new Point(Oldp1.x-1,Oldp1.y-1))) {
                
                if(!seeKingCheck(enemy)) {
                    enemy.changePostion(other,ate_to_protect);
                    Sold.setPoint(Oldp1);
                    
                    return false;
                }
                enemy.changePostion(other,ate_to_protect);
                }
            
            if(!pieceAlreadyThereFromEnemy(new Point(Oldp1.x+1,Oldp1.y-1),enemy))
                if(killToProtectKing(enemy,new Point(Oldp1.x+1,Oldp1.y-1))) {
                if(!seeKingCheck(enemy)) {
                    enemy.changePostion(other,ate_to_protect);
                    Sold.setPoint(Oldp1);
                    
                    return false;
                }
                enemy.changePostion(other,ate_to_protect);
                
                }
            
        }
        
        Sold.setPoint(Oldp1);
        return true;
    }
    
    
    public boolean checkTheWayToPostion(Player2 enemy,Point newP) {
        boolean flag=false;
        
        
        for(int i=1;i<=32;i++) {
            if(inHand!=i)// check if there is peices in the WAY
            {
                if(i<17)
                    flag=checktheWay(newP,enemy.returnPostion(i),inHand);//Means there is somting in the Way so can't move
                else {
                    flag=checktheWay(newP,returnPostion(i),inHand);
                }
                
                if(flag==true) {
                    return false;}//Means  there is a Pice in the Way
            }
        }
        return true;
        
        
    }
    public boolean killToProtectKing(Player2 enemy,Point newP) {
        
        for(int i=1;i<17;i++) {
            
            other=enemy.returnPostion(i);
            if(other.x==newP.x&&other.y==newP.y) {
                ate_to_protect=i;
                
                
                
                enemy.Killedpiec(i);
                return true;
            }
        }
        
        return false;
    }
    
    public String tellMeAboutLastMove() {
        switch(inHand) {
            
            case 17:return whiteCastle1.Tell_me();
            case 18:return whiteCastle2.Tell_me();
            case 19:return whiteKnight1.Tell_me();
            case 20:return whiteKnight2.Tell_me();
            case 21:return whiteBishop1.Tell_me();
            case 22:return whiteBishop2.Tell_me();
            case 23:return whiteQueen.Tell_me();
            case 24:return whiteKing.Tell_me();
            case 25:return  whitePawns[0].Tell_me();
            case 26:return  whitePawns[1].Tell_me();
            case 27:return  whitePawns[2].Tell_me();
            case 28:return  whitePawns[3].Tell_me();
            case 29:return  whitePawns[4].Tell_me();
            case 30:return  whitePawns[5].Tell_me();
            case 31:return  whitePawns[6].Tell_me();
            case 32:return  whitePawns[7].Tell_me();
        }
        return null;
    }
}





