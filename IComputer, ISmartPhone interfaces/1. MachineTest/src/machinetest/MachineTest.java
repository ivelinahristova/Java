/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package machinetest;

/**
 *
 * @author Ivelina
 */
public class MachineTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Car newCar = new Car();
        newCar.powerOn();
        newCar.drive();
        newCar.powerOff();
        
        Truck newTruct = new Truck();
        newTruct.powerOn();
        newTruct.drive();
        newTruct.powerOff();
    }
}
