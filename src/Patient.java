import java.util.ArrayList;
import java.util.Date;

public class Patient extends User {

    private ArrayList<String> medicalHistory = new ArrayList<>();
    private Doctor assignedDoctor;
    private String currentPrescription;
    private String currentDiagnose;
    private Date dateOfVisit;

    public Patient(String name, int age, boolean gender, String email, String phone, String password) {
        super(name, age, gender, email, phone, password);
    }

    public void setDateOfVisit(Date dateOfVisit) {
        this.dateOfVisit = dateOfVisit;
    }

    public void setAssignedDoctor(Doctor assignedDoctor) {
        this.assignedDoctor = assignedDoctor;
    }

    public Doctor getAssignedDoctor() {
        return this.assignedDoctor;
    }

    public void setPrescription(String prescription) {
        this.currentPrescription = prescription;
    }

    public String getCurrentPrescription() {
        return this.currentPrescription;
    }

    public void setCurrentDiagnose(String diagnose) {
        this.currentDiagnose = diagnose;
    }

    public String getCurrentDiagnose() {
        return this.currentDiagnose;
    }

    public void addMedialHistory(String log) {
        this.medicalHistory.add(log);
    }

    public ArrayList<String> getMedicalHistory() {
        return this.medicalHistory;
    }

    public void requestMedicalReport() {
        System.out.printf(String.format("""
                        ========= MEDICAL REPORT =========
                        Date of Visit:              %s
                        Patient Name:               %s
                        Age:                        %d
                        Gender:                     %s
                        ----------------------------------
                        Diagnosis:                  %s
                        Treatment:                  %s
                        Doctor In Charge:           Dr. %s
                        Medical History:            %s
                        ==================================""",
                this.dateOfVisit, this.getName(), this.getAge(), this.getGender() ? "Male" : "Female", this.getCurrentDiagnose(), this.currentPrescription, this.getAssignedDoctor().getName(), this.medicalHistory));
    }
}
