import java.io.*;
import java.util.*;
public class Peak
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
        Peak obj=new Peak();
       System.out.println(" index of peek is "+ obj.peek_method(a) ) ;
    }
}