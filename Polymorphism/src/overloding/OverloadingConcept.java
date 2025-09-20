package overloding;

class EmployeeInfo{

    // Method with one int,one string parameters
    public void employee(int empId, String name){
        System.out.println("Employee Details:" + empId + name);
    }

    // Method with two int,one string parameters
    public void employee(int empId, String name, int salary){
        System.out.println("Employee Details:" + empId + name + salary);
    }

    // Method with two int,two string parameters
    public void employee(int empId, String name, int salary, String department){
        System.out.println("Employee Details:" + empId + name + salary + department);
    }
}

public class OverloadingConcept {
    public static void main(String[] args){
        EmployeeInfo emp = new EmployeeInfo();

        emp.employee(101," Gauri ");
        emp.employee(102," Neha ",30000);
        emp.employee(103," Shweta ",35000," Manager ");
    }
}
