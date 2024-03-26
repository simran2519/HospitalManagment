package Weekly_Assignment.HospitalManagement;

import Weekly_Assignment.TaskManagement.User;

import java.util.*;

import static Weekly_Assignment.TaskManagement.Main.scanner;

public class AdminManager
{
    static Scanner scanner = new Scanner(System.in);
    static HashMap<String, Doctors> doctorsHashMap;
    static HashMap<String, Patient> patientHashMap;
    List<Appointments> appointmentsList = new ArrayList<>();
    HashMap<String, Donor> donorHashMap;

    Admin admin = new Admin("simran","simran@gmail.com", "1234","7740066387");
    //addDoctor
    public void addDoctor()
    {
        System.out.println("Enter User's name");
        String name = scanner.next();
        System.out.println("Enter User's email");
        String email = scanner.next();
        System.out.println("Enter password");
        String password = scanner.next();
        System.out.println("Enter contact no.");
        String contact = scanner.next();
        Doctors doctors = new Doctors(name,email,password,contact);
        if(!doctorsHashMap.containsKey(email))
        {
            doctorsHashMap.put(email,doctors);
            System.out.println("Doctor is added successfully");
        }
        else
        {
            System.out.println("Doctor with this email id is already exists");
        }
    }
    public void addPatient()
    {
        System.out.println("Enter User's name");
        String name = scanner.next();
        System.out.println("Enter User's email");
        String email = scanner.next();
        System.out.println("Enter password");
        String password = scanner.next();
        System.out.println("Enter contact no.");
        String contact = scanner.next();
        Patient patient = new Patient(name,email,password,contact);
        if(!patientHashMap.containsKey(email))
        {
            patientHashMap.put(email,patient);
            System.out.println("Patient is added successfully");
        }
        else
        {
            System.out.println("Patient with this email id is already exists");
        }

    }
    public void deleteDoctor()
    {
        System.out.println("Enter the email id of Doctor whome you want to delete ");
        String email = scanner.next();
        if(doctorsHashMap.containsKey(email))
        {
            Doctors doctorToDelete = doctorsHashMap.get(email);
            doctorsHashMap.remove(doctorToDelete);
            System.out.println("Doctor is removed successfully");
        }
        else
        {
            System.out.println("Doctor with this id does not exits");
        }
    }
    public void deletePatient()
    {
        System.out.println("Enter the email id of patient whome you want to delete ");
        String email = scanner.next();
        if(patientHashMap.containsKey(email))
        {
            Patient patientToDelete = patientHashMap.get(email);
            doctorsHashMap.remove(patientToDelete);
            System.out.println("Patient is removed successfully");
        }
        else
        {
            System.out.println("Patient with this id does not exits");
        }
    }
    public void showPatient()
    {
        Collection c= patientHashMap.values();
        Iterator i = c.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
    public void showDoctor()
    {
        Collection c= doctorsHashMap.values();
        Iterator i = c.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
    public void approveAppointment()
    {
        System.out.println("All the pending appointments are");
        for(Appointments appointments: appointmentsList)
        {
            if(appointmentsList.size()!=0 && appointments.getStatus().equals("pending"))
            {
                System.out.println(appointments);
            }
            else if(appointmentsList.size()==0)
            {
                System.out.println("No appointments");
            }
            else {
                System.out.println("No pending appointments");
            }
        }
        System.out.println("Enter the title of appointment which you want to approve");
        String title= scanner.next();
        Appointments appointmentToApprove = null;
        String doctorId = appointmentToApprove.getDoctorEmail();
        if(appointmentsList.size()!=0)
        {
            for(Appointments appointments: appointmentsList)
            {
                if( appointments.getTitle().equals(title))
                {
                    appointmentToApprove=appointments;
                    break;
                }
            }
            if(appointmentToApprove!=null)
            {
                appointmentToApprove.setStatus("approved");
                if(doctorsHashMap.containsKey(doctorId))
                {
                    Doctors doctors= doctorsHashMap.get(doctorId);
                    doctors.appointmentList.put(title,appointmentToApprove);
                }
                else
                {
                    System.out.println("The doctor id which you have provided does not exits");
                }
                System.out.println("Appointment is approved");
            }
            else {
                System.out.println("No appointment with this title exits");
            }
        }
        else
        {
            System.out.println("No appointments");
        }
    }
    public void declineAppointments()
    {
        System.out.println("All the pending appointments are");
        for(Appointments appointments: appointmentsList)
        {
            if(appointmentsList.size()!=0 && appointments.getStatus().equals("pending"))
            {
                System.out.println(appointments);
            }
            else if(appointmentsList.size()==0)
            {
                System.out.println("No appointments");
            }
            else {
                System.out.println("No pending appointments");
            }
        }
        System.out.println("Enter the title of appointment which you want to decline");
        String title= scanner.next();
        Appointments appointmentToDecline = null;
        if(appointmentsList.size()!=0)
        {
            for(Appointments appointments: appointmentsList)
            {
                if( appointments.getTitle().equals(title))
                {
                    appointmentToDecline=appointments;
                    break;
                }
            }
            if(appointmentToDecline!=null)
            {
                appointmentToDecline.setStatus("declined");
                System.out.println("Appointment is declined");
            }
            else {
                System.out.println("No appointment with this title exits");
            }
        }
        else
        {
            System.out.println("No appointments");
        }
    }
    public void showAppointments()
    {
        if(appointmentsList.size()==0)
        {
            System.out.println("No any Appointment ");
        }
        else
        {
            for(Appointments appointments : appointmentsList)
            {
                System.out.println(appointments);
            }
        }
    }
    public void addDonor()
    {
        System.out.println("Enter User's name");
        String name = scanner.next();
        System.out.println("Enter User's email");
        String email = scanner.next();
        System.out.println("Enter password");
        String password = scanner.next();
        System.out.println("Enter contact no.");
        String contact = scanner.next();
        Donor donor= new Donor(name,email,password,contact);
        if(!donorHashMap.containsKey(email))
        {
            donorHashMap.put(email,donor);
            System.out.println("Donor is added successfully");
        }
        else
        {
            System.out.println("Donor with this email id is already exists");
        }

    }
    public void deleteDonor()
    {
        System.out.println("Enter the email id of Donor whome you want to delete ");
        String email = scanner.next();
        if(donorHashMap.containsKey(email))
        {
            Donor donorToDelete = donorHashMap.get(email);
            doctorsHashMap.remove(donorToDelete);
            System.out.println("Donor is removed successfully");
        }
        else
        {
            System.out.println("Donor with this id does not exits");
        }
    }
    public void showDonor()
    {
        Collection c= donorHashMap.values();
        Iterator i = c.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }

    public boolean loginAdmin()
    {
        System.out.println("Enter the email ");
        String username= scanner.next();
        System.out.println("Enter the password");
        String password = scanner.next();
        if(username.equals("simran@gmail.com") && password.equals("1234"))
        {
            System.out.println("Admin is log in");
            return true;
        }
        else
        {
            System.out.println("No any Admin with this credential exits");
            return false;
        }
    }
}
