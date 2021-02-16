import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.open;
import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class YandexSearch {

@Test
    public void selenideSearchYandex() {
        open("https://yandex.ru/");
        $("#text").setValue("Selenide").pressEnter();
        $(By.linkText("Selenide: concise UI tests in Java")).shouldBe(Condition.appear);
    }
    
@Test
    public void selenideSearchGoogle() {
        open("https://google.com/");
        $(By.name("q")).setValue("Selenide").pressEnter();
        $(By.linkText("selenide.org")).shouldBe(Condition.appear);
    }
}
