/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package computertest;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 *
 * @author Ivelina
 */
public class Computer implements IComputer{
    private boolean isTurnedOn;
    
    public Computer()
    {
        this.isTurnedOn = false;
    }
    
    @Override
    public void turnOn()
    {
        if (isTurnedOn) {
            throw new IllegalThreadStateException("SmartPhone is already turned on!");
        }
        else
        {
            System.out.println("Welcome!");
            isTurnedOn = true;
        }
    }
    
    @Override
    public void shutDown()
    {
        if (!isTurnedOn) {
            throw new IllegalThreadStateException("SmartPhone is already turned off!");
        }
        else
        {
            System.out.println("Good bye!");
            isTurnedOn = false;
        }
    }
    
    @Override
    public void restart()
    {
        if (!isTurnedOn) {
            throw new IllegalThreadStateException("SmartPhone is not working!");
        }
        else
        {
            isTurnedOn = false;
            System.out.println("Good bye!... Welcome!");
            isTurnedOn = true;
        }
    }
    
    @Override
    public void openGoogle()
    {
        try
        {
            if(Desktop.isDesktopSupported())
            {
              Desktop.getDesktop().browse(new URI("http://www.google.com"));
            }
        }
        catch(URISyntaxException | IOException e)
                {
                    System.out.println(e.toString());
                }
    }
}
