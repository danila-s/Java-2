package ru.geekbrains.java2.lesson1;

import javax.swing.*;
import java.awt.*;

public class BackGround extends JPanel {
    static long timer = 0;

    BackGround(GameCanvas canvas){
     timer++;
     if(timer%1200==0)canvas.setBackground(Color.BLACK);
     else if(timer%900==0)canvas.setBackground(Color.DARK_GRAY);
     else if(timer%600==0)canvas.setBackground(Color.cyan);
     else if(timer%300==0)canvas.setBackground(Color.BLUE);
     if(timer==2147483647)timer=0;

        }
    }


