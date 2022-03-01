package com.company;

public class Calculations {
    public static Point2D positionGeometricCenter(Point2D[] points) {
        double sumX = 0;
        double sumY = 0;
        for(Point2D point2D: points){
            sumX+=point2D.getX();
            sumY+=point2D.getY();
        }
        return new Point2D(sumX/points.length,sumY/points.length);
    }

    public static Point2D positionCenterOfMass(MaterialPoint2D[] materialPoints) {
        double massX = 0;
        double massY = 0;
        double massSum = 0;
        for(MaterialPoint2D materialPoint2D : materialPoints){
            massX+=materialPoint2D.getX()* materialPoint2D.getMass();
            massY+=materialPoint2D.getY()* materialPoint2D.getMass();
            massSum+=materialPoint2D.getMass();
        }
        return new MaterialPoint2D(massX/massSum,massY/massSum,massSum);
    }
}
