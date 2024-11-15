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
//        createGrass(g2);
        createGrassOri(g2);
        createSky(g2);
        createWall(g2);
        createBuilding2(g2);
        createBuilding3(g2);
        createBuilding(g2);
    }
    protected void createSky(Graphics2D g){
        int[] XSky = {7,7,1193,1193};  
        int[] YSky = {260,7,7,260};        
        g.drawPolygon(XSky, YSky, XSky.length);
        g.setColor(new Color(201, 230, 240));
        g.fillPolygon(XSky, YSky, XSky.length);
    }
    protected void createWall(Graphics2D g){
        g.setColor(Color.BLACK);
        GeneralPath path = new GeneralPath();
        
//        g.drawLine(5,250,1195,250);
//        g.drawLine(5,450,1195,450);
        int[] XWall = {6,6,1194,1194};  
        int[] YWall = {440,260,260,440};
        g.setColor(Color.BLACK);
        g.drawPolygon(XWall, YWall, XWall.length);
        g.setColor(new Color(128, 0, 0));
        g.fillPolygon(XWall, YWall, XWall.length);
        
        g.setColor(Color.BLACK);
        int start = 440;
        int a = 1;
//        Kuli Jawa bikin tembok
        while(a <= 8){
            System.out.println("Create Wall-"+a);
            int sum = a*25;
            
            int point = 440-sum;
            int[] XWallLine = {6,6,1194,1194};
            int[] YWallLine = {point,start,start,point};
            System.out.println("Bawah-"+point+" Atas-"+start);
            g.setColor(Color.BLACK);
            g.drawPolygon(XWallLine, YWallLine, XWallLine.length);
            g.setColor(new Color(128, 0, 0));
            g.fillPolygon(XWallLine, YWallLine, XWallLine.length);
            
            g.setColor(Color.BLACK);
            if(a%2 == 0){
                int bricksLine = point*-1;
                while(bricksLine <= 1190){
                    int point2 = bricksLine + 70;
                    g.drawLine(point2,start,point2,point);
                    bricksLine = point2;
                }
            }else{
                int bricksLine = point*-1;
                while(bricksLine <= 1190){
                    int point2 = bricksLine + 70;
                    g.drawLine(point2,start,point2,point);
                    bricksLine = point2;
                }
            }
            
            start = point;
            a++;
        }

    }
    protected void createGrassOri(Graphics2D g){
        int[] XGrass = {7,7,1193,1193};  
        int[] YGrass = {515,440,440,515};        
        g.setColor(Color.BLACK);
        g.drawPolygon(XGrass, YGrass, XGrass.length);
        g.setColor(new Color(122, 157, 84));
        g.fillPolygon(XGrass, YGrass, XGrass.length);
        
        int[] XGrass2 = {7,7,515};  
        int[] YGrass2 = {770,570,570};        
        g.setColor(Color.BLACK);
        g.drawPolygon(XGrass2, YGrass2, XGrass2.length);
        g.setColor(new Color(122, 157, 84));
        g.fillPolygon(XGrass2, YGrass2, XGrass2.length);
        
        int[] XGrass3 = {1193,685,1193};  
        int[] YGrass3 = {768,570,570};        
        g.setColor(Color.BLACK);
        g.drawPolygon(XGrass3, YGrass3, XGrass3.length);
        g.setColor(new Color(122, 157, 84));
        g.fillPolygon(XGrass3, YGrass3, XGrass3.length);
        
        
        g.setColor(Color.BLACK);
        
//        biar idup
        int start = 20;
        while(start <= 1193){
            g.drawLine(start+25,516,start,529);
            start = start+50;
        }
        
        
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
        int[] YBuilding1Window1 = {488,370,340,498};  
        g.setColor(Color.BLACK);
        g.drawPolygon(XBuilding1Window1, YBuilding1Window1, XBuilding1Window1.length);
        g.setColor(Color.WHITE);
        g.fillPolygon(XBuilding1Window1, YBuilding1Window1, XBuilding1Window1.length);
        
        g.setColor(Color.BLACK);
        g.drawLine(455,363,455,490);
        g.drawLine(475,358,475,493);
        g.drawLine(495,353,495,495);
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
        
        
        
//        g.setColor(Color.black); 
//        g.drawLine(590,315,590,45);   
//        g.drawLine(380,350,380,100);
//        g.drawLine(380,100,590,45);
        
        int[] XBuilding1Side3 = {380,380,590,590};  
        int[] YBuilding1Side3 = {348,100,45,311};  
        g.setColor(new Color(121, 156, 158));
        g.drawPolygon(XBuilding1Side3, YBuilding1Side3, XBuilding1Side3.length);
        g.fillPolygon(XBuilding1Side3, YBuilding1Side3, XBuilding1Side3.length);
        
//        g.setColor(Color.black); 
//        g.drawLine(725,350,725,100); 
//        g.drawLine(590,315,590,45);  
//        g.drawLine(590,45,725,100);
        
        
        int[] XBuilding1Side4 = {590,590,725,725};  
        int[] YBuilding1Side4 = {312,45,100,350};  
        g.setColor(new Color(59, 96, 98));
        g.drawPolygon(XBuilding1Side4, YBuilding1Side4, XBuilding1Side4.length);
        g.fillPolygon(XBuilding1Side4, YBuilding1Side4, XBuilding1Side4.length);
        
        
        
//        g.setColor(Color.BLACK);
//        g.drawLine(405,345,405,125);
//        g.drawLine(565,317,565,80);
//        g.drawLine(405,125,565,80);
        
        int[] XBuilding1Window3 = {405,405,565,565};  
        int[] YBuilding1Window3 = {345,125,80,317};  
        g.setColor(Color.BLACK);
        g.drawPolygon(XBuilding1Window3, YBuilding1Window3, XBuilding1Window3.length);
        g.setColor(Color.WHITE);
        g.fillPolygon(XBuilding1Window3, YBuilding1Window3, XBuilding1Window3.length);

        int[] XBuilding1Window4 = {615,615,710,710};  
        int[] YBuilding1Window4 = {320,80,120,348};  
        g.setColor(Color.BLACK);
        g.drawPolygon(XBuilding1Window4, YBuilding1Window4, XBuilding1Window4.length);
        g.setColor(Color.WHITE);
        g.fillPolygon(XBuilding1Window4, YBuilding1Window4, XBuilding1Window4.length);
        
//        Line For Window Lt 2
        int[] XBuilding1Window3Line1 = {405,405,565,565};  
        int[] YBuilding1Window3Line1 = {305,300,265,270};  
        g.setColor(new Color(59, 96, 98));
        g.drawPolygon(XBuilding1Window3Line1, YBuilding1Window3Line1, XBuilding1Window3Line1.length);
        g.fillPolygon(XBuilding1Window3Line1, YBuilding1Window3Line1, XBuilding1Window3Line1.length);
        
        int[] XBuilding1Window3Line2 = {405,405,565,565};  
        int[] YBuilding1Window3Line2 = {250,245,210,215};  
        g.setColor(new Color(59, 96, 98));
        g.drawPolygon(XBuilding1Window3Line2, YBuilding1Window3Line2, XBuilding1Window3Line2.length);
        g.fillPolygon(XBuilding1Window3Line2, YBuilding1Window3Line2, XBuilding1Window3Line2.length);
        
        int[] XBuilding1Window3Line3 = {405,405,565,565};  
        int[] YBuilding1Window3Line3 = {184,179,140,145};  
        g.setColor(new Color(59, 96, 98));
        g.drawPolygon(XBuilding1Window3Line3, YBuilding1Window3Line3, XBuilding1Window3Line3.length);
        g.fillPolygon(XBuilding1Window3Line3, YBuilding1Window3Line3, XBuilding1Window3Line3.length);
        
//        Window Line 
        g.setStroke(new BasicStroke(3));
        g.setColor(Color.BLACK);
        g.drawLine(430,340,430,300);
        g.drawLine(460,335,460,290);
        g.drawLine(490,330,490,280);
        g.drawLine(520,325,520,275);
        g.drawLine(550,320,550,270);
        
        g.drawLine(430,292,430,248);
        g.drawLine(460,287,460,241);
        g.drawLine(490,282,490,235);
        g.drawLine(520,277,520,228);
        g.drawLine(550,272,550,221);
        
        g.drawLine(430,235,430,180);
        g.drawLine(460,230,460,171);
        g.drawLine(490,225,490,166);
        g.drawLine(520,220,520,158);
        g.drawLine(550,215,550,152);
        
        g.drawLine(430,170,430,115);
        g.drawLine(460,163,460,109);
        g.drawLine(490,155,490,102);
        g.drawLine(520,148,520,92);
        g.drawLine(550,140,550,85);
        
        int[] XBuilding1Window4Line1 = {615,615,710,710};  
        int[] YBuilding1Window4Line1 = {270,265,300,305};  
        g.setColor(new Color(59, 96, 98));
        g.drawPolygon(XBuilding1Window4Line1, YBuilding1Window4Line1, XBuilding1Window4Line1.length);
        g.fillPolygon(XBuilding1Window4Line1, YBuilding1Window4Line1, XBuilding1Window4Line1.length);
        
        
        int[] XBuilding1Window4Line2 = {615,615,710,710};  
        int[] YBuilding1Window4Line2 = {210,215,250,245};  
        g.setColor(new Color(59, 96, 98));
        g.drawPolygon(XBuilding1Window4Line2, YBuilding1Window4Line2, XBuilding1Window4Line2.length);
        g.fillPolygon(XBuilding1Window4Line2, YBuilding1Window4Line2, XBuilding1Window4Line2.length);
        
        int[] XBuilding1Window4Line3 = {615,615,710,710};  
        int[] YBuilding1Window4Line3 = {160,165,200,195};  
        g.setColor(new Color(59, 96, 98));
        g.drawPolygon(XBuilding1Window4Line3, YBuilding1Window4Line3, XBuilding1Window4Line3.length);
        g.fillPolygon(XBuilding1Window4Line3, YBuilding1Window4Line3, XBuilding1Window4Line3.length);
        
        int[] XBuilding1Window4Line4 = {615,615,710,710};  
        int[] YBuilding1Window4Line4 = {120,125,160,155};  
        g.setColor(new Color(59, 96, 98));
        g.drawPolygon(XBuilding1Window4Line4, YBuilding1Window4Line4, XBuilding1Window4Line4.length);
        g.fillPolygon(XBuilding1Window4Line4, YBuilding1Window4Line4, XBuilding1Window4Line4.length);
       
        
//        Window Line 
        g.setStroke(new BasicStroke(3));
        g.setColor(Color.BLACK);
        g.drawLine(645,328,645,283);
        g.drawLine(685,340,685,297);
        
        
        g.drawLine(645,273,645,227);
        g.drawLine(685,290,685,240);
        
        g.drawLine(645,220,645,178);
        g.drawLine(685,233,685,189);
        
        g.drawLine(645,170,645,138);
        g.drawLine(685,185,685,150);
        
        g.drawLine(645,130,645,93);
        g.drawLine(685,143,685,110);
        
     }
    protected void createBuilding2(Graphics2D g){
        g.setColor(Color.BLACK);
        GeneralPath path = new GeneralPath();
        int[] XBuilding2Side1 = {135,135,200,380,380};  
        int[] YBuilding2Side1 = {470,25,9,9,485};
        g.setColor(new Color(204, 43, 82));
        g.drawPolygon(XBuilding2Side1, YBuilding2Side1, XBuilding2Side1.length);
        g.fillPolygon(XBuilding2Side1, YBuilding2Side1, XBuilding2Side1.length);
        
        int[] XBuilding2Side2 = {380,380,500,500};  
        int[] YBuilding2Side2 = {100,9,9,100};
        g.setColor(new Color(116, 9, 56));
        g.drawPolygon(XBuilding2Side2, YBuilding2Side2, XBuilding2Side2.length);
        g.fillPolygon(XBuilding2Side2, YBuilding2Side2, XBuilding2Side2.length);
        
        int[] XDoor1 = {208,208,308,308};  
        int[] YDoor1 = {475,357,360,480};
        g.setColor(Color.BLACK);
        g.drawPolygon(XDoor1, YDoor1, XDoor1.length);
        g.setColor(Color.WHITE);
        g.fillPolygon(XDoor1, YDoor1, XDoor1.length);
        
        g.setColor(Color.BLACK);
        g.drawLine(258,477,258,358);
        
        int[] XWindow1 = {150,150,188,188};  
        int[] YWindow1 = {425,355,360,430};
        g.setColor(Color.BLACK);
        g.drawPolygon(XWindow1, YWindow1, XWindow1.length);
        g.setColor(Color.WHITE);
        g.fillPolygon(XWindow1, YWindow1, XWindow1.length);
        
        int[] XWindow2 = {330,330,368,368};  
        int[] YWindow2 = {430,360,360,430};
        g.setColor(Color.BLACK);
        g.drawPolygon(XWindow2, YWindow2, XWindow2.length);
        g.setColor(Color.WHITE);
        g.fillPolygon(XWindow2, YWindow2, XWindow2.length);
        
        int[] XStripe1 = {120,120,380,380};  
        int[] YStripe1 = {300,270,270,300};
        g.setColor(new Color(184, 0, 31));
        g.drawPolygon(XStripe1, YStripe1, XStripe1.length);
        g.fillPolygon(XStripe1, YStripe1, XStripe1.length);
        
        int[] XAnu1 = {165,165,295,350,350};  
        int[] YAnu1 = {268,45,7,7,268};
        g.setColor(Color.BLACK);
        g.drawPolygon(XAnu1, YAnu1, XAnu1.length);
        g.setColor(Color.WHITE);
        g.fillPolygon(XAnu1, YAnu1, XAnu1.length);
        
        int[] XAnu2 = {165,165,295,350,180,180};  
        int[] YAnu2 = {268,45,7,7,60,268};
        g.setColor(Color.BLACK);
        g.drawPolygon(XAnu2, YAnu2, XAnu2.length);
        g.fillPolygon(XAnu2, YAnu2, XAnu2.length);
        
     }
    protected void createBuilding3(Graphics2D g){

        int[] XBuilding3Side1 = {725,725,765,840,840};  
        int[] YBuilding3Side1 = {465,9,9,60,438};
        g.setColor(new Color(30, 42, 94));
        g.drawPolygon(XBuilding3Side1, YBuilding3Side1, XBuilding3Side1.length);
        g.fillPolygon(XBuilding3Side1, YBuilding3Side1, XBuilding3Side1.length);
        
        int[] XBuilding3Side2 = {615,615,660,725,725};  
        int[] YBuilding3Side2 = {120,25,9,9,120};
        g.setColor(new Color(124, 147, 195));
        g.drawPolygon(XBuilding3Side2, YBuilding3Side2, XBuilding3Side2.length);
        g.fillPolygon(XBuilding3Side2, YBuilding3Side2, XBuilding3Side2.length);
        
        int[] XDoor = {765,765,805,805};  
        int[] YDoor = {455,370,380,445};
        g.setColor(Color.WHITE);
        g.drawPolygon(XDoor, YDoor, XDoor.length);
        g.fillPolygon(XDoor, YDoor, XDoor.length);
        g.setColor(Color.BLACK);
        drawCenteredCircle(g,800,415,7);
        
        
        
        int[] XBalcony1 = {740,740,830,830};  
        int[] YBalcony1 = {305,250,270,325};
        g.setColor(Color.WHITE);
        g.drawPolygon(XBalcony1, YBalcony1, XBalcony1.length);
        g.fillPolygon(XBalcony1, YBalcony1, XBalcony1.length);
        
        int[] XBalcony1Shadow = {813,815,830,830};  
        int[] YBalcony1Shadow = {323,265,268,326};
        g.setColor(new Color(117, 134, 148));
        g.drawPolygon(XBalcony1Shadow, YBalcony1Shadow, XBalcony1Shadow.length);
        g.fillPolygon(XBalcony1Shadow, YBalcony1Shadow, XBalcony1Shadow.length);
        
        int[] XBalcony2 = {740,740,830,830};  
        int[] YBalcony2 = {225,170,195,250};
        g.setColor(Color.WHITE);
        g.drawPolygon(XBalcony2, YBalcony2, XBalcony2.length);
        g.fillPolygon(XBalcony2, YBalcony2, XBalcony2.length);
        
        int[] XBalcony1Shadow2 = {815,815,830,830};  
        int[] YBalcony1Shadow2 = {248,190,195,250};
        g.setColor(new Color(117, 134, 148));
        g.drawPolygon(XBalcony1Shadow2, YBalcony1Shadow2, XBalcony1Shadow2.length);
        g.fillPolygon(XBalcony1Shadow2, YBalcony1Shadow2, XBalcony1Shadow2.length);
        
        
        int[] XBalcony3 = {740,740,830,830};  
        int[] YBalcony3 = {150,95,125,175};
        g.setColor(Color.WHITE);
        g.drawPolygon(XBalcony3, YBalcony3, XBalcony3.length);
        g.fillPolygon(XBalcony3, YBalcony3, XBalcony3.length);
        
        int[] XBalcony1Shadow3 = {815,815,830,830};  
        int[] YBalcony1Shadow3 = {172,120,125,176};
        g.setColor(new Color(117, 134, 148));
        g.drawPolygon(XBalcony1Shadow3, YBalcony1Shadow3, XBalcony1Shadow3.length);
        g.fillPolygon(XBalcony1Shadow3, YBalcony1Shadow3, XBalcony1Shadow3.length);
        
        
        
        
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
