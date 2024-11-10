package com.tugaskelompok;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.GeneralPath;

/**
 *
 * @author rifki-alfariz-shidiq
 */
public class DrawShape extends JPanel{
    
    public DrawShape(){
        setBackground(Color.WHITE);
        addMouseListener(new MouseAdapter(){
            @Override
             public void mousePressed(MouseEvent e) {
                System.out.println(e.getX() + "," + e.getY());
            }
        });
    }
     protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
//        Width = 1200 & Height = 800
//Max Width = 1195 & Height = 795
        Graphics2D g2 = (Graphics2D) g; 
        outerBox(g2);
        colorRoad(g2);
        createRoad(g2);
        drawGrassPatch(g2,40,700);
        drawGrassPatch(g2,50,700);
    }
     
     protected void createRoad(Graphics2D g){
        g.setColor(Color.BLACK);
         g.drawLine(5,795,500,600);
         g.drawLine(5,770,520,570);
         g.drawLine(1195,795,700,600);
         g.drawLine(1195,770,680,570);
         
         
        g.setColor(Color.WHITE);
        int[] xRoad1 = {130,190,350,300};  
        int[] YRoad1 = {770,770,700,700};  
        g.drawPolygon(xRoad1, YRoad1, xRoad1.length);
        g.fillPolygon(xRoad1, YRoad1, xRoad1.length);
        
        
        int[] xRoad2 = {340,390,470,435};  
        int[] YRoad2 = {680,680,640,640};  
        g.drawPolygon(xRoad2, YRoad2, xRoad2.length);
        g.fillPolygon(xRoad2, YRoad2, xRoad2.length);
         
                 
        int[] xRoad3 = {1030,1070,900,860};  
        int[] YRoad3 = {770,770,700,700};  
        g.drawPolygon(xRoad3, YRoad3, xRoad3.length);
        g.fillPolygon(xRoad3, YRoad3, xRoad3.length);
         
         
        int[] xRoad4 = {810,850,755,720};  
        int[] YRoad4 = {680,680,640,640};  
        g.drawPolygon(xRoad4, YRoad4, xRoad4.length);
        g.fillPolygon(xRoad4, YRoad4, xRoad4.length);
        
        
        int[] xRoad5 = {810,850,755,720};  
        int[] YRoad5 = {680,680,640,640};  
        g.drawPolygon(xRoad5, YRoad5, xRoad5.length);
        g.fillPolygon(xRoad5, YRoad5, xRoad5.length);
        
        GeneralPath roadCenter1 = new GeneralPath();
        roadCenter1.moveTo(580, 770);
        roadCenter1.lineTo(530, 770);
        roadCenter1.quadTo(580,720,580,680);
        roadCenter1.lineTo(620, 680);
        roadCenter1.quadTo(620,720,580,770);
        g.setColor(Color.WHITE);
        g.fill(roadCenter1);
        
        
        GeneralPath roadCenter2 = new GeneralPath();
        roadCenter2.moveTo(620, 670);
        roadCenter2.lineTo(580, 670);
        roadCenter2.quadTo(600,630,580,600);
        roadCenter2.lineTo(610, 600); 
        roadCenter2.quadTo(630,630,620,670);
        g.setColor(Color.WHITE);
        g.fill(roadCenter2);
        
        GeneralPath roadCorner1 = new GeneralPath();
        roadCorner1.moveTo(500, 600);
        roadCorner1.quadTo(530,570,520,570);
        roadCorner1.lineTo(5, 570);
        roadCorner1.lineTo(5, 550); 
        roadCorner1.lineTo(1195, 550); 
        roadCorner1.lineTo(1195, 570); 
        roadCorner1.lineTo(680, 570); 
        roadCorner1.quadTo(690,590,700,600);
//        roadCorner1.quadTo(630,630,620,670);
        g.setColor(Color.BLACK);
        g.fill(roadCorner1);
        
        g.drawLine(5,530,1195,530);

        
//        g.setColor(Color.BLUE);
//         g.drawLine(530,770,580,770);
//         g.drawLine(580,680,620,680);
//         g.drawLine(560,770,580,560);
//         g.drawLine(850,680,755,640);
//         g.drawLine(720,640,755,640);
//         g.drawLine(810,680,720,640);


         
     }
      private void drawGrassPatch(Graphics2D g2d, int x, int y) {
        g2d.setColor(new Color(34, 139, 34)); // Grass green color

        GeneralPath grass = new GeneralPath();
        
        // Draw curved blades of grass using a path
        grass.moveTo(x, y);
        grass.curveTo(x - 10, y - 20, x - 10, y - 40, x, y - 50); // Left blade
        grass.curveTo(x + 10, y - 40, x + 10, y - 20, x + 20, y); // Right blade
        grass.curveTo(x + 10, y - 15, x + 5, y - 15, x, y); // Bottom curve

        g2d.fill(grass);

        // Add more blades next to the first
        grass.reset();
        grass.moveTo(x + 20, y);
        grass.curveTo(x + 10, y - 15, x + 15, y - 40, x + 30, y - 45); // Left blade of next patch
        grass.curveTo(x + 35, y - 40, x + 35, y - 15, x + 40, y); // Right blade
        grass.curveTo(x + 15, y - 15, x + 25, y - 15, x + 20, y); // Bottom curve

        g2d.fill(grass);
    }
     protected void colorRoad(Graphics2D g){
         // Coordinates for the polygon area to fill (example coordinates)
         
//         g.drawLine(5,795,500,600);
//         g.drawLine(1195,795,700,600);
         
        int[] xPoints = {5, 500,700, 1190};
        int[] yPoints = {795, 600, 600, 795};
        g.setColor(Color.BLACK);
        // Fill polygon
        g.drawPolygon(xPoints, yPoints, xPoints.length);
        g.fillPolygon(xPoints, yPoints, xPoints.length);
     }
     protected void outerBox(Graphics2D g){
         g.setStroke(new BasicStroke(4.0f));
         // TOP
         g.drawLine(5,5,1195,5);         
         // LEFT
         g.drawLine(5,5,5,795);         
         // RIGHT
         g.drawLine(1195,5,1195,795);
         // BOTTOM
         g.drawLine(5, 795, 1195, 795);
     }
}
