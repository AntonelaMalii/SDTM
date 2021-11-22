public class EmployeeBuilder {
    public void build(String department, String job){
        if (department.equalsIgnoreCase("Cardiology") || department.equalsIgnoreCase("Pediatry") || department.equalsIgnoreCase("Surgery")){
            MedicalCenterEmployeeAdapter medicalAdapter = new MedicalCenterEmployeeAdapter(department,job);
            medicalAdapter.workingEmployee();
        } else {
            System.out.println("No such department in this Hospital!");
        }
    }
}
