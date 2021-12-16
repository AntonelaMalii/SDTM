public class MedicalCenterEmployee {

    private String name;
    private String surname;
    private Integer age;
    private double salary;
    private Integer seniority;
    private String department;
    private String job;


    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setSeniority(Integer seniority) {
        this.seniority = seniority;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public Integer getSeniority(){ return seniority;}

    public String getDepartment() {
        return department;
    }

    public String getJob() {
        return job;
    }
}
