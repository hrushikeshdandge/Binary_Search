import java.io.*;
import java.util.*;
public class Sorted_Array_Rotates
{
    public void rotates(int a[])
    {
        int start=0,mid=0,end=a.length-1;
        int flag=0;
        
        while(end>=start)
        {
            mid=start+(end-start)/2;
            int prev=(mid - 1 + a.length) % a.length;
            int next=(mid+1)%a.length;

            if(a[mid]<a[prev] && a[mid]<a[next] )
            {
                System.out.println("number of times rotated is " + mid);
                flag=1;
                break;
            }
            else if(a[mid]<=a[end])
            {
                end=mid-1;
            }
            else if(a[start]<=a[mid])
            {
                start=mid+1;
            }            

        }
        if(flag==0)
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
        Sorted_Array_Rotates obj=new Sorted_Array_Rotates();
        obj.rotates(a);
    }
}