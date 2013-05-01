/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pointtest;

/**
 *
 * @author Ivelina
 */
public class Point {
    
    private double x,y;
    
    public double getX()
    {
        return this.x;
    }
    public void setX(double x)
    {
        this.x = x;
    }
    public double getY()
    {
        return this.y;
    }
    public void setY(double y)
    {
        this.y = y;
    }
    public Point()
    {
        this.x = 0;
        this.y = 0;
    }
    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    public Point(Point point)
    {
        this.x = point.x;
        this.y = point.y;
    }
    
    @Override
    public String toString()
    {
        
        return String.format("(%s,%s)",this.x,this.y);
    }
    public double distanceTo(Point pointTarget)
    {
        return Math.sqrt(Math.pow(pointTarget.x - this.x, 2) + Math.pow(pointTarget.y - this.y, 2));
    }
    public double distanceFrom(Point pointTarget)
    {
        return Math.sqrt(Math.pow(this.x - pointTarget.x, 2) + Math.pow(this.y - pointTarget.y, 2));
    }
    public double distanceFrom(Point pointSource,Point pointTarget)
    {
        return Math.sqrt(Math.pow(pointSource.x - pointTarget.x, 2) + Math.pow(pointSource.y - pointTarget.y, 2));
    }
}
