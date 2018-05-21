/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aafsv2;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.io.File;
import java.nio.file.Paths;

/*public class OpenDoc {
    
    public void OpenDoc() throws IOException{
        File file = new File("C:\\Users\\munir\\Documents\\NetBeansProjects\\AAFS1\\dist\\Artuu.docx");
        
        Desktop.getDesktop().open(file);
}*/
public class PATH {
    
    public static String getPath(){
     
        return Paths.get("").toAbsolutePath().toString() + "\\" + "Article.docx";
        //return System.getProperty("user.dir") + File.separator + "Article";
    }
}

