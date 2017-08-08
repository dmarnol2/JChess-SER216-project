

package MainFrame.ChessFrame.players;
import MainFrame.ChessFrame.players.Pieces.Castle;
import MainFrame.ChessFrame.players.Pieces.Bishop;
import MainFrame.ChessFrame.players.Pieces.Knight;
import MainFrame.ChessFrame.players.Pieces.Queen;
import MainFrame.ChessFrame.players.Pieces.Pawn;
import MainFrame.ChessFrame.players.Pieces.King;
import java.awt.Image;
import java.awt.Point;
import java.util.Enumeration;




public class Player2 implements Enumeration
{
    public Castle blackCastle1;
    public Castle blackCastle2;
    public Knight blackKnight1;
    public Knight blackKnight2;
    public Bishop blackBishop1;
    public Bishop blackBishop2;
    public Queen blackQueen;
    private King blackKing;
    public Pawn[] blackPawns=new Pawn[8];
    private int choosenOne;
    private int inHand=-1;
    private boolean kingIsCheck=false;
    private Point other;
    private int ate_to_protect;
    
    private String Color="black";
    /** Creates a new instance of player2 */
    public Player2()
    {
        String fileSeparator = new String(System.getProperty("file.separator"));
        blackCastle1=new Castle("src" + fileSeparator + "Icons" + fileSeparator + "Player2Icons" + fileSeparator+ "br.gif",1,1);
        blackCastle2=new Castle("src" + fileSeparator + "Icons" + fileSeparator + "Player2Icons" + fileSeparator+ "br.gif",8,1);
        blackKnight1=new Knight("src" + fileSeparator + "Icons" + fileSeparator + "Player2Icons" + fileSeparator+ "bn.gif",2,1);
        blackKnight2=new Knight("src" + fileSeparator + "Icons" + fileSeparator + "Player2Icons" + fileSeparator+ "bn.gif",7,1);
        blackBishop1=new Bishop("src" + fileSeparator + "Icons" + fileSeparator + "Player2Icons" + fileSeparator+ "bb.gif",3,1);
        blackBishop2=new Bishop("src" + fileSeparator + "Icons" + fileSeparator + "Player2Icons" + fileSeparator+ "bb.gif",6,1);
        blackQueen=new Queen("src" + fileSeparator + "Icons" + fileSeparator + "Player2Icons" + fileSeparator+ "bq.gif",4,1);
        blackKing=new King("src" + fileSeparator + "Icons" + fileSeparator + "Player2Icons" + fileSeparator+ "bk.gif",5,1);
        int j=1;
        for(int  i=0;i<=7;i++,j++)
        {
            blackPawns[i]=new Pawn("src" + fileSeparator + "Icons" + fileSeparator + "Player2Icons" + fileSeparator+ "bp.gif",j,2);
        }
    }
    public void setChoosen(int newChoosen)
    {
        choosenOne=newChoosen;
    }
    public Point returnPostion(int i)
    {
        
        switch(i)
        {
            case 1:return blackCastle1.returnPostion();
            case 2:return blackCastle2.returnPostion();
            case 3:return blackKnight1.returnPostion();
            case 4:return blackKnight2.returnPostion();
            case 5:return blackBishop1.returnPostion();
            case 6:return blackBishop2.returnPostion();
            case 7:return blackQueen.returnPostion();
            case 8:return blackKing.returnPostion();
            case 9:return  blackPawns[0].returnPostion();
            case 10:return  blackPawns[1].returnPostion();
            case 11:return  blackPawns[2].returnPostion();
            case 12:return  blackPawns[3].returnPostion();
            case 13:return  blackPawns[4].returnPostion();
            case 14:return  blackPawns[5].returnPostion();
            case 15:return  blackPawns[6].returnPostion();
            case 16:return  blackPawns[7].returnPostion();
            
        }
        return new Point(-1,-1);
        
    }
    public Point returnOldPostion(int i)
    {
        
        switch(i)
        {
            case 1:return blackCastle1.returnOld();
            case 2:return blackCastle2.returnOld();
            case 3:return blackKnight1.returnOld();
            case 4:return blackKnight2.returnOld();
            case 5:return blackBishop1.returnOld();
            case 6:return blackBishop2.returnOld();
            case 7:return blackQueen.returnOld();
            case 8:return blackKing.returnOld();
            case 9:return  blackPawns[0].returnOld();
            case 10:return  blackPawns[1].returnOld();
            case 11:return  blackPawns[2].returnOld();
            case 12:return  blackPawns[3].returnOld();
            case 13:return  blackPawns[4].returnOld();
            case 14:return  blackPawns[5].returnOld();
            case 15:return  blackPawns[6].returnOld();
            case 16:return  blackPawns[7].returnOld();
            
        }
        return new Point(-1,-1);
        
    }
    public Image returnIconImage(int i)
    {
        switch(i)
        {
            case 1:return blackCastle1.returnPieceImage();
            case 2:return blackCastle2.returnPieceImage();
            case 3:return blackKnight1.returnPieceImage();
            case 4:return blackKnight2.returnPieceImage();
            case 5:return blackBishop1.returnPieceImage();
            case 6:return blackBishop2.returnPieceImage();
            case 7:return blackQueen.returnPieceImage();
            case 8:return blackKing.returnPieceImage();
            case 9:return  blackPawns[0].returnPieceImage();
            case 10:return  blackPawns[1].returnPieceImage();
            case 11:return  blackPawns[2].returnPieceImage();
            case 12:return  blackPawns[3].returnPieceImage();
            case 13:return  blackPawns[4].returnPieceImage();
            case 14:return  blackPawns[5].returnPieceImage();
            case 15:return  blackPawns[6].returnPieceImage();
            case 16:return  blackPawns[7].returnPieceImage();
            
        }
        return  null;
        
    }
    public void changePostion(Point newPoint,int i)
    {
        switch(i)
        {
            case 1:blackCastle1.setPoint(newPoint);break;
            case 2: blackCastle2.setPoint(newPoint);break;
            case 3: blackKnight1.setPoint(newPoint);break;
            case 4: blackKnight2.setPoint(newPoint);break;
            case 5: blackBishop1.setPoint(newPoint);break;
            case 6: blackBishop2.setPoint(newPoint);break;
            case 7: blackQueen.setPoint(newPoint);break;
            case 8: blackKing.setPoint(newPoint);break;
            case 9:  blackPawns[0].setPoint(newPoint);break;
            case 10:  blackPawns[1].setPoint(newPoint);break;
            case 11:  blackPawns[2].setPoint(newPoint);break;
            case 12:  blackPawns[3].setPoint(newPoint);break;
            case 13:  blackPawns[4].setPoint(newPoint);break;
            case 14:  blackPawns[5].setPoint(newPoint);break;
            case 15:  blackPawns[6].setPoint(newPoint);break;
            case 16:  blackPawns[7].setPoint(newPoint);break;
            
        }
        
    }
    public void changePostionToOld(Point newPoint,int i)
    {
        switch(i)
        {
            case 1:blackCastle1.toOld(newPoint);break;
            case 2: blackCastle2.toOld(newPoint);break;
            case 3: blackKnight1.toOld(newPoint);break;
            case 4: blackKnight2.toOld(newPoint);break;
            case 5: blackBishop1.toOld(newPoint);break;
            case 6: blackBishop2.toOld(newPoint);break;
            case 7: blackQueen.toOld(newPoint);break;
            case 8: blackKing.toOld(newPoint);break;
            case 9:  blackPawns[0].toOld(newPoint);break;
            case 10:  blackPawns[1].toOld(newPoint);break;
            case 11:  blackPawns[2].toOld(newPoint);break;
            case 12:  blackPawns[3].toOld(newPoint);break;
            case 13:  blackPawns[4].toOld(newPoint);break;
            case 14:  blackPawns[5].toOld(newPoint);break;
            case 15:  blackPawns[6].toOld(newPoint);break;
            case 16:  blackPawns[7].toOld(newPoint);break;
            
        }
        
    }
    public void changePixel(int newPixelX,int newPixelY)
    {
        switch(choosenOne)
        {
            case 1:blackCastle1.setPixels(newPixelX,newPixelY);break;
            case 2: blackCastle2.setPixels(newPixelX,newPixelY);break;
            case 3: blackKnight1.setPixels(newPixelX,newPixelY);break;
            case 4: blackKnight2.setPixels(newPixelX,newPixelY);break;
            case 5: blackBishop1.setPixels(newPixelX,newPixelY);break;
            case 6: blackBishop2.setPixels(newPixelX,newPixelY);break;
            case 7: blackQueen.setPixels(newPixelX,newPixelY);break;
            case 8: blackKing.setPixels(newPixelX,newPixelY);break;
            case 9:  blackPawns[0].setPixels(newPixelX,newPixelY);break;
            case 10:  blackPawns[1].setPixels(newPixelX,newPixelY);break;
            case 11:  blackPawns[2].setPixels(newPixelX,newPixelY);break;
            case 12:  blackPawns[3].setPixels(newPixelX,newPixelY);break;
            case 13:  blackPawns[4].setPixels(newPixelX,newPixelY);break;
            case 14:  blackPawns[5].setPixels(newPixelX,newPixelY);break;
            case 15:  blackPawns[6].setPixels(newPixelX,newPixelY);break;
            case 16:  blackPawns[7].setPixels(newPixelX,newPixelY);break;
            
        }
    }
    public Point getPixelPoint(int i)
    {
        choosenOne=i;
        switch(choosenOne)
        {
            case 1:return  blackCastle1.getpixelPoint();
            case 2:return   blackCastle2.getpixelPoint();
            case 3:return   blackKnight1.getpixelPoint();
            case 4:return   blackKnight2.getpixelPoint();
            case 5:return   blackBishop1.getpixelPoint();
            case 6: return  blackBishop2.getpixelPoint();
            case 7:return   blackQueen.getpixelPoint();
            case 8:return   blackKing.getpixelPoint();
            case 9:return    blackPawns[0].getpixelPoint();
            case 10:return    blackPawns[1].getpixelPoint();
            case 11: return   blackPawns[2].getpixelPoint();
            case 12:return    blackPawns[3].getpixelPoint();
            case 13:return    blackPawns[4].getpixelPoint();
            case 14:return    blackPawns[5].getpixelPoint();
            case 15:return    blackPawns[6].getpixelPoint();
            case 16:return    blackPawns[7].getpixelPoint();
            
        }
        return null;
    }
    public void changePixel(int newPixelX,int newPixelY,int i)
    {
        choosenOne=i;
        switch(choosenOne)
        {
            case 1:blackCastle1.setPixels(newPixelX,newPixelY);break;
            case 2:blackCastle2.setPixels(newPixelX,newPixelY);break;
            case 3:blackKnight1.setPixels(newPixelX,newPixelY);break;
            case 4:blackKnight2.setPixels(newPixelX,newPixelY);break;
            case 5:blackBishop1.setPixels(newPixelX,newPixelY);break;
            case 6:blackBishop2.setPixels(newPixelX,newPixelY);break;
            case 7:blackQueen.setPixels(newPixelX,newPixelY);break;
            case 8:blackKing.setPixels(newPixelX,newPixelY);break;
            case 9:blackPawns[0].setPixels(newPixelX,newPixelY);break;
            case 10:blackPawns[1].setPixels(newPixelX,newPixelY);break;
            case 11:blackPawns[2].setPixels(newPixelX,newPixelY);break;
            case 12:blackPawns[3].setPixels(newPixelX,newPixelY);break;
            case 13:blackPawns[4].setPixels(newPixelX,newPixelY);break;
            case 14:blackPawns[5].setPixels(newPixelX,newPixelY);break;
            case 15:blackPawns[6].setPixels(newPixelX,newPixelY);break;
            case 16:blackPawns[7].setPixels(newPixelX,newPixelY);break;
            
        }
    }
    public boolean Killedpiec(int i)
    {
        Point out=new Point(20,20);
        switch(i)
        {
            case 1:blackCastle1.setPoint(out);return true;
            case 2:blackCastle2.setPoint(out);return true;
            case 3:blackKnight1.setPoint(out);return true;
            case 4:blackKnight2.setPoint(out);return true;
            case 5:blackBishop1.setPoint(out);return true;
            case 6:blackBishop2.setPoint(out);return true;
            case 7:blackQueen.setPoint(out);return true;
            case 8 :return true;// the King "Can't be moved out"
            case 9:blackPawns[0].setPoint(out);return true;
            case 10:blackPawns[1].setPoint(out);return true;
            case 11:blackPawns[2].setPoint(out);return true;
            case 12:blackPawns[3].setPoint(out);return true;
            case 13:blackPawns[4].setPoint(out);return true;
            case 14:blackPawns[5].setPoint(out);return true;
            case 15:blackPawns[6].setPoint(out);return true;
            case 16:blackPawns[7].setPoint(out);return true;
        }
        return false;
    }
    
