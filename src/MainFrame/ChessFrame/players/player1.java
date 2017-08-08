
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
    public Castle WC1;
    public Castle WC2;
    public Knight WH1;
    public Knight WH2;
    public Queen WQ;
    public Bishop WE1;
    public Bishop WE2;
    public Pawn[] WS=new Pawn[8];
    public King WK;
    private int inHand=-1;
    private boolean kingIsCheck=false;
    private int choosenOne;
    String Color="white";
    private Point other;
    int ate_to_protect;
    
    
    
    public Player1() {
        String fileSeparator = new String(System.getProperty("file.separator"));
        WC1=new Castle("src" + fileSeparator + "Icons" + fileSeparator + "Player1Icons" +fileSeparator + "wr.gif",8,8);
        WC2=new Castle("src" + fileSeparator + "Icons" + fileSeparator + "Player1Icons" +fileSeparator + "wr.gif",1,8);
        WH1=new Knight("src" + fileSeparator + "Icons" + fileSeparator + "Player1Icons" +fileSeparator + "wn.gif",2,8);
        WH2=new Knight("src" + fileSeparator + "Icons" + fileSeparator + "Player1Icons" +fileSeparator + "wn.gif",7,8);
        WE1=new Bishop("src" + fileSeparator + "Icons" + fileSeparator + "Player1Icons" +fileSeparator + "wb.gif",3,8);
        WE2=new Bishop("src" + fileSeparator + "Icons" + fileSeparator + "Player1Icons" +fileSeparator + "wb.gif",6,8);
        WQ=new Queen("src" + fileSeparator + "Icons" + fileSeparator + "Player1Icons" +fileSeparator + "wq.gif",4,8);
        WK=new King("src" + fileSeparator + "Icons" + fileSeparator + "Player1Icons" +fileSeparator + "wk.gif",5,8);
        int j=1;
        for(int  i=0;i<=7;i++,j++) {
            WS[i]=new Pawn("src" + fileSeparator + "Icons" + fileSeparator + "Player1Icons" +fileSeparator + "wp.gif",j,7);
        }
    }
    public Point returnPostion(int i) {
        
        switch(i) {
            
            case 17:return WC1.returnPostion();
            case 18:return WC2.returnPostion();
            case 19:return WH1.returnPostion();
            case 20:return WH2.returnPostion();
            case 21:return WE1.returnPostion();
            case 22:return WE2.returnPostion();
            case 23:return WQ.returnPostion();
            case 24:return WK.returnPostion();
            case 25:return  WS[0].returnPostion();
            case 26:return  WS[1].returnPostion();
            case 27:return  WS[2].returnPostion();
            case 28:return  WS[3].returnPostion();
            case 29:return  WS[4].returnPostion();
            case 30:return  WS[5].returnPostion();
            case 31:return  WS[6].returnPostion();
            case 32:return  WS[7].returnPostion();
        }
        return new Point(-1,-1);
    }
    public Point returnOldPostion(int i) {
        
        switch(i) {
            
            case 17:return WC1.returnOld();
            case 18:return WC2.returnOld();
            case 19:return WH1.returnOld();
            case 20:return WH2.returnOld();
            case 21:return WE1.returnOld();
            case 22:return WE2.returnOld();
            case 23:return WQ.returnOld();
            case 24:return WK.returnOld();
            case 25:return  WS[0].returnOld();
            case 26:return  WS[1].returnOld();
            case 27:return  WS[2].returnOld();
            case 28:return  WS[3].returnOld();
            case 29:return  WS[4].returnOld();
            case 30:return  WS[5].returnOld();
            case 31:return  WS[6].returnOld();
            case 32:return  WS[7].returnOld();
        }
        return new Point(-1,-1);
    }
    public Image returnIconImage(int i) {
        
        switch(i) {
            
            case 17:
            {return WC1.returnPieceImage();}
            case 18:
            {return WC2.returnPieceImage();}
            case 19:
            {return WH1.returnPieceImage();}
            case 20:
            {return WH2.returnPieceImage();}
            case 21:return WE1.returnPieceImage();
            case 22:return WE2.returnPieceImage();
            case 23:return WQ.returnPieceImage();
            case 24:return WK.returnPieceImage();
            case 25:return  WS[0].returnPieceImage();
            case 26:return  WS[1].returnPieceImage();
            case 27:return  WS[2].returnPieceImage();
            case 28:return  WS[3].returnPieceImage();
            case 29:return  WS[4].returnPieceImage();
            case 30:return  WS[5].returnPieceImage();
            case 31:return  WS[6].returnPieceImage();
            case 32:return  WS[7].returnPieceImage();
        }
        return null;
    }
    public void changePostion(Point newPoint,int i) {
        switch(i) {
            
            case 17:WC1.setPoint(newPoint);break;
            case 18:WC2.setPoint(newPoint);break;
            case 19:WH1.setPoint(newPoint);break;
            case 20:WH2.setPoint(newPoint);break;
            case 21: WE1.setPoint(newPoint);break;
            case 22: WE2.setPoint(newPoint);break;
            case 23: WQ.setPoint(newPoint);break;
            case 24: WK.setPoint(newPoint);break;
            case 25:  WS[0].setPoint(newPoint);break;
            case 26:  WS[1].setPoint(newPoint);break;
            case 27:  WS[2].setPoint(newPoint);break;
            case 28:  WS[3].setPoint(newPoint);break;
            case 29:  WS[4].setPoint(newPoint);break;
            case 30:  WS[5].setPoint(newPoint);break;
            case 31:  WS[6].setPoint(newPoint);break;
            case 32:  WS[7].setPoint(newPoint);break;
        }
        
    }
    public void changePostionToOld(Point newPoint,int i) {
        switch(i) {
            
            case 17:WC1.toOld(newPoint);break;
            case 18:WC2.toOld(newPoint);break;
            case 19:WH1.toOld(newPoint);break;
            case 20:WH2.toOld(newPoint);break;
            case 21: WE1.toOld(newPoint);break;
            case 22: WE2.toOld(newPoint);break;
            case 23: WQ.toOld(newPoint);break;
            case 24: WK.toOld(newPoint);break;
            case 25:  WS[0].toOld(newPoint);break;
            case 26:  WS[1].toOld(newPoint);break;
            case 27:  WS[2].toOld(newPoint);break;
            case 28:  WS[3].toOld(newPoint);break;
            case 29:  WS[4].toOld(newPoint);break;
            case 30:  WS[5].toOld(newPoint);break;
            case 31:  WS[6].toOld(newPoint);break;
            case 32:  WS[7].toOld(newPoint);break;
        }
    }
    
    public void changePixel(int newPixelX,int newPixelY,int i) {
        choosenOne=i;
        switch(choosenOne) {
            
            case 17:WC1.setPixels(newPixelX,newPixelY);break;
            case 18:WC2.setPixels(newPixelX,newPixelY);break;
            case 19:WH1.setPixels(newPixelX,newPixelY);break;
            case 20:WH2.setPixels(newPixelX,newPixelY);break;
            case 21: WE1.setPixels(newPixelX,newPixelY);break;
            case 22: WE2.setPixels(newPixelX,newPixelY);break;
            case 23: WQ.setPixels(newPixelX,newPixelY);break;
            case 24: WK.setPixels(newPixelX,newPixelY);break;
            case 25:  WS[0].setPixels(newPixelX,newPixelY);break;
            case 26:  WS[1].setPixels(newPixelX,newPixelY);break;
            case 27:  WS[2].setPixels(newPixelX,newPixelY);break;
            case 28:  WS[3].setPixels(newPixelX,newPixelY);break;
            case 29:  WS[4].setPixels(newPixelX,newPixelY);break;
            case 30:  WS[5].setPixels(newPixelX,newPixelY);break;
            case 31:  WS[6].setPixels(newPixelX,newPixelY);break;
            case 32:  WS[7].setPixels(newPixelX,newPixelY);break;
        }
    }
    public Point getPixelPoint(int i) {
        choosenOne=i;
        switch(choosenOne) {
            
            case 17:return WC1.getpixelPoint();
            case 18:return WC2.getpixelPoint();
            case 19:return WH1.getpixelPoint();
            case 20:return WH2.getpixelPoint();
            case 21: return WE1.getPixelPoint();
            case 22: return WE2.getPixelPoint();
            case 23: return WQ.getpixelPoint();
            case 24: return WK.getpixelPoint();
            case 25: return  WS[0].getpixelPoint();
            case 26:  return WS[1].getpixelPoint();
            case 27: return  WS[2].getpixelPoint();
            case 28:  return WS[3].getpixelPoint();
            case 29: return  WS[4].getpixelPoint();
            case 30: return WS[5].getpixelPoint();
            case 31: return WS[6].getpixelPoint();
            case 32: return WS[7].getpixelPoint();
        }
        return null;
    }
    public boolean checkTheMove(Point newP,int i) {
        choosenOne=i;
        switch(choosenOne) {
            
            case 17:return WC1.Canmove(newP.x,newP.y);
            case 18:return WC2.Canmove(newP.x,newP.y);
            case 19:return WH1.Canmove(newP.x,newP.y);
            case 20:return WH2.Canmove(newP.x,newP.y);
            case 21: return WE1.Canmove(newP.x,newP.y);
            case 22: return WE2.Canmove(newP.x,newP.y);
            case 23: return WQ.Canmove(newP.x,newP.y);
            case 24: return WK.Canmove(newP.x,newP.y);
            case 25: return  WS[0].Canmove(newP.x,newP.y,Color);
            case 26:  return WS[1].Canmove(newP.x,newP.y,Color);
            case 27: return  WS[2].Canmove(newP.x,newP.y,Color);
            case 28:  return WS[3].Canmove(newP.x,newP.y,Color);
            case 29: return  WS[4].Canmove(newP.x,newP.y,Color);
            case 30: return WS[5].Canmove(newP.x,newP.y,Color) ;
            case 31: return WS[6].Canmove(newP.x,newP.y,Color);
            case 32: return WS[7].Canmove(newP.x,newP.y,Color);
        }
        return false;
    }
    public boolean setSeenToPawn(int i,Point P) {
        switch(i) {
            case 25:   return  WS[0].setSeenbychecking(P,"white");
            case 26:   return WS[1].setSeenbychecking(P,"white");
            case 27:  return   WS[2].setSeenbychecking(P,"white");
            case 28:  return    WS[3].setSeenbychecking(P,"white");
            case 29:  return  WS[4].setSeenbychecking(P,"white");
            case 30:  return  WS[5].setSeenbychecking(P,"white");
            case 31:  return  WS[6].setSeenbychecking(P,"white");
            case 32: return WS[7].setSeenbychecking(P,"white");
        }
        return false;
    }
    public boolean returnPawnSeen(int i) {
        switch(i) {
            case 25:   return  WS[0].returnMyseen();
            case 26:   return WS[1].returnMyseen();
            case 27:  return   WS[2].returnMyseen();
            case 28:  return    WS[3].returnMyseen();
            case 29:  return  WS[4].returnMyseen();
            case 30:  return  WS[5].returnMyseen();
            case 31:  return  WS[6].returnMyseen();
            case 32: return WS[7].returnMyseen();
        }
        return false;
    }
    public boolean checkTheWay(Point newP,Point postionFromOthers,int i) {
        switch(i) {
            
            
            case 17:return WC1.PieceInMYway(newP.x,newP.y,postionFromOthers);
            case 18:return WC2.PieceInMYway(newP.x,newP.y,postionFromOthers);
            case 21: return WE1.PieceInMYway(newP.x,newP.y,postionFromOthers);
            case 22: return WE2.PieceInMYway(newP.x,newP.y,postionFromOthers);
            case 23: return WQ.PieceInMYway(newP.x,newP.y,postionFromOthers);
            case 25: return  WS[0].PieceInMYway(newP.x,newP.y,postionFromOthers,Color);
            case 26:  return WS[1].PieceInMYway(newP.x,newP.y,postionFromOthers,Color);
            case 27: return  WS[2].PieceInMYway(newP.x,newP.y,postionFromOthers,Color);
            case 28:  return WS[3].PieceInMYway(newP.x,newP.y,postionFromOthers,Color);
            case 29: return  WS[4].PieceInMYway(newP.x,newP.y,postionFromOthers,Color);
            case 30: return WS[5].PieceInMYway(newP.x,newP.y,postionFromOthers,Color);
            case 31: return WS[6].PieceInMYway(newP.x,newP.y,postionFromOthers,Color);
            case 32: return WS[7].PieceInMYway(newP.x,newP.y,postionFromOthers,Color);
            
        }
        return false;
    }
    public boolean killedPiece(int i) {
        Point out=new Point(13,13);
        switch(i) {
            
            case 17:  WC1.setPoint(out);return true;
            case 18:   WC2.setPoint(out);return true;
            case 19:  WH1.setPoint(out);return true;
            case 20:  WH2.setPoint(out);return true;
            case 21:   WE1.setPoint(out);return true;
            case 22:   WE2.setPoint(out);return true;
            case 23:   WQ.setPoint(out);return true;
            case 24:    return false;
            case 25:    WS[0].setPoint(out);return true;
            case 26:   WS[1].setPoint(out);return true;
            case 27:   WS[2].setPoint(out);return true;
            case 28:    WS[3].setPoint(out);return true;
            case 29:    WS[4].setPoint(out);return true;
            case 30:   WS[5].setPoint(out);return true;
            case 31:   WS[6].setPoint(out);return true;
            case 32:   WS[7].setPoint(out);return true;
        }
        
        return false;
    }
    public boolean checKing(Point p1,Point p2,int i) {
        switch(i) {
            
            case 17:return  WC1.checkKing(p1.x,p1.y,p2);
            case 18:return WC2.checkKing(p1.x,p1.y,p2);
            case 19:return  WH1.Canmove(p1.x,p1.y);
            case 20:return  WH2.Canmove(p1.x,p1.y);
            case 21:return   WE1.checkKing(p1.x,p1.y,p2);
            case 22:return   WE2.checkKing(p1.x,p1.y,p2);
            case 23:return   WQ.checkKing(p1.x,p1.y,p2);
            
            case 25:return    WS[0].Canmove(p1.x,p1.y,Color);
            case 26:return   WS[1].Canmove(p1.x,p1.y,Color);
            case 27:return   WS[2].Canmove(p1.x,p1.y,Color);
            case 28:return    WS[3].Canmove(p1.x,p1.y,Color);
            case 29:return    WS[4].Canmove(p1.x,p1.y,Color);
            case 30: return  WS[5].Canmove(p1.x,p1.y,Color);
            case 31:return   WS[6].Canmove(p1.x,p1.y,Color);
            case 32:return   WS[7].Canmove(p1.x,p1.y,Color);
        }
        return false;
    }
    
    
    
    public int returnChosen() {
        return choosenOne;
    }
    public void setInhand(int i ) {
        inHand=i;
    }
    public int getInhand() {
        return inHand;
    }
    public boolean canMove(int x,int y) {
        return true;
    }
    public void checkKing(boolean newKingCheck) {
        kingIsCheck=newKingCheck;
    }
    public boolean returnCheckKing() {
        
        
        return kingIsCheck;
    }
    
    public boolean if_MyKing_In_check(Player2 Black) {
        boolean isCheckmate=false;
        boolean flag=false;
        
        
        
        
        
        
        return false;
    }
    public boolean check_Mate_GameOver(Player2 enemy) {
        
        
        
        
        if(! kingGenerateMoves(enemy)) {
            
            inHand=-1;
            return false;
        } else if(!castleGenerateMoves(enemy,WC1)) {
            
            inHand=-1;
            return false;
        } else if(!castleGenerateMoves(enemy,WC2)) {
            
            inHand=-1;
            return false;
        } else if(!bishopGenerateMoves(enemy,WE1)) {
            
            inHand=-1;
            return false;
        } else if(!bishopGenerateMoves(enemy,WE2)) {
            
            inHand=-1;
            return false;
        } else if(!knightMoves(enemy,WH1)) {
            
            inHand=-1;
            return false;
        } else if(!knightMoves(enemy,WH2)) {
            
            inHand=-1;
            return false;
        }
        
        else if(!queenGenerateMoves(enemy)) {
            
            inHand=-1;
            return false;
        }
        
        for(int i=0;i<=7;i++) {
            inHand=25+i;
            if(!pawnGeneratesMove(enemy,WS[i])) {
                
                inHand=-1;
                System.out.println("I Killed Solider 1");
                return false;
            }
        }
        
        inHand=-1;
        return true;
        
        
        
        
    }
    public boolean  see_king_Check(Player2 Black) {
        
        Point myKingPostion=WK.returnPostion();
        boolean flag=false;
        
        
        //////////    Start Checking the King ////////////
        for(int i=1;i<17;i++) {
            if(i<9) {
                if(Black.checkthemove(myKingPostion,i)) {
                    
                    flag=true;
                    for(int j=1;j<33;j++) {
                        
                        if(j<17) {
                            
                            if(Black.checktheWay(myKingPostion,Black.returnPostion(j),i)) {
                                //Means there is something in the Way so can't move'
                                
                                flag=false;
                                
                                
                            }
                        }
                        
                        else {
                            
                            if(j!=24)
                                if(Black.checktheWay(myKingPostion,returnPostion(j),i)) {
                                
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
                // For pawns
                if(Black.setSeenToPawn(i,myKingPostion)) {
                    
                    break;
                    
                }
            }
            //   if(stillIn_Check){ return true;}//Here Means White king is in check !!!
            if(i==16) {
                
                return false; }
        }
        
        return true;
    }
    
    
    public boolean pieceAlreadyThere(Point newPiece) {
        Point samePostion;
        for(int i=17;i<=32;i++) {
            if(getInhand()!=i)// There is no need to check the inHand pice
            {
                
                
                //Check if there is White Pieces in the new Point
                //If so we Can't move (Same Color)!!
                
                
                
                samePostion=returnPostion(i);
                if(newPiece.x==samePostion.x&&newPiece.y==samePostion.y) {
                    
                    return false;
                    
                }
            }
        }
        
        
        return true;
    }
    public boolean enemyOccupies(Point newPiece,Player2 enemy) {
        Point samePostion;
        for(int i=1;i<=16;i++) {
            samePostion=enemy.returnPostion(i);
            if(newPiece.x==samePostion.x&&newPiece.y==samePostion.y) {
                
                return false;
                
            }
        }
        
        
        return true;
    }
    public int Get_Pice_already_there_from_enemy(Point newPiece,Player2 enemy) {
        Point samePostion;
        for(int i=1;i<=16;i++) {
            samePostion=enemy.returnPostion(i);
            if(newPiece.x==samePostion.x&&newPiece.y==samePostion.y) {
                
                return i;
                
            }
        }
        
        
        return -1;
    }
    
    
    public boolean kingGenerateMoves(Player2 enemy) {
        boolean somthing_killed=false;
        Point oldP=new Point();
        
        Point placeCheck=new Point();
        inHand=24;
        
        int x=WK.returnX();
        int y=WK.returnY();
        oldP.x=x;
        oldP.y=y;
        
        if(x+1<=8) {
            
            
            WK.setX(x+1);
            WK.setY(y);
            placeCheck.x=x+1;
            placeCheck.y=y;
            
            
            if(protectKing(enemy,returnPostion(inHand))) {
                somthing_killed=true;
            }
            if(pieceAlreadyThere(placeCheck))
                if(!see_king_Check(enemy)) {
                
                
                WK.setPoint(oldP);
                if(somthing_killed) {
                    enemy.changePostion(other,ate_to_protect);
                    somthing_killed=false;
                }
                return false;
                }
            
        }
        WK.setPoint(oldP);
        if(somthing_killed) {
            enemy.changePostion(other,ate_to_protect);
            somthing_killed=false;
        }
        if(y+1<=8) {
            
            
            WK.setX(x);
            WK.setY(y+1);
            placeCheck.x=x;
            placeCheck.y=y+1;
            if(protectKing(enemy,returnPostion(inHand))) {
                somthing_killed=true;
            }
            if(pieceAlreadyThere( placeCheck))
                if(!see_king_Check(enemy)) {
                
                WK.setPoint(oldP);
                if(somthing_killed) {
                    enemy.changePostion(other,ate_to_protect);
                    somthing_killed=false;
                }
                return false;
                
                }
            
        }
        WK.setPoint(oldP);
        if(somthing_killed) {
            enemy.changePostion(other,ate_to_protect);
            somthing_killed=false;
        }
        
        if(y-1>0) {
            
            WK.setX(x);
            WK.setY(y-1);
            
            placeCheck.x=x;
            placeCheck.y=y-1;
            
            if(protectKing(enemy,returnPostion(inHand))) {
                somthing_killed=true;
            }
            
            if(pieceAlreadyThere( placeCheck))
                if(!see_king_Check(enemy)) {
                
                WK.setPoint(oldP);
                if(somthing_killed) {
                    enemy.changePostion(other,ate_to_protect);
                    somthing_killed=false;
                }
                
                return false;
                }
            
        }
        WK.setPoint(oldP);
        if(somthing_killed) {
            enemy.changePostion(other,ate_to_protect);
            somthing_killed=false;
        }
        if(x-1>0) {
            
            WK.setX(x-1);
            WK.setY(y);
            
            placeCheck.x=x-1;
            placeCheck.y=y;
            if(protectKing(enemy,returnPostion(inHand))) {
                somthing_killed=true;
            }
            if(pieceAlreadyThere( placeCheck))
                if(!see_king_Check(enemy)) {
                if(somthing_killed) {
                    enemy.changePostion(other,ate_to_protect);
                    somthing_killed=false;
                }
                WK.setPoint(oldP);
                return false;
                }
            
        }
        WK.setPoint(oldP);
        if(somthing_killed) {
            enemy.changePostion(other,ate_to_protect);
            somthing_killed=false;
        }
        if(y-1>0&&x-1>0) {
            
            WK.setX(x-1);
            WK.setY(y-1);
            
            placeCheck.x=x-1;
            placeCheck.y=y-1;
            
            if(protectKing(enemy,returnPostion(inHand))) {
                somthing_killed=true;
            }
            if(pieceAlreadyThere( placeCheck))
                if(!see_king_Check(enemy)) {
                
                if(somthing_killed) {
                    enemy.changePostion(other,ate_to_protect);
                    somthing_killed=false;
                }
                WK.setPoint(oldP);
                return false;
                }
            
        }
        WK.setPoint(oldP);
        if(somthing_killed) {
            enemy.changePostion(other,ate_to_protect);
            somthing_killed=false;
        }
        if(y+1<=8&&x+1<=8) {
            
            WK.setX(x+1);
            WK.setY(y+1);
            
            placeCheck.x=x+1;
            placeCheck.y=y+1;
            if(protectKing(enemy,returnPostion(inHand))) {
                somthing_killed=true;
            }
            if(pieceAlreadyThere( placeCheck))
                if(!see_king_Check(enemy)) {
                
                if(somthing_killed) {
                    enemy.changePostion(other,ate_to_protect);
                    somthing_killed=false;
                }
                WK.setPoint(oldP);
                return false;
                }
            
        }
        WK.setPoint(oldP);
        if(somthing_killed) {
            enemy.changePostion(other,ate_to_protect);
            somthing_killed=false;
        }
        if(y-1>0&&x+1<=8) {
            
            WK.setX(x+1);
            WK.setY(y-1);
            
            placeCheck.x=x+1;
            placeCheck.y=y-1;
            if(protectKing(enemy,returnPostion(inHand))) {
                somthing_killed=true;
            }
            if(pieceAlreadyThere( placeCheck))
                if(!see_king_Check(enemy)) {
                if(somthing_killed) {
                    enemy.changePostion(other,ate_to_protect);
                    somthing_killed=false;
                }
                WK.setPoint(oldP);
                return false;
                }
            
        }
        WK.setPoint(oldP);
        if(somthing_killed) {
            enemy.changePostion(other,ate_to_protect);
            somthing_killed=false;
        }
        if(y+1<=8&&x-1>0) {
            
            
            WK.setX(x-1);
            WK.setY(y+1);
            
            placeCheck.x=x-1;
            placeCheck.y=y+1;
            if(protectKing(enemy,returnPostion(inHand))) {
                somthing_killed=true;
            }
            if(pieceAlreadyThere( placeCheck))
                if(!see_king_Check(enemy)) {
                if(somthing_killed) {
                    enemy.changePostion(other,ate_to_protect);
                    somthing_killed=false;
                }
                WK.setPoint(oldP);
                return false;
                }
            
        }
        
        if(somthing_killed) {
            enemy.changePostion(other,ate_to_protect);
            somthing_killed=false;
        }
        
        
        WK.setPoint(oldP);
        return true;
        
        
        
        
    }
    
    public boolean castleGenerateMoves(Player2 enemy,Castle WC) {
        boolean somthing_killed=false;
        Point oldP1=new Point();
        
        Point placeCheck=new Point();
        int x1=WC.returnX();
        int y1=WC.returnY();
        
        if(WC==WC1) {
            inHand=17;
        } else {
            inHand=18;
        }
        /////////////////////
        
        oldP1.x=x1;
        oldP1.y=y1;
        
        placeCheck.y=y1;
        
        if(x1!=20) {
            for(int i=1;i<=8;i++) {
                WC.setX(i);
                placeCheck.x=i;
                
                if(checkPath(enemy,oldP1)) {
                    if(protectKing(enemy,returnPostion(inHand))) {
                        somthing_killed=true;
                    }
                    if(pieceAlreadyThere(placeCheck))
                        if(!see_king_Check(enemy)) {
                        WC.setX(oldP1.x);
                        WC.setY(oldP1.y);
                        
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
            WC.setX(oldP1.x);
            placeCheck.x=oldP1.x;
            
            if(somthing_killed) {
                enemy.changePostion(other,ate_to_protect);
                somthing_killed=false;
            }
            for(int i=1;i<=8;i++) {
                WC.setY(i);
                placeCheck.y=i;
                if(checkPath(enemy,oldP1)) {
                    if(protectKing(enemy,returnPostion(inHand))) {
                        somthing_killed=true;
                    }
                    if(pieceAlreadyThere(placeCheck) )
                        if(!see_king_Check(enemy)) {
                        WC.setX(oldP1.x);
                        WC.setY(oldP1.y);
                        
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
            WC.setY(oldP1.y);
        }
        //////////////////////////////////////////
        ///////////////////////////
        
        if(somthing_killed) {
            enemy.changePostion(other,ate_to_protect);
            somthing_killed=false;
        }
        WC.setX(oldP1.x);
        WC.setY(oldP1.y);
        return true;
    }
    
    public  boolean bishopGenerateMoves(Player2 enemy,Bishop WE) {
        boolean somthing_killed=false;
        Point oldP1=new Point();
        Point placeCheck=new Point();
        
        oldP1=WE.returnPostion();
        
        if(WE==WE1) {
            inHand=21;
        } else {
            inHand=22;
        }
        
        if(oldP1.x!=20) {
            for(int x= oldP1.x,y= oldP1.y;x>=1&&y<=8;x--,y++) {
                
                WE.setX(x);
                WE.setY(y);
                placeCheck.x=x;
                placeCheck.y=y;
                if(checkPath(enemy, oldP1)) {
                    if(protectKing(enemy,returnPostion(inHand))) {
                        somthing_killed=true;
                    }
                    if(pieceAlreadyThere(placeCheck))
                        if(!see_king_Check(enemy)) {
                        
                        if(somthing_killed) {
                            enemy.changePostion(other,ate_to_protect);
                            somthing_killed=false;
                        }
                        WE.setPoint(oldP1);
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
            for(int x=oldP1.x,y=oldP1.y;y>=1&&x<=8;x++,y--) {
                
                WE.setX(x);
                WE.setY(y);
                placeCheck.x=x;
                placeCheck.y=y;
                if(checkPath(enemy, oldP1)) {
                    if(protectKing(enemy,returnPostion(inHand))) {
                        somthing_killed=true;
                    }
                    if(pieceAlreadyThere(placeCheck))
                        if(!see_king_Check(enemy)) {
                        if(somthing_killed) {
                            enemy.changePostion(other,ate_to_protect);
                            somthing_killed=false;
                        }
                        WE.setPoint(oldP1);
                        return false;
                        }
                }
                
                if(somthing_killed) {
                    enemy.changePostion(other,ate_to_protect);
                    somthing_killed=false;
                }
                
            }
            WE.setPoint(oldP1);
            
        }
        
        WE.setPoint(oldP1);
        
        
        if(somthing_killed) {
            enemy.changePostion(other,ate_to_protect);
            somthing_killed=false;
        }
        
        return true;
    }
    
    public boolean knightMoves(Player2 enemy,Knight WH) {
        Point oldp1=new Point();
        boolean somthing_killed=false;
        oldp1=WH.returnPostion();
        
        Point placeCheck=new Point();
        
        if(WH==WH1) {
            inHand=19;
        } else {
            inHand=20;
        }
        
        
        int x=oldp1.x;
        int y=oldp1.y;
        
        if(x!=20) {
            
            if(x+1<=8&&y+1<=8) {
                WH.setX(x+1);
                WH.setY(y+2);
                placeCheck.x=x+1;
                placeCheck.y=y+2;
                
                if(protectKing(enemy,returnPostion(inHand))) {
                    somthing_killed=true;
                }
                
                if(pieceAlreadyThere(placeCheck) )
                    if(!see_king_Check(enemy)) {
                    WH.setPoint(oldp1);
                    
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
                WH.setX(x+1);
                WH.setY(y-2);
                placeCheck.x=x+1;
                placeCheck.y=y-2;
                if(protectKing(enemy,returnPostion(inHand))) {
                    somthing_killed=true;
                }
                
                if(pieceAlreadyThere(placeCheck) )
                    if(!see_king_Check(enemy)) {
                    if(somthing_killed) {
                        enemy.changePostion(other,ate_to_protect);
                        somthing_killed=false;
                    }
                    WH.setPoint(oldp1);
                    return false;
                    }
            }
            if(somthing_killed) {
                enemy.changePostion(other,ate_to_protect);
                somthing_killed=false;
            }
            
            if(x+2<=8&&y+1<=8) {
                WH.setX(x+2);
                WH.setY(y+1);
                placeCheck.x=x+2;
                placeCheck.y=y+1;
                
                if(protectKing(enemy,returnPostion(inHand))) {
                    somthing_killed=true;
                }
                
                if(pieceAlreadyThere(placeCheck) )
                    if(!see_king_Check(enemy)) {
                    if(somthing_killed) {
                        enemy.changePostion(other,ate_to_protect);
                        somthing_killed=false;
                    }
                    WH.setPoint(oldp1);
                    return false;
                    }
            }
            
            if(somthing_killed) {
                enemy.changePostion(other,ate_to_protect);
                somthing_killed=false;
            }
            if(x+2<=8&&y-1>=1) {
                WH.setX(x+2);
                WH.setY(y-1);
                placeCheck.x=x+2;
                placeCheck.y=y-1;
                if(protectKing(enemy,returnPostion(inHand))) {
                    somthing_killed=true;
                }
                
                if(pieceAlreadyThere(placeCheck) )
                    if(!see_king_Check(enemy)) {
                    if(somthing_killed) {
                        enemy.changePostion(other,ate_to_protect);
                        somthing_killed=false;
                    }
                    WH.setPoint(oldp1);
                    return false;
                    }
            }
            if(somthing_killed) {
                enemy.changePostion(other,ate_to_protect);
                somthing_killed=false;
            }
            
            if(x-1>=1&&y+2<=8) {
                WH.setX(x-1);
                WH.setY(y+2);
                placeCheck.x=x-1;
                placeCheck.y=y+2;
                
                if(protectKing(enemy,returnPostion(inHand))) {
                    somthing_killed=true;
                }
                
                if(pieceAlreadyThere(placeCheck) )
                    if(!see_king_Check(enemy)) {
                    if(somthing_killed) {
                        enemy.changePostion(other,ate_to_protect);
                        somthing_killed=false;
                    }
                    WH.setPoint(oldp1);
                    return false;
                    }
            }
            if(somthing_killed) {
                enemy.changePostion(other,ate_to_protect);
                somthing_killed=false;
            }
            
            if(x-1>=1&&y-2>=1) {
                WH.setX(x-1);
                WH.setY(y-2);
                placeCheck.x=x-1;
                placeCheck.y=y-2;
                if(protectKing(enemy,returnPostion(inHand))) {
                    somthing_killed=true;
                }
                
                if(pieceAlreadyThere(placeCheck) )
                    if(!see_king_Check(enemy)) {
                    if(somthing_killed) {
                        enemy.changePostion(other,ate_to_protect);
                        somthing_killed=false;
                    }
                    WH.setPoint(oldp1);
                    return false;
                    }
            }
            if(somthing_killed) {
                enemy.changePostion(other,ate_to_protect);
                somthing_killed=false;
            }
            
            if(x-2>=1&&y+1<=8) {
                WH.setX(x-2);
                WH.setY(y+1);
                placeCheck.x=x-2;
                placeCheck.y=y+1;
                
                if(protectKing(enemy,returnPostion(inHand))) {
                    somthing_killed=true;
                }
                if(pieceAlreadyThere(placeCheck) )
                    if(!see_king_Check(enemy)) {
                    if(somthing_killed) {
                        enemy.changePostion(other,ate_to_protect);
                        somthing_killed=false;
                    }
                    WH.setPoint(oldp1);
                    return false;
                    }
            }
            
            if(somthing_killed) {
                enemy.changePostion(other,ate_to_protect);
                somthing_killed=false;
            }
            
            if(x-2>=1&&y-1>=1) {
                WH.setX(x-2);
                WH.setY(y-1);
                placeCheck.x=x-2;
                placeCheck.y=y-1;
                
                if(protectKing(enemy,returnPostion(inHand))) {
                    somthing_killed=true;
                }
                
                if(pieceAlreadyThere(placeCheck) )
                    if(!see_king_Check(enemy)) {
                    if(somthing_killed) {
                        enemy.changePostion(other,ate_to_protect);
                        somthing_killed=false;
                    }
                    WH.setPoint(oldp1);
                    return false;
                    }
            }
            if(somthing_killed) {
                enemy.changePostion(other,ate_to_protect);
                somthing_killed=false;
            }
            
        }
        WH.setPoint(oldp1);
        
        
        return true;
    }
    
    public boolean queenGenerateMoves(Player2 enemy) {
        boolean somethingKilled=false;
        
        Point oldP1=new Point();
        
        oldP1=WQ.returnPostion();
        
        Point placeCheck=new Point();
        
        inHand=23;
        
        if(oldP1.x!=20) {
            for(int x= oldP1.x,y= oldP1.y;x>=1&&y<=8;x--,y++) {
                
                WQ.setX(x);
                WQ.setY(y);
                placeCheck.x=x;
                placeCheck.y=y;
                if(checkPath(enemy, oldP1)) {
                    if(protectKing(enemy,returnPostion(inHand))) {
                        somethingKilled=true;
                    }
                    
                    if(pieceAlreadyThere(placeCheck))
                        if(!see_king_Check(enemy)) {
                        WQ.setPoint(oldP1);
                        
                        if(somethingKilled) {
                            enemy.changePostion(other,ate_to_protect);
                            somethingKilled=false;
                        }
                        return false;
                        }
                }
                
                if(somethingKilled) {
                    enemy.changePostion(other,ate_to_protect);
                    somethingKilled=false;
                }
                
            }
            if(somethingKilled) {
                enemy.changePostion(other,ate_to_protect);
                somethingKilled=false;
            }
            for(int x=oldP1.x,y=oldP1.y;y>=1&&x<=8;x++,y--) {
                
                WQ.setX(x);
                WQ.setY(y);
                placeCheck.x=x;
                placeCheck.y=y;
                if(checkPath(enemy, oldP1)) {
                    if(protectKing(enemy,returnPostion(inHand))) {
                        somethingKilled=true;
                    }
                    if(pieceAlreadyThere(placeCheck))
                        if(!see_king_Check(enemy)) {
                        WQ.setPoint(oldP1);
                        if(somethingKilled) {
                            enemy.changePostion(other,ate_to_protect);
                            somethingKilled=false;
                        }
                        return false;
                        }
                }
                
                if(somethingKilled) {
                    enemy.changePostion(other,ate_to_protect);
                    somethingKilled=false;
                }
                
            }
            WQ.setPoint(oldP1);
            placeCheck.x=oldP1.x;
            placeCheck.y=oldP1.y;
            
            if(somethingKilled) {
                enemy.changePostion(other,ate_to_protect);
                somethingKilled=false;
            }
            
            
            for(int i=1;i<=8;i++) {
                WQ.setX(i);
                
                placeCheck.x=i;
                if(checkPath(enemy, oldP1)) {
                    if(protectKing(enemy,returnPostion(inHand))) {
                        somethingKilled=true;
                    }
                    if(pieceAlreadyThere(placeCheck) )
                        if(!see_king_Check(enemy)) {
                        WQ.setX(oldP1.x);
                        if(somethingKilled) {
                            enemy.changePostion(other,ate_to_protect);
                            somethingKilled=false;
                        }
                        return false;
                        }
                }
                
                if(somethingKilled) {
                    enemy.changePostion(other,ate_to_protect);
                    somethingKilled=false;
                }
                
            }
            WQ.setX(oldP1.x);
            placeCheck.x=oldP1.x;
            
            if(somethingKilled) {
                enemy.changePostion(other,ate_to_protect);
                somethingKilled=false;
            }
            
            
            for(int i=1;i<=8;i++) {
                WQ.setY(i);
                placeCheck.y=i;
                if(checkPath(enemy, oldP1)) {
                    if(protectKing(enemy,returnPostion(inHand))) {
                        somethingKilled=true;
                    }
                    if(pieceAlreadyThere(placeCheck) )
                        if(!see_king_Check(enemy)) {
                        WQ.setY(oldP1.y);
                        if(somethingKilled) {
                            enemy.changePostion(other,ate_to_protect);
                            somethingKilled=false;
                        }
                        return false;
                        }
                }
                
                if(somethingKilled) {
                    enemy.changePostion(other,ate_to_protect);
                    somethingKilled=false;
                }
                
            }
            WQ.setY(oldP1.y);
        }
        
        
        if(somethingKilled) {
            enemy.changePostion(other,ate_to_protect);
            somethingKilled=false;
        }
        
        
        return true;
        
    }
    public boolean pawnGeneratesMove(Player2 enemy, Pawn pawn) {
        Point oldP1=new Point();
        oldP1=pawn.returnPostion();
        Point PlaceCheck=new Point();
        PlaceCheck.x=oldP1.x;
        PlaceCheck.y=oldP1.y;
        
        
        
        if(oldP1.x!=20) {
            if(pawn.Canmove(oldP1.x,oldP1.y-2,Color)&&oldP1.y-2>=1) {
                pawn.setY(oldP1.y-2);
                
                PlaceCheck.y=oldP1.y-1;
                
                if(pieceAlreadyThere(PlaceCheck))
                    if(enemyOccupies(PlaceCheck,enemy)) {
                    if(!see_king_Check(enemy)) {
                        
                        pawn.setPoint(oldP1);
                        return false;
                    }
                    }
                
            }
            if(pawn.Canmove(oldP1.x,oldP1.y-1,Color)&&oldP1.y-1>=1) {
                pawn.setY(oldP1.y-1);
                PlaceCheck.y=oldP1.y-1;
                
                
                if(pieceAlreadyThere(PlaceCheck))
                    if(enemyOccupies(PlaceCheck,enemy)) {
                    
                    if(!see_king_Check(enemy)) {
                        pawn.setPoint(oldP1);
                        System.out.println("dff");
                        System.out.println("dff");
                        System.out.println("dff");
                        return false;
                    }
                    }
            }
            
            if(!enemyOccupies(new Point(oldP1.x-1,oldP1.y-1),enemy))
                if(protectKing(enemy,new Point(oldP1.x-1,oldP1.y-1))) {
                
                if(!see_king_Check(enemy)) {
                    enemy.changePostion(other,ate_to_protect);
                    pawn.setPoint(oldP1);
                    
                    return false;
                }
                enemy.changePostion(other,ate_to_protect);
                }
            
            if(!enemyOccupies(new Point(oldP1.x+1,oldP1.y-1),enemy))
                if(protectKing(enemy,new Point(oldP1.x+1,oldP1.y-1))) {
                if(!see_king_Check(enemy)) {
                    enemy.changePostion(other,ate_to_protect);
                    pawn.setPoint(oldP1);
                    
                    return false;
                }
                enemy.changePostion(other,ate_to_protect);
                
                }
            
        }
        
        pawn.setPoint(oldP1);
        return true;
    }
    
    
    public boolean checkPath(Player2 enemy,Point newPosition) {
        boolean flag=false;
        
        
        for(int i=1;i<=32;i++) {
            if(inHand!=i)// check if there is peices in the WAY
            {
                if(i<17)
                    flag=checkTheWay(newPosition,enemy.returnPostion(i),inHand);//Means there is something in the Way so can't move
                else {
                    flag=checkTheWay(newPosition,returnPostion(i),inHand);
                }
                
                if(flag==true) {
                    return false;}//Means  there is a Pice in the Way
            }
        }
        return true;
        
        
    }
    public boolean protectKing(Player2 enemy,Point newPoint) {
        
        for(int i=1;i<17;i++) {
            
            other=enemy.returnPostion(i);
            if(other.x==newPoint.x&&other.y==newPoint.y) {
                ate_to_protect=i;
                
                
                
                enemy.killedPiece(i);
                return true;
            }
        }
        
        return false;
    }
    
    public String reportLastMove() {
        switch(inHand) {
            
            case 17:return WC1.Tell_me();
            case 18:return WC2.Tell_me();
            case 19:return WH1.Tell_me();
            case 20:return WH2.Tell_me();
            case 21:return WE1.Tell_me();
            case 22:return WE2.Tell_me();
            case 23:return WQ.Tell_me();
            case 24:return WK.Tell_me();
            case 25:return  WS[0].Tell_me();
            case 26:return  WS[1].Tell_me();
            case 27:return  WS[2].Tell_me();
            case 28:return  WS[3].Tell_me();
            case 29:return  WS[4].Tell_me();
            case 30:return  WS[5].Tell_me();
            case 31:return  WS[6].Tell_me();
            case 32:return  WS[7].Tell_me();
        }
        return null;
    }
}





