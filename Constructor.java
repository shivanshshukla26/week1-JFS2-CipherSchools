public class Constructor {
    int employeeID;
    int salary;
    String department;

    Constructor(int empID, int sal, String dept){
        employeeID = empID;
        salary = sal;
        department = dept;
    }
    public static void main(String[] args){
        Constructor harsha = new Constructor(101, 4000,"harsha");
        Constructor varsha = new Constructor(102, 5000, "Varsha");

        System.out.println(harsha.employeeID+" salary "+harsha.salary+" dept "+harsha.department);
        System.out.println(varsha.employeeID+" salary "+varsha.salary+" dept "+varsha.department);
    }
}