    public boolean checkTheMove(Point newP,int i)
    {
        choosenOne=i;
        switch(choosenOne)
        {
            
            case 1:return blackCastle1.Canmove(newP.x,newP.y);
            case 2:return   blackCastle2.Canmove(newP.x,newP.y);
            case 3:return   blackKnight1.Canmove(newP.x,newP.y);
            case 4:return   blackKnight2.Canmove(newP.x,newP.y);
            case 5:return   blackBishop1.Canmove(newP.x,newP.y);
            case 6: return  blackBishop2.Canmove(newP.x,newP.y);
            case 7:return   blackQueen.Canmove(newP.x,newP.y);
            case 8:return   blackKing.Canmove(newP.x,newP.y);
            case 9:return    blackPawns[0].Canmove(newP.x,newP.y,Color);
            case 10:return    blackPawns[1].Canmove(newP.x,newP.y,Color);
            case 11: return   blackPawns[2].Canmove(newP.x,newP.y,Color);
            case 12:return    blackPawns[3].Canmove(newP.x,newP.y,Color);
            case 13:return    blackPawns[4].Canmove(newP.x,newP.y,Color);
            case 14:return    blackPawns[5].Canmove(newP.x,newP.y,Color);
            case 15:return    blackPawns[6].Canmove(newP.x,newP.y,Color);
            case 16:return    blackPawns[7].Canmove(newP.x,newP.y,Color);
        }
        return false;
    }
    public boolean setSeenToSiliders(int i,Point P)
    {
        
        switch(i)
        {
            case 9: return     blackPawns[0].setSeenbychecking(P,"black");
            case 10: return    blackPawns[1].setSeenbychecking(P,"black");
            case 11: return     blackPawns[2].setSeenbychecking(P,"black");
            case 12: return     blackPawns[3].setSeenbychecking(P,"black");
            case 13: return     blackPawns[4].setSeenbychecking(P,"black");
            case 14: return     blackPawns[5].setSeenbychecking(P,"black");
            case 15: return    blackPawns[6].setSeenbychecking(P,"black");
            case 16: return     blackPawns[7].setSeenbychecking(P,"black");
        }
        return false;
        
    }
    public boolean returnPawnSeen(int i)
    {
        switch(i)
        {
            
            case 9: return     blackPawns[0].returnMyseen();
            case 10: return    blackPawns[1].returnMyseen();
            case 11: return     blackPawns[2].returnMyseen();
            case 12: return     blackPawns[3].returnMyseen();
            case 13: return     blackPawns[4].returnMyseen();
            case 14: return     blackPawns[5].returnMyseen();
            case 15: return    blackPawns[6].returnMyseen();
            case 16: return     blackPawns[7].returnMyseen();
        }
        return false;
    }
    public boolean checkTheWay(Point newP,Point postionFromOthers,int i)
    {
        switch(i)
        {
            case 1:return blackCastle1.PieceInMYway(newP.x,newP.y,postionFromOthers);
            case 2:return   blackCastle2.PieceInMYway(newP.x,newP.y,postionFromOthers);
            case 5:return   blackBishop1.PieceInMYway(newP.x,newP.y,postionFromOthers);
            case 6: return  blackBishop2.PieceInMYway(newP.x,newP.y,postionFromOthers);
            case 7:return   blackQueen.PieceInMYway(newP.x,newP.y,postionFromOthers);
            case 9:return    blackPawns[0].PieceInMYway(newP.x,newP.y,postionFromOthers,Color);
            case 10:return   blackPawns[1].PieceInMYway(newP.x,newP.y,postionFromOthers,Color);
            case 11: return   blackPawns[2].PieceInMYway(newP.x,newP.y,postionFromOthers,Color);
            case 12:return    blackPawns[3].PieceInMYway(newP.x,newP.y,postionFromOthers,Color);
            case 13:return    blackPawns[4].PieceInMYway(newP.x,newP.y,postionFromOthers,Color);
            case 14:return    blackPawns[5].PieceInMYway(newP.x,newP.y,postionFromOthers,Color);
            case 15:return   blackPawns[6].PieceInMYway(newP.x,newP.y,postionFromOthers,Color);
            case 16:
            {  return   blackPawns[7].PieceInMYway(newP.x,newP.y,postionFromOthers,Color);}
            
            
        }
        return false;
    }
    public boolean checKing(Point p1,Point p2,int i)
    {
        switch(i)
        {
            
            case 1:return  blackCastle1.checkKing(p1.x,p1.y,p2);
            case 2:return blackCastle2.checkKing(p1.x,p1.y,p2);
            case 3:return  blackKnight1.Canmove(p1.x,p1.y);
            case 4:return  blackKnight2.Canmove(p1.x,p1.y);
            case 5:return   blackBishop1.checkKing(p1.x,p1.y,p2);
            case 6:return   blackBishop2.checkKing(p1.x,p1.y,p2);
            case 7:return   blackQueen.checkKing(p1.x,p1.y,p2);
            
            case 9:return    blackPawns[0].Canmove(p1.x,p1.y,Color);
            case 10:return   blackPawns[1].Canmove(p1.x,p1.y,Color);
            case 11:return   blackPawns[2].Canmove(p1.x,p1.y,Color);
            case 12:return    blackPawns[3].Canmove(p1.x,p1.y,Color);
            case 13:return    blackPawns[4].Canmove(p1.x,p1.y,Color);
            case 14: return  blackPawns[5].Canmove(p1.x,p1.y,Color);
            case 15:return   blackPawns[6].Canmove(p1.x,p1.y,Color);
            case 16:return   blackPawns[7].Canmove(p1.x,p1.y,Color);
        }
        return false;
    }
    public int returnChosen()
    {
        return choosenOne;
    }
    public void setInHand(int i )
    {
        inHand=i;
    }
    public int getInHand()
    {
        return inHand;
    }
    public boolean canMove(int x,int y)
    {
        return true;
    }
    public void checkKing(boolean newkingcheck)
    {
        kingIsCheck=newkingcheck;
    }
    public boolean returnCheckKing()
    {
        return kingIsCheck;
    }
    public boolean  seeKingCheck(Player1 White)
    {
        
        Point My_King_Postion=blackKing.returnPostion();
        boolean flag=false;
        
        
        //////////    Start Checking the King ////////////
        for(int i=17;i<33;i++)
        {
            if(i<25)
            {
                if(White.checkthemove(My_King_Postion,i))
                {
                    
                    flag=true;
                    for(int j=1;j<33;j++)
                    {
                        
                        if(j<17)
                        {
                            
                            if(White.checktheWay(My_King_Postion,returnPostion(j),i))
                            {
                                //Means there is somting in the Way so can't move'
                                
                                flag=false;
                                
                                
                            }
                        }
                        
                        else
                        {
                            
                            if(j!=8)
                                if(White.checktheWay(My_King_Postion,White.returnPostion(j),i))
                                {
                                
                                flag=false;
                                //Means there is somting in the Way so can't move'
                                
                                
                                }
                            
                        }
                        
                    }
                    
                    if(flag)
                    {
                        
                        break;
                    }
                    
                }
            }
            else
            {
                // For soliders
                if(White.setSeenToSiliders(i,My_King_Postion))
                {
                    
                    break;
                    
                }
            }
            //   if(stillIn_Check){ return true;}//Here Means White king is in check !!!
            if(i==32)
            {
                
                return false; }
        }
        
        return true;
    }
    public boolean checkmateGameOver(Player1 Enemy)
    {
        
        
        
        
        if(! kingGenerateMoves(Enemy))
        {
            
            inHand=-1;
            System.out.println("I Killed King  2");
            
            return false;
        }
        else if(!castleGenerateMoves(Enemy,blackCastle1))
        {
            
            inHand=-1;
            System.out.println("I Killed Castle 2");
            
            return false;
        }
        else if(!castleGenerateMoves(Enemy,blackCastle2))
        {
            
            inHand=-1;
            System.out.println("I Killed Castle 2");
            return false;
        }
        else if(!bishopGenerateMoves(Enemy,blackBishop1))
        {
            
            inHand=-1;
            System.out.println("I Killed ELephent2");
            return false;
        }
        else if(!bishopGenerateMoves(Enemy,blackBishop2))
        {
            
            inHand=-1;
            System.out.println("I Killed ELephent2");
            
            return false;
        }
        else if(!knightGenerateMoves(Enemy,blackKnight1))
        {
            
            inHand=-1;
            System.out.println("I Killed Horse 2");
            return false;
        }
        else if(!knightGenerateMoves(Enemy,blackKnight2))
        {
            
            inHand=-1;
            System.out.println("I Killed Horse 2");
            return false;
        }
        
        else if(!queenGenerateMoves(Enemy))
        {
            
            inHand=-1;
            System.out.println("I Killed Queen 2");
            return false;
        }
        
        for(int i=0;i<=7;i++)
        {
            inHand=9+i;
            if(!pawnGenerateMoves(Enemy,blackPawns[i]))
            {
                
                inHand=-1;
                
                System.out.println("I Killed Solider 2");
                
                return false;
            }
        }
        
        inHand=-1;
        return true;
        
        
        
        
    }
    
    
    
