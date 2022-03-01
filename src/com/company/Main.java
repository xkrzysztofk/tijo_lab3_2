package com.company;

public class Main {

    public static void main(String[] args) {

                final int POINTS = 2;
                Point2D[] points = new Point2D[POINTS];
                MaterialPoint2D[] materialPoints = new MaterialPoint2D[POINTS];

                points[0] = new Point2D(0.0, 0.0);
                points[1] = new Point2D(10.0, 10.0);

                materialPoints[0] = new MaterialPoint2D(0.0, 0.0, 10);
                materialPoints[1] = new MaterialPoint2D(10.0, 10.0, 100);

                Point2D geometricCenter = Calculations.positionGeometricCenter(points);
                Point2D massCenter = Calculations.positionCenterOfMass(materialPoints);

                System.out.println("Polozenie srodka masy: " + massCenter);
                System.out.println("Polozenie srodka geometrycznego: " + geometricCenter);
    }
}
