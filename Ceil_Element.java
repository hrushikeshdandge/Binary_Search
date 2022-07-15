import java.io.*;
import java.util.*;
public class Ceil_Element
{
    public void floor_method(int a[],int element)
    {
        int start=0;
        int end=a.length-1;
        int mid=0;
        int result=0;

        while(end>=start)
        {
            mid=start+(end-start)/2;
            if(a[mid]>=element)
            {
                result=a[mid];
                end=mid-1;
            }
            else if(a[mid]<element)
            {
                start=mid+1;
            }
            else if(element<a[mid])
            {
                end=mid-1;
            }
            
        }
        System.out.println("Ceil of " + element +" is "+ result);
    }
     public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int size=sc.nextInt();
        int a[]=new int[size];
        System.out.println("Enter the elements of the array ");
        for(int i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
        Ceil_Element obj=new Ceil_Element();
        System.out.println("enter the elemebt for floor");
        int ele=sc.nextInt();
        obj.floor_method(a,ele);
    }
}