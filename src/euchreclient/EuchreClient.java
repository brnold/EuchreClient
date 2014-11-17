 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package euchreclient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Benjamin
 */
public class EuchreClient
{

    String name;
    Object o;
    ObjectInputStream objectin;
    ObjectOutputStream objectOut;
    Socket s;
    

    /**
     * @param args the command line arguments
     */
    void EuchreClient()
    {
        name = "fred";
        System.out.println("Object created");
    }

    boolean openPort(String ip, int port)
    {
        try
        {
            // ServerSocket ss = new ServerSocket( port);
            s = new Socket(ip, port);

            objectOut = new ObjectOutputStream(s.getOutputStream());
            objectOut.flush();
            //InputStream input = s.getInputStream();
            objectin = new ObjectInputStream(s.getInputStream());
            
            

      //OutputStream output = s.getOutputStream();
            /*
             String sss = "sending from da client";
             objectOut.writeObject(sss);
             objectOut.flush();
             String asdf = (String)objectin.readObject();
             System.out.println(asdf);
            
             asdf = (String)objectin.readObject();
             System.out.println(asdf);
             */
        } catch (Exception e)
        {
            System.out.println(e);
            return false;
        }
        return true;
    }
    
    public void workSocket()
    {
        try{
        if(objectin.available() > 0)
                 o = objectin.readObject();
        }catch(IOException e){
            System.out.println(e);
        }catch(ClassNotFoundException e){
            System.out.println(e);
        }
    }

}
