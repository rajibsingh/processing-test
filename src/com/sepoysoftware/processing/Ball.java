package com.sepoysoftware.processing;

import processing.core.PApplet;

public class Ball {
    int xpos;
    int ypos;
    double xspeed;
    double yspeed;
    PApplet context;

    Ball(int xpos, int ypos, double xspeed, double yspeed, PApplet context) {
        this.xpos = xpos;
        this.ypos = ypos;
        this.xspeed = xspeed;
        this.yspeed = yspeed;
        this.context = context;
    }

    void draw() {
        move();
        context.stroke(0);
        context.fill(0);
        context.ellipse(xpos, ypos, 20, 20);
    }

    void move() {
        xpos = xpos + (int) xspeed;
        ypos = ypos + (int) yspeed;

        if (xpos < 5 || ypos > 795) {
            xspeed = -10.0 * xspeed;
        }
        if (ypos < 5 || ypos > 795) {
            yspeed = -10.0 * yspeed;
        }

        yspeed = .9995 * yspeed;
        xspeed = .9995 * xspeed;
        context.ellipse(xpos, ypos, 10, 10);

    }
}
