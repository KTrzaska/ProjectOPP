import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class WorkersList {

    private int nextWorkerID;
    private Worker[] workersList;
    Scanner scanner = new Scanner(System.in);
    ObjectMapper objectMapper = new ObjectMapper();


    public WorkersList()
    {
        this.workersList = new Worker[100];
    }




    public void addWorker() {
        System.out.println("Set worker NAME:");
        String name = scanner.nextLine();
        System.out.println("Set worker LASTNAME:");
        String lastname = scanner.nextLine();
        System.out.println("Set worker SEX (Type M/F):");
        char sex = scanner.nextLine().charAt(0);
        System.out.println("Set worker DEPARTMENT NUMBER");
        int departmentNumber = scanner.nextInt();
        System.out.println("Set worker SALARY:");
        float salary = scanner.nextFloat();
        System.out.println("Set worker AGE");
        int age = scanner.nextInt();
        System.out.println("Set worker NUMBER OF KIDS");
        int numberOfKids = scanner.nextInt();
        System.out.println("Is this worker married? (Type: true/false):");
        boolean mStatus = scanner.nextBoolean();


        Worker worker = new Worker(name, lastname, sex, departmentNumber, salary, age, numberOfKids, mStatus, nextWorkerID);
        
            workersList[nextWorkerID] = worker;
            nextWorkerID++;
        
    }
    
    public void readWorkersList()
    {
        for(int i = 0; i < nextWorkerID; i++) {
            workersList[i].displayBasicData();
        }
    }

    public void exportWorkerList(String filename){
            try{
                objectMapper.writeValue(new File(filename + ".csv"), workersList);
            } catch (IOException e) {
            e.printStackTrace();
        }
}

    public void removeWorker()
    {
        for (int i = 0; i < nextWorkerID; i++) {
            workersList[i].displayAllData();
        }

        System.out.println("Type worker ID to remove");

        int workerID = scanner.nextInt();
        for(int i = workerID; i < nextWorkerID; i++) {
        workersList[workerID] = workersList[workerID + 1];
        nextWorkerID--;
        }
    }



    private void editWorkerExecutive(int workerID) {
        if (workersList[workerID].getSex() == 'f' || workersList[workerID].getSex() == 'F') {

            System.out.println("Type to edit: "
                    + "\n1 Lastname: "
                    + "\n2 Department Number: "
                    + "\n3 Salary: "
                    + "\n4 Age: "
                    + "\n5 Number of kids: "
                    + "\n6 Marital status: ");
            int operator = scanner.nextInt();
            switch (operator) {
                case 1:

                    System.out.println("Set new Lastname: ");
                    String newLastname = scanner.nextLine();
                    workersList[workerID].setLastname(newLastname);
                    break;

                case 2:

                    System.out.println("Set new Department Number: ");
                    int newDepartmentNumber = scanner.nextInt();
                    workersList[workerID].setDepartmentNumber(newDepartmentNumber);
                    break;

                case 3:

                    System.out.println("Set new Salary: ");
                    float newSalary = scanner.nextFloat();
                    workersList[workerID].setSalary(newSalary);
                    break;

                case 4:

                    System.out.println("Set new Age: ");
                    int newAge = scanner.nextInt();
                    workersList[workerID].setAge(newAge);
                    break;

                case 5:

                    System.out.println("Set new Number of kids: ");
                    int newNumberOfKids = scanner.nextInt();
                    workersList[workerID].setNumberOfKids(newNumberOfKids);
                    break;

                case 6:

                    System.out.println("Set new Marital status: " +
                            "\n is this worker married? Type: Y/N");
                    String maritalStatus = scanner.nextLine();

                    if (maritalStatus.charAt(0) == 'y' || maritalStatus.charAt(0) == 'Y') {
                        workersList[workerID].setMaritalStatus(true);
                    } else if (maritalStatus.charAt(0) == 'n' || maritalStatus.charAt(0) == 'N') {
                        workersList[workerID].setMaritalStatus(false);
                    } else {
                        System.out.println("Invalid answear, try again");
                        editWorkerExecutive(workerID);
                    }
                    break;
            }
        } else {

            System.out.println("Type to edit: "
                    + "\n1 Department Number: "
                    + "\n2 Salary: "
                    + "\n3 Age: "
                    + "\n4 Number of kids: "
                    + "\n5 Marital status: ");
            int operator = scanner.nextInt();
            switch (operator) {


                case 1:

                    System.out.println("Set new Department Number: ");
                    int newDepartmentNumber = scanner.nextInt();
                    workersList[workerID].setDepartmentNumber(newDepartmentNumber);
                    break;

                case 2:

                    System.out.println("Set new Salary: ");
                    float newSalary = scanner.nextFloat();
                    workersList[workerID].setSalary(newSalary);
                    break;

                case 3:

                    System.out.println("Set new Age: ");
                    int newAge = scanner.nextInt();
                    workersList[workerID].setAge(newAge);
                    break;

                case 4:

                    System.out.println("Set new Number of kids: ");
                    int newNumberOfKids = scanner.nextInt();
                    workersList[workerID].setNumberOfKids(newNumberOfKids);
                    break;

                case 5:

                    System.out.println("Set new Marital status: " +
                            "\n is this worker married? Type: Y/N");
                    String maritalStatus = scanner.nextLine();

                    if (maritalStatus == "y" || maritalStatus == "Y") {
                        workersList[workerID].setMaritalStatus(true);
                    } else if (maritalStatus == "n" || maritalStatus == "N") {
                        workersList[workerID].setMaritalStatus(false);
                    } else {
                        System.out.println("Invalid answear, try again");
                        editWorkerExecutive(workerID);
                        break;
                    }
            }
        }
    }

    public void editWorker() {
        for (int i = 0; i < nextWorkerID; i++) {
            workersList[i].displayAllData();
        }

        System.out.println("Type worker ID to edit");

        int workerID = scanner.nextInt();

        workersList[workerID].displaySpecialData();
            editWorkerExecutive(workerID);
        }


}



