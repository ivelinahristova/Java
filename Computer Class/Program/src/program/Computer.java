/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

public class Computer {
    int number;
    String model;
    Boolean started;
    public Computer()
    {
        this.started = false;
    }
    public Computer(int number, String model)
    {
        this.number = number;
        this.model = model;
        this.started = false;
    }
    public void ShutDown()
    {
        
        if (!started) {
            System.out.println("This computer is already shutted down. You cannot shut it down again");
        }
        else
        {
            System.out.println("Computer " + this.number + " is shutting down... \n The Computer is turned off!");
            this.started = false;
        }
    }
    public void StartUp()
    {
        
        if (started) {
            System.out.println("This computer is already started up. You cannot turned it on again");
        }
        else
        {
           System.out.println("Computer " + this.number + "is starting up... \n The Computer is turned on!");
            this.started = true;
        }
    }
    public void DoWork()
    {
        if (started) {
            System.out.println("Computer is working...");
        }
        else
        {
            System.out.println("Computer is turned off. It cannot work that way.");
        }
    }
} 
