import java.io.*;
import java.util.*;
public class Minimum_difference_Easy
{
    public void bs(int a[],int target)
    {
        int start=0,end=a.length-1;
        int mid=0,result=0;
        int temp=0;
        while(end>=start)
        {
            mid=start+(end-start)/2;

            if(a[mid]==target)
            {
               temp=a[mid];
              // flag=1;
               break;
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
        

        if(temp!=0 )
        {
            System.out.println("Minimum difference is " + 0);
        }
        else if(a[a.length-1]<target)
        {
            int c=target-(a[a.length-1]);
            System.out.println("Minimum difference is "+ c);
        }
        else
        {
            int c=a[start]-target;
            int f=target-a[end];
            if(f<c)
                System.out.println("Minimum difference is " + f);
            else if(c<f)
                System.out.println("Minimum difference is " + c);

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
        Minimum_difference_Easy obj=new Minimum_difference_Easy();
        System.out.println("ENter the numnber");
        int num=sc.nextInt();
        obj.bs(a,num);
    }
}