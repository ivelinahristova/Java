/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package computertest;

/**
 *
 * @author Ivelina
 */
public class ComputerTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Computer hp = new Computer();
        hp.turnOn();
        hp.restart();
        hp.shutDown();
        hp.turnOn();
        hp.openGoogle();
        hp.shutDown();
        
        SmartPhone samsung = new SmartPhone();
        samsung.turnOn();
        samsung.openGoogle();
        
        RingTone ringTone = new RingTone("Kilata", "I am six", 202);
        
        samsung.setRingTone(ringTone);
        samsung.answer();
        samsung.shutDown();
    }
}
