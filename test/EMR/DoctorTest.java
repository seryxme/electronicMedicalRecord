package EMR;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class DoctorTest {
    Doctor doctor;
    Hospital hospital;

    @BeforeEach
    void setUp() {
        hospital = new Hospital("St. Joseph", "Akoka");
        doctor = new Doctor("John", "Henry", "Gynaecology");
    }

    @Test
    void testThatDoctorCanBeCreated() {
        assertNotNull(doctor);
    }

    @Test
    void testThatNameCanBeChanged() {
        doctor.setFirstName("Anna");

        assertEquals("Anna", doctor.getFirstName());

        doctor.setLastName("Kendrick");

        assertEquals("Kendrick", doctor.getLastName());
    }
}