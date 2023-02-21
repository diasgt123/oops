import java.util.*;
abstract class shape extends Thread
{
  abstract void area();
}
class rectangle extends shape
{
  public void area(){
  int l,b,area=0;
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the dimensions: ");
   l=sc.nextInt();
  sc.nextLine();
   b = sc.nextInt();
  sc.nextLine();
  area = l*b;
    System.out.println("Area is: "+area);
  }
  public void run(){
  rectangle r = new rectangle();
  r.area();
  }
  }
  class triangle extends shape
{
  public void area(){
  double a,c,h,area=0;
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the dimensions: ");
   a=sc.nextInt();
  sc.nextLine();
   c = sc.nextInt();
  sc.nextLine();
    h = sc.nextInt();
  sc.nextLine();
  area = 0.5*a*c*h;
    System.out.println("Area is: "+area);
  }
  public void run(){
  triangle t = new triangle();
  t.area();
  }
  }
  class circle extends shape
{
  public void area(){
  double r,area=0;
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the dimensions: ");
   r=sc.nextInt();
  sc.nextLine();
  area = 3.14*r*r;
    System.out.println("Area is: "+area);
  }
  public void run(){
  circle c = new circle();
  c.area();
  }
  }
  
  class thread
  {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    rectangle r = new rectangle();
    triangle t = new triangle();
    circle c = new circle();
    int ch;
    System.out.println("1.Rectangle\n");
    System.out.println("2.Triangle\n");
    System.out.println("3.Circle\n");

  
        ch = sc.nextInt();
    switch(ch){
    case 1:     r.start();
                break;
    case 2:     t.start();
                break;
    case 3:     c.start();
                break;
    }

    }
    }
  
  
