/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package computertest;

/**
 *
 * @author Ivelina
 */
public class RingTone {
    private String autorName;
    private String songName;
    private int songLenghtInSec;
    
    public RingTone(String autorName, String songName, int songLength)
    {
        this.autorName = autorName;
        this.songLenghtInSec = songLength;
        this.songName = songName;
    }
    
    public String getAutorName()
    {
        return this.autorName;
    }
    
    public void setAutorName(String autorName)
    {
        this.autorName = autorName;
    }
    
    public String getSongName()
    {
        return this.songName;
    }
    
    public void setSongName(String songName)
    {
        this.songName = songName;
    }
    
    public int getSongLength()
    {
        return this.songLenghtInSec;
    }
    
    public void setSingLength(int songLength)
    {
        this.songLenghtInSec = songLength;
    }
}