    public boolean pieceAlreadyThere(Point newP)
    {
        Point samePostion;
        for(int i=1;i<=16;i++)
        {
            if(getInHand()!=i)// There is no need to check the inHand pice
            {
                
                
                //Check if there is White Pices in the new Point
                //If so we Can't move (Same Color)!!
                
                
                
                samePostion=returnPostion(i);
                if(newP.x==samePostion.x&&newP.y==samePostion.y)
                {
                    
                    return false;
                    
                }
            }
        }
        
        
        return true;
    }
    public boolean pieceAlreadyThereFromEnemy(Point newP,Player1 enemy)
    {
        Point samePostion;
        for(int i=17;i<=32;i++)
        {
            
            
            
            //Check if there is White Pices in the new Point
            //If so we Can't move (Same Color)!!
            
            
            
            samePostion=enemy.returnPostion(i);
            if(newP.x==samePostion.x&&newP.y==samePostion.y)
            {
                
                return false;
                
            }
            
        }
        
        
        return true;
    }
    public int getPieceAlreadyThereFromEnemy(Point newP,Player1 enemy)
    {
        Point samePostion;
        for(int i=17;i<=32;i++)
        {
            samePostion=enemy.returnPostion(i);
            if(newP.x==samePostion.x&&newP.y==samePostion.y)
            {
                return i;
            }
        }
        return -1;
    }
    public boolean kingGenerateMoves(Player1 enemy)
    {
        boolean somthing_killed=false;
        Point Oldp=new Point();
        
        Point PlaceCheck=new Point();
        inHand=8;
        
        int x=blackKing.returnX();
        int y=blackKing.returnY();
        
        Oldp.x=x;
        Oldp.y=y;
        
        if(x+1<=8)
        {
            
            
            blackKing.setX(x+1);
            blackKing.setY(y);
            PlaceCheck.x=x+1;
            PlaceCheck.y=y;
            
            
            if(killToProtectKing(enemy,returnPostion(inHand)))
            {
                somthing_killed=true;
            }
            if(pieceAlreadyThere(PlaceCheck))
                if(!seeKingCheck(enemy))
                {
                
                
                blackKing.setPoint(Oldp);
                if(somthing_killed)
                {
                    enemy.changePostion(other,ate_to_protect);
                    somthing_killed=false;
                }
                return false;
                }
            
        }
        blackKing.setPoint(Oldp);
        if(somthing_killed)
        {
            enemy.changePostion(other,ate_to_protect);
            somthing_killed=false;
        }
        if(y+1<=8)
        {
            
            
            blackKing.setX(x);
            blackKing.setY(y+1);
            PlaceCheck.x=x;
            PlaceCheck.y=y+1;
            if(killToProtectKing(enemy,returnPostion(inHand)))
            {
                somthing_killed=true;
            }
            if(pieceAlreadyThere( PlaceCheck))
                if(!seeKingCheck(enemy))
                {
                
                blackKing.setPoint(Oldp);
                if(somthing_killed)
                {
                    enemy.changePostion(other,ate_to_protect);
                    somthing_killed=false;
                }
                return false;
                
                }
            
        }
        blackKing.setPoint(Oldp);
        if(somthing_killed)
        {
            enemy.changePostion(other,ate_to_protect);
            somthing_killed=false;
        }
        
        if(y-1>0)
        {
            
            blackKing.setX(x);
            blackKing.setY(y-1);
            
            PlaceCheck.x=x;
            PlaceCheck.y=y-1;
            
            if(killToProtectKing(enemy,returnPostion(inHand)))
            {
                somthing_killed=true;
            }
            
            if(pieceAlreadyThere( PlaceCheck))
                if(!seeKingCheck(enemy))
                {
                
                blackKing.setPoint(Oldp);
                if(somthing_killed)
                {
                    enemy.changePostion(other,ate_to_protect);
                    somthing_killed=false;
                }
                
                return false;
                }
            
        }
        blackKing.setPoint(Oldp);
        if(somthing_killed)
        {
            enemy.changePostion(other,ate_to_protect);
            somthing_killed=false;
        }
        if(x-1>0)
        {
            
            blackKing.setX(x-1);
            blackKing.setY(y);
            
            PlaceCheck.x=x-1;
            PlaceCheck.y=y;
            if(killToProtectKing(enemy,returnPostion(inHand)))
            {
                somthing_killed=true;
            }
            if(pieceAlreadyThere( PlaceCheck))
                if(!seeKingCheck(enemy))
                {
                if(somthing_killed)
                {
                    enemy.changePostion(other,ate_to_protect);
                    somthing_killed=false;
                }
                blackKing.setPoint(Oldp);
                return false;
                }
            
        }
        blackKing.setPoint(Oldp);
        if(somthing_killed)
        {
            enemy.changePostion(other,ate_to_protect);
            somthing_killed=false;
        }
        if(y-1>0&&x-1>0)
        {
            
            blackKing.setX(x-1);
            blackKing.setY(y-1);
            
            PlaceCheck.x=x-1;
            PlaceCheck.y=y-1;
            
            if(killToProtectKing(enemy,returnPostion(inHand)))
            {
                somthing_killed=true;
            }
            if(pieceAlreadyThere( PlaceCheck))
                if(!seeKingCheck(enemy))
                {
                
                if(somthing_killed)
                {
                    enemy.changePostion(other,ate_to_protect);
                    somthing_killed=false;
                }
                blackKing.setPoint(Oldp);
                return false;
                }
            
        }
        blackKing.setPoint(Oldp);
        if(somthing_killed)
        {
            enemy.changePostion(other,ate_to_protect);
            somthing_killed=false;
        }
        if(y+1<=8&&x+1<=8)
        {
            
            blackKing.setX(x+1);
            blackKing.setY(y+1);
            
            PlaceCheck.x=x+1;
            PlaceCheck.y=y+1;
            if(killToProtectKing(enemy,returnPostion(inHand)))
            {
                somthing_killed=true;
            }
            if(pieceAlreadyThere( PlaceCheck))
                if(!seeKingCheck(enemy))
                {
                
                if(somthing_killed)
                {
                    enemy.changePostion(other,ate_to_protect);
                    somthing_killed=false;
                }
                blackKing.setPoint(Oldp);
                return false;
                }
            
        }
        blackKing.setPoint(Oldp);
        if(somthing_killed)
        {
            enemy.changePostion(other,ate_to_protect);
            somthing_killed=false;
        }
        if(y-1>0&&x+1<=8)
        {
            
            blackKing.setX(x+1);
            blackKing.setY(y-1);
            
            PlaceCheck.x=x+1;
            PlaceCheck.y=y-1;
            if(killToProtectKing(enemy,returnPostion(inHand)))
            {
                somthing_killed=true;
            }
            if(pieceAlreadyThere( PlaceCheck))
                if(!seeKingCheck(enemy))
                {
                if(somthing_killed)
                {
                    enemy.changePostion(other,ate_to_protect);
                    somthing_killed=false;
                }
                blackKing.setPoint(Oldp);
                return false;
                }
            
        }
        blackKing.setPoint(Oldp);
        if(somthing_killed)
        {
            enemy.changePostion(other,ate_to_protect);
            somthing_killed=false;
        }
        if(y+1<=8&&x-1>0)
        {
            
            
            blackKing.setX(x-1);
            blackKing.setY(y+1);
            
            PlaceCheck.x=x-1;
            PlaceCheck.y=y+1;
            if(killToProtectKing(enemy,returnPostion(inHand)))
            {
                somthing_killed=true;
            }
            if(pieceAlreadyThere( PlaceCheck))
                if(!seeKingCheck(enemy))
                {
                if(somthing_killed)
                {
                    enemy.changePostion(other,ate_to_protect);
                    somthing_killed=false;
                }
                blackKing.setPoint(Oldp);
                return false;
                }
            
        }
        
        if(somthing_killed)
        {
            enemy.changePostion(other,ate_to_protect);
            somthing_killed=false;
        }
        
        
        blackKing.setPoint(Oldp);
        return true;
        
        
        
        
    }
    
