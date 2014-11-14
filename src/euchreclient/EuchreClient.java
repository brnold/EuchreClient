/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package euchreclient;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author Benjamin
 */
public class EuchreClient
{
    String name;
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
        try {
            Socket kkSocket = new Socket(ip, port);
            PrintWriter out = new PrintWriter(kkSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(
            new InputStreamReader(kkSocket.getInputStream()));
        }catch(Exception e){
            System.out.println(e);
            return false;
         }
        return true;
    }
    
    public boolean sendName(String name)
    {
        
    }
}
