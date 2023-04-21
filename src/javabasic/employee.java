package javabasic;

public class employee {

    int empid;                                                       //Variables
    String empname;
    int empdept;
    int empsalary;

    public void display(){                                          //Method
        System.out.println("Employee Details are :");
        System.out.println("Emp ID: "+empid);
        System.out.println("Emp Name: "+empname);
        System.out.println("Emp Dept: "+empdept);
        System.out.println("Emp Salary: "+empsalary);
    }

//    public employee(int id, String name, int dept, int salary){           //Constructor
//        empid=id;
//        empname=name;
//        empdept=dept;
//        empsalary=salary;
//    }

    public void setdata(int id, String name, int dept, int salary){           //Using Methods
        empid = id;
        empname = name;
        empdept = dept;
        empsalary = salary;

    }

    public static void main(String[] args) {                        //Main

        // values Using Direct Method:

//        employee emp1 = new employee();
//        emp1.empid = 1;
//        emp1.empname="Tony";
//        emp1.empdept=5;
//        emp1.empsalary=100000;
//        emp1.display();
//
//        employee emp2 = new employee();
//        emp2.empid =2;
//        emp2.empname="sam";
//        emp2.empdept=4;
//        emp2.empsalary=50000;
//        emp2.display();
//
//        employee emp3=new employee();
//        emp3.empid =3;
//        emp3.empname="ganesh";
//        emp3.empdept=3;
//        emp3.empsalary=60000;
//        emp3.display();

        // Values Using Constructor

//        employee emp1 = new employee(1,"Sam",10,20000);
//        emp1.display();
//
//        employee emp2 = new employee(2,"ganesh",20,30000);
//        emp2.display();
//
//        employee emp3 = new employee(3,"Tony",30,40000);
//        emp3.display();

        // Values using Method

            employee emp1 = new employee();
            emp1.setdata(1,"Sam",10,20000);
            emp1.display();

            employee emp2 = new employee();
            emp2.setdata(2,"ganesh",20,30000);
            emp2.display();

            employee emp3 = new employee();
            emp3.setdata(3,"Tony",30,40000);
            emp3.display();


    }


}
