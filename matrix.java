import java.util.*;
class matrix
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of matricx 1: \n");
int m = sc.nextInt();
int n = sc.nextInt();
System.out.println("Enter the size of matricx 2: \n");
int p = sc.nextInt();
int q = sc.nextInt();
int i,j,k;
if(p!=n){
System.out.println("Cannot be multiplied\n");
return;
}
else{
int a[][]= new int[m][n];
int b[][]= new int[p][q];
int c[][]= new int[m][q];
System.out.println("Enter the values of matrix 1\n");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
a[i][j]= sc.nextInt();
}
}
System.out.println("Enter the values of matrix 2\n");
for(i=0;i<p;i++)
{
for(j=0;j<q;j++)
{
b[i][j]= sc.nextInt();
}
}
for(i=0;i<m;i++)
{
for(j=0;j<q;j++)
{
c[i][j]=0;
for(k=0;k<n;k++)
c[i][j]+=a[i][k]*b[k][j];
}
}
System.out.println("multiplied matrix is: \n");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
System.out.println(c[i][j]);
}
}
}
}
}

