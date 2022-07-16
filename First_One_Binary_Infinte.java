import java.io.*;
import java.util.*;
public class First_One_Binary_Infinte
{
    public int First_bs(int a[],int start,int end)
    {
        //System.out.println("check0");
        int mid=0,result=-1;
        while(end>=start)
        {
            mid=start+(end-start)/2;
            if(a[mid]==1)
            {
                result=mid;
                end=mid-1;
            }
            else if(1<a[mid])
            {
                end=mid-1;
            }
            else// if(1>a[mid])
            {
                start=mid+1;
            }
        }
        return result;
    }
    public void check(int a[])
    {
        int start=0,end=1;

        while(1>a[end] && end<a.length-1)
        {
            start=end;
            if(end*2 < a.length-1)
            {
                end=end*2;
            }
            else
            {
                end=a.length-1;
            }

            
        }

       
        if(First_bs(a,start,end)!=-1)
        System.out.println(First_bs(a,start,end));
        else
        System.out.println("Not found");
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
        First_One_Binary_Infinte obj=new First_One_Binary_Infinte();
       
        obj.check(a);
    }
}