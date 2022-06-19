package EMR;

import java.util.ArrayList;

public class Hospital {
    private String hospitalName;
    private int hospitalId;
    private String location;
    ArrayList<Doctor> doctors;
    ArrayList<Test> tests;

    public Hospital(String name, String location) {
        hospitalName = name;
        this.location = location;
        doctors = new ArrayList<>();
        tests = new ArrayList<>();
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public int getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(int hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ArrayList<Doctor> getAllDoctors() {
        return doctors;
    }

    public Doctor getDoctor(int index) {
        return doctors.get(index);
    }

    public void showAllDoctors() {
        for(Doctor doctor: doctors) {
            System.out.println(doctor);
        }
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void dismissDoctor(Doctor doctor) {
        doctors.remove(doctor);
    }

    public int totalNumOfDoctors() {
        return doctors.size();
    }

    public ArrayList<Test> getAllTests() {
        return tests;
    }

    public Test getTest(int index) {
        return tests.get(index);
    }

    public void showAllTests() {
        for(Test test: tests) {
            System.out.println(test);
        }
    }

    public void addTest(Test test) {
        tests.add(test);
    }

    public void deleteTest(Test test) {
        tests.remove(test);
    }

    public int totalNumOfTests() {
        return tests.size();
    }

    @Override
    public String toString() {
        return String.format("""
                
                ID No.: %d
                Name: %s
                No. of Doctors: %d
                No. of Tests Available: %d
                """, hospitalId, hospitalName, totalNumOfDoctors(), totalNumOfTests());
    }
}
