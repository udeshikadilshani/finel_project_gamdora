/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JTextField;

/**
 *
 * @author udesh
 */
public class Checknull {
    public static void checkNull(JTextField text,String name,JTextField grab) {
             if(!text.getText().trim().equals("")){
                  text.setBorder(BorderFactory.createLineBorder(Color.decode("#cccccc")));
                        grab.grabFocus(); 
             }else{
                 
            text.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
        }
     }

}