    public boolean castleGenerateMoves(Player1 enemy,Castle blackCastle)
    {
        boolean somthing_killed=false;
        Point Oldp1=new Point();
        
        Point PlaceCheck=new Point();
        int x1=blackCastle.returnX();
        int y1=blackCastle.returnY();
        
        if(blackCastle==blackCastle1)
        {
            inHand=1;
        }
        else
        {
            inHand=2;
        }
        /////////////////////
        
        Oldp1.x=x1;
        Oldp1.y=y1;
        
        PlaceCheck.y=y1;
        
        
        
        if(x1!=20)
        {
            for(int i=1;i<=8;i++)
            {
                
                blackCastle.setX(i);
                PlaceCheck.x=i;
                
                
                if(Check_The_Way_to_Postion(enemy,Oldp1))
                {
                    if(killToProtectKing(enemy,returnPostion(inHand)))
                    {
                        somthing_killed=true;
                    }
                    
                    if(pieceAlreadyThere(PlaceCheck))
                        if(!seeKingCheck(enemy))
                        {
                        blackCastle.setX(Oldp1.x);
                        blackCastle.setY(Oldp1.y);
                        
                        if(somthing_killed)
                        {
                            enemy.changePostion(other,ate_to_protect);
                            somthing_killed=false;
                        }
                        return false;
                        }
                }
                
                if(somthing_killed)
                {
                    enemy.changePostion(other,ate_to_protect);
                    somthing_killed=false;
                }
                
            }
            blackCastle.setX(Oldp1.x);
            PlaceCheck.x=Oldp1.x;
            
            if(somthing_killed)
            {
                enemy.changePostion(other,ate_to_protect);
                somthing_killed=false;
            }
            for(int i=1;i<=8;i++)
            {
                blackCastle.setY(i);
                PlaceCheck.y=i;
                if(Check_The_Way_to_Postion(enemy,Oldp1))
                {
                    if(killToProtectKing(enemy,returnPostion(inHand)))
                    {
                        somthing_killed=true;
                    }
                    if(pieceAlreadyThere(PlaceCheck) )
                        if(!seeKingCheck(enemy))
                        {
                        blackCastle.setX(Oldp1.x);
                        blackCastle.setY(Oldp1.y);
                        
                        if(somthing_killed)
                        {
                            enemy.changePostion(other,ate_to_protect);
                            somthing_killed=false;
                        }
                        return false;
                        }
                }
                
                if(somthing_killed)
                {
                    enemy.changePostion(other,ate_to_protect);
                    somthing_killed=false;
                }
                
            }
            blackCastle.setY(Oldp1.y);
        }
        //////////////////////////////////////////
        ///////////////////////////
        
        if(somthing_killed)
        {
            enemy.changePostion(other,ate_to_protect);
            somthing_killed=false;
        }
        blackCastle.setX(Oldp1.x);
        blackCastle.setY(Oldp1.y);
        return true;
    }
    
