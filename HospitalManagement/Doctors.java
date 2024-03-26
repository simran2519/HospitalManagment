package Weekly_Assignment.HospitalManagement;

import Weekly_Assignment.TaskManagement.Main;
import Weekly_Assignment.TaskManagement.User;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

import static Weekly_Assignment.HospitalManagement.AdminManager.*;

public class Doctors extends Users
{
    HashMap<String,Appointments> appointmentList;
    public Doctors(String name, String email, String password, String contact) {
        super(name, email, password, contact);
        appointmentList= new HashMap<>();
    }

    public  void viewAppointments()     // similar to showAppointments
    {
        if(appointmentList.size()!=0)
        {
            Collection c = appointmentList.values();
            Iterator i = c.iterator();
            while(i.hasNext())
            {
                System.out.println(i.next());
            }
        }
        else
        {
            System.out.println("NO any appointment is scheduled for you yet");
        }

    }

    public void viewPatients() {
        if (!appointmentList.isEmpty()) {
            Collection<Appointments> appointments = appointmentList.values();
            for (Appointments appointment : appointments) {
                System.out.println(appointment.getPatientEmail());
            }
        } else {
            System.out.println("No appointments are scheduled yet.");
        }
    }

    public void provideAdvice()      //have to take one more variable to set advice from Doctors
    {
        viewPatients();
        System.out.println("Enter the id of patient to which you want to give advice");
        String patientId = scanner.next();
        Patient patient = patientHashMap.get(patientId);
        patient.setPrescriptions("Don't take Sugar because you are a diabetic Patient");
    }
    public Doctors loginDoctor()
    {
        System.out.println("Enter the emailId ");
        String username= Main.scanner.next();
        System.out.println("Enter the password");
        String password = Main.scanner.next();
        Doctors doctorToLogin= null;
        if(doctorsHashMap.containsKey(username))
        {
            doctorToLogin= doctorsHashMap.get(username);
            return doctorToLogin;
        }
        else
        {
            return null;
        }
    }
}
