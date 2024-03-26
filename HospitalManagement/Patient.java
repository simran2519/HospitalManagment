package Weekly_Assignment.HospitalManagement;
import Weekly_Assignment.TaskManagement.Main;

import java.util.HashMap;

import static Weekly_Assignment.HospitalManagement.AdminManager.doctorsHashMap;
import static Weekly_Assignment.HospitalManagement.AdminManager.patientHashMap;

public class Patient extends Users
{
    HashMap<String,Appointments> appointmentList;
    private String medicalRecords, labResults, prescriptions;
    public Patient(String name, String email, String password, String contact)
    {
        super(name, email, password, contact);
        appointmentList = new HashMap<>();
    }

    public void setPrescriptions(String prescriptions) {
        this.prescriptions = prescriptions;
    }

    public void scheduleAppointment()
    {

    }
    public void viewAppointments()
    {

    }
    public void viewDetails()
    {

    }
    public Patient loginPatient()
    {
        System.out.println("Enter the emailId ");
        String username= Weekly_Assignment.TaskManagement.Main.scanner.next();
        System.out.println("Enter the password");
        String password = Main.scanner.next();
        Patient patientToLogin= null;
        if(patientHashMap.containsKey(username))
        {
            patientToLogin= patientHashMap.get(username);
            return patientToLogin;
        }
        else
        {
            return null;
        }
    }
}
