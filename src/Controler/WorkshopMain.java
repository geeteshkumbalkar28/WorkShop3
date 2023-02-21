package Controler;

import Service.PrimeNo;

import java.util.LinkedList;

public class WorkshopMain {
    private static LinkedList<Integer> list = new LinkedList<>();
    private static LinkedList<Integer> list1 = new LinkedList<>();
    private static LinkedList<Integer> list2 = new LinkedList<>();
    private static LinkedList<Integer> primeNoList = new LinkedList<>();
    public static void main(String[] args)
    {
        PrimeNo primeNo = new PrimeNo();

        primeNo.DivisibleBythree(list);
        primeNo.DivisibleByFive(list1);
        primeNo.DivisibleSeven(list2);
        System.out.println("Divide by 3");
        primeNo.Display(list);

        System.out.println("Divide by 5");
        primeNo.Display(list1);

        System.out.println("Divide by 7");
        primeNo.Display(list2);
        primeNo.primeNo(primeNoList);


//        ArrayImp.DivisibleByfive(list1);
//        ArrayImp.DivisibleByfive(list2);
//        ArrayImp.DisplayList(list);
//        ArrayImp.DisplayList1(list1);
//        ArrayImp.DisplayList2(list2);
//        ArrayImp.DisplayPrime(primeNoList);

    }
}
