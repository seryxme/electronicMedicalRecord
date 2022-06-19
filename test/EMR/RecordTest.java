package EMR;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecordTest {
    Record record;
    Hospital hospital1;
    Hospital hospital2;
    Doctor doctor1;
    Doctor doctor2;
    EMR.Test test1;
    EMR.Test test2;
    EMR.Test test3;



    @BeforeEach
    void setUp() {
        hospital1 = new Hospital("St. Joseph Medical Centre", "Akoka");
        hospital2 = new Hospital("Children's Day Hospital", "Ikeja");

        doctor1 = new Doctor("David", "Oluyole", "General Practitioner");
        doctor2 = new Doctor("John", "Henry", "Gynaecology");

        record = new Record(doctor1, hospital1);

        test1 = new EMR.Test("Eye Pressure Test");
        test2 = new EMR.Test("Malaria Test");
        test3 = new EMR.Test("Blood Test");
    }

    @Test
    void testThatRecordCanBeCreated() {
        assertNotNull(record);
    }

    @Test
    void testThatConstructorIsWorking() {
        assertEquals("St. Joseph Medical Centre", record.getHospitalUsed().getHospitalName());

        assertEquals("David", record.getAttendingDoctor().getFirstName());
    }

    @Test
    void testThatRecordIDCanBeSet() {
        record.setRecordId(25);

        assertEquals(25, record.getRecordId());
    }

    @Test
    void testThatHospitalCanBeChanged() {

        record.changeHospital(hospital2);

        assertEquals("Children's Day Hospital", record.getHospitalUsed().getHospitalName());
    }

    @Test
    void testThatDoctorCanBeChanged() {

        record.changeDoctor(doctor2);

        assertEquals("John", record.getAttendingDoctor().getFirstName());
    }

    @Test
    void testThatTestsCanBeAdded() {
        record.addTest(test1);
        record.addTest(test2);

        assertEquals(2, record.numOfTestsDone());
    }

    @Test
    void testThatTestInformationIsCorrect() {
        record.addTest(test1);
        record.addTest(test2);
        record.addTest(test3);

        assertEquals("Blood Test", record.getTest(2).getTestName());
    }

    @Test
    void testThatTestCanBeDeleted() {
        record.addTest(test1);
        record.addTest(test2);
        record.addTest(test3);

        assertEquals(3, record.numOfTestsDone());

        record.deleteTest(test3);

        assertEquals(2, record.numOfTestsDone());

        record.deleteTest(test1);

        assertEquals(1, record.numOfTestsDone());
    }
}