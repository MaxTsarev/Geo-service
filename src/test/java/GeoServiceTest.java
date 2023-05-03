import entity.Country;
import entity.Location;
import geo.GeoService;
import geo.GeoServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class GeoServiceTest {

    public String s = "96.44.180.059";

    @Test
    void byIpTest() {
        Country country = Country.USA;
        GeoService geoService = new GeoServiceImpl();
        Location location = geoService.byIp(s);
        Country country1 = location.getCountry();
        Assertions.assertEquals(country, country1);
    }
}
