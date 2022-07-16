import java.io.*;
import java.util.*;
public class Next_Alphabet
{
    public void Next_A(char a[],char element)
    {
        int start=0;
        int end=a.length-1;
        int mid=0;
        char result=' ';

        while(end>=start)
        {
            mid=start+(end-start)/2;
            if(a[mid]>element)
            {
                result=a[mid];
                end=mid-1;
              
            }
            else if(a[mid]<element)
            {
                start=mid+1;
            }
            else //if(element<a[mid])
            {
                //result=a[mid];
                end=mid-1;
            }
            
        }
        System.out.println("Ceil of " + element +" is "+ result);
    }
     public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of char array ");
        int size=sc.nextInt();
        char a[]=new char[size];
        System.out.println("Enter the alphabets of the array ");
        for(int i=0;i<size;i++)
        {
            a[i]=sc.next().charAt(0);
        }
        Next_Alphabet obj=new Next_Alphabet();
        System.out.println("enter the char for next alphabet");
        char ele=sc.next().charAt(0);
        obj.Next_A(a,ele);
    }
}