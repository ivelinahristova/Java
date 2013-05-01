/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datetest;


public class DateTime {
int days;
int months;
int years;
int hours;
int seconds;
int miliseconds;
public DateTime()
{}
public DateTime(int days, int months, int years, int hours, int seconds, int miliseconds)
{
    this.days = days;
    this.months = months;
    this.years = years;
    this.hours = hours;
    this.seconds = seconds;
    this.miliseconds = miliseconds;
    
}

public Boolean IsAfter(DateTime other)
{
    Boolean isIt;
    if (this.years > other.years) {
        return true;
    }
    else
        if (this.years == other.years) 
        {
        
            
             if (this.months > other.months) 
             {
                return true;
             }
            else
                if (this.months == other.months) 
                {
        
                    if (this.days > other.days) 
                    {
                        return true;
                    }
                    else return false;
            
                }
        else return false;
        }
        else return false;
}
}
