/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datetest;

public class DateTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DateTime firstDate = new DateTime(1,1,2012,15,20,12);
        DateTime secondDate = new DateTime(2, 3, 2013, 17, 28, 37);
        System.out.println(String.format("Въведена дата, %s-%s-%s", firstDate.days, firstDate.months, firstDate.years));
        System.out.println(String.format("Въведена дата, %s-%s-%s", secondDate.days, secondDate.months, secondDate.years));
        if (firstDate.IsAfter(secondDate)) {
            System.out.println("Invalid Date");
        }
        else
        {
            System.out.println("Valid Date");
        }
        
    }
}
