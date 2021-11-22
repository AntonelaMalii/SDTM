public class AssistantEmployee implements MedicalCenterEmployeeAPI {

    public void qualification(String department){
        if (department.equalsIgnoreCase("Cardiology")){
            System.out.println("Assistant in Cardiology has to have at least 4 years of experience.");
        } else if(department.equalsIgnoreCase("Pediatry")){
            System.out.println("Assistant in Pediatry has to have at least 2 years of experience.");
        } else {
            System.out.println("Assistant in Surgery has to have at least 6 years of experience.");
        }
    }
}