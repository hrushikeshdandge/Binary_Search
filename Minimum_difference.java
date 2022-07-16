import java.io.*;
import java.util.*;
public class Minimum_difference
{
    public int floor(int a[], int target)
    {
        int start=0,end=a.length-1;
        int mid=0,result=0;

        while(end>=start)
        {
            mid=start+(end-start)/2;

            if(a[mid]<=target)
            {
                result=a[mid];
                start=mid+1;
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
        return result;
    }

    public int ceil(int a[], int target)
    {
        int start=0,end=a.length-1;
        int mid=0,result=0;

        while(end>=start)
        {
            mid=start+(end-start)/2;

            if(a[mid]>=target)
            {
                result=a[mid];
                end=mid-1;
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
        return result;
    }

    public void mini(int a[],int target)
    {
        int f=target-floor(a,target);
        int c=ceil(a,target)-target;

        if(ceil(a,target)!=0)
        {
            if(f<c)
                System.out.println("Minimum difference is " + f);
            else if(c<f)
                System.out.println("Minimum difference is " + c);
            else
                System.out.println("Minimum difference is " + 0);
        }
        else
        {
            System.out.println("Minimum Difference is "+ f);
        }
        
    }

     public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of binary array ");
        int size=sc.nextInt();
        int a[]=new int[size];
        System.out.println("Enter the elements of the array o or 1 ");
        for(int i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
        Minimum_difference obj=new Minimum_difference();
        System.out.println("ENter the numnber");
        int num=sc.nextInt();
        obj.mini(a,num);
    }
}