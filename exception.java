import java.util.*;
class exception{
public static void divide(float a,float b) throws ArithmeticException{
if(b==0){
throw new ArithmeticException("Division not possible");
}
else{
System.out.println("Result: "+a/b);
}
}
public static void main(String[] args)
{
float x,y;
Scanner sc= new Scanner(System.in);
System.out.println("Enter the numbers:\n");
x=sc.nextInt();
sc.nextLine();
y=sc.nextInt();
sc.nextLine();
divide(x,y);
}
}

