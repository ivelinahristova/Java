/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pointtest;

import javax.swing.JOptionPane;

/**
 *
 * @author Ivelina
 */
public class PointTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Point firstPoint = new Point();
        double x,y;
        x = Double.parseDouble(JOptionPane.showInputDialog("Enter the X of your point:"));
        y = Double.parseDouble(JOptionPane.showInputDialog("Enter the Y of your point:"));
        firstPoint.setX(x);
        firstPoint.setY(y);
        JOptionPane.showMessageDialog(null, "Your point is " + firstPoint.toString());
        double targetX = Double.parseDouble(JOptionPane.showInputDialog("Enter the X of second point:"));
        double targetY = Double.parseDouble(JOptionPane.showInputDialog("Enter the Y of second point:"));
        Point secondPoint = new Point(targetX,targetY);
        JOptionPane.showMessageDialog(null, "The distance between " + firstPoint.toString() + "and " + secondPoint.toString() + "is " + firstPoint.distanceTo(secondPoint));
    }
}
