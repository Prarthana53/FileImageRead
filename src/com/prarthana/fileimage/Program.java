/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prarthana.fileimage;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;


/**
 *
 * @author Pavilion G4
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      try{
          String link="https://secure.parksandresorts.wdpromedia.com/resize/mwImage/1/900/360/75/wdpromedia.disney.go.com/media/wdpro-assets/dlr/parks-and-tickets/destinations/disneyland-park/disneyland-00-full.jpg ";
      
        URL url=new URL(link);
        URLConnection con=url.openConnection();
          InputStream is=con.getInputStream();
          String[] tokens=link.split("/");
          String path="C:\\Users\\Pavilion G4\\Desktop\\output\\";
          FileOutputStream os=new FileOutputStream(path+tokens[tokens.length-1]);
          byte[] data=new byte[1024];
          int i=0;
          while((i=is.read(data))!=-1) {
          os.write(data, 0, i);
          }
os.close();
is.close();
              
           
        
        
    }catch(IOException ioe){
            System.out.println(ioe.getMessage());
}
    
    
    }
    
}
