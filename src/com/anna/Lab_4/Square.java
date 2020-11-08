package com.anna.Lab_4;

import java.io.Serializable;

public class Square implements IFigure, Serializable {

    private double length;


    public Square(){

    }

    public Square(double length)
    {
        this.length = length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public double getDiagonal(){
        return this.length * Math.sqrt(2);
    }

    public double getPerim(){
        return this.length * 4;
    }

    public double getS(){
        return this.length * this.length;
    }

    public String toString(){
        return "\nSquare length = " + this.length+'\n'
                + "  Square diagonal = " + this.getDiagonal()+'\n'
                + "  Square Perim = " + this.getPerim()+'\n'
                + "  Square S = " + this.getS();
    }
}



//    private double radius;
//    private double length;
//    private double square;
//
//
//    public Circle(final double radius)
//    {
//        this.setRadius(radius);
//        this.setLength();
//        this.setSquare();
//    }
//
//    public Circle(){}
//
//    public Circle(Double length, Double radius, Double square) {
//        this.length = length;
//        this.radius = radius;
//        this.square = square;
//    }
//
//    public void setLength()
//    {
//        this.length = Math.round(2 * Math.PI * this.radius);
//    }
//
//    public void setSquare()
//    {
//        this.square = Math.round(Math.PI * (Math.pow(this.radius, 2)));
//    }
//
//    public double getRadius()
//    {
//        return this.radius;
//    }
//
//    /**
//     * Calculates the radius
//     *
//     * @param radius radius of the circle
//     */
//    public void setRadius(final double radius)
//    {
//        if (radius > 0) {
//            this.radius = radius;
//        }
//        else {
//            this.radius = 1;
//        }
//    }
//
//    @Override
//    public String toString()
//    {
//        return "\nCircle\nRadius: " + radius + "\nLength: " + getLength() + "\nSquare: " + getSquare() + "\n";
//    }
//
//    public double getLength()
//    {
//        return length;
//    }
//
//    public double getSquare()
//    {
//        return square;
//    }
//}
