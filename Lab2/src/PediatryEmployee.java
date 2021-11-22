public class PediatryEmployee extends Employees{
    PediatryEmployee(MedicalCenterEmployeeAPI medicalAPI){
        super(medicalAPI);
        super.setDepartment("Pediatry");
    }
    public void work() {
        System.out.println("Working in the Pediatry Department");
    }

}
