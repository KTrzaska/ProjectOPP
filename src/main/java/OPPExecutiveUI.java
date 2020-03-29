
import java.util.Scanner;


public class OPPExecutiveUI {

    Scanner scanner =  new Scanner(System.in);
    WorkersList workersList = new WorkersList();

        public void executiveUI(){  //#todo loading WorkerList from prev file




            System.out.println("1: Display worker list: "
                    + "\n2: Add new worker: "
                    + "\n3: Export worker list. Set filename: "
                    + "\n4: Remove worker: "
                    + "\n5: Edit worker data: "
                    + "\n6: More Options: " );
            int operator = scanner.nextInt();

            switch(operator){
                case 1: {

                    workersList.readWorkersList();
                    executiveUI();
                    break;
                }
                case 2: {

                    workersList.addWorker();
                    executiveUI();
                    break;
                }
                case 3: {

                    String filename = scanner.nextLine();
                    workersList.exportWorkerList(filename);
                    executiveUI();
                    break;
                }
                case 4: {

                    workersList.removeWorker();
                    executiveUI();
                    break;
                }
                case 5: {

                    workersList.editWorker();
                    executiveUI();
                    break;
                }
                case 6:
                    //#todo more options

                    break;



            }
        }



}
