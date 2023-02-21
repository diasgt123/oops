import java.io.*;
abstract class shape{
public abstract void numofsides();
}
class rectangle extends shape{
public void numofsides(){
System.out.println("No of sides of is 4\n");
}
}
class triangle extends shape{
public void numofsides(){
System.out.println("No of sides of is 3\n");
}
}
class hexagon extends shape{
public void numofsides(){
System.out.println("No of sides of is 6\n");
}
}
class abstract
{
public static void main(String[] args)
{
rectangle r=new rectangle();
triangle t= new triangle();
hexagon h= new hexagon();
r.numofsides();
t.numofsides();
h.numofsides();
}
}