    public  boolean bishopGenerateMoves(Player1 enemy,Bishop blackBishop)
    {
        boolean somthing_killed=false;
        Point Oldp1=new Point();
        Point PlaceCheck=new Point();
        
        Oldp1=blackBishop.returnPostion();
        
        if(blackBishop==blackBishop1)
        {
            inHand=5;
        }
        else
        {
            inHand=6;
        }
        
        if(Oldp1.x!=20)
        {
            for(int x= Oldp1.x,y= Oldp1.y;x>=1&&y<=8;x--,y++)
            {
                
                blackBishop.setX(x);
                blackBishop.setY(y);
                PlaceCheck.x=x;
                PlaceCheck.y=y;
                if(Check_The_Way_to_Postion(enemy, Oldp1))
                {
                    if(killToProtectKing(enemy,returnPostion(inHand)))
                    {
                        somthing_killed=true;
                    }
                    if(pieceAlreadyThere(PlaceCheck))
                        if(!seeKingCheck(enemy))
                        {
                        
                        if(somthing_killed)
                        {
                            enemy.changePostion(other,ate_to_protect);
                            somthing_killed=false;
                        }
                        blackBishop.setPoint(Oldp1);
                        return false;
                        }
                }
                
                if(somthing_killed)
                {
                    enemy.changePostion(other,ate_to_protect);
                    somthing_killed=false;
                }
                
            }
            if(somthing_killed)
            {
                enemy.changePostion(other,ate_to_protect);
                somthing_killed=false;
            }
            for(int x=Oldp1.x,y=Oldp1.y;y>=1&&x<=8;x++,y--)
            {
                
                blackBishop.setX(x);
                blackBishop.setY(y);
                PlaceCheck.x=x;
                PlaceCheck.y=y;
                if(Check_The_Way_to_Postion(enemy, Oldp1))
                {
                    if(killToProtectKing(enemy,returnPostion(inHand)))
                    {
                        somthing_killed=true;
                    }
                    if(pieceAlreadyThere(PlaceCheck))
                        if(!seeKingCheck(enemy))
                        {
                        if(somthing_killed)
                        {
                            enemy.changePostion(other,ate_to_protect);
                            somthing_killed=false;
                        }
                        blackBishop.setPoint(Oldp1);
                        return false;
                        }
                }
                
                if(somthing_killed)
                {
                    enemy.changePostion(other,ate_to_protect);
                    somthing_killed=false;
                }
                
            }
            blackBishop.setPoint(Oldp1);
            
        }
        
        blackBishop.setPoint(Oldp1);
        
        
        if(somthing_killed)
        {
            enemy.changePostion(other,ate_to_protect);
            somthing_killed=false;
        }
        
        return true;
    }
    
