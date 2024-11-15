/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.tugaskelompok;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author rifki-alfariz-shidiq
 */
public class TugasKelompok {

    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Tugas Kelompok");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        frame.setSize(1200, 850);
 // Add the custom JPanel (RectangleDrawer) to the frame
//        DrawShape rectanglePanel = new DrawShape();
        frame.add(new DrawShape());
        
        // Make the frame visible
        frame.setVisible(true);
    }
}
