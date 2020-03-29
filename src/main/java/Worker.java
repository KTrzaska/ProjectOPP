public class Worker {
    private String name;
    private String lastname;
    private char sex;
    private int departmentNumber;
    private float salary;
    private int age;
    private int numberOfKids;
    private boolean maritalStatus;
    private int workerID;

public Worker(String name, String lastname, char sex, int departmentNumber, float salary, int age, int numberOfKids, boolean maritalStatus, int workerID){
    this.name = name;
    this.lastname = lastname;
    this.sex = sex;
    this.departmentNumber = departmentNumber;
    this.salary = salary;
    this.age = age;
    this.numberOfKids = numberOfKids;
    this.maritalStatus = maritalStatus;
    this.workerID = workerID;

}

public void maritalStatus()
{
        if (maritalStatus == true){
            System.out.print("Maried");
        } else {
            System.out.print("Single");
        }
}
public void displayAllData(){
    System.out.print("ID: " + workerID
                    + " "
                    + " Name: " + name
                    + " Lastname: " + lastname
                    + " Sex: " + sex
                    + " Department Number: " + departmentNumber
                    + " Age: " + age
                    + " Salary: " + salary + "$"
                    + " Number of kids: " + numberOfKids
                    + " Marital status: ");
    maritalStatus();
    System.out.println("\n ");

}


public void displayBasicData(){
    System.out.print("ID: " + workerID + " Name: " + name + " Lastname: " + lastname + " Salary: " + salary + "$" + "\n");

}

public void displaySpecialData(){
    System.out.println("ID: " + workerID + " NAME: "+ name.toUpperCase() + " LASTNAME: " + lastname.toUpperCase() + "SALARY " + salary + "$");
}

public boolean compareSalaryTo(float valueToCompare){
    if(salary > valueToCompare){
        return true;
    } else {
        return false;
    }
}

public float salaryRaiseBonusCalculate(){
    float raiseBonus = 0;
    raiseBonus += numberOfKids * 0.02;
    if(maritalStatus == true)
    {
     raiseBonus += 0.03;
    }
    System.out.println("Salary rise bonus =" + raiseBonus);
    return raiseBonus;
}

    public int getWorkerID() {
        return workerID;
    }

    public void setWorkerID(int workerID) {
        this.workerID = workerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public void setDepartmentNumber(int departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumberOfKids() {
        return numberOfKids;
    }

    public void setNumberOfKids(int numberOfKids) {
        this.numberOfKids = numberOfKids;
    }

    public boolean isMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(boolean maritalStatus) {
        this.maritalStatus = maritalStatus;
    }
}
