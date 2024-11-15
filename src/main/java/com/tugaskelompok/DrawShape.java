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
        createGrass(g2);
        createBuilding(g2);
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
        
        g.setColor(Color.BLACK);
        g.fill(roadCorner1);
        
        g.drawLine(5,530,1195,530);

         
     }
     protected void createGrass(Graphics2D g){
        g.setColor(Color.GREEN);
        GeneralPath grass = new GeneralPath();
        grass.moveTo(30,725);
        grass.curveTo(20,705,20,665,15,675);
        grass.curveTo(32,680,35,700,30,725);
         
        g.fill(grass);
        grass.reset();
        
        grass.moveTo(30,725);
        grass.curveTo(43,690,42,680,45,670);
        grass.curveTo(50,710,47,720,30,725);
        g.fill(grass);
        grass.reset();
        
        
        grass.moveTo(35,725);
        grass.curveTo(50,680,50,680,75,670);
        grass.curveTo(50,700,60,690,40,725);
        g.fill(grass);
        grass.reset();
        
        // Grass 2
        grass.moveTo(1140,715);
        grass.curveTo(1125,680,1130,665,1130,670);
        grass.curveTo(1140,680,1140,700,1140,715);
         
        g.fill(grass);
        grass.reset();
//Tangkai Bunga
//        g.setColor(new Color(242, 194, 0));
//        grass.moveTo(1143,710);
//        grass.curveTo(1137,665,1135,665,1145,630);
//        g.fill(grass);
//        grass.reset();

//        Daun
        g.setColor(Color.GREEN);
        grass.moveTo(1140,715);
        grass.curveTo(1143,680,1145,665,1160,670);
        grass.curveTo(1150,690,1140,700,1145,715);
//         
        g.fill(grass);
        grass.reset();
//        
//        g.setColor(Color.RED);
//        g.fillOval(1107,624, 80, 10);
//        
//        g.fillOval(1143,594, 10, 80);
        
        
//        g.setColor(new Color(110, 240, 105));
//        drawCenteredCircle(g,1145,630,30);
//        grass.moveTo(1117,600);
//        grass.curveTo(1135,630,1135,630,1175,655);
//        g.fill(grass);
//        grass.moveTo(30,725);
//        grass.curveTo(43,690,42,680,45,670);
//        grass.curveTo(50,710,47,720,30,725);
//        g.fill(grass);
//        grass.reset();
//        
//        
//        grass.moveTo(35,725);
//        grass.curveTo(50,680,50,680,75,670);
//        grass.curveTo(50,700,60,690,40,725);
//        g.fill(grass);
//        grass.reset();
         
     } 
     protected void createBuilding(Graphics2D g){
        g.setColor(Color.BLACK);
        GeneralPath path = new GeneralPath();
//        Building 1 Side 1
//         g.drawLine(590,500,380,485);
//         g.drawLine(380,485,380,360);
//         g.drawLine(590,500,590,320);
//         g.drawLine(380,360,590,320);
//         
////         Building 1 Side 2
//         g.drawLine(590,500,590,320);
//         g.drawLine(590,500,725,465);
//         g.drawLine(725,465,725,360);
//         g.drawLine(590,320,725,360);

//Building Over Line 1
//        g.drawLine(590,320,360,363);
//        g.drawLine(590,320,590,300);
//        g.drawLine(590,300,360,340);
//        g.drawLine(360,363,360,340);


//        g.drawLine(590,320,740,363);
//        g.drawLine(590,320,590,300);    
//        g.drawLine(590,300,740,343);   
//        g.drawLine(740,343,740,363);

         
        int[] XBuildingSide1 = {380,380,590,590};  
        int[] YBuildingSide1 = {485,360,320,500};  
        g.setColor(new Color(121, 156, 158));
        g.drawPolygon(XBuildingSide1, YBuildingSide1, XBuildingSide1.length);
        g.fillPolygon(XBuildingSide1, YBuildingSide1, XBuildingSide1.length);
        
        int[] XBuilding1Window1 = {405,405,565,565};  
        int[] YBuilding1Window1 = {468,370,340,480};  
        g.setColor(Color.BLACK);
        g.drawPolygon(XBuilding1Window1, YBuilding1Window1, XBuilding1Window1.length);
        g.setColor(Color.WHITE);
        g.fillPolygon(XBuilding1Window1, YBuilding1Window1, XBuilding1Window1.length);
        
        g.setColor(Color.BLACK);
        g.drawLine(455,363,455,470);
        g.drawLine(475,358,475,474);
        g.drawLine(495,353,495,474);
//        g.drawLine(565,480,565,340);
//        g.drawLine(405,370,565,340);
//        g.drawLine(405,468,565,480);
        
        g.setColor(new Color(59, 96, 98));
        int[] XBuilding1Side2 = {590,590,725,725};  
        int[] YBuilding1Side2 = {500,320,360,465};  
        g.drawPolygon(XBuilding1Side2, YBuilding1Side2, XBuilding1Side2.length);
        g.fillPolygon(XBuilding1Side2, YBuilding1Side2, XBuilding1Side2.length);
        
        int[] XBuilding1Window2 = {615,615,710,710};  
        int[] YBuilding1Window2 = {340,480,460,365};  
        g.setColor(Color.BLACK);
        g.drawPolygon(XBuilding1Window2, YBuilding1Window2, XBuilding1Window2.length);
        g.setColor(Color.WHITE);
        g.fillPolygon(XBuilding1Window2, YBuilding1Window2, XBuilding1Window2.length);
        
        
        
        g.setColor(Color.BLACK);
        g.drawLine(665,353,665,470);
        
        
        int[] XBuilding1Shadow1 = {363,377,377};  
        int[] YBuilding1Shadow1 = {363,370,360};  
        g.drawPolygon(XBuilding1Shadow1, YBuilding1Shadow1, 3);
        g.fillPolygon(XBuilding1Shadow1, YBuilding1Shadow1, 3);
        
        int[] XBuilding1Shadow2 = {725,725,737};  
        int[] YBuilding1Shadow2 = {370,360,364};  
        g.drawPolygon(XBuilding1Shadow2, YBuilding1Shadow2, 3);
        g.fillPolygon(XBuilding1Shadow2, YBuilding1Shadow2, 3);
        
        g.setColor(new Color(93, 127, 128));
        int[] XBuilding1Line1 = {360,360,590,590};  
        int[] YBuilding1Line1 = {360,355,315,320};  
        g.drawPolygon(XBuilding1Line1, YBuilding1Line1, 4);
        g.fillPolygon(XBuilding1Line1, YBuilding1Line1, 4);
        
         
        g.setColor(new Color(41, 67, 69));
        int[] XBuilding1Line2 = {590,590,740,740};  
        int[] YBuilding1Line2 = {320,315,358,363};  
        g.drawPolygon(XBuilding1Line2, YBuilding1Line2, 4);
        g.fillPolygon(XBuilding1Line2, YBuilding1Line2, 4);
        
//        g.drawLine(739,364,725,370);
//        g.drawLine(725,370,725,360);
//        g.drawLine(725,360,739,364);
//        g.drawLine(377,360,360,360);
        
     }
     public void drawCenteredCircle(Graphics2D g, int x, int y, int r) {
        x = x-(r/2);
        y = y-(r/2);
        System.out.println(x + "," + y);
        g.fillOval(x,y,r,r);
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
