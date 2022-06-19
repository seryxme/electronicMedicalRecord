package EMR;

import java.util.ArrayList;

public class Record {
    private int recordId;
    private Doctor attendingDoctor;
    private Hospital hospitalUsed;
    private ArrayList<Test> medicalTests;

    public Record(Doctor doctor, Hospital hospital) {
        attendingDoctor = doctor;
        hospitalUsed = hospital;
        medicalTests = new ArrayList<>();
    }

    public int getRecordId() {
        return recordId;
    }

    public void setRecordId(int recordId) {
        this.recordId = recordId;
    }

    public Doctor getAttendingDoctor() {
        return attendingDoctor;
    }

    public Hospital getHospitalUsed() {
        return hospitalUsed;
    }

    public ArrayList<Test> getAllTests() {
        return medicalTests;
    }

    public Test getTest(int index) {
        return medicalTests.get(index);
    }

    public void showAllTests() {
        for(Test test: medicalTests) {
            System.out.println(test);
        }
    }

    public void addTest(Test test) {
        medicalTests.add(test);
    }

    public void deleteTest(Test test) {
        medicalTests.remove(test);
    }

    @Override
    public String toString() {
        return String.format("""
                
                File No.: %d
                ----------------
                    Hospital
                ----------------
                %s
                ----------------
                Attending Doctor
                ----------------
                %s
                
                No. of tests: %d
                """, recordId, hospitalUsed, attendingDoctor, medicalTests.size());
    }

    public void changeHospital(Hospital hospital) {
        hospitalUsed = hospital;
    }

    public void changeDoctor(Doctor doctor) {
        attendingDoctor = doctor;
    }

    public int numOfTestsDone() {
        return medicalTests.size();
    }
}
