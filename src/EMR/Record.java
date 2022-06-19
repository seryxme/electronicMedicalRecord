package EMR;

import java.util.ArrayList;

public class Record {
    private Doctor attendingDoctor;
    private Hospital hospitalUsed;
    private ArrayList<Test> medicalTests;

    public Record(Doctor doctor, Hospital hospital) {
        attendingDoctor = doctor;
        hospitalUsed = hospital;
        medicalTests = new ArrayList<>();
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
}
