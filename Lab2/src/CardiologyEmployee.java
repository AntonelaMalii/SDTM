public class CardiologyEmployee extends Employees{
    CardiologyEmployee(MedicalCenterEmployeeAPI medicalAPI){
        super(medicalAPI);
        super.setDepartment("Cardioloogy");
    }
    public void work() {
        System.out.println("Working in the Cardiology Department");
    }

}
