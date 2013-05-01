/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cafemachinetest;

/**
 *
 * @author Ivelina
 */
public class CafeMachine {
    
    int coins1;
    int coins2;
    int coins5;
    int coins10;
    int coins20;
    int coins50;
    int coins100;
    
    public CafeMachine()
    {
        this.coins1 = 0;
        this.coins2 = 0;
        this.coins5 = 0;
        this.coins10 = 0;
        this.coins20 = 0;
        this.coins50 = 0;
        this.coins100 = 0;
    }
    
    public CafeMachine(int coins1, int coins2, int coins5, int coins10, int coins20, int coins50, int coins100)
    {
        this.coins1 = coins1;
        this.coins2 = coins2;
        this.coins5 = coins5;
        this.coins10 = coins10;
        this.coins20 = coins20;
        this.coins50 = coins50;
        this.coins100 = coins100;
        
        
    }
    
    public int checkTotal()
    {
        int sum = 0;
        sum += this.coins1;
        sum += 2*this.coins2 + 5*this.coins5 + 10*this.coins10 + 20*this.coins20 + 50*this.coins50 + 100*this.coins100;
        return sum;
    }
    @Override
    public String toString()
    {
        return String.format("1 stotinka: %s \n2 stotinki: %s \n5 stotinki: %s \n10 stotinki: %s \n20 stotinki: %s \n50 stotinki: %s \n1 lev: %s", this.coins1, this.coins2, 
                this.coins5, this.coins10, this.coins20, this.coins50, this.coins100);
        
    }
    public String takeResto(int resto)
    {
        int restoCount1 = 0, restoCount2 = 0, restoCount5 = 0, restoCount10 = 0;
        int restoCount20 = 0, restoCount50 = 0, restoCount100 = 0;
        while(this.coins100 >= 1 && resto>=100)
        {
            this.coins100--;
            resto -=100;
            restoCount100++;
        }
        while(this.coins50 >= 1 && resto>=50)
        {
            this.coins50--;
            resto -=50;
            restoCount50++;
        }
        while(this.coins20 >= 1 && resto>=20)
        {
            this.coins20--;
            resto -=20;
            restoCount20++;
        }
        while(this.coins10 >= 1 && resto>=10)
        {
            this.coins10--;
            resto -=10;
            restoCount10++;
        }
        while(this.coins5 >= 1 && resto>=5)
        {
            this.coins5--;
            resto -=5;
            restoCount5++;
        }
        while(this.coins2 >= 1 && resto>=2)
        {
            this.coins2--;
            resto -=2;
            restoCount2++;
        }
        while(this.coins1 >= 1 && resto>=1)
        {
            this.coins1--;
            resto -=1;
            restoCount1++;
        }
        StringBuilder toString = new StringBuilder();
        if(restoCount100 != 0)
        {
            if (restoCount100 == 1) {
                toString.append("1 монета от 1 лев\n");
            }
            else
            {
                toString.append(restoCount100);
                toString.append(" монети от 1 лев\n");
                        
            }
        }
        if(restoCount50 != 0)
        {
            if (restoCount50 == 1) {
                toString.append("1 монета от 50 стотинки\n");
            }
            else
            {
                 toString.append(restoCount50);
                toString.append(" монети от 50 стотинки\n");
            }
        }
        if(restoCount20 != 0)
        {
            if (restoCount20 == 1) {
                toString.append("1 монета от 20 стотинки\n");
            }
            else
            {
                toString.append(restoCount20);
                toString.append(" монети от 20 стотинки\n");
            }
        }
        if(restoCount10 != 0)
        {
            if (restoCount10 == 1) {
                toString.append("1 монета от 10 стотинки\n");
            }
            else
            {
                toString.append(restoCount10);
                toString.append(" монети от 10 стотинки\n");
            }
        }
        if(restoCount5 != 0)
        {
            if (restoCount5 == 1) {
                toString.append("1 монета от 5 стотинки\n");
            }
            else
            {
                toString.append(restoCount5);
                toString.append(" монети от 5 стотинки\n");
            }
        }
        if(restoCount2 != 0)
        {
            if (restoCount2 == 1) {
                toString.append("1 монета от 2 стотинки\n");
            }
            else
            {
                toString.append(restoCount2);
                toString.append(" монети от 2 стотинки\n");
            }
        }
        if(restoCount1 != 0)
        {
            if (restoCount1 == 1) {
                toString.append("1 монета от 1 стотинка\n");
            }
            else
            {
                toString.append(restoCount1);
                toString.append(" монети от 1 стотинкa\n");
            }
        }
        System.out.println(toString);
        return toString.toString();
    }
    
}