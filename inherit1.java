import java.util.*;

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayEmp() {
        System.out.println("Name " + name);
        System.out.println("Age " + age);
    }
}

class Manager extends Employee {
    private double phoneno;

    public Manager(String name, int age, double phoneno) {
        super(name, age);
        this.phoneno = phoneno;
    }

    public void displayMan() {
        super.displayEmp();
        System.out.println("Phone " + phoneno);
    }
}

class Officer extends Employee {
    private double phoneno;

    public Officer(String name, int age, double phoneno) {
        super(name, age);
        this.phoneno = phoneno;
    }

    public void displayOff() {
        super.displayEmp();
        System.out.println("Phone " + phoneno);
    }
}

class inherit1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Manager details");
        System.out.println("Name ");
        String name = sc.nextLine();
        System.out.println("Age ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Phone ");
        double phoneno = sc.nextDouble();
        sc.nextLine();

        Manager m = new Manager(name, age, phoneno);

        System.out.println("Enter Officer details");
        System.out.println("Name ");
        String name1 = sc.nextLine();
        System.out.println("Age ");
        int age1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Phone ");
        double phoneno1 = sc.nextDouble();
        sc.nextLine();

        Officer o = new Officer(name1, age1, phoneno1);

        m.displayMan();
        o.displayOff();
    }
}

