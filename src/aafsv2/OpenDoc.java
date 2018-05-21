/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aafsv2;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author munir
 */
public class OpenDoc {
    
    public void OpenDoc() throws IOException{
        String FileName = PATH.getPath();
        File file = new File(FileName);
        
        Desktop.getDesktop().open(file);
    }
    
}
