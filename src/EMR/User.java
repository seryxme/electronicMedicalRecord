package EMR;

import java.util.ArrayList;

public class User {
    private ArrayList<Record> medicalRecords;

    public User() {
        medicalRecords = new ArrayList<>();
    }

    public ArrayList<Record> getAllMedicalRecords() {
        return medicalRecords;
    }

    public Record getMedicalRecord(int index) {
        return medicalRecords.get(index);
    }

    public void setMedicalRecords(Record record) {
        medicalRecords.add(record);
    }

    public void deleteMedicalRecords(Record record) {
        medicalRecords.remove(record);
    }

    public void deleteMedicalRecords(int index) {
        medicalRecords.remove(index);
    }
}
