package com.anna.Lab_4;

import java.io.Serializable;

public class Prism extends Square implements Serializable {

    private double height;

    public Prism()
    {
    }

    public Prism(double length, double height)
    {
        super.setLength(length);
        this.height = height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    //    @Override
    public void setLength(int length) {
        super.setLength(length);
    }

    @Override
    public double getLength() {
        return super.getLength();
    }

    public double getHeight() {
        return height;
    }

    public double getV(){
        return super.getS() * this.height;
    }

    @Override
    public double getS() {
        return (super.getS() * 2) + this.height * this.getLength();
    }

    @Override
    public double getDiagonal() {
        return super.getDiagonal();
    }

    @Override
    public String toString(){
        return "\nPrism length = " + this.getLength()+'\n'
                + "  Prism height = " + this.getHeight()+'\n'
                + "  Prism S = " + this.getS()+'\n'
                + "  Prism V = " + this.getV();
    }
    
    
//
//    private double height;
//    private double square;
//    private double volume;
////    private double radius;
//
//    public Cylinder(final double radius, final double height)
//    {
//        super(radius);
//        setHeight(height);
//        this.setSquare();
//        this.setVolume();
//    }
//
//    public Cylinder(Double height, Double radius, Double square, Double volume) {
//        super(radius);
//        this.height = height;
//        this.square = square;
//        this.volume = volume;
//
//    }
////    public Cylinder()
////    {
////        //this.radius = getRadius();
////        setHeight(height);
////        this.setSquare();
////        this.setVolume();
////    }
//
//    public double getVolume()
//    {
//        return volume;
//    }
//
//    public double getHeight() {
//        return height;
//    }
//
//    public void setHeight(double height)
//    {
//        if (height > 0) {
//            this.height = height;
//        }
//        else {
//            this.height = 1;
//        }
//    }
//
//    @Override
//    public void setSquare()
//    {
//        this.square = Math.round(2 * Math.PI * getRadius() * (height + getRadius()) + this.getLength() * height);
//    }
//
//    @Override
//    public String toString()
//    {
//        return "\nCylinder\nRadius: " + getRadius() + "\nHeight: " + height + "\nSquare: " + square
//                + "\nVolume: " + volume + "\n";
//    }
//
//    public void setVolume()
//    {
//        this.volume = Math.round(Math.PI * Math.pow(getRadius(), 2) * height);
//    }
//
////    @Override
////    public double getRadius() {
////        return radius;
////    }
}
