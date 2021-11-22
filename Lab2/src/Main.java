import java.util.List;

public class Main {
    public static void main(String[] args) {
// Adapter
        /*
        EmployeeBuilder employeeBuilder = new EmployeeBuilder();
        employeeBuilder.build("Cardiology", "Doctor");
        employeeBuilder.build("Surgery","Assistant");


         */
//Bridge
        /*
        MedicalCenterEmployee emp1 = new CardiologyEmployee(new DoctorEmployee());
        MedicalCenterEmployee emp2 = new PediatryEmployee(new AssistantEmployee());
        emp1.work();
        emp2.work();

         */
        Employees emp1 = new Employees(new DoctorEmployee());
        Employees emp2 = new Employees(new DoctorEmployee());
        Employees emp3 = new Employees(new DoctorEmployee());
        Employees emp4 = new Employees(new DoctorEmployee());
        Employees emp5 = new Employees(new DoctorEmployee());
        emp1.setName("Ana");
        emp2.setName("Alina");
        emp3.setName("Irina");
        emp4.setName("Alexandru");
        emp5.setName("Tatiana");
        emp1.setSurname("Mihalachi");
        emp2.setSurname("Asachi");
        emp3.setSurname("Costachi");
        emp4.setSurname("Iordachi");
        emp5.setSurname("Suflachi");
        emp1.setAge(45);
        emp2.setAge(38);
        emp3.setAge(27);
        emp4.setAge(48);
        emp5.setAge(64);
        emp1.setSalary(4500);
        emp2.setSalary(4500);
        emp3.setSalary(4500);
        emp4.setSalary(4500);
        emp5.setSalary(4500);
        emp1.setDepartment("Cardiology");
        emp2.setDepartment("Cardiology");
        emp3.setDepartment("Cardiology");
        emp4.setDepartment("Cardiology");
        emp5.setDepartment("Cardiology");
        emp1.setJob("Doctor");
        emp2.setJob("Doctor");
        emp3.setJob("Doctor");
        emp4.setJob("Doctor");
        emp5.setJob("Doctor");

        // Composite pattern
        // suppose all the employees are from the same department and are collegues
        emp5.addHiredColleague(emp1);
        emp5.addHiredColleague(emp2);
        emp5.addHiredColleague(emp3);
        emp5.addHiredColleague(emp4);
        // but unfortunately one of them is fired from the medical center and removed from the collegues list
        emp5.removeFiredColleague(emp2);
        for(Employees emp : emp5.getColleagues()){
        System.out.println(emp.getInfo());}




    }


}
