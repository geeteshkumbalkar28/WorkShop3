package Controler;

import Model.ArrayImp;

import java.util.ArrayList;
import java.util.List;

public class WorkshopMain {
    private static List<Integer> list = new ArrayList<>();
    private static List<Integer> list1 = new ArrayList<>();
    private static List<Integer> list2 = new ArrayList<>();
    private static List<Integer> primeNoList = new ArrayList<>();
    public static void main(String[] args) {

        int counter1=0,counter2 = 0,counter3=0;

        ArrayImp.DivisibleBythree(list);
        ArrayImp.DivisibleByfive(list1);
        ArrayImp.DivisibleByfive(list2);
        ArrayImp.DisplayList(list);
        ArrayImp.DisplayList1(list1);
        ArrayImp.DisplayList2(list2);
        ArrayImp.DisplayPrime(primeNoList);
//        for(int j= 0;j<=500;j++)
//        {
//            if(j%5==0)
//            {
//                list2.add(j);
//            }
//        }
//        for(int k = 0; k<=500;k++)
//        {
//            if(k%7==0)
//            {
//                list2.add(k);
//            }
//        }
//
//         System.out.println("Number divide by 5 is ");
//        for(int a = 1; a<list1.size();a++)
//        {
//            System.out.println(list1.get(a));
//
//        } System.out.println("Number divide by 7 is ");
//        for(int a = 1; a<list2.size();a++)
//        {
//            System.out.println(list2.get(a));
//
//        }



    }
}
