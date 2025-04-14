import java.util.ArrayList;

public class Doctor extends User {


    private String specialization;
    private ArrayList<Patient> patients;

    public Doctor(String name, int age, boolean gender, String email, String phone, String password) {
        super(name, age, gender, email, phone, password);
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return this.specialization;
    }

    public void addPatient(Patient patient) {
        this.patients.add(patient);
        patient.setAssignedDoctor(this);
    }

    public ArrayList<Patient> getPatients() {
        return this.patients;
    }


    public void writePrescription(Patient patient, String prescription) {
        if (this.patients.contains(patient)) {
            patient.setPrescription(prescription);

        } else {
            System.out.printf(String.format("Not allowed to write prescription, Doctor %s assigned to this patient.", patient.getAssignedDoctor()));
        }
    }

    public void diagnosePatient(Patient patient, String diagnose) {
        if (this.patients.contains(patient)) {
            patient.setCurrentDiagnose(diagnose);
        } else {
            System.out.printf(String.format("Not allowed to write prescription, Doctor %s assigned to this patient.", patient.getAssignedDoctor()));
        }
    }


}
