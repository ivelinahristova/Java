/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cafemachinetest;

import java.util.Scanner;

/**
 *
 * @author Ivelina
 */
public class CafeMachineTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        CafeMachine nescafeMachine = new CafeMachine(50, 20, 40, 30, 40, 50, 6);
        System.out.println(nescafeMachine.checkTotal());
        System.out.println(nescafeMachine.toString());
        Scanner input = new Scanner(System.in);
        int resto = Integer.parseInt(input.nextLine());
        System.out.println(nescafeMachine.takeResto(resto));
        
        
    }
}
