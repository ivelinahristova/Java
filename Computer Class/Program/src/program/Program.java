/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Computer comp1 = new Computer(1, "HP");
        Computer comp2 = new Computer();
        comp2.number = 2;
        comp2.model = "Acer";
        comp1.StartUp();
        comp1.StartUp();
        comp1.ShutDown();
        
        
        comp2.StartUp();
        comp2.DoWork();
        comp2.ShutDown();
        comp2.DoWork();
        
    }
}
