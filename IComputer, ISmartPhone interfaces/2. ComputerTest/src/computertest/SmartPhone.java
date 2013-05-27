/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package computertest;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 *
 * @author Ivelina
 */
public class SmartPhone implements IPhone, IComputer {
    private RingTone ringTone;
    private boolean isTurnedOn;
    
    public SmartPhone()
    {
        this.isTurnedOn = false;
    }
    @Override
    public void turnOn()
    {
        if (isTurnedOn) {
            throw new IllegalThreadStateException("Computer is already turned on!");
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
            throw new IllegalThreadStateException("Computer is already turned off!");
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
            throw new IllegalThreadStateException("Computer is not working!");
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
    
    @Override
    public void call(String name)
    {
        System.out.println("Calling " + name + "...");
    }
    
    @Override
    public void answer()
    {
        System.out.println("Hi, wazza?");
    }
    
    @Override
    public void setRingTone(RingTone ringTone)
    {
        this.ringTone = ringTone;
    }
    
}
