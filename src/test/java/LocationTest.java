import entity.Country;
import entity.Location;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LocationTest {

    public Location location = new Location("Moscow", Country.RUSSIA, "Lenina", 952);

    @Test
    void countryTest() {
        String value = "RUSSIA";
        String value2 = String.valueOf(location.getCountry());

        Assertions.assertEquals(value, value2);
    }
}
