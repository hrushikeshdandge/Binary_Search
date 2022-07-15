import java.io.*;
import java.util.*;
public class Binary_Search
{
    public void search_method(int a[],int search)
    {
        int flag=0;
        int start=0,end=a.length-1,mid=0;
        while(end>=start)
        {
            mid=start+(end-start)/2;
            if(a[mid]==search)
            {
                flag=1;
                System.out.println("FOund elemnet at index" + mid);
                break;
            }
            else if(a[mid]>search)
            {
                end=mid-1;
            }
            else if(a[mid]<search)
            {
                start=mid+1;
            }
        }
        if(flag==0)
        {
            System.out.println("Not found in array");
        }
    }
    public static void main(String args[])
    {
        Binary_Search obj=new Binary_Search();
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter the size of the array ");
        int size=sc.nextInt();
        int a[]=new int[size];
        System.out.println("ENter the elemnets in the array");
        for(int i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("ENter the elment to search in array ");
        int search=sc.nextInt();
        obj.search_method(a,search);
    }
}