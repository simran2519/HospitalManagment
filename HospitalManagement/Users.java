package Weekly_Assignment.HospitalManagement;
//
//User Authentication:
//        Users (patients, doctors, and admin) should be able to log in to the system using their credentials.
//        New users should be able to register by providing necessary details such as name, email, password, and contact information.
//
//        Patient Features:
//        Schedule Appointment: Patients can schedule appointments with doctors by providing the desired date and time.
//        View Medical Information: Patients can view their results, prescriptions, etc.
//        View Appointments: Patients can view their upcoming and past appointments.
//
//        Doctor Features:
//        View Appointments: Doctors can view their upcoming appointments with patients.
//        Access Patient Information: Doctors can access patient's medical records, lab results, prescriptions, etc.
//        Provide Healthcare Advice: Doctors can provide healthcare advice to patients based on their medical information.
//
//
//        Admin Features:
//        Manage Users: Admin can add, update, and delete user accounts.
//        Manage Appointments: Admin can view and manage all appointments, including approving or canceling them.
//        Manage Donors: Admin can add, update, and delete donor information.
//
//        General Features:
//        Search Functionality: Users can search for doctors, patients, or donors based on various criteria.
//        Data Security: Ensure data encryption and secure storage of sensitive information like medical records, passwords, etc.

abstract public class Users
{
//    name, email, password, and contact information
    private String name;
    private String email;
    private String password ;
    private String contact;
    public Users(String name,String email, String password, String contact)
    {
        this.name=name;
        this.email= email;
        this.password= password;
        this.contact= contact;
    }
    @Override
    public String toString() {
        return "Users{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }
}

