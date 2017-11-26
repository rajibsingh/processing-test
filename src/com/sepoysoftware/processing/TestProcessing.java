package com.sepoysoftware.processing;

import processing.core.PApplet;

public class TestProcessing extends PApplet {
    Ball ball;

    public static void main(String[] args) {
        print("running");
        PApplet.main("com.sepoysoftware.processing.TestProcessing");
    }

    public void settings() {
        size(800, 800);
    }

    public void setup() {
        ball = new Ball(0, 0, 5.0,5.0, this);
    }

    public void draw() {
        background(255);
        ball.draw();
    }
}
