package EMR;

public class Doctor {
    private int staffId;
    private String firstName;
    private String lastName;
    private String specialty;

    private Hospital hospital;

    public Doctor(String firstName, String lastName, String specialty) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialty = specialty;
        hospital = new Hospital();
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

    @Override
    public String toString() {
        return String.format("""
                
                Medical Facility: %s
                ID No.: %d
                Name: Dr. %s %s
                Specialization: %s
                """, hospital.getHospitalName(), staffId, firstName, lastName, specialty);
    }
}
