import java.util.*;
abstract class shape{
abstract void noofsides();
}
class rectangle extends shape{
public void noofsides(){
System.out.println("Sides of rectangle is 4");
}
}
class triangle extends shape{
public void noofsides(){
System.out.println("Sides of triangle is 3");
}
}
class hexagon extends shape{
public void noofsides(){
System.out.println("Sides of hexagon is 6");
}
}
class abstraction{
public static void main(String[] args)
{
rectangle r = new rectangle();
triangle t= new triangle();
hexagon h = new hexagon();
r.noofsides();
t.noofsides();
h.noofsides();
}
}
