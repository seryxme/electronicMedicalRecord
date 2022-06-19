package EMR;

public class Doctor {
    private int staffId;
    private String firstName;
    private String lastName;
    private String specialty;
    private String hospitalName;

    public Doctor(String firstName, String lastName, String specialty, Hospital hospital) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialty = specialty;
        hospitalName = hospital.getHospitalName();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return String.format("""
                
                Medical Facility: %s
                ID No.: %d
                Name: Dr. %s %s
                Specialization: %s
                """, hospitalName, staffId, firstName, lastName, specialty);
    }
}
