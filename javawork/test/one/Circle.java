package test.one;

import javax.swing.*;
import java.awt.*;

abstract class Shape{
    abstract void draw();
    Point position;
    Shape(Point p){
        position = p;
    }
}

abstract class Round extends Shape {
    final double pi = 3.1415926;

    Round(Point p) {
        super(p);
    }

    abstract void draw();
    abstract double area();
}

class Circle extends Round{
    int radius;
    void draw() {
        drawCircle(position);
    }

    private void drawCircle(Point position) {
        System.out.println("圆心：("+ position.x + ", "+position.y + ")");
        System.out.println("半径："+radius);
    }

    double area(){
        return pi*radius*radius;
    }

    Circle (Point p, int radius){
        super(p);
        this.radius  = radius;
    }


    public static void main(String[] args){
        Point p = new Point(0,0);
        int radius = 5;
        Circle a = new Circle(p , radius);
        a.draw();
    }
}

