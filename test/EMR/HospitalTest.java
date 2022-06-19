package EMR;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HospitalTest {

    Hospital hospital;
    Doctor doctor1;
    Doctor doctor2;
    Doctor doctor3;
    EMR.Test test1;
    EMR.Test test2;
    EMR.Test test3;

    @BeforeEach
    void setUp() {
        hospital = new Hospital("St. Joseph Medical Centre", "Akoka");

        doctor1 = new Doctor("David", "Oluyole", "General Practitioner");
        doctor2 = new Doctor("John", "Henry", "Gynaecology");
        doctor3 = new Doctor("Anna", "Kendrick", "Ophthalmology");

        test1 = new EMR.Test("Eye Pressure Test");
        test2 = new EMR.Test("Malaria Test");
        test3 = new EMR.Test("Blood Test");
    }

    @Test
    void testThatHospitalCanBeCreated() {
        assertNotNull(hospital);
    }

    @Test
    void testThatConstructorIsWorking() {
        assertEquals("St. Joseph Medical Centre", hospital.getHospitalName());

        assertEquals("Akoka", hospital.getLocation());
    }

    @Test
    void testThatHospitalIDCanBeSet() {
        hospital.setHospitalId(12);

        assertEquals(12, hospital.getHospitalId());
    }

    @Test
    void testThatHospitalDetailsCanBeUpdated() {
        hospital.setHospitalName("St. Joseph Hospital");

        assertEquals("St. Joseph Hospital", hospital.getHospitalName());

        hospital.setLocation("Yaba");

        assertEquals("Yaba", hospital.getLocation());
    }

    @Test
    void testThatDoctorsCanBeAdded() {
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);
        hospital.addDoctor(doctor3);

        assertEquals(3, hospital.totalNumOfDoctors());
    }

    @Test
    void testThatTestsCanBeAdded() {
        hospital.addTest(test1);
        hospital.addTest(test2);

        assertEquals(2, hospital.totalNumOfTests());
    }

    @Test
    void testThatDoctorInformationIsCorrect() {
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);
        hospital.addDoctor(doctor3);

        assertEquals("John", hospital.getDoctor(1).getFirstName());
    }

    @Test
    void testThatTestInformationIsCorrect() {
        hospital.addTest(test1);
        hospital.addTest(test2);
        hospital.addTest(test3);

        assertEquals("Blood Test", hospital.getTest(2).getTestName());
    }

    @Test
    void testThatDoctorCanBeDismissed() {
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);
        hospital.addDoctor(doctor3);

        assertEquals(3, hospital.totalNumOfDoctors());

        hospital.dismissDoctor(doctor2);

        assertEquals(2, hospital.totalNumOfDoctors());
    }

    @Test
    void testThatTestCanBeDeleted() {
        hospital.addTest(test1);
        hospital.addTest(test2);
        hospital.addTest(test3);

        assertEquals(3, hospital.totalNumOfTests());

        hospital.deleteTest(test3);

        assertEquals(2, hospital.totalNumOfTests());

        hospital.deleteTest(test1);

        assertEquals(1, hospital.totalNumOfTests());
    }
}