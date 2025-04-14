import java.util.ArrayList;
import java.util.Date;

public class Patient extends User {

    private ArrayList<String> medicalHistory;
    private Doctor assignedDoctor;
    private String currentPrescription;
    private String currentDiagnose;
    private Date dateOfVisit;

    public Patient(String name, int age, boolean gender, String email, String phone, String password) {
        super(name, age, gender, email, phone, password);
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
        System.out.printf(String.format("========= MEDICAL REPORT =========\nDate of Visit:     %s\nPatient Name:         %s\nAge:          %d\nGender:         %s\n----------------------------------\nDiagnosis:      %s\nTreatment:          %s\nDoctor In Charge:           %s\nMedical History:            %s\n=================================="), this.dateOfVisit, this.getName(), this.getAge(), this.getGender(), this.getCurrentDiagnose(), this.currentPrescription, this.getAssignedDoctor(), this.medicalHistory);
    }
}
