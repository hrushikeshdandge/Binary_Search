import java.io.*;
import java.util.*;
public class Position_element_Infinite 
{
    public int bs(int a[], int start,int end,int target)
    {
        int mid=0;
        while(end>=start)
        {
            mid=start+(end-start)/2;
            if(a[mid]==target)
            {
                return mid;
            }
            else if(target<a[mid])
            {
                end=mid-1;
            }
            else if(target>a[mid])
            {
                start=mid+1;
            }
        }
        return -1;
    }

    public void check(int a[], int target)
    {
        int start=0;
        int end=1;
        

       while(target>a[end])
       {
            start=end;
            if(end*2<a.length-1)
            {
                end=end*2;
            }
            else
            {
                end=a.length-1;
            }

           
       }

        if(bs(a,start,end,target)!=-1)
        System.out.println("position is " + bs(a,start,end,target));
        else
        System.out.println("Not found");
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
        Position_element_Infinite obj=new Position_element_Infinite();
        System.out.println("enter the elemebt for search");
        int ele=sc.nextInt();
        obj.check(a,ele);
    }
}