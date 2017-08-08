

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
    public Castle BC1;
    public Castle BC2;
    public Knight BH1;
    public Knight BH2;
    public Bishop BE1;
    public Bishop BE2;
    public Queen BQ;
    private King BK;
    public Pawn[] BS=new Pawn[8];
    private int choosenOne;
    private int inHand=-1;
    private boolean kingIsCheck=false;
    private Point other;
    private int sacrificed;
    
    private String Color="black";
    /** Creates a new instance of player2 */
    public Player2()
    {
        String fileSeparator = new String(System.getProperty("file.separator"));
        BC1=new Castle("src" + fileSeparator + "Icons" + fileSeparator + "Player2Icons" + fileSeparator+ "br.gif",1,1);
        BC2=new Castle("src" + fileSeparator + "Icons" + fileSeparator + "Player2Icons" + fileSeparator+ "br.gif",8,1);
        BH1=new Knight("src" + fileSeparator + "Icons" + fileSeparator + "Player2Icons" + fileSeparator+ "bn.gif",2,1);
        BH2=new Knight("src" + fileSeparator + "Icons" + fileSeparator + "Player2Icons" + fileSeparator+ "bn.gif",7,1);
        BE1=new Bishop("src" + fileSeparator + "Icons" + fileSeparator + "Player2Icons" + fileSeparator+ "bb.gif",3,1);
        BE2=new Bishop("src" + fileSeparator + "Icons" + fileSeparator + "Player2Icons" + fileSeparator+ "bb.gif",6,1);
        BQ=new Queen("src" + fileSeparator + "Icons" + fileSeparator + "Player2Icons" + fileSeparator+ "bq.gif",4,1);
        BK=new King("src" + fileSeparator + "Icons" + fileSeparator + "Player2Icons" + fileSeparator+ "bk.gif",5,1);
        int j=1;
        for(int  i=0;i<=7;i++,j++)
        {
            BS[i]=new Pawn("src" + fileSeparator + "Icons" + fileSeparator + "Player2Icons" + fileSeparator+ "bp.gif",j,2);
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
            case 1:return BC1.returnPostion();
            case 2:return BC2.returnPostion();
            case 3:return BH1.returnPostion();
            case 4:return BH2.returnPostion();
            case 5:return BE1.returnPostion();
            case 6:return BE2.returnPostion();
            case 7:return BQ.returnPostion();
            case 8:return BK.returnPostion();
            case 9:return  BS[0].returnPostion();
            case 10:return  BS[1].returnPostion();
            case 11:return  BS[2].returnPostion();
            case 12:return  BS[3].returnPostion();
            case 13:return  BS[4].returnPostion();
            case 14:return  BS[5].returnPostion();
            case 15:return  BS[6].returnPostion();
            case 16:return  BS[7].returnPostion();
            
        }
        return new Point(-1,-1);
        
    }
    public Point returnOldPostion(int i)
    {
        
        switch(i)
        {
            case 1:return BC1.returnOld();
            case 2:return BC2.returnOld();
            case 3:return BH1.returnOld();
            case 4:return BH2.returnOld();
            case 5:return BE1.returnOld();
            case 6:return BE2.returnOld();
            case 7:return BQ.returnOld();
            case 8:return BK.returnOld();
            case 9:return  BS[0].returnOld();
            case 10:return  BS[1].returnOld();
            case 11:return  BS[2].returnOld();
            case 12:return  BS[3].returnOld();
            case 13:return  BS[4].returnOld();
            case 14:return  BS[5].returnOld();
            case 15:return  BS[6].returnOld();
            case 16:return  BS[7].returnOld();
            
        }
        return new Point(-1,-1);
        
    }
    public Image returnIconImage(int i)
    {
        switch(i)
        {
            case 1:return BC1.returnPieceImage();
            case 2:return BC2.returnPieceImage();
            case 3:return BH1.returnPieceImage();
            case 4:return BH2.returnPieceImage();
            case 5:return BE1.returnPieceImage();
            case 6:return BE2.returnPieceImage();
            case 7:return BQ.returnPieceImage();
            case 8:return BK.returnPieceImage();
            case 9:return  BS[0].returnPieceImage();
            case 10:return  BS[1].returnPieceImage();
            case 11:return  BS[2].returnPieceImage();
            case 12:return  BS[3].returnPieceImage();
            case 13:return  BS[4].returnPieceImage();
            case 14:return  BS[5].returnPieceImage();
            case 15:return  BS[6].returnPieceImage();
            case 16:return  BS[7].returnPieceImage();
            
        }
        return  null;
        
    }
    public void changePostion(Point newPoint,int i)
    {
        switch(i)
        {
            case 1:BC1.setPoint(newPoint);break;
            case 2: BC2.setPoint(newPoint);break;
            case 3: BH1.setPoint(newPoint);break;
            case 4: BH2.setPoint(newPoint);break;
            case 5: BE1.setPoint(newPoint);break;
            case 6: BE2.setPoint(newPoint);break;
            case 7: BQ.setPoint(newPoint);break;
            case 8: BK.setPoint(newPoint);break;
            case 9:  BS[0].setPoint(newPoint);break;
            case 10:  BS[1].setPoint(newPoint);break;
            case 11:  BS[2].setPoint(newPoint);break;
            case 12:  BS[3].setPoint(newPoint);break;
            case 13:  BS[4].setPoint(newPoint);break;
            case 14:  BS[5].setPoint(newPoint);break;
            case 15:  BS[6].setPoint(newPoint);break;
            case 16:  BS[7].setPoint(newPoint);break;
            
        }
        
    }
    public void changePostionToOld(Point newPoint,int i)
    {
        switch(i)
        {
            case 1:BC1.toOld(newPoint);break;
            case 2: BC2.toOld(newPoint);break;
            case 3: BH1.toOld(newPoint);break;
            case 4: BH2.toOld(newPoint);break;
            case 5: BE1.toOld(newPoint);break;
            case 6: BE2.toOld(newPoint);break;
            case 7: BQ.toOld(newPoint);break;
            case 8: BK.toOld(newPoint);break;
            case 9:  BS[0].toOld(newPoint);break;
            case 10:  BS[1].toOld(newPoint);break;
            case 11:  BS[2].toOld(newPoint);break;
            case 12:  BS[3].toOld(newPoint);break;
            case 13:  BS[4].toOld(newPoint);break;
            case 14:  BS[5].toOld(newPoint);break;
            case 15:  BS[6].toOld(newPoint);break;
            case 16:  BS[7].toOld(newPoint);break;
            
        }
        
    }
    public void changePixel(int newPixelX,int newPixelY)
    {
        switch(choosenOne)
        {
            case 1:BC1.setPixels(newPixelX,newPixelY);break;
            case 2: BC2.setPixels(newPixelX,newPixelY);break;
            case 3: BH1.setPixels(newPixelX,newPixelY);break;
            case 4: BH2.setPixels(newPixelX,newPixelY);break;
            case 5: BE1.setPixels(newPixelX,newPixelY);break;
            case 6: BE2.setPixels(newPixelX,newPixelY);break;
            case 7: BQ.setPixels(newPixelX,newPixelY);break;
            case 8: BK.setPixels(newPixelX,newPixelY);break;
            case 9:  BS[0].setPixels(newPixelX,newPixelY);break;
            case 10:  BS[1].setPixels(newPixelX,newPixelY);break;
            case 11:  BS[2].setPixels(newPixelX,newPixelY);break;
            case 12:  BS[3].setPixels(newPixelX,newPixelY);break;
            case 13:  BS[4].setPixels(newPixelX,newPixelY);break;
            case 14:  BS[5].setPixels(newPixelX,newPixelY);break;
            case 15:  BS[6].setPixels(newPixelX,newPixelY);break;
            case 16:  BS[7].setPixels(newPixelX,newPixelY);break;
            
        }
    }
    public Point getPixelPoint(int i)
    {
        choosenOne=i;
        switch(choosenOne)
        {
            case 1:return  BC1.getpixelPoint();
            case 2:return   BC2.getpixelPoint();
            case 3:return   BH1.getpixelPoint();
            case 4:return   BH2.getpixelPoint();
            case 5:return   BE1.getPixelPoint();
            case 6: return  BE2.getPixelPoint();
            case 7:return   BQ.getpixelPoint();
            case 8:return   BK.getpixelPoint();
            case 9:return    BS[0].getpixelPoint();
            case 10:return    BS[1].getpixelPoint();
            case 11: return   BS[2].getpixelPoint();
            case 12:return    BS[3].getpixelPoint();
            case 13:return    BS[4].getpixelPoint();
            case 14:return    BS[5].getpixelPoint();
            case 15:return    BS[6].getpixelPoint();
            case 16:return    BS[7].getpixelPoint();
            
        }
        return null;
    }
    public void changePixel(int newPixelX,int newPixelY,int i)
    {
        choosenOne=i;
        switch(choosenOne)
        {
            case 1:BC1.setPixels(newPixelX,newPixelY);break;
            case 2:BC2.setPixels(newPixelX,newPixelY);break;
            case 3:BH1.setPixels(newPixelX,newPixelY);break;
            case 4:BH2.setPixels(newPixelX,newPixelY);break;
            case 5:BE1.setPixels(newPixelX,newPixelY);break;
            case 6:BE2.setPixels(newPixelX,newPixelY);break;
            case 7:BQ.setPixels(newPixelX,newPixelY);break;
            case 8:BK.setPixels(newPixelX,newPixelY);break;
            case 9:BS[0].setPixels(newPixelX,newPixelY);break;
            case 10:BS[1].setPixels(newPixelX,newPixelY);break;
            case 11:BS[2].setPixels(newPixelX,newPixelY);break;
            case 12:BS[3].setPixels(newPixelX,newPixelY);break;
            case 13:BS[4].setPixels(newPixelX,newPixelY);break;
            case 14:BS[5].setPixels(newPixelX,newPixelY);break;
            case 15:BS[6].setPixels(newPixelX,newPixelY);break;
            case 16:BS[7].setPixels(newPixelX,newPixelY);break;
            
        }
    }
    public boolean killedPiece(int i)
    {
        Point out=new Point(20,20);
        switch(i)
        {
            case 1:BC1.setPoint(out);return true;
            case 2:BC2.setPoint(out);return true;
            case 3:BH1.setPoint(out);return true;
            case 4:BH2.setPoint(out);return true;
            case 5:BE1.setPoint(out);return true;
            case 6:BE2.setPoint(out);return true;
            case 7:BQ.setPoint(out);return true;
            case 8 :return true;// the King "Can't be moved out"
            case 9:BS[0].setPoint(out);return true;
            case 10:BS[1].setPoint(out);return true;
            case 11:BS[2].setPoint(out);return true;
            case 12:BS[3].setPoint(out);return true;
            case 13:BS[4].setPoint(out);return true;
            case 14:BS[5].setPoint(out);return true;
            case 15:BS[6].setPoint(out);return true;
            case 16:BS[7].setPoint(out);return true;
        }
        return false;
    }
    
    public boolean checkthemove(Point newPoint,int i)
    {
        choosenOne=i;
        switch(choosenOne)
        {
            
            case 1:return BC1.Canmove(newPoint.x,newPoint.y);
            case 2:return   BC2.Canmove(newPoint.x,newPoint.y);
            case 3:return   BH1.Canmove(newPoint.x,newPoint.y);
            case 4:return   BH2.Canmove(newPoint.x,newPoint.y);
            case 5:return   BE1.Canmove(newPoint.x,newPoint.y);
            case 6: return  BE2.Canmove(newPoint.x,newPoint.y);
            case 7:return   BQ.Canmove(newPoint.x,newPoint.y);
            case 8:return   BK.Canmove(newPoint.x,newPoint.y);
            case 9:return    BS[0].Canmove(newPoint.x,newPoint.y,Color);
            case 10:return    BS[1].Canmove(newPoint.x,newPoint.y,Color);
            case 11: return   BS[2].Canmove(newPoint.x,newPoint.y,Color);
            case 12:return    BS[3].Canmove(newPoint.x,newPoint.y,Color);
            case 13:return    BS[4].Canmove(newPoint.x,newPoint.y,Color);
            case 14:return    BS[5].Canmove(newPoint.x,newPoint.y,Color);
            case 15:return    BS[6].Canmove(newPoint.x,newPoint.y,Color);
            case 16:return    BS[7].Canmove(newPoint.x,newPoint.y,Color);
        }
        return false;
    }
    public boolean setSeenToPawn(int i,Point point)
    {
        
        switch(i)
        {
            case 9: return     BS[0].setSeenbychecking(point,"black");
            case 10: return    BS[1].setSeenbychecking(point,"black");
            case 11: return     BS[2].setSeenbychecking(point,"black");
            case 12: return     BS[3].setSeenbychecking(point,"black");
            case 13: return     BS[4].setSeenbychecking(point,"black");
            case 14: return     BS[5].setSeenbychecking(point,"black");
            case 15: return    BS[6].setSeenbychecking(point,"black");
            case 16: return     BS[7].setSeenbychecking(point,"black");
        }
        return false;
        
    }
    public boolean returnPawnSeen(int i)
    {
        switch(i)
        {
            
            case 9: return     BS[0].returnMyseen();
            case 10: return    BS[1].returnMyseen();
            case 11: return     BS[2].returnMyseen();
            case 12: return     BS[3].returnMyseen();
            case 13: return     BS[4].returnMyseen();
            case 14: return     BS[5].returnMyseen();
            case 15: return    BS[6].returnMyseen();
            case 16: return     BS[7].returnMyseen();
        }
        return false;
    }
    public boolean checktheWay(Point newP,Point postionFromOthers,int i)
    {
        switch(i)
        {
            case 1:return BC1.PieceInMYway(newP.x,newP.y,postionFromOthers);
            case 2:return   BC2.PieceInMYway(newP.x,newP.y,postionFromOthers);
            case 5:return   BE1.PieceInMYway(newP.x,newP.y,postionFromOthers);
            case 6: return  BE2.PieceInMYway(newP.x,newP.y,postionFromOthers);
            case 7:return   BQ.PieceInMYway(newP.x,newP.y,postionFromOthers);
            case 9:return    BS[0].PieceInMYway(newP.x,newP.y,postionFromOthers,Color);
            case 10:return   BS[1].PieceInMYway(newP.x,newP.y,postionFromOthers,Color);
            case 11: return   BS[2].PieceInMYway(newP.x,newP.y,postionFromOthers,Color);
            case 12:return    BS[3].PieceInMYway(newP.x,newP.y,postionFromOthers,Color);
            case 13:return    BS[4].PieceInMYway(newP.x,newP.y,postionFromOthers,Color);
            case 14:return    BS[5].PieceInMYway(newP.x,newP.y,postionFromOthers,Color);
            case 15:return   BS[6].PieceInMYway(newP.x,newP.y,postionFromOthers,Color);
            case 16:
            {  return   BS[7].PieceInMYway(newP.x,newP.y,postionFromOthers,Color);}
            
            
        }
        return false;
    }
    public boolean checKing(Point p1,Point p2,int i)
    {
        switch(i)
        {
            
            case 1:return  BC1.checkKing(p1.x,p1.y,p2);
            case 2:return BC2.checkKing(p1.x,p1.y,p2);
            case 3:return  BH1.Canmove(p1.x,p1.y);
            case 4:return  BH2.Canmove(p1.x,p1.y);
            case 5:return   BE1.checkKing(p1.x,p1.y,p2);
            case 6:return   BE2.checkKing(p1.x,p1.y,p2);
            case 7:return   BQ.checkKing(p1.x,p1.y,p2);
            
            case 9:return    BS[0].Canmove(p1.x,p1.y,Color);
            case 10:return   BS[1].Canmove(p1.x,p1.y,Color);
            case 11:return   BS[2].Canmove(p1.x,p1.y,Color);
            case 12:return    BS[3].Canmove(p1.x,p1.y,Color);
            case 13:return    BS[4].Canmove(p1.x,p1.y,Color);
            case 14: return  BS[5].Canmove(p1.x,p1.y,Color);
            case 15:return   BS[6].Canmove(p1.x,p1.y,Color);
            case 16:return   BS[7].Canmove(p1.x,p1.y,Color);
        }
        return false;
    }
    public int returnChosen()
    {
        return choosenOne;
    }
    public void SetInhand(int i )
    {
        inHand=i;
    }
    public int GetInhand()
    {
        return inHand;
    }
    public boolean CanMove(int x,int y)
    {
        return true;
    }
    public void checkKing(boolean newkingcheck)
    {
        kingIsCheck=newkingcheck;
    }
    public boolean returncheckKing()
    {
        return kingIsCheck;
    }
    public boolean  see_king_Check(Player1 White)
    {
        
        Point My_King_Postion=BK.returnPostion();
        boolean flag=false;
        
        
        //////////    Start Checking the King ////////////
        for(int i=17;i<33;i++)
        {
            if(i<25)
            {
                if(White.checkTheMove(My_King_Postion,i))
                {
                    
                    flag=true;
                    for(int j=1;j<33;j++)
                    {
                        
                        if(j<17)
                        {
                            
                            if(White.checkTheWay(My_King_Postion,returnPostion(j),i))
                            {
                                //Means there is somting in the Way so can't move'
                                
                                flag=false;
                                
                                
                            }
                        }
                        
                        else
                        {
                            
                            if(j!=8)
                                if(White.checkTheWay(My_King_Postion,White.returnPostion(j),i))
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
                if(White.setSeenToPawn(i,My_King_Postion))
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
    public boolean Check_Mate_GameOver(Player1 Enemy)
    {
        
        
        
        
        if(! KingGenerate_moves(Enemy))
        {
            
            inHand=-1;
            System.out.println("I Killed King  2");
            
            return false;
        }
        else if(!CastleGenerate_moves(Enemy,BC1))
        {
            
            inHand=-1;
            System.out.println("I Killed Castle 2");
            
            return false;
        }
        else if(!CastleGenerate_moves(Enemy,BC2))
        {
            
            inHand=-1;
            System.out.println("I Killed Castle 2");
            return false;
        }
        else if(!ElephentGenerate_moves(Enemy,BE1))
        {
            
            inHand=-1;
            System.out.println("I Killed ELephent2");
            return false;
        }
        else if(!ElephentGenerate_moves(Enemy,BE2))
        {
            
            inHand=-1;
            System.out.println("I Killed ELephent2");
            
            return false;
        }
        else if(!HosreGenerate_moves(Enemy,BH1))
        {
            
            inHand=-1;
            System.out.println("I Killed Horse 2");
            return false;
        }
        else if(!HosreGenerate_moves(Enemy,BH2))
        {
            
            inHand=-1;
            System.out.println("I Killed Horse 2");
            return false;
        }
        
        else if(!queenGeneratesMoves(Enemy))
        {
            
            inHand=-1;
            System.out.println("I Killed Queen 2");
            return false;
        }
        
        for(int i=0;i<=7;i++)
        {
            inHand=9+i;
            if(!pawnGeneratesMoves(Enemy,BS[i]))
            {
                
                inHand=-1;
                
                System.out.println("I Killed Solider 2");
                
                return false;
            }
        }
        
        inHand=-1;
        return true;
        
        
        
        
    }
    
    
    
    public boolean positionOccupied(Point newP)
    {
        Point samePostion;
        for(int i=1;i<=16;i++)
        {
            if(GetInhand()!=i)// There is no need to check the inHand pice
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
    public boolean occupiedByEnemy(Point newP,Player1 enemy)
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
    public int Get_Pice_already_there_from_enemy(Point newP,Player1 enemy)
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
    public boolean KingGenerate_moves(Player1 enemy)
    {
        boolean somthing_killed=false;
        Point Oldp=new Point();
        
        Point PlaceCheck=new Point();
        inHand=8;
        
        int x=BK.returnX();
        int y=BK.returnY();
        
        Oldp.x=x;
        Oldp.y=y;
        
        if(x+1<=8)
        {
            
            
            BK.setX(x+1);
            BK.setY(y);
            PlaceCheck.x=x+1;
            PlaceCheck.y=y;
            
            
            if(protectKing(enemy,returnPostion(inHand)))
            {
                somthing_killed=true;
            }
            if(positionOccupied(PlaceCheck))
                if(!see_king_Check(enemy))
                {
                
                
                BK.setPoint(Oldp);
                if(somthing_killed)
                {
                    enemy.changePostion(other,sacrificed);
                    somthing_killed=false;
                }
                return false;
                }
            
        }
        BK.setPoint(Oldp);
        if(somthing_killed)
        {
            enemy.changePostion(other,sacrificed);
            somthing_killed=false;
        }
        if(y+1<=8)
        {
            
            
            BK.setX(x);
            BK.setY(y+1);
            PlaceCheck.x=x;
            PlaceCheck.y=y+1;
            if(protectKing(enemy,returnPostion(inHand)))
            {
                somthing_killed=true;
            }
            if(positionOccupied( PlaceCheck))
                if(!see_king_Check(enemy))
                {
                
                BK.setPoint(Oldp);
                if(somthing_killed)
                {
                    enemy.changePostion(other,sacrificed);
                    somthing_killed=false;
                }
                return false;
                
                }
            
        }
        BK.setPoint(Oldp);
        if(somthing_killed)
        {
            enemy.changePostion(other,sacrificed);
            somthing_killed=false;
        }
        
        if(y-1>0)
        {
            
            BK.setX(x);
            BK.setY(y-1);
            
            PlaceCheck.x=x;
            PlaceCheck.y=y-1;
            
            if(protectKing(enemy,returnPostion(inHand)))
            {
                somthing_killed=true;
            }
            
            if(positionOccupied( PlaceCheck))
                if(!see_king_Check(enemy))
                {
                
                BK.setPoint(Oldp);
                if(somthing_killed)
                {
                    enemy.changePostion(other,sacrificed);
                    somthing_killed=false;
                }
                
                return false;
                }
            
        }
        BK.setPoint(Oldp);
        if(somthing_killed)
        {
            enemy.changePostion(other,sacrificed);
            somthing_killed=false;
        }
        if(x-1>0)
        {
            
            BK.setX(x-1);
            BK.setY(y);
            
            PlaceCheck.x=x-1;
            PlaceCheck.y=y;
            if(protectKing(enemy,returnPostion(inHand)))
            {
                somthing_killed=true;
            }
            if(positionOccupied( PlaceCheck))
                if(!see_king_Check(enemy))
                {
                if(somthing_killed)
                {
                    enemy.changePostion(other,sacrificed);
                    somthing_killed=false;
                }
                BK.setPoint(Oldp);
                return false;
                }
            
        }
        BK.setPoint(Oldp);
        if(somthing_killed)
        {
            enemy.changePostion(other,sacrificed);
            somthing_killed=false;
        }
        if(y-1>0&&x-1>0)
        {
            
            BK.setX(x-1);
            BK.setY(y-1);
            
            PlaceCheck.x=x-1;
            PlaceCheck.y=y-1;
            
            if(protectKing(enemy,returnPostion(inHand)))
            {
                somthing_killed=true;
            }
            if(positionOccupied( PlaceCheck))
                if(!see_king_Check(enemy))
                {
                
                if(somthing_killed)
                {
                    enemy.changePostion(other,sacrificed);
                    somthing_killed=false;
                }
                BK.setPoint(Oldp);
                return false;
                }
            
        }
        BK.setPoint(Oldp);
        if(somthing_killed)
        {
            enemy.changePostion(other,sacrificed);
            somthing_killed=false;
        }
        if(y+1<=8&&x+1<=8)
        {
            
            BK.setX(x+1);
            BK.setY(y+1);
            
            PlaceCheck.x=x+1;
            PlaceCheck.y=y+1;
            if(protectKing(enemy,returnPostion(inHand)))
            {
                somthing_killed=true;
            }
            if(positionOccupied( PlaceCheck))
                if(!see_king_Check(enemy))
                {
                
                if(somthing_killed)
                {
                    enemy.changePostion(other,sacrificed);
                    somthing_killed=false;
                }
                BK.setPoint(Oldp);
                return false;
                }
            
        }
        BK.setPoint(Oldp);
        if(somthing_killed)
        {
            enemy.changePostion(other,sacrificed);
            somthing_killed=false;
        }
        if(y-1>0&&x+1<=8)
        {
            
            BK.setX(x+1);
            BK.setY(y-1);
            
            PlaceCheck.x=x+1;
            PlaceCheck.y=y-1;
            if(protectKing(enemy,returnPostion(inHand)))
            {
                somthing_killed=true;
            }
            if(positionOccupied( PlaceCheck))
                if(!see_king_Check(enemy))
                {
                if(somthing_killed)
                {
                    enemy.changePostion(other,sacrificed);
                    somthing_killed=false;
                }
                BK.setPoint(Oldp);
                return false;
                }
            
        }
        BK.setPoint(Oldp);
        if(somthing_killed)
        {
            enemy.changePostion(other,sacrificed);
            somthing_killed=false;
        }
        if(y+1<=8&&x-1>0)
        {
            
            
            BK.setX(x-1);
            BK.setY(y+1);
            
            PlaceCheck.x=x-1;
            PlaceCheck.y=y+1;
            if(protectKing(enemy,returnPostion(inHand)))
            {
                somthing_killed=true;
            }
            if(positionOccupied( PlaceCheck))
                if(!see_king_Check(enemy))
                {
                if(somthing_killed)
                {
                    enemy.changePostion(other,sacrificed);
                    somthing_killed=false;
                }
                BK.setPoint(Oldp);
                return false;
                }
            
        }
        
        if(somthing_killed)
        {
            enemy.changePostion(other,sacrificed);
            somthing_killed=false;
        }
        
        
        BK.setPoint(Oldp);
        return true;
        
        
        
        
    }
    
    public boolean CastleGenerate_moves(Player1 enemy,Castle BC)
    {
        boolean somthing_killed=false;
        Point Oldp1=new Point();
        
        Point PlaceCheck=new Point();
        int x1=BC.returnX();
        int y1=BC.returnY();
        
        if(BC==BC1)
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
                
                BC.setX(i);
                PlaceCheck.x=i;
                
                
                if(checkPath(enemy,Oldp1))
                {
                    if(protectKing(enemy,returnPostion(inHand)))
                    {
                        somthing_killed=true;
                    }
                    
                    if(positionOccupied(PlaceCheck))
                        if(!see_king_Check(enemy))
                        {
                        BC.setX(Oldp1.x);
                        BC.setY(Oldp1.y);
                        
                        if(somthing_killed)
                        {
                            enemy.changePostion(other,sacrificed);
                            somthing_killed=false;
                        }
                        return false;
                        }
                }
                
                if(somthing_killed)
                {
                    enemy.changePostion(other,sacrificed);
                    somthing_killed=false;
                }
                
            }
            BC.setX(Oldp1.x);
            PlaceCheck.x=Oldp1.x;
            
            if(somthing_killed)
            {
                enemy.changePostion(other,sacrificed);
                somthing_killed=false;
            }
            for(int i=1;i<=8;i++)
            {
                BC.setY(i);
                PlaceCheck.y=i;
                if(checkPath(enemy,Oldp1))
                {
                    if(protectKing(enemy,returnPostion(inHand)))
                    {
                        somthing_killed=true;
                    }
                    if(positionOccupied(PlaceCheck) )
                        if(!see_king_Check(enemy))
                        {
                        BC.setX(Oldp1.x);
                        BC.setY(Oldp1.y);
                        
                        if(somthing_killed)
                        {
                            enemy.changePostion(other,sacrificed);
                            somthing_killed=false;
                        }
                        return false;
                        }
                }
                
                if(somthing_killed)
                {
                    enemy.changePostion(other,sacrificed);
                    somthing_killed=false;
                }
                
            }
            BC.setY(Oldp1.y);
        }
        //////////////////////////////////////////
        ///////////////////////////
        
        if(somthing_killed)
        {
            enemy.changePostion(other,sacrificed);
            somthing_killed=false;
        }
        BC.setX(Oldp1.x);
        BC.setY(Oldp1.y);
        return true;
    }
    
    public  boolean ElephentGenerate_moves(Player1 enemy,Bishop BE)
    {
        boolean somthing_killed=false;
        Point Oldp1=new Point();
        Point PlaceCheck=new Point();
        
        Oldp1=BE.returnPostion();
        
        if(BE==BE1)
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
                
                BE.setX(x);
                BE.setY(y);
                PlaceCheck.x=x;
                PlaceCheck.y=y;
                if(checkPath(enemy, Oldp1))
                {
                    if(protectKing(enemy,returnPostion(inHand)))
                    {
                        somthing_killed=true;
                    }
                    if(positionOccupied(PlaceCheck))
                        if(!see_king_Check(enemy))
                        {
                        
                        if(somthing_killed)
                        {
                            enemy.changePostion(other,sacrificed);
                            somthing_killed=false;
                        }
                        BE.setPoint(Oldp1);
                        return false;
                        }
                }
                
                if(somthing_killed)
                {
                    enemy.changePostion(other,sacrificed);
                    somthing_killed=false;
                }
                
            }
            if(somthing_killed)
            {
                enemy.changePostion(other,sacrificed);
                somthing_killed=false;
            }
            for(int x=Oldp1.x,y=Oldp1.y;y>=1&&x<=8;x++,y--)
            {
                
                BE.setX(x);
                BE.setY(y);
                PlaceCheck.x=x;
                PlaceCheck.y=y;
                if(checkPath(enemy, Oldp1))
                {
                    if(protectKing(enemy,returnPostion(inHand)))
                    {
                        somthing_killed=true;
                    }
                    if(positionOccupied(PlaceCheck))
                        if(!see_king_Check(enemy))
                        {
                        if(somthing_killed)
                        {
                            enemy.changePostion(other,sacrificed);
                            somthing_killed=false;
                        }
                        BE.setPoint(Oldp1);
                        return false;
                        }
                }
                
                if(somthing_killed)
                {
                    enemy.changePostion(other,sacrificed);
                    somthing_killed=false;
                }
                
            }
            BE.setPoint(Oldp1);
            
        }
        
        BE.setPoint(Oldp1);
        
        
        if(somthing_killed)
        {
            enemy.changePostion(other,sacrificed);
            somthing_killed=false;
        }
        
        return true;
    }
    
    public boolean HosreGenerate_moves(Player1 enemy,Knight BH)
    {
        Point oldp1=new Point();
        boolean somthing_killed=false;
        oldp1=BH.returnPostion();
        
        Point PlaceCheck=new Point();
        
        if(BH==BH1)
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
                BH.setX(x+1);
                BH.setY(y+2);
                PlaceCheck.x=x+1;
                PlaceCheck.y=y+2;
                
                if(protectKing(enemy,returnPostion(inHand)))
                {
                    somthing_killed=true;
                }
                
                if(positionOccupied(PlaceCheck) )
                    if(!see_king_Check(enemy))
                    {
                    BH.setPoint(oldp1);
                    
                    if(somthing_killed)
                    {
                        enemy.changePostion(other,sacrificed);
                        somthing_killed=false;
                    }
                    
                    return false;
                    }
            }
            if(somthing_killed)
            {
                enemy.changePostion(other,sacrificed);
                somthing_killed=false;
            }
            
            if(x+1<=8&&y-2>=1)
            {
                BH.setX(x+1);
                BH.setY(y-2);
                PlaceCheck.x=x+1;
                PlaceCheck.y=y-2;
                if(protectKing(enemy,returnPostion(inHand)))
                {
                    somthing_killed=true;
                }
                
                if(positionOccupied(PlaceCheck) )
                    if(!see_king_Check(enemy))
                    {
                    if(somthing_killed)
                    {
                        enemy.changePostion(other,sacrificed);
                        somthing_killed=false;
                    }
                    BH.setPoint(oldp1);
                    return false;
                    }
            }
            if(somthing_killed)
            {
                enemy.changePostion(other,sacrificed);
                somthing_killed=false;
            }
            
            if(x+2<=8&&y+1<=8)
            {
                BH.setX(x+2);
                BH.setY(y+1);
                PlaceCheck.x=x+2;
                PlaceCheck.y=y+1;
                
                if(protectKing(enemy,returnPostion(inHand)))
                {
                    somthing_killed=true;
                }
                
                if(positionOccupied(PlaceCheck) )
                    if(!see_king_Check(enemy))
                    {
                    if(somthing_killed)
                    {
                        enemy.changePostion(other,sacrificed);
                        somthing_killed=false;
                    }
                    BH.setPoint(oldp1);
                    return false;
                    }
            }
            
            if(somthing_killed)
            {
                enemy.changePostion(other,sacrificed);
                somthing_killed=false;
            }
            if(x+2<=8&&y-1>=1)
            {
                BH.setX(x+2);
                BH.setY(y-1);
                PlaceCheck.x=x+2;
                PlaceCheck.y=y-1;
                if(protectKing(enemy,returnPostion(inHand)))
                {
                    somthing_killed=true;
                }
                
                if(positionOccupied(PlaceCheck) )
                    if(!see_king_Check(enemy))
                    {
                    if(somthing_killed)
                    {
                        enemy.changePostion(other,sacrificed);
                        somthing_killed=false;
                    }
                    BH.setPoint(oldp1);
                    return false;
                    }
            }
            if(somthing_killed)
            {
                enemy.changePostion(other,sacrificed);
                somthing_killed=false;
            }
            
            if(x-1>=1&&y+2<=8)
            {
                BH.setX(x-1);
                BH.setY(y+2);
                PlaceCheck.x=x-1;
                PlaceCheck.y=y+2;
                
                if(protectKing(enemy,returnPostion(inHand)))
                {
                    somthing_killed=true;
                }
                
                if(positionOccupied(PlaceCheck) )
                    if(!see_king_Check(enemy))
                    {
                    if(somthing_killed)
                    {
                        enemy.changePostion(other,sacrificed);
                        somthing_killed=false;
                    }
                    BH.setPoint(oldp1);
                    return false;
                    }
            }
            if(somthing_killed)
            {
                enemy.changePostion(other,sacrificed);
                somthing_killed=false;
            }
            
            if(x-1>=1&&y-2>=1)
            {
                BH.setX(x-1);
                BH.setY(y-2);
                PlaceCheck.x=x-1;
                PlaceCheck.y=y-2;
                if(protectKing(enemy,returnPostion(inHand)))
                {
                    somthing_killed=true;
                }
                
                if(positionOccupied(PlaceCheck) )
                    if(!see_king_Check(enemy))
                    {
                    if(somthing_killed)
                    {
                        enemy.changePostion(other,sacrificed);
                        somthing_killed=false;
                    }
                    BH.setPoint(oldp1);
                    return false;
                    }
            }
            if(somthing_killed)
            {
                enemy.changePostion(other,sacrificed);
                somthing_killed=false;
            }
            
            if(x-2>=1&&y+1<=8)
            {
                BH.setX(x-2);
                BH.setY(y+1);
                PlaceCheck.x=x-2;
                PlaceCheck.y=y+1;
                
                if(protectKing(enemy,returnPostion(inHand)))
                {
                    somthing_killed=true;
                }
                if(positionOccupied(PlaceCheck) )
                    if(!see_king_Check(enemy))
                    {
                    if(somthing_killed)
                    {
                        enemy.changePostion(other,sacrificed);
                        somthing_killed=false;
                    }
                    BH.setPoint(oldp1);
                    return false;
                    }
            }
            
            if(somthing_killed)
            {
                enemy.changePostion(other,sacrificed);
                somthing_killed=false;
            }
            
            if(x-2>=1&&y-1>=1)
            {
                BH.setX(x-2);
                BH.setY(y-1);
                PlaceCheck.x=x-2;
                PlaceCheck.y=y-1;
                
                if(protectKing(enemy,returnPostion(inHand)))
                {
                    somthing_killed=true;
                }
                
                if(positionOccupied(PlaceCheck) )
                    if(!see_king_Check(enemy))
                    {
                    if(somthing_killed)
                    {
                        enemy.changePostion(other,sacrificed);
                        somthing_killed=false;
                    }
                    BH.setPoint(oldp1);
                    return false;
                    }
            }
            if(somthing_killed)
            {
                enemy.changePostion(other,sacrificed);
                somthing_killed=false;
            }
            
        }
        BH.setPoint(oldp1);
        
        
        return true;
    }
    
    public boolean queenGeneratesMoves(Player1 enemy)
    {
        boolean somthing_killed=false;
        
        Point Oldp1=new Point();
        
        Oldp1=BQ.returnPostion();
        
        Point PlaceCheck=new Point();
        
        inHand=7;
        
        if(Oldp1.x!=20)
        {
            for(int x= Oldp1.x,y= Oldp1.y;x>=1&&y<=8;x--,y++)
            {
                
                BQ.setX(x);
                BQ.setY(y);
                PlaceCheck.x=x;
                PlaceCheck.y=y;
                if(checkPath(enemy, Oldp1))
                {
                    if(protectKing(enemy,returnPostion(inHand)))
                    {
                        somthing_killed=true;
                    }
                    
                    if(positionOccupied(PlaceCheck))
                        if(!see_king_Check(enemy))
                        {
                        BQ.setPoint(Oldp1);
                        
                        if(somthing_killed)
                        {
                            enemy.changePostion(other,sacrificed);
                            somthing_killed=false;
                        }
                        return false;
                        }
                }
                
                if(somthing_killed)
                {
                    enemy.changePostion(other,sacrificed);
                    somthing_killed=false;
                }
                
            }
            if(somthing_killed)
            {
                enemy.changePostion(other,sacrificed);
                somthing_killed=false;
            }
            for(int x=Oldp1.x,y=Oldp1.y;y>=1&&x<=8;x++,y--)
            {
                
                BQ.setX(x);
                BQ.setY(y);
                PlaceCheck.x=x;
                PlaceCheck.y=y;
                if(checkPath(enemy, Oldp1))
                {
                    if(protectKing(enemy,returnPostion(inHand)))
                    {
                        somthing_killed=true;
                    }
                    if(positionOccupied(PlaceCheck))
                        if(!see_king_Check(enemy))
                        {
                        BQ.setPoint(Oldp1);
                        if(somthing_killed)
                        {
                            enemy.changePostion(other,sacrificed);
                            somthing_killed=false;
                        }
                        return false;
                        }
                }
                
                if(somthing_killed)
                {
                    enemy.changePostion(other,sacrificed);
                    somthing_killed=false;
                }
                
            }
            BQ.setPoint(Oldp1);
            PlaceCheck.x=Oldp1.x;
            PlaceCheck.y=Oldp1.y;
            
            if(somthing_killed)
            {
                enemy.changePostion(other,sacrificed);
                somthing_killed=false;
            }
            
            
            for(int i=1;i<=8;i++)
            {
                BQ.setX(i);
                
                PlaceCheck.x=i;
                if(checkPath(enemy, Oldp1))
                {
                    if(protectKing(enemy,returnPostion(inHand)))
                    {
                        somthing_killed=true;
                    }
                    if(positionOccupied(PlaceCheck) )
                        if(!see_king_Check(enemy))
                        {
                        BQ.setX(Oldp1.x);
                        if(somthing_killed)
                        {
                            enemy.changePostion(other,sacrificed);
                            somthing_killed=false;
                        }
                        return false;
                        }
                }
                
                if(somthing_killed)
                {
                    enemy.changePostion(other,sacrificed);
                    somthing_killed=false;
                }
                
            }
            BQ.setX(Oldp1.x);
            PlaceCheck.x=Oldp1.x;
            
            if(somthing_killed)
            {
                enemy.changePostion(other,sacrificed);
                somthing_killed=false;
            }
            
            
            for(int i=1;i<=8;i++)
            {
                BQ.setY(i);
                PlaceCheck.y=i;
                if(checkPath(enemy, Oldp1))
                {
                    if(protectKing(enemy,returnPostion(inHand)))
                    {
                        somthing_killed=true;
                    }
                    if(positionOccupied(PlaceCheck) )
                        if(!see_king_Check(enemy))
                        {
                        BQ.setY(Oldp1.y);
                        if(somthing_killed)
                        {
                            enemy.changePostion(other,sacrificed);
                            somthing_killed=false;
                        }
                        return false;
                        }
                }
                
                if(somthing_killed)
                {
                    enemy.changePostion(other,sacrificed);
                    somthing_killed=false;
                }
                
            }
            BQ.setY(Oldp1.y);
        }
        
        
        if(somthing_killed)
        {
            enemy.changePostion(other,sacrificed);
            somthing_killed=false;
        }
        
        
        return true;
        
    }
    public boolean pawnGeneratesMoves(Player1 enemy, Pawn pawn)
    {
        Point oldp1=new Point();
        oldp1=pawn.returnPostion();
        Point placeCheck=new Point();
        placeCheck.x=oldp1.x;
        placeCheck.y=oldp1.y;
        
        
        
        if(oldp1.x!=20)
        {
            if(pawn.Canmove(oldp1.x,oldp1.y+2,Color)&&oldp1.y+2>=1)
            {
                pawn.setY(oldp1.y+2);
                
                placeCheck.y=oldp1.y+2;
                
                if(positionOccupied(placeCheck))
                    if(occupiedByEnemy(placeCheck,enemy))
                    {
                    if(!see_king_Check(enemy))
                    {
                        
                        pawn.setPoint(oldp1);
                        return false;
                    }
                    }
                
            }
            if(pawn.Canmove(oldp1.x,oldp1.y+1,Color)&&oldp1.y+1>=1)
            {
                pawn.setY(oldp1.y+1);
                placeCheck.y=oldp1.y+1;
                
                
                
                if(positionOccupied(placeCheck))
                    if(occupiedByEnemy(placeCheck,enemy))
                    {
                    if(!see_king_Check(enemy))
                    {
                        pawn.setPoint(oldp1);
                        
                        return false;
                    }
                    }
            }
            
            if(occupiedByEnemy(new Point(oldp1.x-1,oldp1.y+1),enemy))
                if(protectKing(enemy,new Point(oldp1.x-1,oldp1.y+1)))
                {
                
                if(!see_king_Check(enemy))
                {
                    enemy.changePostion(other,sacrificed);
                    pawn.setPoint(oldp1);
                    
                    return false;
                }
                enemy.changePostion(other,sacrificed);
                }
            
            if(!occupiedByEnemy(new Point(oldp1.x+1,oldp1.y+1),enemy))
                if(protectKing(enemy,new Point(oldp1.x+1,oldp1.y+1)))
                {
                if(!see_king_Check(enemy))
                {
                    enemy.changePostion(other,sacrificed);
                    pawn.setPoint(oldp1);
                    
                    return false;
                }
                enemy.changePostion(other,sacrificed);
                
                }
            
        }
        
        pawn.setPoint(oldp1);
        return true;
    }
    
    
    public boolean checkPath(Player1 enemy,Point newPoint)
    {
        boolean flag=false;
        
        
        for(int i=1;i<=32;i++)
        {
            if(inHand!=i)// check if there is peices in the WAY
            {
                if(i<17)
                    flag=checktheWay(newPoint,enemy.returnPostion(i),inHand);//Means there is somting in the Way so can't move
                else
                {
                    flag=checktheWay(newPoint,returnPostion(i),inHand);
                }
                
                if(flag==true)
                {return false;}//Means  there is a Piece in the Way
            }
        }
        return true;
        
        
    }
    public boolean protectKing(Player1 enemy,Point newPoint)
    {
        
        for(int i=17;i<=32;i++)
        {
            
            other=enemy.returnPostion(i);
            if(other.x==newPoint.x&&other.y==newPoint.y)
            {
                sacrificed=i;
                
                
                
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
    public String reportLastMove()
    {
        switch(inHand)
        {
            case 1:return BC1.Tell_me();
            case 2:return BC2.Tell_me();
            case 3:return BH1.Tell_me();
            case 4:return BH2.Tell_me();
            case 5:return BE1.Tell_me();
            case 6:return BE2.Tell_me();
            case 7:return BQ.Tell_me();
            case 8:return BK.Tell_me();
            case 9:return  BS[0].Tell_me();
            case 10:return  BS[1].Tell_me();
            case 11:return  BS[2].Tell_me();
            case 12:return  BS[3].Tell_me();
            case 13:return  BS[4].Tell_me();
            case 14:return  BS[5].Tell_me();
            case 15:return  BS[6].Tell_me();
            case 16:return  BS[7].Tell_me();
        }
        return null;
    }
    
}
