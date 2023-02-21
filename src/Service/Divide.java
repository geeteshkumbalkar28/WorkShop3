package Service;


import Interface.IWorkShopInterFace;


import java.util.LinkedList;

public class Divide implements IWorkShopInterFace
{
    public void DivisibleBythree(LinkedList list)
    {
        for(int i=0; i<=500/3;i++)
        {
            if(i%3 == 0)
            {
                list.add(i);
            }
        }
    }

    public void DivisibleByFive(LinkedList list1)
    {
        for(int i=0; i<=500/4;i++)
        {
            if(i%5 == 0)
            {
                list1.add(i);
            }
        }

    }
    public void DivisibleSeven(LinkedList list2)
    {
        for(int i=0; i<=500/7;i++)
        {
            if(i%7 == 0)
            {
                list2.add(i);
            }
        }

    }
    public void Display(LinkedList list)
    {
        for (int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
    }





}

