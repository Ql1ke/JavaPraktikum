import com.codeborne.selenide.SelenideElement;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.*;

public class MainPageQuestions {

   /* @Before
    public void openPage() {
        //Открывается страница и создаётся экземпляр класса страницы
        MainPage mainPage = open("https://qa-scooter.praktikum-services.ru/", MainPage.class);
    }*/

    @Test //Получить кол-во строк с вопросами FAQ
    public void test() {

        MainPage mainPage = open("https://qa-scooter.praktikum-services.ru/", MainPage.class);
        MainPage countAccordion = mainPage.getCollectionStringQuestion(0);
        SelenideElement textOne = mainPage.assertTextFirstQuestion();

    }
}