package Inheritance;

public final class Employee {

    int salary = 50000;
    void empWork()
    {
        System.out.println("empWork");
    }

    /*final*/ void calculateSalary()
    {
        System.out.println("Employee Salary");
    }
}

class Programmer /*extends Employee*/
{
    int bonus = 35000;
    void programmerWork()
    {
        System.out.println("programmerWork");
    }

    void calculateSalary()
    {
        System.out.println("Programmer Salary");
    }
    public static void main(String[] args) {

        Programmer p = new Programmer();
        System.out.println(p.bonus);
        p.programmerWork();

       /* System.out.println(p.salary);
        p.empWork();*/

    }
}
