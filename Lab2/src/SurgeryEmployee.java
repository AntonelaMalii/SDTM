public class SurgeryEmployee extends Employees{
    SurgeryEmployee(MedicalCenterEmployeeAPI medicalAPI){
        super(medicalAPI);
        super.setDepartment("Surgery");
    }
    public void work() {
        System.out.println("Working in the Surgery Department");
    }

}

