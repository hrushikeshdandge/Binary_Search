import java.io.*;
import java.util.*;
public class Binary_Search_Agnostic_Array
{
    public void search_method(int a[],int search)
    {
        int start=0,end=a.length-1,mid=0,flag=0;
        while(end>=start)
        {
            mid=start+(end-start)/2;
            if(a[mid]==search)
            {
                System.out.println("Element found at index" + mid);
                flag=1;
                break;
            }
           if(a[1]>a[0])
           {
                if(a[mid] > search)
                {
                    end=mid-1;
                }
                else if(a[mid]< search)
                {
                    start=mid+1;
                }
           } 
            
            else
            {
                if (a[mid] > search)
                {
                    start=mid+1;
                }
                else if(a[mid] < search)
                {
                    end=mid-1;
                }
            }
        }
        if(flag==0)
        {
            System.out.println("Not found");
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Binary_Search_Agnostic_Array obj=new Binary_Search_Agnostic_Array();
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
        obj.search_method(a,search);
    }

}