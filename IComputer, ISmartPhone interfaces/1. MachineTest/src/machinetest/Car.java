/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package machinetest;

/**
 *
 * @author Ivelina
 */
public class Car implements IMachine{
    @Override
    public void powerOn()
    {
        System.out.println("Car is turned on");
    }
    
    @Override
    public void powerOff()
    {
        System.out.println("Car is turned off");
    }
    
    @Override
    public void drive()
    {
        System.out.println("Car is running");
    }
}
