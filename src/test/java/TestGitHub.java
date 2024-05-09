
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import static com.codeborne.selenide.Selenide.*;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
public class TestGitHub extends TestBase {

    @Test
    @Tag("owner")
    void mainPageTest() {
        open("https://github.com/");
        assertThat(title()).isEqualTo("GitHub: Let’s build from here · GitHub");
        //sleep(5000);
    }
}
