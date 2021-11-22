public class NurseEmployee implements MedicalCenterEmployeeAPI {

    public void qualification(String department){
        if (department.equalsIgnoreCase("Cardiology")){
            System.out.println("Nurse in Cardiology has to have at least 5 certifications after medical school graduation.");
        } else if(department.equalsIgnoreCase("Pediatry")){
            System.out.println("Nurse in Pediatry has to have at least 4 certifications after medical school graduation.");
        } else {
            System.out.println("Nurse in Surgery has to have at least 20 certifications after medical school graduation.");
        }
    }
}
