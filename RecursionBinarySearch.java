import java.util.*;
public class RecursionBinarySearch
{
    int binsearch(int low,int high, int n[],int k)
    {
        int mid=(high+low)/2;
        if (n[mid]==k)
        return mid+1;
        else if (high<low)
        return -1;
        else if (k>n[mid])
        return binsearch(mid+1,high,n,k);
        else 
        return binsearch(low,mid-1,n,k);
    
    }
    public void main()
    {
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter the number of terms");
        int n=SC.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the values");
        for (int i=0;i<n;i++)
        {
            a[i]=SC.nextInt();
        }
        System.out.println("Enter term to be searched");
        int k=SC.nextInt();
        int pos=binsearch(0,n-1,a,k);
        if (pos==-1)
        System.out.println("Not found");
        else
        System.out.println("Position="+pos);
    }
}