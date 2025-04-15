import java.util.Date;

public class Main {
    public static void main(String[] args) {

        User user = new User("Ahmed", 25, true, "ahmed@yahoo.com", "01054963854", "#Ahmedpass22");
        Doctor doctor = new Doctor("Mohamed", 35,true, "mohamed@gmail.com", "01015834574", "#Mohpassword29");
        Patient patient = new Patient("Samy", 20, true, "samy@gmail.com", "01023854753", "@samyY99");

        AuthenticationService authenticationService = new AuthenticationService();

        authenticationService.registerUser(user);
        authenticationService.registerUser(doctor);
        authenticationService.registerUser(patient);

        authenticationService.login("ahmed@yahoo.com", "#Ahmedpass22");
        authenticationService.login("mohamed@gmail.com", "#Mohpassword29");
        authenticationService.login("samy@gmail.com", "@samyY99");

        patient.addMedialHistory("Disease 1");
        patient.addMedialHistory("Disease 2");
        patient.addMedialHistory("Disease 3");
        patient.addMedialHistory("Disease 4");
        Date date = new Date();
        patient.setDateOfVisit(date);
        patient.setAssignedDoctor(doctor);
        patient.requestMedicalReport();


    }
}