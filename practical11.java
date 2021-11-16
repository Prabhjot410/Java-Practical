//inheritance with constructors
class employee{
    String Name;
    int id;
    public employee(){
        Name = "ABC";
        id = 123;
        System.out.println("Employee Name : "+Name);
        System.out.println("Employee ID : "+id);
    }

   

    public  employee(int i) {
        int ID = i;
        Name = "XYZ";
        System.out.println("Employee Name : "+Name);
        System.out.println("Employee ID : "+ID);
    }

    
}
class salary extends employee{
    int salary;
    public salary(){
         salary = 24000;
         System.out.println("Employee Salary : "+salary);
         
    }
    public salary(int s){
        int Salary = s;
        System.out.println("Employee Salary : "+Salary);

    }
}
public class practical11{
public static void main(String[] args) {
    employee Employee = new employee(45);
    System.out.println(" ");
   salary objSalary = new salary(34000);

}
}
