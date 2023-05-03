import entity.Country;
import i18n.LocalizationService;
import i18n.LocalizationServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LocalizationServiceTest {

    public String value;
    public String value1;
    public LocalizationService localizationService = new LocalizationServiceImpl();

    @Test
    void localeTest() {
        value = "Добро пожаловать";
        value1 = localizationService.locale(Country.RUSSIA);
        Assertions.assertEquals(value, value1);
    }
}
