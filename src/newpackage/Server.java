/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


/**
 *
 * @author Igor
 */
public class Server implements Runnable{

    private int porta;
    private ServerSocket ss = null;
    private Socket s = null;

    Server(int porta) {
        this.porta = porta;
    }
    
    
    @Override
    public void run(){
        ServerSocket ss;
        try {
            ss = new ServerSocket(porta);
        } catch (IOException ex) {
           ex.printStackTrace();
        }
        while (true) {
            try {
                this.s = this.ss.accept();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            
            new WebServer(this.s);
            
        }
        

    }

}
