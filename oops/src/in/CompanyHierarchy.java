package in;

//Parent class
 class Employee {
 void work() {
     System.out.println("Employee works in a company.");
 }
}

//Child of Employee
class Manager extends Employee {
 void manage() {
     System.out.println("Manager manages employees.");
 }
}

//Child of Manager
class Director extends Manager {
 void decision() {
     System.out.println("Director makes big decisions.");
 }
}

public class CompanyHierarchy {
 public static void main(String[] args) {
     Director d = new Director();
     d.work();      // From Employee
     d.manage();    // From Manager
     d.decision();  // From Director
 }
}
