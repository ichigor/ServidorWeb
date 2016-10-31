/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.StringTokenizer;


public class WebServer {

    private Socket soc;
    
    
    public WebServer(Socket soc) {
        this.soc = soc;
    }
     
        
    
    /*
        ServerSocket ss = new ServerSocket(80);
        System.out.println("Servidor ouvindo na porta 80...");
        while (true) {
            System.out.println("Aguardando requisição...");
            Socket s = ss.accept();
            System.out.println("Requisição recebida:");
            byte[] b = new byte[1024];
            int nbytes = s.getInputStream().read(b);
            if (nbytes <= 0) {
                try {
                    s.close();
                } catch (Exception ex) {
                    continue;
                }
            }
            String str = new String(b, 0, nbytes);
            StringTokenizer st = new StringTokenizer(str);
            String metodo = st.nextToken();
            String documento = st.nextToken();
            String versao = st.nextToken();
            System.out.println("Metodo: " + metodo);
            System.out.println("Documento: " + documento);
            if (metodo.equals("GET")) {
                
                if(documento.equals("/")){
                    documento = "/index.html";
                }
                documento = documento.replace('\\', '/');
                try {
                    File f = new File("C:\\Users\\aluno\\ufsm_pag" + documento);
                    FileInputStream fin = new FileInputStream(f);
                    byte[] b_arquivo = new byte[(int) fin.getChannel().size()];
                    fin.read(b_arquivo);
                    fin.close();
                    s.getOutputStream().write(b_arquivo);
                } catch (Exception e) {
                    s.getOutputStream().write("500 SERVER ERROR".getBytes());
                    e.printStackTrace();
                }
            }
            try {
                s.close();
            } catch (Exception ex) {
                 ex.printStackTrace();
            }

        }

*/
}
