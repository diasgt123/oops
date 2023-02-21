import java.util.*;
class employee{
private String name;
private int age;
private String address;
private double salary;
public void print(){
System.out.println("Salary is :" + salary);
}
public employee(String name,int age,String address,double salary){
this.name=name;
this.age=age;
this.address=address;
this.salary=salary;
}
public void displayEmp(){
System.out.println("Name: "+name);
System.out.println("Age: "+age);
System.out.println("Address: "+address);
System.out.println("Salary: "+salary);
}
}
class manager extends employee{
private String specialization;
private String department;
public manager(String name,int age,String address,double salary,String specialization,String department){
super(name,age,address,salary);
this.specialization=specialization;
this.department=department;
}
public void displayMan(){
displayEmp();
System.out.println("Specialization: "+specialization);
System.out.println("Department: "+department);
}
}
class officer extends employee{
private String specialization;
private String department;
public officer(String name,int age,String address,double salary,String specialization,String department){
super(name,age,address,salary);
this.specialization=specialization;
this.department=department;
}
public void displayOff(){
displayEmp();
System.out.println("Specialization: "+specialization);
System.out.println("Department: "+department);
}
}
class inherit{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter manager details ");
System.out.println("Name: ");
String name = sc.nextLine();
System.out.println("Age: ");
int age = sc.nextInt();
sc.nextLine();
System.out.println("Address: ");
String address = sc.nextLine();
System.out.println("Salary: ");
double salary = sc.nextDouble();
sc.nextLine();
System.out.println("Specialization: ");
String specialization = sc.nextLine();
System.out.println("Department: ");
String department = sc.nextLine();
manager m = new manager(name,age,address,salary,specialization,department);
System.out.println("Enter officer details ");
System.out.println("Name: ");
String name1 = sc.nextLine();
System.out.println("Age: ");
int age1 = sc.nextInt();
//sc.nextLine();
System.out.println("Address: ");
String address1 = sc.nextLine();
System.out.println("Salary: ");
double salary1 = sc.nextDouble();
//sc.nextLine();
System.out.println("Specialization: ");
String specialization1 = sc.nextLine();
System.out.println("Department: ");
String department1 = sc.nextLine();
officer o = new officer(name1,age1,address1,salary1,specialization1,department1);
System.out.println("\n");
m.displayMan();
o.displayOff();
}
}
