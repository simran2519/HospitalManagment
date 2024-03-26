package Weekly_Assignment.HospitalManagement;

public class Appointments
{
    private String title;
    private String doctorEmail;
    private String patientEmail;
    private String subject;
    private String status;

    public Appointments(String title, String doctorEmail, String patientEmail, String subject, String status) {
        this.title = title;
        this.doctorEmail=doctorEmail;
        this.patientEmail= patientEmail;
        this.subject= subject;
        this.status= status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public String getTitle() {
        return title;
    }

    public String getDoctorEmail() {
        return doctorEmail;
    }

    public String getPatientEmail() {
        return patientEmail;
    }

    @Override
    public String toString() {
        return "Appointments{" +
                "title='" + title + '\'' +
                ", doctorEmail='" + doctorEmail + '\'' +
                ", patientEmail='" + patientEmail + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}
