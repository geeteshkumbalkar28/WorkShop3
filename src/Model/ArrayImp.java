package Model;

import Interface.WorkShopArray;

import java.util.List;

public class ArrayImp implements WorkShopArray {
    public static void DivisibleBythree(List list)
    {
        for(int i = 0; i<=500;i++)
        {
            if(i%3==0)
            {

                list.add(i);

            }
        }

    }
    public static void DivisibleByfive(List list1)
    {
        for(int i = 0; i<=500;i++)
        {
            if(i%5==0)
            {

                list1.add(i);

            }
        }

    }
    public static void DivisibleByseven(List list2)
    {
        for(int i = 0; i<=500;i++)
        {
            System.out.println("Number divide by 7 is ");
            if(i%7==0)
            {
                list2.add(i);

            }
        }

    }
    public static void DisplayList(List list)
    {
        System.out.println("Number divide by 3 is ");
        for(int a = 1; a<list.size();a++)
        {
            System.out.println(list.get(a));

        }

    }
    public static void DisplayList1(List list1)
    {
        System.out.println("Number divide by 5 is ");
        for(int a = 1; a<list1.size();a++)
        {
            System.out.println(list1.get(a));

        }

    }
    public static void DisplayList2(List list2)
    {
        System.out.println("Number divide by 7 is ");
        for(int a = 1; a<list2.size();a++)
        {
            System.out.println(list2.get(a));

        }

}
    private static boolean priemNo(int num)
    {
        if(num<=1)
        {
            return false;
        }
        for(int i=2;i<=num/2;i++)
        {
            if(num%i == 0)
            {
                return false;
            }
        }
        return true;

    }
    public static void DisplayPrime(List list3)
    {
        System.out.println("prime no is:");
        for(int i=0;i<=500;i++)
        {
            if(priemNo(i))
            {
                System.out.println(i);

            }
        }
    }
}
