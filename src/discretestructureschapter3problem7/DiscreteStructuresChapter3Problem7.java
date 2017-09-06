
package discretestructureschapter3problem7;

/**
 * Author: Tejas Shah Date: 10/08/2015 Due: 10/18/2015 Chapter 1 Computer Projects
 * Problem 7: Given an integer n, use the greedy algorithm to find the
 * change for n cents using quarters, dimes, nickels, and
 * pennies.
 * @author shaht_000
 */
public class DiscreteStructuresChapter3Problem7 
{

    
    public static void main(String[] args) 
    {
        int n = 93; //Set n to any number you want for the amount
        int coin[] = {25,10,5,1}; //25 for quarter, 10 for dime, 5 for nickel, 1 for penny
        int num;
        
        for(int i=0;i<coin.length;i++)
        {
            num=n/coin[i];
            System.out.println(num + " " + "$"+coin[i]);
            n-=num*coin[i];
            
            //What this code does is that it will give us an immediate output.
        }
        
    }
    
}
