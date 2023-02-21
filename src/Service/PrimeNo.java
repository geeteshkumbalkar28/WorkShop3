package Service;

import java.util.LinkedList;
import java.util.List;

public class PrimeNo extends Divide
{
    private static boolean checkPrime(int num)
    {
        for(int i =2;i<=num/2;i++) {
            if (num % i == 0)
            {
                return false;
            }
        }
        return true;

    }
    public void primeNo(LinkedList list)
    {
        System.out.println("prime no");
        for(int i=2; i<=500; i++)
        {
            if(checkPrime(i))
            {
                System.out.println(i);
                list.add(i);
            }
        }
    }

}
