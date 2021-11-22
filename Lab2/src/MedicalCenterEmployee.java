public abstract class MedicalCenterEmployee {

    protected MedicalCenterEmployeeAPI medicalAPI;

    public MedicalCenterEmployee(){

    }
    public MedicalCenterEmployee(MedicalCenterEmployeeAPI medicalAPI){
        this.medicalAPI = medicalAPI;
    }
    abstract void work();
    abstract String getInfo();
    abstract void qualification();

}
