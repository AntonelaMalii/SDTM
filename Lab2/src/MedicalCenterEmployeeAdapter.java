public class MedicalCenterEmployeeAdapter extends Employees {

    private Employees medicalEmployee;

    MedicalCenterEmployeeAdapter(String department, String job) {
        if (department.equalsIgnoreCase("Cardiology")){
            medicalEmployee = new CardiologyEmployee(job.equalsIgnoreCase("Doctor") ?  new DoctorEmployee() : (job.equalsIgnoreCase("Assistant")) ? new AssistantEmployee():  new NurseEmployee());
        } else if (department.equalsIgnoreCase("Surgery")){
            medicalEmployee = new SurgeryEmployee(job.equalsIgnoreCase("Doctor") ? new DoctorEmployee() : (job.equalsIgnoreCase("Assistant")) ? new AssistantEmployee() :  new NurseEmployee());
        } else {
            medicalEmployee = new PediatryEmployee(job.equalsIgnoreCase("Doctor") ? new DoctorEmployee() : (job.equalsIgnoreCase("Assistant")) ? new AssistantEmployee() : new NurseEmployee());
        }
    }
    public void workingEmployee(){
        medicalEmployee.work();
    }
}
