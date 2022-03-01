package com.company;

public class MaterialPoint2D extends Point2D{
    protected double mass;
    MaterialPoint2D(double x, double y, double mass){
        super(x,y);
        this.mass=mass;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    @Override
    public String toString() {
        return
                "{mass=" + mass +
                " x=" + x +
                " y= " + y +
                '}';
    }
}