    public boolean knightGenerateMoves(Player1 enemy,Knight blackKnight)
    {
        Point oldp1=new Point();
        boolean somthing_killed=false;
        oldp1=blackKnight.returnPostion();
        
        Point PlaceCheck=new Point();
        
        if(blackKnight==blackKnight1)
        {
            inHand=3;
        }
        else
        {
            inHand=4;
        }
        
        
        int x=oldp1.x;
        int y=oldp1.y;
        
        if(x!=20)
        {
            
            if(x+1<=8&&y+1<=8)
            {
                blackKnight.setX(x+1);
                blackKnight.setY(y+2);
                PlaceCheck.x=x+1;
                PlaceCheck.y=y+2;
                
                if(killToProtectKing(enemy,returnPostion(inHand)))
                {
                    somthing_killed=true;
                }
                
                if(pieceAlreadyThere(PlaceCheck) )
                    if(!seeKingCheck(enemy))
                    {
                    blackKnight.setPoint(oldp1);
                    
                    if(somthing_killed)
                    {
                        enemy.changePostion(other,ate_to_protect);
                        somthing_killed=false;
                    }
                    
                    return false;
                    }
            }
            if(somthing_killed)
            {
                enemy.changePostion(other,ate_to_protect);
                somthing_killed=false;
            }
            
            if(x+1<=8&&y-2>=1)
            {
                blackKnight.setX(x+1);
                blackKnight.setY(y-2);
                PlaceCheck.x=x+1;
                PlaceCheck.y=y-2;
                if(killToProtectKing(enemy,returnPostion(inHand)))
                {
                    somthing_killed=true;
                }
                
                if(pieceAlreadyThere(PlaceCheck) )
                    if(!seeKingCheck(enemy))
                    {
                    if(somthing_killed)
                    {
                        enemy.changePostion(other,ate_to_protect);
                        somthing_killed=false;
                    }
                    blackKnight.setPoint(oldp1);
                    return false;
                    }
            }
            if(somthing_killed)
            {
                enemy.changePostion(other,ate_to_protect);
                somthing_killed=false;
            }
            
            if(x+2<=8&&y+1<=8)
            {
                blackKnight.setX(x+2);
                blackKnight.setY(y+1);
                PlaceCheck.x=x+2;
                PlaceCheck.y=y+1;
                
                if(killToProtectKing(enemy,returnPostion(inHand)))
                {
                    somthing_killed=true;
                }
                
                if(pieceAlreadyThere(PlaceCheck) )
                    if(!seeKingCheck(enemy))
                    {
                    if(somthing_killed)
                    {
                        enemy.changePostion(other,ate_to_protect);
                        somthing_killed=false;
                    }
                    blackKnight.setPoint(oldp1);
                    return false;
                    }
            }
            
            if(somthing_killed)
            {
                enemy.changePostion(other,ate_to_protect);
                somthing_killed=false;
            }
            if(x+2<=8&&y-1>=1)
            {
                blackKnight.setX(x+2);
                blackKnight.setY(y-1);
                PlaceCheck.x=x+2;
                PlaceCheck.y=y-1;
                if(killToProtectKing(enemy,returnPostion(inHand)))
                {
                    somthing_killed=true;
                }
                
                if(pieceAlreadyThere(PlaceCheck) )
                    if(!seeKingCheck(enemy))
                    {
                    if(somthing_killed)
                    {
                        enemy.changePostion(other,ate_to_protect);
                        somthing_killed=false;
                    }
                    blackKnight.setPoint(oldp1);
                    return false;
                    }
            }
            if(somthing_killed)
            {
                enemy.changePostion(other,ate_to_protect);
                somthing_killed=false;
            }
            
            if(x-1>=1&&y+2<=8)
            {
                blackKnight.setX(x-1);
                blackKnight.setY(y+2);
                PlaceCheck.x=x-1;
                PlaceCheck.y=y+2;
                
                if(killToProtectKing(enemy,returnPostion(inHand)))
                {
                    somthing_killed=true;
                }
                
                if(pieceAlreadyThere(PlaceCheck) )
                    if(!seeKingCheck(enemy))
                    {
                    if(somthing_killed)
                    {
                        enemy.changePostion(other,ate_to_protect);
                        somthing_killed=false;
                    }
                    blackKnight.setPoint(oldp1);
                    return false;
                    }
            }
            if(somthing_killed)
            {
                enemy.changePostion(other,ate_to_protect);
                somthing_killed=false;
            }
            
            if(x-1>=1&&y-2>=1)
            {
                blackKnight.setX(x-1);
                blackKnight.setY(y-2);
                PlaceCheck.x=x-1;
                PlaceCheck.y=y-2;
                if(killToProtectKing(enemy,returnPostion(inHand)))
                {
                    somthing_killed=true;
                }
                
                if(pieceAlreadyThere(PlaceCheck) )
                    if(!seeKingCheck(enemy))
                    {
                    if(somthing_killed)
                    {
                        enemy.changePostion(other,ate_to_protect);
                        somthing_killed=false;
                    }
                    blackKnight.setPoint(oldp1);
                    return false;
                    }
            }
            if(somthing_killed)
            {
                enemy.changePostion(other,ate_to_protect);
                somthing_killed=false;
            }
            
            if(x-2>=1&&y+1<=8)
            {
                blackKnight.setX(x-2);
                blackKnight.setY(y+1);
                PlaceCheck.x=x-2;
                PlaceCheck.y=y+1;
                
                if(killToProtectKing(enemy,returnPostion(inHand)))
                {
                    somthing_killed=true;
                }
                if(pieceAlreadyThere(PlaceCheck) )
                    if(!seeKingCheck(enemy))
                    {
                    if(somthing_killed)
                    {
                        enemy.changePostion(other,ate_to_protect);
                        somthing_killed=false;
                    }
                    blackKnight.setPoint(oldp1);
                    return false;
                    }
            }
            
            if(somthing_killed)
            {
                enemy.changePostion(other,ate_to_protect);
                somthing_killed=false;
            }
            
            if(x-2>=1&&y-1>=1)
            {
                blackKnight.setX(x-2);
                blackKnight.setY(y-1);
                PlaceCheck.x=x-2;
                PlaceCheck.y=y-1;
                
                if(killToProtectKing(enemy,returnPostion(inHand)))
                {
                    somthing_killed=true;
                }
                
                if(pieceAlreadyThere(PlaceCheck) )
                    if(!seeKingCheck(enemy))
                    {
                    if(somthing_killed)
                    {
                        enemy.changePostion(other,ate_to_protect);
                        somthing_killed=false;
                    }
                    blackKnight.setPoint(oldp1);
                    return false;
                    }
            }
            if(somthing_killed)
            {
                enemy.changePostion(other,ate_to_protect);
                somthing_killed=false;
            }
            
        }
        blackKnight.setPoint(oldp1);
        
        
        return true;
    }
    
