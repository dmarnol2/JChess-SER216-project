
package MainFrame.ChessFrame;

import MainFrame.ChessFrame.players.Player1;
import MainFrame.ChessFrame.players.Player2;

import java.awt.Point;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.Rectangle2D;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.event.*;
import java.lang.String;
import javax.swing.JScrollPane;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.net.*;


public class MainPanel extends JPanel {
    
    private  Player1 player1=new Player1();
    private  Player2 player2=new Player2();
    private final int divide=600/8;
    private  int  move =0;
    private Rectangle2D rec;
    private  short players_turn=1;
    public  final ToolPanel myTool;
    private  final StatusPanel myStatus;
    private  boolean gameOver=false;
    private boolean theServer=false;
    private boolean theClient=false;
    private ServerSocket serverSock;
    private Socket Sock;
    private BufferedReader in;
    private PrintWriter out;
    private String box;
    private boolean local=true;
    private JButton startServer;
    private JButton startClient;
    private String myIP;
    private String myPortNum;
    private boolean gameStarted=true;
    private Recv_Thread recFrom;
    private ChatPanel refChat;
    
    
    public void start_As_Server(String ip,String port,ChatPanel newChat) {
        
        recFrom=new Recv_Thread();
        refChat=newChat;
        gameStarted=false;
        
        myIP=ip;
        myPortNum=port;
        
        start_Again();
        startServer=new JButton(" Start server");
        startServer.setSize(150,25);
        startServer.setLocation(200,300);
        startServer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                try {
                	serverSock=new ServerSocket(Integer.parseInt(myPortNum));
                    
                    Thread server=new Thread(new Runnable() {
                        public synchronized  void run() {
                            
                            try {
                                
                                Sock=serverSock.accept();
                                
                                refChat.listen_chat();
                                in=new BufferedReader(new InputStreamReader(Sock.getInputStream()));
                                out=new PrintWriter(Sock.getOutputStream());
                                startServer.setVisible(false);
                                startServer=null;
                                recFrom.start();
                                
                                gameStarted=true;
                                
                            } catch (IOException ex) {
                                ex.printStackTrace();
                            }
                        }
                    });
                    
                    
                    server.start();
                    
             /*in=new BufferedReader(new InputStreamReader(Sock.getInputStream()));
             out=new PrintWriter(Sock.getOutputStream());*/
                    // Sock.setSoTimeout(999999);
                    //  Refe_Chat.listen_chat();
                    
                    
                    
                } catch (IOException ex) {
                    ex.printStackTrace();
                    
                    JOptionPane.showConfirmDialog(null,"Server error","Error",JOptionPane.ERROR_MESSAGE);
                }
                startServer.setText("Waiting...");
                
            }
            
        });
        local=false;
        add(startServer);
        
        
        theServer=true;
        repaint();
    }
    public void start_As_Client(String ip,String port,ChatPanel newChat) {
    	
    	recFrom=new Recv_Thread();
        refChat=newChat;
        gameStarted=false;
        
        start_Again();
        myIP=ip;
        myPortNum=port;
        local=false;
        startClient=new JButton("Start Client");
        startClient.setSize(150,25);
        startClient.setLocation(200,300);
        
        startClient.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                try {
                    
                    Sock=new Socket(myIP,Integer.parseInt(myPortNum));
                    in=new BufferedReader(new InputStreamReader(Sock.getInputStream()));
                    out=new PrintWriter(Sock.getOutputStream());
                    
                    recFrom.start();
                    gameStarted=true;
                    refChat.start_chat();
                    } catch (UnknownHostException ex) {
                    	ex.printStackTrace();
                    	
                    } catch (IOException ex) {
                    	ex.printStackTrace();
                    	JOptionPane.showConfirmDialog(null,"Client error","Error",JOptionPane.ERROR_MESSAGE);
                    }
                
                startClient.setVisible(false);
                startClient=null;
            }
        });
        
        
        theClient=true;
        add(startClient);
        }
    
    public void start_Again() {
        player1=new Player1();
        player2=new Player2();
        move =0;
        players_turn=1;
        gameOver=false;
        local=true;
        myTool.start_Again();
        myStatus.start_Again();
        theServer=false;
        theClient=false;
        repaint();
        }
    
    
    public MainPanel(ToolPanel myToolPanel,StatusPanel myStatusPanel) {
        setBackground(Color.WHITE);
        
        setSize(600,600);
        setLocation(3,10);
        
        MouseWhenMove mouseDragAndDrop=new MouseWhenMove();
        MouseHere    mouseHereEvent=new MouseHere();
        addMouseMotionListener(mouseDragAndDrop);
        addMouseListener(mouseHereEvent);
        
        myTool=myToolPanel;
        myStatus=myStatusPanel;
        setLayout(null);
        
        
    }
    
    public void paintComponent(Graphics g) {
        
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        int iWidth = 600;
        int iHeight = 600;
        
        
        // Drawing the board
        for (int i=0; i<8; i=i+2) {
            for (int j=0; j<8; j=j+2) {
                
                g2.setColor(Color.BLUE);
                rec=new Rectangle2D.Double(j*iWidth/8,(1+i)*iWidth/8,divide,divide);
                g2.fill(rec);
                rec=new Rectangle2D.Double((1+j)*iWidth/8,i*iWidth/8,divide,divide);
                g2.fill(rec);
                
            }
        }
        
        /// Place pieces
        Point postionPoint;
        int postX;
        int postY;
        Image img;
        for (int i = 1; i <= 32; i++) {
            if(i<17) {
                if(i==player2.GetInhand()) {
                    postionPoint=player2.getPixelPoint(i);
                    
                } else {
                    postionPoint=player2.returnPostion(i);   }
                img=player2.returnIconImage(i);
                }
            else {
            	if(i==player1.getInhand()) {
            		postionPoint=player1.getPixelPoint(i);
            		} 
            	else {
                    postionPoint=player1.returnPostion(i);   }
                	img=player1.returnIconImage(i);
            }
            
            
            if(i==player1.getInhand())
                g2.drawImage(img,postionPoint.x-25,postionPoint.y-25,divide-40,divide-12 ,this);
            else if(i==player2.GetInhand())
                g2.drawImage(img,postionPoint.x-25,postionPoint.y-25,divide-40,divide-12 ,this);
            else {
                postX=rowToX(postionPoint.x);
                postY=colToY(postionPoint.y);
                g2.drawImage(img,postX+20,postY+4,divide-40,divide-12 ,this);
            }
            }
        }
    
    /// You can inherit from Adapter and avoid meaningless
    private class MouseHere implements MouseListener {
        
        public void mouseClicked(MouseEvent e) {
        	
        }
        
        public void mousePressed(MouseEvent e) {
        	
        
        }
        
        public void mouseReleased(MouseEvent e) {
            boolean can_Send=false;
            
            if(!gameOver) {
                
                Point newP;
                Point samePostion;
                if(player1.getInhand()!=-1) {
                    
                    
                    newP=player1.getPixelPoint(player1.getInhand());
                    newP.x/=divide;
                    newP.y/=divide;
                    newP.x++;
                    newP.y++;
                    int otherindex;
                    
                    Point old=player1.returnOldPostion(player1.getInhand());
                    int x=old.x;
                    int y=old.y;
                    Point present=player1.returnPostion(player1.getInhand());

                    if(theServer||local) {
                        
                        
                        // set the seen of the pawn -white
                        if(player1.getInhand()<33&&player1.getInhand()>24) {
                            for(int i=1;i<17;i++) {
                                samePostion=player2.returnPostion(i);
                                if(samePostion.x==newP.x&&samePostion.y==newP.y) {
                                    if(player1.setSeenToPawn(player1.getInhand(),samePostion))
                                        break;
                                }
                            }
                        }

                        if(!(newP.x== present.x&&newP.y== present.y)/*&&!P1.returncheckKing()*/)
                            if(player1.checkTheMove(newP,player1.getInhand() )) // if the move is illegal
                            {
                            	boolean flag=false;
                            	
                            	for(int i=1;i<=32;i++) {
                                if(player1.getInhand()!=i)// check if there is peices in the WAY
                                {
                                    if(i<17)
                                        flag=player1.checkTheWay(newP,player2.returnPostion(i),player1.getInhand());//Means there is somting in the Way so can't move
                                    else {
                                        flag=player1.checkTheWay(newP,player1.returnPostion(i),player1.getInhand());
                                    }
                                    
                                    if(flag==true)break;//Means  there is a Pice in the Way
                                }
                                
                            	}
                            	
                            	if(!flag&&player1.pieceAlreadyThere(newP)){
                                //(if flag =false this means "The piece able to MOVE as logic""
                            	
                                // So We Check If the New Place Make  a Check To Black King !!!
                                boolean king2=true;
                                Point myold=new Point();
                                Point o=player1.returnPostion(player1.getInhand());
                                myold.x=o.x;
                                myold.y=o.y;
                                Point other=new Point();
                                Point f=new Point();
                                boolean kill=false;
                                int killed=-1;
                                boolean end_move=true;
                                
                                
                                ////***  Start Here to Check the King
                                
                                for(int k=1;k<17;k++) {
                                    // I have to Check the Place
                                    
                                    other=player2.returnPostion(k);
                                    if(newP.x==other.x&&newP.y==other.y) {
                                        
                                        int inHand=player1.getInhand();
                                        if(inHand>24&&player1.returnPawnSeen(inHand)) {
                                            kill=true;
                                            f.x=other.x;
                                            f.y=other.y;
                                            
                                            player2.killedPiece(k);
                                        } else if(inHand<=24) {
                                            kill=true;
                                            
                                            f.x=other.x;
                                            f.y=other.y;
                                            
                                            player2.killedPiece(k);
                                        } else {
                                            player1.changePostion(myold,inHand);
                                            end_move=false;
                                            
                                            break;
                                        }
                                        
                                        
                                        killed=k;//!!!
                                        
                                        break;
                                        
                                    }
                                    
                                }
                                
                                
                                if(end_move)
                                    player1.changePostion(newP,player1.getInhand());// Here is the mOve ended
                                
                                player1.checkKing(false);
                                if(player1.see_king_Check(player2))
                                    // if my king will be in check if i move
                                    //so i can't move and i will return back to old postion'
                                {
                                    player1.changePostion(myold,player1.getInhand());
                                    player1.checkKing(true);
                                    end_move=false;
                                }
                                if(kill&&player1.returnCheckKing()) {
                                    player2.changePostion(f,killed);
                                    }
                                if(!player1.returnCheckKing()) {
                                    
                                    if(player2.see_king_Check(player1))
                                        // if my king will be in check if i move
                                        //so i can't move and i will return back to old postion'
                                    {
                                        
                                        player2.checkKing(true);
                                        end_move=false;
                                        if(player2.Check_Mate_GameOver(player1)) {
                                            gameOver();
                                            box=Integer.toString(player2.GetInhand())+Integer.toString(newP.x)+Integer.toString(newP.y);
                                            can_Send=true;
                                        }
                                        
                                        else {
                                            box=Integer.toString(player1.getInhand())+Integer.toString(newP.x)+Integer.toString(newP.y);
                                            
                                            checkStatus();
                                            can_Send=true;
                                            }
                                        }
                                    if(end_move) {
                                        box=Integer.toString(player1.getInhand())+Integer.toString(newP.x)+Integer.toString(newP.y);
                                        changeTurn();
                                        can_Send=true;
                                    } 
                                    }
                                }
                            	}
                        
                        player1.setInhand(-1);
                        repaint();
                        if(can_Send&&((theServer||theClient))) {
                        	sendMove();
                            }
                        if(gameOver)
                            JOptionPane.showConfirmDialog(null,"Check Mate\n White won the game","Game Over",JOptionPane.PLAIN_MESSAGE);
                        
                    }
                }
                //////////////////////////////Black//////////////////////////////////////////////
                else if(player2.GetInhand()!=-1)//white
                {
                    
                    if(theClient||local) {
                        newP=player2.getPixelPoint(player2.GetInhand());
                        newP.x/=divide;
                        newP.y/=divide;
                        newP.x++;
                        newP.y++;
                        boolean kingChange=false;
                        Point old=player2.returnOldPostion(player2.GetInhand());
                        Point present=player2.returnPostion(player2.GetInhand());

                        // set the seen of the pawn -black
                        if(player2.GetInhand()<17&&player2.GetInhand()>8) {
                            for(int i=17;i<33;i++) {
                                samePostion=player1.returnPostion(i);
                                
                                if(samePostion.x==newP.x&&samePostion.y==newP.y) {
                                    if(player2.setSeenToPawn(player2.GetInhand(),samePostion)) {
                                        
                                        break;
                                    }
                                }
                            }
                        }
                        
                        
                        if(!(newP.x== present.x&&newP.y== present.y)/*&&!P2.returncheckKing()*/)
                            if(player2.checkthemove(newP,player2.GetInhand())) {
                            boolean flag=false;
                            for(int i=1;i<=32;i++) {
                                if(player2.GetInhand()!=i) {
                                    if(i<17)
                                        flag=player2.checktheWay(newP,player2.returnPostion(i),player2.GetInhand());
                                    else
                                        flag=player2.checktheWay(newP,player1.returnPostion(i),player2.GetInhand());
                                    
                                    if(flag)break;
                                }
                            }
                            
                            for(int i=1;i<=16&&!flag;i++) {
                                if(player2.GetInhand()!=i) {
                                    if(flag==false) {
                                        samePostion=player2.returnPostion(i);
                                        if(newP.x==samePostion.x&&newP.y==samePostion.y) {
                                            flag =true;
                                            break;
                                            }
                                        }
                                    }
                                }
                            
                            if(!flag) {
                                Point kingPostion2=player2.returnPostion(8);
                                Point myold=new Point();
                                Point o=player2.returnPostion(player2.GetInhand());
                                myold.x=o.x;
                                myold.y=o.y;
                                Point other=new Point();
                                Point f=new Point();
                                boolean kill=false;
                                boolean end_move=true;
                                int killed=-1;
                                
                                
                                
                                for(int k=17;k<33;k++) {
                                    other=player1.returnPostion(k);
                                    if(newP.x==other.x&&newP.y==other.y) {
                                        
                                        int inHand=player2.GetInhand();
                                        
                                        
                                        if(inHand>8&&player2.returnPawnSeen(inHand)) {
                                            kill=true;
                                            
                                            other=player1.returnPostion(k);
                                            
                                            f.x=other.x;
                                            f.y=other.y;
                                            
                                            player1.killedPiece(k);
                                        } else if(inHand<=8) {
                                            kill=true;
                                            
                                            other=player1.returnPostion(k);
                                            
                                            f.x=other.x;
                                            f.y=other.y;
                                            player1.killedPiece(k);
                                        } else {
                                            end_move=false;
                                            player2.changePostion(myold,inHand);
                                        }
                                        
                                        killed=k;
                                        break;
                                        }
                                    }
                                //boolean kin2=true;
                                if(end_move)
                                    player2.changePostion(newP,player2.GetInhand());
                                
                                player2.checkKing(false);
                                if(player2.see_king_Check(player1))
                                    // if my king will be in check if i move
                                    //so i can't move and i will return back to old postion'
                                {
                                    player2.changePostion(myold,player2.GetInhand());
                                    player2.checkKing(true);
                                    
                                    end_move=false;
                                    }
                                if(kill&&player2.returncheckKing()) {
                                    
                                    player1.changePostion(f,killed);
                                }
                                
                                if(player2.returncheckKing()) {
                                    player2.changePostion(myold,player2.GetInhand());
                                }
                                
                                
                                if(!player2.returncheckKing()) {
                                    if(player1.see_king_Check(player2))
                                        // if my king will be in check if i move
                                        //so i can't move and i will return back to old postion'
                                    {
                                        
                                        player1.checkKing(true);
                                        end_move=false;
                                        
                                        
                                        if(player1.check_Mate_GameOver(player2)) {
                                            box=Integer.toString(player2.GetInhand())+Integer.toString(newP.x)+Integer.toString(newP.y);
                                            gameOver();
                                            
                                            can_Send=true;
                                        }
                                        
                                        else {
                                            box=Integer.toString(player2.GetInhand())+Integer.toString(newP.x)+Integer.toString(newP.y);
                                            checkStatus();
                                            can_Send=true;
                                        }
                                    }
                                    
                                    
                                    if(end_move) {
                                        box=Integer.toString(player2.GetInhand())+Integer.toString(newP.x)+Integer.toString(newP.y);
                                        changeTurn();
                                        can_Send=true;
                                    }
                                    
                                }
                                
                            }
                            }
                        player2.SetInhand(-1);
                        
                        repaint();
                        
                        if(can_Send&&((theServer||theClient))) {
                            
                            //Send_to.resume();
                            sendMove();
                            ///     Recv_from.resume();
                            
                            
                        }
                        if(gameOver)
                            JOptionPane.showConfirmDialog(null,"Check Mate\n Black won the game","Game Over",JOptionPane.DEFAULT_OPTION);
                        
                    }
                }
            }
            }
        
        public void mouseEntered(MouseEvent e) {
            
        }
        
        public void mouseExited(MouseEvent e) {
            
        }
    }
   
    public boolean boardGetPostion(int x, int y) {
    	
        if(!gameOver&&gameStarted) {
            if((theServer&&players_turn==1)||(local)||(theClient&&players_turn==2)) {
                
                int newX=x/divide;
                int newY=y/divide;
                newX++;
                newY++;
                
                if(newX>8||newY>8||newX<1||newY<1) {
                    repaint();
                    return false;
                    
                }
                
                if(players_turn==1&&player1.getInhand()==-1)//Player 1
                {
                    for(int i=17;i<=32;i++) {
                        Point p=player1.returnPostion(i);
                        if(p.x==newX&&p.y==newY) {
                            player1.setInhand(i); handlePiece(x,y);return true;}
                    }
                } else   if(players_turn==2&&player2.GetInhand()==-1)//Player 2
                {
                    for(int i=1;i<=16;i++) {
                        Point p=player2.returnPostion(i);
                        if(p.x==newX&&p.y==newY) {
                            player2.SetInhand(i); handlePiece(x,y);return true;}
                    }
                }
                
                else if(players_turn==1&&player1.getInhand()!=-1)//Player 1
                {
                    handlePiece(x,y);
                    return true;
                } else if(players_turn==2&&player2.GetInhand()!=-1)//Player 2
                {
                    handlePiece(x,y);
                    return true;
                }
                player1.setInhand(-1);
                move=0;
                
                return false;
                
            }
        }
        return false;
    }
    public boolean handlePiece(int x,int y) {
        
        if(players_turn==1&&player1.getInhand()!=-1) {
            player1.changePixel(x,y,player1.getInhand());return true;
        } else if(players_turn==2&&player2.GetInhand()!=-1) {
            player2.changePixel(x,y,player2.GetInhand());return true;
        }
        return false;
    }
    private int rowToX(int r) {
        int myx;
        int iHeight = this.getHeight();
        myx=(r*iHeight/8) - divide;
        return myx;
    }
    private int colToY(int c) {
        int myy;
        int iWidth = getWidth();
        myy = (c*iWidth/8) - divide;
        return myy;
    }
    
    private class MouseWhenMove implements MouseMotionListener {
        public void mouseDragged(MouseEvent e) {
            
            int x = e.getX();
            int y = e.getY();
            if(controlGameType(x,y)) {
                
                repaint();
            }
            
        }
        public void mouseMoved(MouseEvent e) {
            
        }
        
        
    }
    
    public boolean controlGameType(int x,int y) {
        
        if(theServer==true||theClient==true&&gameStarted) {
            if(theServer&&players_turn==1) {
                return boardGetPostion(x,y);
            } else if(theClient&&players_turn==2) {
                return boardGetPostion(x,y);
            } else
                return false;
        } else {
            return boardGetPostion(x,y);
        }
        
        
        // return false;
    }
    
    private void changeTurn() {
        if(players_turn==1) {
            players_turn=2;
            myTool.add_to_History("White : "+player1.reportLastMove());
            myStatus.changeStatus(" Black player turn");
            myTool.change_to_Timer2();
        }
        
        else if(players_turn==2) {
            players_turn=1;
            myTool.add_to_History("Black : "+player2.reportLastMove());
            myTool.change_to_Timer1();
            myStatus.changeStatus(" White player turn");
        }
        }
    
    private void netChangeTurn() {
        if(players_turn==2) {
            
            myTool.add_to_History("White : "+player1.reportLastMove());
            myStatus.changeStatus(" Black player turn");
            myTool.change_to_Timer2();
        }
        
        else if(players_turn==1) {
            
            myTool.add_to_History("Black : "+player2.reportLastMove());
            myTool.change_to_Timer1();
            myStatus.changeStatus(" White player turn");
        }
        
    }
    
    private void neTGameCheckStatus() {
        if(players_turn==1) {
            
            
            myTool.add_to_History("White : "+player1.reportLastMove());
            myTool.change_to_Timer2();
        } else if(players_turn==2) {
            
            
            myTool.add_to_History("Black : "+player2.reportLastMove());
            myTool.change_to_Timer1();
        }
        myStatus.changeStatus(" Check! ");
    }
    
    
    private void checkStatus() {
        if(players_turn==1) {
            
            players_turn=2;
            myTool.add_to_History("White : "+player1.reportLastMove());
            myTool.change_to_Timer2();
        } else if(players_turn==2) {
            
            players_turn=1;
            myTool.add_to_History("Black : "+player2.reportLastMove());
            myTool.change_to_Timer1();
        }
        
        
        myStatus.changeStatus(" Check! ");
    }
    
    
    private void gameOver() {
        
        myStatus.changeStatus(" Checkmate! ");
        gameOver=true;
    }
    
    
    public void sendMove() {
        out.print(box);
        out.print("\r\n");
        out.flush();
        
    }
    
    class Recv_Thread extends Thread {
        public synchronized  void run  () {
        	
        	while(true) {
                
                try {
                    
                    box=in.readLine();
                    
                } catch (IOException ex) {
                    ex.printStackTrace();
                    System.out.println("ERROR");
                }
                
                if(box!=null) {
                	
                	int newInHand=Integer.parseInt(box);
                    int newX=Integer.parseInt(box);
                    int newY=Integer.parseInt(box);
                    
                    
                    /***
                     * Operation to Get
                     *1- The # of Piece
                     *2- The Location X
                     *3- The Location Y
                     *
                     **/
                    
                    newInHand/=100;
                    newX-=(newInHand*100);
                    newX/=10;
                    newY-=(newInHand*100)+(newX*10);
                    
                    
                    if(players_turn==1) {
                        
                        
                        
                        player1.setInhand(newInHand);
                        players_turn=2;
                        
                        player1.changePostion(new Point(newX,newY),newInHand);
                        
                        player2.killedPiece(player1.Get_Pice_already_there_from_enemy(new Point(newX,newY),player2));
                        player2.checkKing(false);
                        
                        if(player2.see_king_Check(player1))
                            // if my king will be in check if i move
                            //so i can't move and i will return back to old postion'
                        {
                            
                            player2.checkKing(true);
                            
                            
                            
                            if(player2.Check_Mate_GameOver(player1)) {
                                System.out.println("mate");
                                gameOver();
                                
                            }
                            
                            else {
                                
                                neTGameCheckStatus();
                                
                            }
                        } else netChangeTurn();
                        
                        
                        player1.setInhand(-1);
                        
                        
                    } else {
                        player2.SetInhand(newInHand);
                        player2.changePostion(new Point(newX,newY),newInHand);
                        
                        player1.killedPiece(player2.Get_Pice_already_there_from_enemy(new Point(newX,newY),player1));
                        players_turn=1;
                        
                        player1.checkKing(false);
                        if(player1.see_king_Check(player2))
                            // if my king will be in check if i move
                            //so i can't move and i will return back to old postion'
                        {
                            
                            player1.checkKing(true);
                            
                            
                            
                            if(player1.check_Mate_GameOver(player2)) {
                                
                                System.out.println("mate");
                                gameOver();
                                
                            }
                            
                            else {
                                
                                neTGameCheckStatus();
                                
                            }
                        } else netChangeTurn();
                        
                        player2.SetInhand(-1);
                    }
                    //   CheckStatus();
                    
                    repaint();
                }
            }
        }
    }
    
}


