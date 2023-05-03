import geo.GeoService;
import geo.GeoServiceImpl;
import i18n.LocalizationService;
import i18n.LocalizationServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import sender.MessageSender;
import sender.MessageSenderImpl;

import java.util.HashMap;
import java.util.Map;

public class MessageSenderTest {

    public GeoService geoService = Mockito.spy(GeoServiceImpl.class);
    public LocalizationService localizationService = Mockito.spy(LocalizationServiceImpl.class);


    @Test
    void sendTestRussia() {
        MessageSender messageSender = new MessageSenderImpl(geoService, localizationService);
        Map<String, String> headers = new HashMap<String, String>();
        headers.put(MessageSenderImpl.IP_ADDRESS_HEADER, "172.123.12.19");
        String value = messageSender.send(headers);
        String value1 = "Добро пожаловать";

        Assertions.assertEquals(value, value1);
    }

    @Test
    void sendTestUsa() {
        MessageSender messageSender = new MessageSenderImpl(geoService, localizationService);
        Map<String, String> headers = new HashMap<String, String>();
        headers.put(MessageSenderImpl.IP_ADDRESS_HEADER, "96.12.512.619");
        String value = messageSender.send(headers);
        String value1 = "Welcome";

        Assertions.assertEquals(value, value1);
    }
}
