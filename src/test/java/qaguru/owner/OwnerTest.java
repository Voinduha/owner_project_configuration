package qaguru.owner;

import com.codeborne.selenide.Selenide;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import qaguru.owner.config.OwnerConfig;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;

public class OwnerTest {

    @Test
    public void selenideOwnerTest() {

        final OwnerConfig config = ConfigFactory
                .create(OwnerConfig.class, System.getProperties());

        String searchResult = "selenide.org";
        String searchItem = "Selenide";

        Selenide.open("https://www.google.com/");

        // Ввести Selenide в поиск
        $(byName("q")).setValue(searchItem).pressEnter();

        // Проверить, что Selenide появился в результатах поиска
        $("#search").shouldHave(text(searchResult));

        // Configuration.browser = config.browser();
        // Configuration.browserVersion = config.browserVersion();
        // Configuration.remote = config.remoteUrl();
    }
}
