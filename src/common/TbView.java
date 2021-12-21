/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTable;

/**
 *
 * @author udesh
 */
public class TbView {
    public static void tableSettings(JTable tb1){
    tb1.getTableHeader().setFont(new Font("Tahoma",Font.BOLD,14));
    tb1.getTableHeader().setOpaque(false);
    tb1.getTableHeader().setBackground(Color.white);
    tb1.getTableHeader().setForeground(Color.BLACK);
    tb1.setBackground(new Color(253,253,253));
    tb1.setRowHeight(30);
    tb1.setFont(new Font ("Arial",Font.BOLD,13));
}
}
