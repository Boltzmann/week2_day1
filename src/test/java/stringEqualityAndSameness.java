import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class stringEqualityAndSameness {
    @Test
    void stringSamenessWithEqualsignInstantiation() {
        String company = "neuefische";
        String teachingEntity = "neuefische";
        String newCompany = new String("neuefische");

        Assertions.assertEquals(company, teachingEntity);
        Assertions.assertEquals(company, newCompany);
        Assertions.assertTrue(company == teachingEntity);
        Assertions.assertFalse(company == newCompany);
    }
}
