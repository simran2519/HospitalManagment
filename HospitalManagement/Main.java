package Weekly_Assignment.HospitalManagement;

import static Weekly_Assignment.HospitalManagement.AdminManager.doctorsHashMap;
import static Weekly_Assignment.HospitalManagement.AdminManager.scanner;

public class Main
{
    static AdminManager adminManager = new AdminManager();
    public static void main(String[] args)
    {
        System.out.println("Select an option");
        System.out.println("1. Login As Admin");
        System.out.println("2. Login As Patient");
        System.out.println("3. Login As Doctor");
        int op = scanner.nextInt();
        switch (op)
        {
            case 1:
            {
                if(adminManager.loginAdmin())
                {
                    adminMenu();
                }
                else
                {
                    System.out.println("Cannot login Admin");
                }
                break;
            }
            case 2:
            {
                if()
            }
        }
    }
    public static void  adminMenu()
    {
        while(true)
        {
            System.out.println("Select one option");
            System.out.println("1. Add Doctor");
            System.out.println("2. Delete Doctor");
            System.out.println("3. Add Patient");
            System.out.println("4. Delete Patient");
            System.out.println("5. Add Donor");
            System.out.println("6. Delete Donor");
            System.out.println("7. Show Doctors");
            System.out.println("8. Show Patients");
            System.out.println("9. Show Donors");
            System.out.println("10. Show all Appointments Approved as well as Declined");
            System.out.println("11. Approve Appointment");
            System.out.println("12. Decline Appointment");
            System.out.println("13. Change Role");
            int option = scanner.nextInt();
            if(option==0 || option==13)
            {
                System.out.println("Exited");
                break;
            }
            switch (option)
            {
                case 1:
                {
                    adminManager.addDoctor();
                    break;
                }
                case 2:
                {
                    adminManager.deleteDoctor();
                    break;
                }
                case 3:
                {
                    adminManager.addPatient();
                    break;
                } case 4:
                {
                    adminManager.deletePatient();
                    break;
                } case 5:
                {
                    adminManager.addDonor();
                    break;
                } case 6:
                {
                    adminManager.deleteDonor();
                    break;
                } case 7:
                {
                    adminManager.showDoctor();
                    break;
                } case 8:
                {
                    adminManager.showPatient();
                    break;
                } case 9:
                {
                    adminManager.showDonor();
                    break;
                }
                case 10:
                {
                    adminManager.showAppointments();
                    break;
                }
                case 11:
                {
                    adminManager.approveAppointment();
                    break;
                }
                case 12:
                {
                    adminManager.declineAppointments();
                    break;
                }

            }
        }
    }
    public static void doctorMenu()
    {
        while(true)
        {
            System.out.println("Select one option");
            System.out.println("1. View Appointments");
            System.out.println("2. View Patient");
            System.out.println("3. Provide Advice");
            System.out.println("4. Change Role");
            int option = scanner.nextInt();
            if(option==0 || option==4)
            {
                System.out.println("Exited");
                break;
            }
            switch (option)
            {
                case 1:
                {
                    adminManager.addDoctor();
                    break;
                }
                case 2:
                {
                    adminManager.deleteDoctor();
                    break;
                }
                case 3:
                {
                    adminManager.addPatient();
                    break;
                } case 4:
            {
                adminManager.deletePatient();
                break;
            } case 5:
            {
                adminManager.addDonor();
                break;
            } case 6:
            {
                adminManager.deleteDonor();
                break;
            } case 7:
            {
                adminManager.showDoctor();
                break;
            } case 8:
            {
                adminManager.showPatient();
                break;
            } case 9:
            {
                adminManager.showDonor();
                break;
            }
                case 10:
                {
                    adminManager.showAppointments();
                    break;
                }
                case 11:
                {
                    adminManager.approveAppointment();
                    break;
                }
                case 12:
                {
                    adminManager.declineAppointments();
                    break;
                }

            }
        }
    }
    public static void patientMenu()
    {

    }
}

