
package MainFrame.ChessFrame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.UnknownHostException;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.net.Socket;
import java.net.ServerSocket;

import javax.swing.border.TitledBorder;

public class ChatPanel extends JPanel {
	
	private final MyTextArea textArea=new MyTextArea(6,20);
    private final MyTextFiled messageField=new MyTextFiled(10);
    private final MyButton sendButton=new MyButton();
    private final JScrollPane textAreaScroll=new JScrollPane(textArea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    private boolean flag;
    
    /*  Comment out until server implementation
     * 
    private Socket chat_socket;
    private ServerSocket server_chat;
    private BufferedReader in1;
    private PrintWriter out1;
    private BufferedReader in2;
    private PrintWriter out2;
    //private serv_chat myserv_thread=new serv_chat();
    private Socket send_socket;
    //private client_chat client_thread=new client_chat();
     * 
     */

    /** Creates a new instance of ChatPanel */
    public ChatPanel() {
        setSize(200,300);
        setLocation(600,350);
        
        textAreaScroll.setSize(180,190);
        textAreaScroll.setLocation(10,0);
        
        setLayout(null);
        
        textAreaScroll.setEnabled(false);
        messageField.setEnabled(true);
        sendButton.setEnabled(true);
        
        add(textAreaScroll);
        add(messageField);
        add(sendButton);
        
        
        sendButton.addActionListener(new ActionListener() {
            
        	public void actionPerformed(ActionEvent e) {
        		textArea.append("\n"+messageField.getText());
                if(flag) {
                  //Send_text_server();
                    messageField.setText(null);
                	} 
                else {
                  //Send_text_chat();
                    messageField.setText(null);
                	}
                }
        	});
        
        messageField.addKeyListener(new KeyListener() {
            public void keyPressed(KeyEvent e) {
                //System.out.println("okdddd  "+e.KEY_PRESSED+"  "+e.VK_PAGE_DOWN);
            	if( e.getKeyChar()=='\n') {
            		textArea.append("\n"+messageField.getText());
            		if(flag) {
                        //Send_text_server();
                        messageField.setText(null);
                    	} 
            		else {
                        //Send_text_chat();
                        messageField.setText(null);
                    	}
            		}
            	}
            public void keyReleased(KeyEvent e) {
            	}
            public void keyTyped(KeyEvent e) {
            	}
        });
    } // end constructor
    
    
    public void start_chat() {
        textAreaScroll.setEnabled(true);
        messageField.setEnabled(true);
        sendButton.setEnabled(true);
        flag=false;
        }
    
    
    
    
    /*    try {
            send_socket=new Socket("127.0.0.1",5002);
            in2=new BufferedReader(new InputStreamReader(send_socket.getInputStream()));
            out2=new PrintWriter(send_socket.getOutputStream());
        	} catch (UnknownHostException ex) {
            ex.printStackTrace();
        	} catch (IOException ex) {
            ex.printStackTrace();
        	}
        	client_thread.start();
    	}
    public void Send_text_chat() {
        out2.print(messageField.getText());
        out2.print("\r\n");
        out2.flush();
        }
    public void Send_text_server() {
        out1.print(messageField.getText());
        out1.print("\r\n");
        out1.flush();
        }
    */
    
    public void listen_chat() {
        
        textAreaScroll.setEnabled(true);
        messageField.setEnabled(true);
        sendButton.setEnabled(true);
        flag=true;
    }
     /*   try {
       		server_chat=new ServerSocket(5002);
            chat_socket=server_chat.accept();
            in1=new BufferedReader(new InputStreamReader( chat_socket.getInputStream()));
            out1=new PrintWriter(chat_socket.getOutputStream());
            //chat_socket.setSoTimeout(10000);
            myserv_thread.start();
            } catch (IOException ex) {
            	ex.printStackTrace();
            	}
        	}
        	*/

} // end ChatPanel class 


class MyTextArea extends JTextArea {
	
	private final TitledBorder TextBorder=new TitledBorder("Chat History");
	
    MyTextArea(int Row_num,int Col_num) {
        super(Row_num,Col_num);
        setEditable(false);
        setBorder(TextBorder);
        }
    }

class MyButton extends JButton {
    
	MyButton() {
		setSize(80,30);
        setLocation(50,230);
        setText("Send");
    	}
	}

class MyTextFiled extends JTextField {
	
	private final JScrollPane TextAreaScroll=new JScrollPane();
    
	MyTextFiled(int FiledLength) {
        super(FiledLength);
        setSize(180,20);
        setLocation(10,200);
        
        add(TextAreaScroll);
        this.setToolTipText("Write Text Here");
        }
	}

/*
class client_chat extends Thread {
public void run() {
    String receive = null;
    while(true) {
        try {
            receive=in2.readLine();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        if(receive!=null) {
            textArea.append("\n"+"Other: "+receive);
        }
    }
}
}
class serv_chat extends Thread {
public void run() {
    String receive = null;
    while(true) {
        try {
            receive=in1.readLine();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        if(receive!=null) {
            
            textArea.append("\n"+"Other: "+receive );
            
        }
    }
}
}
*/
