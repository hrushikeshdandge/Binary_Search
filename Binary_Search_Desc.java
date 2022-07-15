import java.io.*;
import java.util.*;
public class Binary_Search_Desc
{
    public void search_method(int a[],int search)
    {
        int flag=1,start=0,mid=0,end=a.length-1;
        while(end>=start)
        {
            mid=start+(end-start)/2;
            if(a[mid]==search)
            {
                System.out.println("Element found at index "+ mid);
                flag=0;
                break;
            }
            else if(a[mid]>search)
            {
                start=mid+1;
            }
            else if(a[mid]<search)
            {
                
                end=mid-1;
            }
        }
        if(flag==1)
        {
            System.out.println("Not found ");
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Binary_Search_Desc obj=new Binary_Search_Desc();
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