import java.io.*;
import java.util.*;
public class Count_Element_Sorted
{
    public void count(int a[], int element)
    {
        if(First(a,element)!=-1)
        {
            int count1=Second(a,element)-First(a,element)+1;
            System.out.println("Count " +count1);
        }
        else
        {
            System.out.println("Element is not present");
        }
    }


     public int First(int a[],int search)
    {
        int start=0,end=a.length-1,mid=0;
        int result=-1;

        while(end>=start)
        {
            mid=start+(end-start)/2;
            if(a[mid]==search)
            {
                result=mid;
                end=mid-1;
            }
            else if( search < a[mid])
            {
                end=mid-1;
            }
            else 
            {
                start=mid+1;
            }
        }
        return result;
    }

    public int Second(int a[],int search)
    {
        int start=0,end=a.length-1,mid=0,flag=0,result=-1;

        while(end>=start)
        {
            mid=start+(end-start)/2;
            if(a[mid]==search)
            {
                result=mid;
                start=mid+1;
            }
            else if( search > a[mid] )
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return result;
    }

     public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Count_Element_Sorted obj=new Count_Element_Sorted();
        System.out.println("ENter the size of the array");
        int size=sc.nextInt();
        int a[]=new int[size];
        System.out.println("ENter the elements in array ");
        for(int i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the search element ");
        int search=sc.nextInt();
        obj.count(a,search);
    }
}