import java.io.*;
import java.util.*;
public class Search_Bitonic
{
    public int peek_method(int a[])
    {
        int s=0;
        int e=a.length-1;
        int mid=0;
        while(e>=s)
        {
            mid=s+(e-s)/2;

            if( mid >0 && mid < a.length-1 )
            {
                if(a[mid]> a[mid-1] && a[mid]>a[mid+1])
                {
                   return mid;
                }
                else if(a[mid-1]>a[mid])
                {
                    e=mid-1;
                }
                else if(a[mid+1]>a[mid])
                {
                    s=mid+1;
                }
            }

            else if(mid==0)
            {
                if(a[mid]>a[mid+1])
                {
                    return 0;
                }
                else
                {
                    return 1;
                }
            }

            else if(mid==a.length-1)
            {
                if(a[a.length-1]>a[a.length-2])
                {
                    return a.length-1;
                }
                else
                {
                    return a.length-2;
                }
            }
         
        }
           return 0;
        
    }

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
    public void check(int a[],int target)
    {
        int peek_index=peek_method(a);
        if(bs(a,0,peek_index,target)!=-1)
        System.out.println(bs(a,0,peek_index,target));
        if(bs(a,peek_index+1,a.length-1,target)!=-1)
        System.out.println(bs(a,peek_index+1,a.length-1,target));

    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of  array ");
        int size=sc.nextInt();
        int a[]=new int[size];
        System.out.println("Enter the elements of the array o or 1 ");
        for(int i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
        Search_Bitonic obj=new Search_Bitonic();
        System.out.println("enter the target to search");
        int target=sc.nextInt();
        obj.check(a,target);
      
    }
}