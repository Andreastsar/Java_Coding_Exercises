package com.company;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this(0,0);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){
        return Math.sqrt( (x-0)*(x-0) + ((y-0)*(y-0) ) );
    }

    public double distance(int x,int y){
        return Math.sqrt( (x-getX())*(x-getX()) + ((y-getY())*(y-getY()) ) );
    }

    public double distance(Point point){
        return Math.sqrt( (getX()- point.getX())*(getX()- point.getX()) + ((getY()- point.getY())*(getY()- point.getY()) ) );
    }
}
