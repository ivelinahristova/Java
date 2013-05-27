/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package machinetest;

/**
 *
 * @author Ivelina
 */
public class Truck implements IMachine{
    @Override
    public void powerOn()
    {
        System.out.println("Truck is turned on");
    }
    
    @Override
    public void powerOff()
    {
        System.out.println("Truck is turned off");
    }
    
    @Override
    public void drive()
    {
        System.out.println("Truck is running");
    }
}
