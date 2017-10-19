import java.util.*;
class Ragged{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[10][10];
        for(int i=0;i<3;i++)
        {
            int x=sc.nextInt();
            for(int j=1;j<=x;j++)
                a[i][j]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
                    if(a[i][j]!=0)
                System.out.printf("%d ",a[i][j]);
            System.out.println();
        }
    }
}