    public boolean queenGenerateMoves(Player1 enemy)
    {
        boolean somthing_killed=false;
        
        Point Oldp1=new Point();
        
        Oldp1=blackQueen.returnPostion();
        
        Point PlaceCheck=new Point();
        
        inHand=7;
        
        if(Oldp1.x!=20)
        {
            for(int x= Oldp1.x,y= Oldp1.y;x>=1&&y<=8;x--,y++)
            {
                
                blackQueen.setX(x);
                blackQueen.setY(y);
                PlaceCheck.x=x;
                PlaceCheck.y=y;
                if(Check_The_Way_to_Postion(enemy, Oldp1))
                {
                    if(killToProtectKing(enemy,returnPostion(inHand)))
                    {
                        somthing_killed=true;
                    }
                    
                    if(pieceAlreadyThere(PlaceCheck))
                        if(!seeKingCheck(enemy))
                        {
                        blackQueen.setPoint(Oldp1);
                        
                        if(somthing_killed)
                        {
                            enemy.changePostion(other,ate_to_protect);
                            somthing_killed=false;
                        }
                        return false;
                        }
                }
                
                if(somthing_killed)
                {
                    enemy.changePostion(other,ate_to_protect);
                    somthing_killed=false;
                }
                
            }
            if(somthing_killed)
            {
                enemy.changePostion(other,ate_to_protect);
                somthing_killed=false;
            }
            for(int x=Oldp1.x,y=Oldp1.y;y>=1&&x<=8;x++,y--)
            {
                
                blackQueen.setX(x);
                blackQueen.setY(y);
                PlaceCheck.x=x;
                PlaceCheck.y=y;
                if(Check_The_Way_to_Postion(enemy, Oldp1))
                {
                    if(killToProtectKing(enemy,returnPostion(inHand)))
                    {
                        somthing_killed=true;
                    }
                    if(pieceAlreadyThere(PlaceCheck))
                        if(!seeKingCheck(enemy))
                        {
                        blackQueen.setPoint(Oldp1);
                        if(somthing_killed)
                        {
                            enemy.changePostion(other,ate_to_protect);
                            somthing_killed=false;
                        }
                        return false;
                        }
                }
                
                if(somthing_killed)
                {
                    enemy.changePostion(other,ate_to_protect);
                    somthing_killed=false;
                }
                
            }
            blackQueen.setPoint(Oldp1);
            PlaceCheck.x=Oldp1.x;
            PlaceCheck.y=Oldp1.y;
            
            if(somthing_killed)
            {
                enemy.changePostion(other,ate_to_protect);
                somthing_killed=false;
            }
            
            
            for(int i=1;i<=8;i++)
            {
                blackQueen.setX(i);
                
                PlaceCheck.x=i;
                if(Check_The_Way_to_Postion(enemy, Oldp1))
                {
                    if(killToProtectKing(enemy,returnPostion(inHand)))
                    {
                        somthing_killed=true;
                    }
                    if(pieceAlreadyThere(PlaceCheck) )
                        if(!seeKingCheck(enemy))
                        {
                        blackQueen.setX(Oldp1.x);
                        if(somthing_killed)
                        {
                            enemy.changePostion(other,ate_to_protect);
                            somthing_killed=false;
                        }
                        return false;
                        }
                }
                
                if(somthing_killed)
                {
                    enemy.changePostion(other,ate_to_protect);
                    somthing_killed=false;
                }
                
            }
            blackQueen.setX(Oldp1.x);
            PlaceCheck.x=Oldp1.x;
            
            if(somthing_killed)
            {
                enemy.changePostion(other,ate_to_protect);
                somthing_killed=false;
            }
            
            
            for(int i=1;i<=8;i++)
            {
                blackQueen.setY(i);
                PlaceCheck.y=i;
                if(Check_The_Way_to_Postion(enemy, Oldp1))
                {
                    if(killToProtectKing(enemy,returnPostion(inHand)))
                    {
                        somthing_killed=true;
                    }
                    if(pieceAlreadyThere(PlaceCheck) )
                        if(!seeKingCheck(enemy))
                        {
                        blackQueen.setY(Oldp1.y);
                        if(somthing_killed)
                        {
                            enemy.changePostion(other,ate_to_protect);
                            somthing_killed=false;
                        }
                        return false;
                        }
                }
                
                if(somthing_killed)
                {
                    enemy.changePostion(other,ate_to_protect);
                    somthing_killed=false;
                }
                
            }
            blackQueen.setY(Oldp1.y);
        }
        
        
        if(somthing_killed)
        {
            enemy.changePostion(other,ate_to_protect);
            somthing_killed=false;
        }
        
        
        return true;
        
    }
    public boolean pawnGenerateMoves(Player1 enemy, Pawn Sold)
    {
        Point Oldp1=new Point();
        Oldp1=Sold.returnPostion();
        Point PlaceCheck=new Point();
        PlaceCheck.x=Oldp1.x;
        PlaceCheck.y=Oldp1.y;
        
        
        
        if(Oldp1.x!=20)
        {
            if(Sold.Canmove(Oldp1.x,Oldp1.y+2,Color)&&Oldp1.y+2>=1)
            {
                Sold.setY(Oldp1.y+2);
                
                PlaceCheck.y=Oldp1.y+2;
                
                if(pieceAlreadyThere(PlaceCheck))
                    if(pieceAlreadyThereFromEnemy(PlaceCheck,enemy))
                    {
                    if(!seeKingCheck(enemy))
                    {
                        
                        Sold.setPoint(Oldp1);
                        return false;
                    }
                    }
                
            }
            if(Sold.Canmove(Oldp1.x,Oldp1.y+1,Color)&&Oldp1.y+1>=1)
            {
                Sold.setY(Oldp1.y+1);
                PlaceCheck.y=Oldp1.y+1;
                
                
                
                if(pieceAlreadyThere(PlaceCheck))
                    if(pieceAlreadyThereFromEnemy(PlaceCheck,enemy))
                    {
                    if(!seeKingCheck(enemy))
                    {
                        Sold.setPoint(Oldp1);
                        
                        return false;
                    }
                    }
            }
            
            if(pieceAlreadyThereFromEnemy(new Point(Oldp1.x-1,Oldp1.y+1),enemy))
                if(killToProtectKing(enemy,new Point(Oldp1.x-1,Oldp1.y+1)))
                {
                
                if(!seeKingCheck(enemy))
                {
                    enemy.changePostion(other,ate_to_protect);
                    Sold.setPoint(Oldp1);
                    
                    return false;
                }
                enemy.changePostion(other,ate_to_protect);
                }
            
            if(!pieceAlreadyThereFromEnemy(new Point(Oldp1.x+1,Oldp1.y+1),enemy))
                if(killToProtectKing(enemy,new Point(Oldp1.x+1,Oldp1.y+1)))
                {
                if(!seeKingCheck(enemy))
                {
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
    
    
    public boolean Check_The_Way_to_Postion(Player1 enemy,Point newP)
    {
        boolean flag=false;
        
        
        for(int i=1;i<=32;i++)
        {
            if(inHand!=i)// check if there is peices in the WAY
            {
                if(i<17)
                    flag=checkTheWay(newP,enemy.returnPostion(i),inHand);//Means there is somting in the Way so can't move
                else
                {
                    flag=checkTheWay(newP,returnPostion(i),inHand);
                }
                
                if(flag==true)
                {return false;}//Means  there is a Pice in the Way
            }
        }
        return true;
        
        
    }
    public boolean killToProtectKing(Player1 enemy,Point newP)
    {
        
        for(int i=17;i<=32;i++)
        {
            
            other=enemy.returnPostion(i);
            if(other.x==newP.x&&other.y==newP.y)
            {
                ate_to_protect=i;
                
                
                
                enemy.killedPiece(i);
                return true;
            }
        }
        
        return false;
    }
    
    public boolean hasMoreElements()
    {
        return false;
    }
    
    public Object nextElement()
    {
        
        return new Object();
    }
    public String tellMeAboutLastMove()
    {
        switch(inHand)
        {
            case 1:return blackCastle1.Tell_me();
            case 2:return blackCastle2.Tell_me();
            case 3:return blackKnight1.Tell_me();
            case 4:return blackKnight2.Tell_me();
            case 5:return blackBishop1.Tell_me();
            case 6:return blackBishop2.Tell_me();
            case 7:return blackQueen.Tell_me();
            case 8:return blackKing.Tell_me();
            case 9:return  blackPawns[0].Tell_me();
            case 10:return  blackPawns[1].Tell_me();
            case 11:return  blackPawns[2].Tell_me();
            case 12:return  blackPawns[3].Tell_me();
            case 13:return  blackPawns[4].Tell_me();
            case 14:return  blackPawns[5].Tell_me();
            case 15:return  blackPawns[6].Tell_me();
            case 16:return  blackPawns[7].Tell_me();
        }
        return null;
    }
    
}
