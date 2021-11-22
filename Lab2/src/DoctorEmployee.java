public class DoctorEmployee implements MedicalCenterEmployeeAPI {

    public void qualification(String department){
        if (department.equalsIgnoreCase("Cardiology")){
            System.out.println("Doctor in Cardiology has to have at least 7 years of experience.");
        } else if(department.equalsIgnoreCase("Pediatry")){
            System.out.println("Doctor in Pediatry has to have at least 3 years of experience.");
        } else {
            System.out.println("Doctor in Surgery has to have at least 10 years of experience.");
        }
    }
}
